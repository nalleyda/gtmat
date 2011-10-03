% Listing 11-12 - Rotating z = x^2 about the x and z axes
clear
clc
close all

 facets = 100;
 x = linspace(0, 5, facets);
 th = linspace(0, 2*pi, facets);
 [xx tth] = meshgrid(x, th);
 
 % rotate about the x axis
 subplot(1, 2, 1)
 rr = xx.^2;
 yy = rr .* cos(tth);
 zz = rr .* sin(tth);
 surf(xx, yy, zz, xx);
 shading interp, axis tight
 xlabel('x'), ylabel('y'), zlabel('z')
 title('x^2 rotated about the x axis')
 
 % rotate about the z axis
 subplot(1, 2, 2)
 rr = xx;
 zz = rr.^2;
 xx = rr .* cos(tth);
 yy = rr .* sin(tth);
 surf(xx, yy, zz);
 shading interp, axis tight
 xlabel('x'), ylabel('y'), zlabel('z')
 title('x^2 rotated about the z axis')

