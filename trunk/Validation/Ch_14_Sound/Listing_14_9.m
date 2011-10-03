% Listing 14-9 - Synthetic trumpet muting
clear
clc

 [x, Fs] = wavread('instr_tpt.wav');
 N = length(x);
 dt = 1/Fs ;        % sampling period (sec)
 t = (1:N) * dt;    % time array for plotting
 sound(x, Fs)
 pause(t(N));
 Y = fft(x);        % perform the transform
 df = 1 / t(end);   % the frequency interval
 fmax = df * N / 2;
 f = (1:N) * 2 * fmax / N; 
 subplot(1, 2, 1);
 frac = floor(N/10);
 plot(f(1:frac), abs(Y(1:frac)));
 title('trumpet original')
 xlabel('frequency (Hz)')
 ylabel('energy')
 fcut = 925; %Hz
 icut = floor(fcut / df);
 foff = 1100; %Hz
 ioff = floor(foff / df);
 Y(icut:end-icut) = Y(icut:end-icut) * 0.2;
 Y(ioff:end-ioff) = 0;
 subplot(1, 2, 2);
 plot(f(1:frac), abs(Y(1:frac)));
 title('truncated trumpet')
 xlabel('frequency (Hz)')
 ylabel('energy')
 y = abs(ifft(Y));
 y = y / max(y);
 disp('synthetic muted');
 sound(y, Fs);
 pause(t(N));
 disp('real muted');
 [x, Fs] = wavread('instr_mutetpt.wav');
 sound(x / (max(x)*4), Fs)
