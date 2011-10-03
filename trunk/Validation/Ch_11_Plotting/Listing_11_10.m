% Listing 11-10 - Constructing a cylinder
clear
clc
close all

 facets = 120;  len = 2;  radius = 1;
 thr = linspace(0, 2*pi, facets);
 xr = [0 len];
 [x, th] = meshgrid( xr, thr );
 y = radius * cos(th);		
 z = radius * sin(th);
 surf(x, y, z);
 shading interp
 colormap bone			
 axis equal,axis tight,axis off 
 lightangle(60, 45) 		 
 alpha(0.8) 				
 view(-20, 35)
