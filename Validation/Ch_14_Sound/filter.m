clear
clc
rows = 3;
cols = 2;
% read original speech
[x, fs] = wavread('whistle.wav');

sound(x, fs)
disp('original signal - press enter')

pause

dt = 1/fs      % sampling period (sec)
pts = length(x)     % number of points
t = (1:pts) * dt;   % time array for plotting
subplot(rows, cols, 1)    % plot it
plot( t, x )
title('original signal')
xlabel('time (sec)')
df = 1 / t(end)       % the frequency interval
fmax = df * pts / 2 % the max frequency is half what you think
                    % because the spectrum is mirrored about
                    % the max frequency, but has the same
                    % number of points

Y = fft(x);         % perform the transform
f = (1:pts) * 2 * fmax / pts; % frequencies for plotting
subplot(rows, cols, 2)    % plot the spectrum
range = 1:pts/4;
plot(f(range), abs(Y(range)))
title('spectrum')
xlabel('frequency (Hz)')
subplot(rows, cols, 3)    % plot the filter
fcut = 1300;
ifcut = fcut / df;
flt = 1 - hiPass( ifcut, length(Y));
Y = Y .* flt;
plot(f(range), flt(range))
title('filter')
xlabel('frequency (Hz)')
subplot(rows, cols, 4)    % plot the real part
plot(f(range), abs(Y(range)))
title('filtered real spectrum')
xlabel('frequency (Hz)')
y = ifft(Y);
subplot(rows, cols, 5)
plot(t, y)
title('reconstructed the new signal')
xlabel('time (sec)')
sound(y, fs)
