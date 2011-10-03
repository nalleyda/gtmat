% Listing 12-1 - Script to rotate a line
clear
clc
close all

 pts =   [3, 10
          1, 3];
 plot(pts(1,:), pts(2,:))
 axis ([0 15 0 15])
 hold on
 for angle = 0.05:0.05:1
     A = rotation(angle);
     pr = A * pts;
     plot(pr(1,:), pr(2,:))
 end

