/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package gui;
/*
 * InteractionWindow.java requires one additional file:
 *   DocumentSizeFilter.java
 */

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.HashMap;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*;

import main.GT_Mat;
import main.Main;
import fileIO.*;
import irrelevant.*;
import jmatrix.*;
import interpreter.*;
import utilities.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import parser.*;
import workspace.Workspace;

public class InteractionWindow {

	public enum Task {

		help, quit, Plot_Test, IO_Test, Workspace,
		Parser_Test, FFT_Test, Sound_Test, your_own_command
	}
	JTextPane textPane;
	public AbstractDocument doc;
	static final int MAX_CHARACTERS = 1000;
	public static int startAt = 0;
	JTextArea changeLog;
	JScrollPane scrollPaneForLog;
	String newline = "\n";
	char newlinech = '\n';
	HashMap<Object, Action> actions;
	Task choice = Task.your_own_command;
	String enteredText;
	public SimpleAttributeSet[] attrs;
	public int indexInChangeLog;
	public ArrayList<String> changeLogArray;
	public boolean printNewLine = true;

	public InteractionWindow(JPanel host) {
		attrs = GT_Mat.attrs;
		JScrollPane scrollPane = makeInteractions();
		textPane.setCharacterAttributes(attrs[0], true);
		scrollPane.setPreferredSize(new Dimension(200, 200));

		//Create the text area for the status log and configure it.
		changeLog = new JTextArea(5, 30);
		changeLog.setEditable(false);
		changeLogArray = new ArrayList<String>();
		changeLogArray.add("");  //Add an empty string, so that when we cycle through to the end, we get a blank line.
		displayCommand(getCurrentDate());
		indexInChangeLog = 1;
		scrollPaneForLog = new JScrollPane(changeLog);
		//Create the status area.
		JPanel statusPane = new JPanel(new GridLayout(1, 1));
		CaretListenerLabel caretListenerLabel =
				new CaretListenerLabel("Caret Status");
		statusPane.add(caretListenerLabel);

		//Add the components to the host panel.
		host.add(scrollPane, BorderLayout.CENTER);
		host.add(statusPane, BorderLayout.PAGE_END);

		//Start watching for undoable edits and caret changes.
		textPane.addCaretListener(caretListenerLabel);
		// doc.addDocumentListener(new MyDocumentListener());
		textPane.addKeyListener(new UpListener());
	}

	/**
	 * Method to grab the current date, in the month/day/year format.
	 * @return the current date as a string, in the format mm/dd/yy.
	 */
	public static String getCurrentDate() {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");
		Date date = new Date();
		return dateFormat.format(date);
	}

	public void clc() {
		try {
			startAt = 0;
			doc.remove(0, doc.getLength());
			startAt = 3;
			nextLine();
		} catch(BadLocationException ble){};
	}


	JScrollPane getLogWindow() {
		return scrollPaneForLog;
	}

	public JTextPane getTextPane() {
		return textPane;
	}

	JScrollPane makeInteractions() {
		//Create the text pane and configure it.
		textPane = new JTextPane();
		StyledDocument styledDoc = textPane.getStyledDocument();
		if (styledDoc instanceof AbstractDocument) {
			doc = (AbstractDocument) styledDoc;
			doc.setDocumentFilter(new WindowFilter());
		} else {
			System.err.println("Text pane's document isn't an AbstractDocument!");
			System.exit(-1);
		}
		nextLine();
		textPane.setMargin(new Insets(5, 5, 5, 5));
		return new JScrollPane(textPane);
	}

	//This listens for and reports caret movements.
	protected class CaretListenerLabel extends JLabel
	implements CaretListener {

		public CaretListenerLabel(String label) {
			super(label);
		}

		//Might not be invoked from the event dispatch thread.
		public void caretUpdate(CaretEvent e) {
			displaySelectionInfo(e.getDot(), e.getMark());
		}

		//This method can be invoked from any thread.  It
		//invokes the setText and modelToView methods, which
		//must run on the event dispatch thread. We use
		//invokeLater to schedule the code for execution
		//on the event dispatch thread.
		protected void displaySelectionInfo(final int dot,
				final int mark) {
			SwingUtilities.invokeLater(new Runnable() {

				public void run() {
					if (dot == mark) {  // no selection
						try {
							Rectangle caretCoords = textPane.modelToView(dot);
							//Convert it to view coordinates.
							setText("caret: text position: " + dot
									+ ", view location = ["
									+ caretCoords.x + ", "
									+ caretCoords.y + "]"
									+ newline);
						} catch (BadLocationException ble) {
							setText("caret: text position: " + dot + newline);
						}
					} else if (dot < mark) {
						setText("selection from: " + dot
								+ " to " + mark + newline);
					} else {
						setText("selection from: " + mark
								+ " to " + dot + newline);
					}
				}
			});
		}
	}

	/**
	 * Append the change to the log, add the string to our array, and put our index up one.
	 * @param str the command to display;
	 */
	private void displayCommand(String str) {
		changeLog.append(str + "\n");
		changeLogArray.add(str);
		indexInChangeLog++;
	}

