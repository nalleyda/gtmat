clear
clc

[note, Fs] = wavread('piano.wav');
duration = floor(length(note)/8);
wait = duration / Fs;
whole = 2^(1/6);
half = 2^(1/12);
for i = 1:8
    dur(i) = duration;
    freq(i) = Fs;
    sound(note(1:duration), Fs);
    pause(wait)
    if (i == 3) || (i == 7)
        Fs = Fs * half;
        duration = round(duration * half);
    else
        Fs = Fs * whole;
        duration = round(duration * whole);
    end
end
%          pitch length
smallworld = [ 1 3;   % C
               1 1;   % C
               3 2;   % E
               1 2;   % C
               2 3;   % D
               2 1;   % D
               2 4]   % D
l = length(smallworld);
for i = 1:l
    f = freq(smallworld(i,1));
    d = dur(smallworld(i,1)) * smallworld(i,2);
    sound(note(1:d), f);
    pause(wait*smallworld(i,2));
end

               
               
    