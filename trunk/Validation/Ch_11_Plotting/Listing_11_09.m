% Listing 11-9 - Basic peaks() plot
clear
clc
close all

 [xx,yy,zz] = peaks(30);
 surf(xx,yy,zz)
 colormap 'default'
 shading interp
 axis tight
 title('peaks')
 xlabel('x'),ylabel('y'),zlabel('z')
