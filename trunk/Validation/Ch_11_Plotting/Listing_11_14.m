% Listing 11-14 - Drawing a solid disk
clear
clc
close all

 %basic parameters
 facets = 200;
 len = 2; radius = 3;
 radial = [0, radius];
 th = linspace(0, 2*pi, facets);
 along = [0 len];
 
 %build the front face
 [r1, tth] = meshgrid( radial, th );
 x1 = zeros(size(r1));   
 y1 = r1.*cos(tth);
 z1 = r1.*sin(tth);
 
 % build the curved surface
 [l, tth] = meshgrid(along, th);
 x2 = l;                  
 y2 = radius*cos(tth);
 z2 = radius*sin(tth);
 
 % build the back face
 x3 = len*ones(size(r1)); 
 [r3, tth] = meshgrid(radial(end:-1:1), th);
 y3 = r3.*cos(tth);
 z3 = r3.*sin(tth);
 
 % assemble and draw the three parts
 x = [x1 x2 x3]; y = [y1 y2 y3]; z = [z1 z2 z3];
 surf(x, y, z);
 shading interp
 colormap copper
 axis equal, axis tight, axis off
