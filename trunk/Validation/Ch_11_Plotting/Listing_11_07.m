% Listing 11-7 - Simple solid cube
clear
clc
close all

xx = [-1, -1,  1, 1, -1;   % A-B-C-D-A
      -1, -1,  1,  1, -1]  % D-E-F-G-D 
yy = [ 1, -1, -1,  1,  1;   % A-B-C-D-A
       1, -1, -1,  1,  1]  % D-E-F-G-D
zz = [ 1,  1,  1,  1,  1;   % A-B-C-D-A
      -1, -1, -1, -1, -1]  % D-E-F-G-D 
subplot(1, 2, 1)  
surf(xx, yy, zz)
axis equal
shading interp
view(-36, 44)
axis off

xx = [ 0,  0,  0,  0,  0;  % P-P-P-P-P
      -1, -1,  1,  1, -1;  % A-B-C-D-A
      -1, -1,  1,  1, -1;  % D-E-F-G-D
       0,  0,  0,  0,  0] % Q-Q-Q-Q-Q
yy = [ 0,  0,  0,  0,  0;  % P-P-P-P-P
       1, -1, -1,  1,  1;  % A-B-C-D-A
       1, -1, -1,  1,  1;  % D-E-F-G-D
       0,  0,  0,  0,  0] % Q-Q-Q-Q-Q
zz = [ 1,  1,  1,  1,  1;  % P-P-P-P-P
       1,  1,  1,  1,  1;  % A-B-C-D-A
      -1, -1, -1, -1, -1;  % D-E-F-G-D
      -1, -1, -1, -1, -1] % Q-Q-Q-Q-Q
subplot(1, 2, 2)  
surf(xx, yy, zz)
axis equal
shading interp
view(-36, 44)
axis off
