package sound;

import java.io.File;
import java.io.IOException;
import jmatrix.*;
import main.*;
import javax.swing.JFileChooser;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Sound {

    private static final int INTERNAL_BUFFER_SIZE = 524288; // 128Kb
    private static float sampleRate;
    private static String fileName;
    private static AudioInputStream audioInputStream = null;
    public static AudioFormat format = null;


    public static CellArray wavread(String filename) {
        fileName = filename;
        CellArray res = null;
        File soundFile = new File(fileName);
        if (!soundFile.exists()) {
            if (Main.fileChooser.showOpenDialog(Main.frame)
                    == JFileChooser.APPROVE_OPTION) {
                fileName = Main.fileChooser.getSelectedFile().getAbsolutePath();
                soundFile = new File(fileName);
                System.err.println("File is actually " + fileName);
            }
            if (!soundFile.exists()) {
                System.err.println("Wave file not found: " + fileName);
                return null;
            }
        }
        try {
            audioInputStream = AudioSystem.getAudioInputStream(soundFile);
        } catch (UnsupportedAudioFileException e1) {
            throw new RuntimeException("wavread: Unsupported File Type");
        } catch (IOException e1) {
            throw new RuntimeException("wavread: I/O error " + e1);
        }
        format = audioInputStream.getFormat();
        sampleRate = format.getSampleRate();
        SignedByte storage = null;
        int nBytesRead = 0;
        byte[] abData = new byte[INTERNAL_BUFFER_SIZE];
        try {
            while (nBytesRead != -1) {
                nBytesRead = audioInputStream.read(abData, 0, abData.length);
                if (nBytesRead >= 0) {
                    if(storage == null) {
                        storage = new SignedByte(abData, nBytesRead);
                    } else {
                        storage.append(abData, nBytesRead);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        res = new CellArray(storage);
        res = res.hcat(new Matrix(sampleRate));
        return res;
    }
    
    public static Matrix sound(SignedByte sb, Matrix m) {
        float Fs = (float) m.get(1);
        SourceDataLine auline = null;
        DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
        try {
            auline = (SourceDataLine) AudioSystem.getLine(info);
            auline.open(format);
            int num = 
            auline.write(sb.data, 0, sb.n-1);
            auline.start();
        } catch (LineUnavailableException e) {
            throw new RuntimeException("sound error " + e);
        } catch (Exception e) {
            throw new RuntimeException("sound error " + e);
        } finally {
            auline.drain();
            auline.close();
        }
        return new Matrix(1);
    }
}
