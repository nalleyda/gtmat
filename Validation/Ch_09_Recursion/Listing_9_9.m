% Listing 9-9 - Finding arm position
 clear
 clc
close all

% global r1
 r1 = 4
% global r2
 r2 = 3
% global alpha
 alpha = pi/6  % 30 deg
 beta = linspace(-pi, pi);
 pf =  r1 .* (cos(alpha) + sin(alpha) - 1)  + r2 * (cos(beta) + sin(beta) - 1);
betaD = beta .* 180 ./ pi;
plot(betaD, pf)
hold on
grid on
xp = [betaD(1) betaD(end)]
plot(xp, [0 0], 'k')
xlabel('beta, degrees')
ylabel('f(beta)')
% zeros = find(pf(1:end-1) .* pf(2:end) <= 0)
% disp('zeros occur just after')
% beta(zeros)
% 
% zero = findZeroAB([beta(zeros(1)) ...
%                       beta(zeros(1)+1)])
