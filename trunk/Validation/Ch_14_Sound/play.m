function play(name)

[y Fs] = wavread(name);
sound(y, Fs);