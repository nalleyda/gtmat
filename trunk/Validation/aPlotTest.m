clear
clc
close all
cols = 20
x = (1:cols) - floor(cols/2)
z = x ./ 2
y = (x.^2) ./ max(x)
plot(x+100, y)
%hold on
%plot(y,'r')

