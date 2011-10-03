% Listing 14-5 - FFT of a sine wave
clear
clc
close all

 dt = 1/400            % sampling period (sec)
 pts = 10000           % number of points
 f = 8                 % frequency
 t = (1:pts) * dt;     % time array for plotting
 x = sin(2*pi*f*t);
 subplot(2, 2, 1)
 plot(t(1:end/25), x(1:end/25));
 title('time domain sine wave')
 ylabel('amplitude')
 xlabel('time (sec)')
 Y = fft(x);           % perform the transform
 df = 1 / t(end)       % the frequency interval
 fmax = df * pts / 2 
 f = (1:pts) * 2 * fmax / pts; 
                      % frequencies for plotting
 subplot(2,2,3)
 plot(f, real(Y))
 title('real part')
 xlabel('frequency (Hz)')
 ylabel('energy')
 subplot(2,2,4)
 plot(f, imag(Y))
 title('imaginary part')
 xlabel('frequency (Hz)')
 ylabel('energy')



