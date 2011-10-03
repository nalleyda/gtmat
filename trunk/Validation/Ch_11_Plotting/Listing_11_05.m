% Listing 11-5 - Simple 3-D line plots
clear
clc
close all

 x=0:0.1:3.*pi;
 y1=zeros(size(x));
 z1=sin(x);
 z2=sin(2.*x);
 z3=sin(3.*x);
 y3=ones(size(x));
 y2=y3./2;
 plot3(x,y1,z1,'r')
 hold on
 plot3(x,y2,z2,'b')
 plot3(x,y3,z3,'g')
 grid on
 xlabel('x-axis')
 ylabel('y-axis')
 zlabel('z-axis') 
