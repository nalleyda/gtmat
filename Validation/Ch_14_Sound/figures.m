clear
clf
clc
rows = 1
cols = 2
subplot(rows, cols, 1)
[sx, Fsx] = wavread('sax.wav');
N = length(sx)
dt = 1/Fsx            % sampling period (sec)
t = (1:N) * dt;     % time array for plotting
plot(t(1:Fsx/10), sx(1:Fsx/10));
title('sax')
ylabel('amplitude')
xlabel('time (sec)')
subplot(rows, cols, 2)
sY = abs(fft(sx));           % perform the transform
[junk, imax ] = max(sY);
df = 1 / t(end)       % the frequency interval
fmax = df * N / 2 
f = (1:N) * 2 * fmax / N; 
low = imax - 5;
up = imax + 20;
plot(f(low:up), sY(low:up) );
title('sax spectrum')
xlabel('frequency (Hz)')
ylabel('energy')
