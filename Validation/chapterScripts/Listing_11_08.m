clear
clc
close all
% Listing 11.08 Constructing a cylinder
acets = 120; len = 2; radius = 1;
hr = linspace(0, 2*pi, facets);
r = [0 len];
x, th] = meshgrid( xr, thr );
 = radius * cos(th);
 = radius * sin(th);
urf(x, y, z);
hading interp
olormap bone
axis equal,axis tight,axis off
lightangle(60, 45)
alpha(0.8)
view(-20, 35)
