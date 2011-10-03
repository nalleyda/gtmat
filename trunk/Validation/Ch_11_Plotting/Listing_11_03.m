% Listing 11-3 - Demonstrating plot options
 clear
 clc
 close all
 
 x = linspace(0, 2*pi);
 subplot(2, 3, 1)
 plot(x, sin(x))
 axis([0 2*pi -0.5 0.5])
 title('Changing Data Range on an Axis')
 
 subplot(2, 3, 2)
 plot(x, sin(x))
 hold on
 plot(x, cos(x))
 axis tight
 title('Multiple Plots with hold on')
 
 subplot(2, 3, 3)
 plot(x, sin(x),'--')
 hold on
 plot(x, cos(x), 'r:')
 axis tight
 title('Multiple Plots with hold on')
 
 subplot(2, 3, 4)
 N = 16;
 xr = linspace(0, 1, N);
 yr = xr + rand(1,N) - 0.5;
 plot(xr, yr, 'r+')
 title('Symbols for Real Data')
 
 subplot(2, 3, 5)
 x = 0:0.01:20;
 y1 = 20*exp(-0.05*x).*sin(x);
 y2 = 0.8*exp(-0.5*x).*sin(3*x);
 plotyy(x,y1,x,y2,'plot');
 xlabel('Zero to 20 \musec.')
 title('plotting on the Second Axis')
 
 subplot(2, 3, 6)
 pow = linspace(0, 1);
 w = 10.^pow;
 fr = complex(0, w);
 h = (fr.^2 + 0.1*fr + 7.5) ...
     ./ (fr.^4 + 0.12*fr.^3 + 9*fr.^2);
 loglog(w, abs(h))
 title('log - log plots')
