clear
clc
clf
rows = 2;
cols = 2;
% set up two sine waves
dt = 1/400      % sampling period (sec)
N = 10000     % number of points
f1 = 3          % first frequency
f2 = 8          % second frequency
t = (1:N) * dt;   % time array for plotting
x = sin(2*pi*f1*t) + sin(2*pi*f2*t);        % the signal
subplot(rows, cols, 1)    % plot it
plot(t(1:(1/dt)), x(1:(1/dt)))
title('original signal')
xlabel('time (sec)')
df = 1 / t(end)       % the frequency interval
fmax = df * N / 2 
Y = fft(x);         % perform the transform
f = (1:N) * 2 * fmax / N; % frequencies for plotting
subplot(rows, cols, 2)    % plot the imaginary part
plot(f(1:N/3), imag(Y(1:N/3)))
title('imag spectrum')
xlabel('frequency (Hz)')
% find the maximum value and location
[level1, index1] = max(imag(Y(1:(N/2))).^2)
[level2, index2] = max(imag(Y((N/2+1):end)).^2)
newF = 50
newBasic = 50 / df
newI1 = newBasic + 1
newI2 = N - newBasic + 1
newV = complex(0, -sqrt(level1)/2)
Y(newI1) = newV;
Y(newI2) = -newV;
subplot(rows, cols, 4)    % plot the imaginary part
plot(f(1:N/3), imag(Y(1:N/3)))
title('imag spectrum with added signal')
xlabel('frequency (Hz)')
y = ifft(Y);
subplot(rows, cols, 3)
plot(t(1:(1/dt)), y(1:(1/dt)))
title('reconstructed the new signal')
xlabel('time (sec)')
