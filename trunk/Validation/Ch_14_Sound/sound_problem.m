% % You have seen this situation in detective stories. 
% % The police have recorded a telephone conversation that
% % seems harmless, but the quick-witted hero hears a faint
% % sound that is a clue to solving the case.  The audio
% % expert works magic with the recording to miraculously
% % extract the audible signal.
% % 
% % You have been provided with a file 'noisyspeech.wav'.
% % 1. Your first step is to read it into Matlab and listen to
% % the sound.  It appears to be nothing but a loud hum,
% % but you may be able to make out some speech in the 
% % background.  Notice the sound is an array between 1 and -1.
% % 
% % 2. Figure out the number of points and the time between
% % samples, and derive the maximum frequency and frequency
% % steps for the Fourier Transform.
% % 
% % 3. Perform the Fourier Transform and plot it against 
% % frequency.
% % 
% % 4. When you examine the plot, you see two huge spikes
% % around 100 Hz. (remember the spectrum is mirrored).
% % 
% % 5. Find the location in the array of the two peaks and
% % plot the spectrum around one of them - perhaps 40 points
% % each side of that peak.  Notice that the peak is smeared
% % to each side - to remove it, you'll need to write a block
% % of zeros into the spectrum around the peak.
% % Hint:  complex(zeros(1, width)) might work.
% % 
% % 6. You now want to remove those two peaks from the spectrum.
% % You will need to experiment with the width of the block that
% % can remove the peaks, but not destroy the sound you want to
% % keep. Make a complex array of zeros of the right size, and
% % copy that array into the spectrum.  Be sure you erase the 
% % second peak in the spectrum.  If the number of points on
% % the full spectrum is np and the first peak is at index pk1,
% % the second peak is at (np - pk1 + 2)
% % 
% % 7. Perform the inverse Fourier Transform of the spectrum
% % to recover the speech. You will want to plot the new signal
% % to check it:
% %   a. if the signal is complex, you didn't put the blocks
% %      in the spectrum symmetrically
% %   b. although there may still be some spikes greater
% %      than 1 in the sound, the majority of the signal
% %      ought to be less than 1.  If it is too faint,
% %      multiply the signal by a suitable number - say, 20.
% %      
% % 8. Listen to the sound.
% % 
% % 9.  Repeat steps 6 - 8 to improve the quality of the speech
% % (the original wasn't hi-fi to start with)