	/**
	 * Clear everything the user is currently typing (past the >> )
	 */
	private void clearTyped() {
		try {
			doc.remove(startAt, doc.getLength() - startAt);
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}

	/**
	 * Method to add the >> to the next line.
	 */
	public void nextLine() {
		appendString(">> ", 0);
	}

	/**
	 * Method to add the a string to the next line.
	 */
	public synchronized void appendString(final String str, final int ndx) {
		Runnable run = new Runnable() {
			public void run() {
				try {
					doc.insertString(doc.getLength(), str, attrs[ndx]);
					startAt = doc.getLength();
					textPane.setCaretPosition(doc.getLength());
				} catch (BadLocationException ble) {
					ble.printStackTrace();
				}
			}
		};
		SwingUtilities.invokeLater(run);
	}

	/**
	 * Print the given RuntimeException to the InteractionWindow.
	 * @param exception The exception to print.
	 */
	public void printError(RuntimeException exception) {
		appendString(exception.toString() + "\n", 0);
	}

	/**
	 * This listener is used for hitting up/down in the command window.
	 */
	private class UpListener implements KeyListener {

		public void keyTyped(KeyEvent e) {
		}

		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == 38) { //up
				e.consume();
				clearTyped();
				indexInChangeLog--;
				if (indexInChangeLog < 0) {
					indexInChangeLog = changeLogArray.size() - 1;
				}
				try {
					doc.insertString(startAt, changeLogArray.get(indexInChangeLog), attrs[0]);
				} catch (BadLocationException ble) {
				}
			} else if (e.getKeyCode() == 40) { //down
				e.consume();
				clearTyped();
				indexInChangeLog++;
				if (indexInChangeLog >= changeLogArray.size()) {
					indexInChangeLog = 0;
				}

				try {
					doc.insertString(startAt, changeLogArray.get(indexInChangeLog), attrs[0]);
				} catch (BadLocationException ble) {
				}

			}

		}

		public void keyReleased(KeyEvent e) {
		}
	}

	public void reload() {
		((StyledDocument) doc).setCharacterAttributes(0, doc.getLength() + 2, attrs[0], false);
		textPane.setCaretPosition(textPane.getText().length());
	}

	private class WindowFilter extends DocumentFilter {

		/**
		 * Prevent the user from deleting anything past the most recent >> .
		 * @param fb
		 * @param offset
		 * @param length
		 * @throws BadLocationException
		 */
		public void remove(DocumentFilter.FilterBypass fb, int offset, int length) throws BadLocationException {
			if (textPane.getCaretPosition() > startAt) {
				super.remove(fb, offset, length);
			}
		}

		public void insertString(DocumentFilter.FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
			super.insertString(fb, offset, string, attr);
		}

		/**
		 * The user has typed something.  If it's a newline, parse the typed line.  Otherwise, if the user's carat
		 * is in a valid location, work normally and let them type their character.
		 * @param fb
		 * @param offset
		 * @param length
		 * @param text
		 * @param attrs
		 * @throws BadLocationException
		 */
		public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
			if (text.equals("\n")) { //The user hit enter, parse the input.
				enteredText = doc.getText(0, doc.getLength()).substring(startAt);
				super.replace(fb, doc.getLength(), length, text, attrs);
				enter();
			} else if (textPane.getCaretPosition() >= startAt) {
				super.replace(fb, offset, length, text, attrs);
			}

		}

		/**
		 * The user hit enter, so we parse the input.  We'll also add the >>
		 * after we've printed what we need to.
		 */
		public void enter() {
			displayCommand(enteredText);
			if(enteredText.trim().isEmpty()) {
				nextLine();
				return;
			}
			if(enteredText.equalsIgnoreCase("continue")) {                    
				synchronized(Main.wstack.peek().getDataHolder()) {
					TreeWalker.popDataHolder();
					nextLine();
					return;
				}
			} else if(enteredText.equalsIgnoreCase("step"))
				synchronized(Main.wstack.peek().getDataHolder()) {

				}
			if (Interpreter.waitForInput) {
				Interpreter.waitForInput = false;
				try {
					Interpreter.dataHolder.setData(enteredText);
				} catch (Exception ev) {//Catch exception if any
					System.err.println("Error: " + ev.getMessage());
				}
			} else {
				choice = Task.your_own_command;
				for (Task task : Task.values()) {
					if (enteredText.equals(task.toString())) {
						choice = task;
						break;
					}
				}
				if (choice == Task.quit) {
					System.exit(0);
				} else {
					try {
						switch (choice) {
						case help:
							for (Task task : Task.values()) {
								doc.insertString(doc.getLength(),
										task.toString() + "\n", attrs[0]);
							}
							break;
						case Plot_Test:
							// Main.Plot_Test();
							nextLine();
							break;
						case IO_Test:
							try {
								FileIO.test();
							} catch (FileNotFoundException e) {
							}
							nextLine();
							break;
						case Workspace:
							//Main.WS_test();
							nextLine();
							break;
						case Parser_Test:
							GTParser.test();
							nextLine();
							break;
						case Sound_Test:
							AePlayWave.test();
							nextLine();
							break;
						case FFT_Test:
							MatComplex.test();
							nextLine();
							break;
						case your_own_command:
							DebugTools.runCommand(enteredText);
						}
						indexInChangeLog = changeLogArray.size();
					} catch (BadLocationException ble) {
						System.err.println("Couldn't insert text.");
					}
				}
			}
		}
	}
}
