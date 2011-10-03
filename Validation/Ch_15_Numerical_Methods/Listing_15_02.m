% Listing 15-2 - Eyeball linear estimation
clear
clc
close all

 x = 0:5;
 y = [0 20 60 68 77 110];
 y2 = 20 * x;
 plot(x, y, 'o', x, y2);
 axis([-1 7 -20 120])
 title('Linear Estimate')
 xlabel('Time (sec)')
 ylabel('Temperature (degrees F)')
 grid
