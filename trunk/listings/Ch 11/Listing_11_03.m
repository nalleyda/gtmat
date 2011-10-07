clear
clc
close all
% Listing 11.03 Parametric plots
th = linspace(0, 2*pi, 40);
r = 1.1; g = .1;
cx = sqrt(r^2-g^2) - 1; cy = g;
x = r*cos(th) + cx;
y = r*sin(th) + cy;
plot( x, y,  'r' )
axis equal
grid on
hold on
z = complex(x, y);
w = z + 1./z;
plot( real(w), imag(w), 'k' );
%Listing 11.04 Simple 3-D line plots
x=0:0.1:3.*pi;
y1=zeros(size(x));
z1=sin(x);
z2=sin(2.*x);
z3=sin(3.*x);
y3=ones(size(x));
y2=y3./2;
plot3(x,y1,z1, 'r',x,y2,z2, 'b',x,y3,z3, 'g')
grid on
xlabel('x-axis'), ylabel('y-axis'), zlabel('z-axis')
