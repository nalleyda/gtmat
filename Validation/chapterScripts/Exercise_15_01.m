clear
clc
close all
x = 0:5;
y = [0, 20, 60, 68, 77, 110];
interp1(x, y ,1.5)
new_x = 0:0.2:5
length(new_x)
new_y = interp1(x,y,new_x)
length(new_y)
plot(x, y)
hold on
plot(new_x, new_y, 'o')
axis([-1,7,-20,120])
title('linear Interpolation Plot')
xlabel('x values') ; ylabel('y values')

