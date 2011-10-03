% Listing 14-8 - Adding a signal to the spectrum
clear
clc

 rows = 2; cols = 2;
    % set up two sine waves
 dt = 1/400;             % sampling period (sec)
 N = 10000;              % number of points
 f1 = 3; f2 = 8;         % signal frequencies
 t = (1:N) * dt;         % time array for plotting
 x = sin(2*pi*f1*t) + sin(2*pi*f2*t);
 subplot(rows, cols, 1)    
 plot(t(1:(1/dt)), x(1:(1/dt)))
 title('original signal')
 xlabel('time (sec)')
 Y = fft(x);              % perform the transform
 df = 1 / t(end);         % the frequency interval
 fmax = df * N / 2; 
 f = (1:N) * 2 * fmax / N; % frequencies
 subplot(rows, cols, 2)    % plot the spectrum
 plot(f(1:N/3), abs(Y(1:N/3)))
 title('spectrum')
 xlabel('frequency (Hz)')
    % find the maximum value and location
 level1 = max(abs(Y));
 newF = 50;
 newBasic = 50 / df;
 newI1 = newBasic + 1;
 newI2 = N - newBasic + 1;
 newV = complex(0, -level1/2);
 Y(newI1) = newV;
 Y(newI2) = -newV;       % imaginary part negated
 subplot(rows, cols, 4)  % plot the new spectrum
 plot(f(1:N/3), abs(Y(1:N/3)))
 title('spectrum with added signal')
 xlabel('frequency (Hz)')
 y = ifft(Y);
 subplot(rows, cols, 3)
 plot(t(1:(1/dt)), y(1:(1/dt)))
 title('reconstructed the new signal')
 xlabel('time (sec)')

