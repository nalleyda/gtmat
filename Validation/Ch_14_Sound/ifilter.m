clear
clc
clf

[x, Fs] = wavread('tpt.wav');
N = length(x);
sound(x, Fs)
dt = 1/Fs ;        % sampling period (sec)
t = (1:N) * dt;    % time array for plotting
pause(t(N));
Y = fft(x);   % perform the transform
df = 1 / t(end) ;  % the frequency interval
fmax = df * N / 2 ;
f = (1:N) * 2 * fmax / N; 
subplot(1, 2, 1);
frac = floor(N/10);
plot(f(1:frac), abs(Y(1:frac)));
title('trumpet original')
xlabel('frequency (Hz)')
ylabel('energy')
subplot(1, 2, 2);
fhalf = 925; %Hz
ihalf = floor(fhalf / df);
foff = 1100; %Hz
ioff = floor(foff / df);
Y(ihalf:end-ihalf) = Y(ihalf:end-ihalf) * 0.2;
Y(ioff:end-ioff) = 0;
plot(f(1:frac), abs(Y(1:frac)));
title('truncated trumpet')
xlabel('frequency (Hz)')
ylabel('energy')
y = abs(ifft(Y));
mx = max(y);
y = y / mx;
disp('synthetic muted');
sound(y, Fs);
pause(t(N));
disp('real muted');
[x, Fs] = wavread('mutetpt.wav');
mx = max(x);
x = x / mx;
sound(x, Fs)
