% 14-1	Write a script to read in the file bubble.wav and perform the following operations on its data.
% Store the sampling period in the variable dt. 
% a.	Store the duration of the sound in the variable t. 
% b.	Store the number of samples in the variable n. 
% c.	Store the difference in frequency between the samples (after the FFT) in the variable df. 
% d.	Store the maximum frequency in the variable f_max. 
% e.	Create an array containing the frequency at each sample in the variable f.
% f.	Create a new sound that has double the frequency of the original sound in the variable sound_Double. 
% g.	Create a new sound that is the same as the original except that the pitch is raised by five half tones. Store your answer in the variable raised_pitch. 
% h.	Plot the original sound, sound_Double, and raised_pitch all in the same row of a figure using subplot. Label each plot accordingly. 
% i.	Play each of the sounds at a sampling frequency of 22050 Hz in the following order: original sound, sound_Double, and raised_pitch.
% h.	Plot the sound waveform in both the time and frequency domains. Label your plots appropriately. Use figure to start a new figure, and subplot (one row, two columns). 
% 14-2 	Write and test a script to assemble your own speech from speeches in the resource center or on the Web.
% 14-3 	Write a script to play your favorite tune on one of the instruments in the resource center.
% 14-4	Write a script to construct a 10 second signal with sine waves of unit amplitude and frequencies 5 Hz and 12 Hz at a sampling rate of 1000 samples per second. Perform the FFT on this signal, and remove the 5000 elements in the center of the spectrum. Then, perform the inverse transform, and plot and explain your observations.
% 14-5	When plotting the results from applying a Fast Fourier transform to a sampled sound file, what would be appropriate labels for the x and y axis?
% a.	x: 'time'	y: 'frequency'
% b.	x: 'frequency'	y: 'time'
% c.	x: 'time'	y: 'power'
% d.	x: 'frequency'	y: 'amplitude'
% e.	x: 'time'	y: 'amplitude'
% 14-6	You want to read in a sound myfile.wav and perform a Fast Fourier transform on it. Which of the following lines of code would accomplish this with no errors?
% a.	[a, b] = wavread('myfile.wav'); r = fft(a, b);
% b.	[c, d] = wavread('myfile.wav'); s = fft(d, c);
% c.	[e, f] = wavread('myfile.wav'); u = fft(e);
% d.	[g, h] = wavread('myfile.wav'); t = fft(h);
% 14-7	Congratulations. Because of your success while working with Acme Clothes over the past few weeks, the company has requested your help again. An agent for Acme Clothes has recorded the average clothes rating for the company in a file, confused.wav. However, the file is scrambled. Your job is to read the file in, unscramble it, and play it back.
% Store your modified waveform (the one that has been unscrambled) in the variable mySound. Here is how the file was scrambled:
% a.	The file was amplified to 10 percent of its original amplitude.
% b.	The order of the words in the file was reversed. Each word in the sound file took one second to say. This means what was the first second in the original sound file is now the last second, and the last second in the original sound file is now the first second. 
% c.	The file was reversed.
%  
