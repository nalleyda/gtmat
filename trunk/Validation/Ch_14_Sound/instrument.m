function instrument(name)

[x, Fs] = wavread(name);
N = length(x)
dt = 1/Fs            % sampling period (sec)
t = (1:N) * dt;     % time array for plotting
Y = abs(fft(x));           % perform the transform
[junk, imax ] = max(Y);
df = 1 / t(end)       % the frequency interval
fmax = df * N / 2 
f = (1:N) * 2 * fmax / N; 
low = imax - 5;
up = imax + 20;
plot(f(low:up), sY(low:up) );
title([name 'spectrum'])
xlabel('frequency (Hz)')
ylabel('energy')
