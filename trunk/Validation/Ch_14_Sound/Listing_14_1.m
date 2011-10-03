% Listing 14-1 - Playing a scale poorly
clear
clc

 [note, Fs] = wavread('instr_piano.wav');
 count = floor(length(note)/8);
 wait = count / Fs;
 whole = 2^(1/6);
 half = 2^(1/12);
 for i = 1:8
     cnt(i) = count;
     freq(i) = Fs;
     sound(note(1: count), Fs);
     pause(wait)
     if (i == 3) || (i == 7)
         Fs = Fs * half;
         count = round(count * half);
     else
         Fs = Fs * whole;
         count = round(count * whole);
     end
 end
