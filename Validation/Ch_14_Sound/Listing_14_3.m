% Listing 14-3 - Play a scale by shrinking the note
clear
clc

 [note, Fs] = wavread('instr_piano.wav');
 half = 2^(1/12);
 whole = half^2;
 for index = 1:8
     sound(note, Fs);
     pause(.5);
     if (index == 3) || (index == 7)
         mult = half;
     else
         mult = whole;
     end
     note = note(ceil(1:mult:end));
 end;
