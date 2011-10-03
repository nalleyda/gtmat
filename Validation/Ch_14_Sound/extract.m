clear
clc
rows = 3;
cols = 2;
% read original speech
[x, fs] = wavread('noisyspeech.wav');

sound(x, fs)
disp('original signal - press enter')

pause

dt = 1/fs      % sampling period (sec)
pts = length(x)     % number of points
t = (1:pts) * dt;   % time array for plotting
subplot(rows, cols, 1)    % plot it
plot( t(1:(fs/5)), x(1:(fs/5)) )
title('original signal')
xlabel('time (sec)')
df = 1 / t(end)       % the frequency interval
fmax = df * pts / 2 % the max frequency is half what you think
                    % because the spectrum is mirrored about
                    % the max frequency, but has the same
                    % number of points

Y = fft(x);         % perform the transform
f = (1:pts) * 2 * fmax / pts; % frequencies for plotting
subplot(rows, cols, 2)    % plot the specrum power
YY = abs(Y);
plot(f, YY)
title('power spectrum')
xlabel('frequency (Hz)')
% find the location of the first noise peak (first half of spectrum)
[peak, index1] = max(YY(1:(pts/2)))
% take a good look at the spectrum in that region
subplot(rows, cols, 3)
% find the location of the second noise peak (second half of spectrum)
plot(f((index1 - 30) : (index1 + 30)), YY((index1 - 30) : (index1 + 30)));
title('expand data around the max')
xlabel('frequency (Hz)')
flt = hiPass(index1*3, pts);
range = 1:floor(length(f)/10);
subplot(rows, cols, 4);
plot(f(range), flt(range));
title('filter')
xlabel('frequency (Hz)')
subplot(rows, cols, 5);
Y1 = Y.*flt;
YY1 = abs(Y1);
plot(f(range), YY1(range))
title('modified real spectrum')
xlabel('frequency (Hz)')
y = ifft(Y1) * 20;
subplot(rows, cols, 6)
range = 1000:(1000+fs/30);
plot(t(range), y(range))
title('reconstructed the new signal')
xlabel('time (sec)')
sound(y, fs)
