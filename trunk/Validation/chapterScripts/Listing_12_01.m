clear
clc
close all
% Listing 12.01 Script to rotate a line
pts = [3, 10
1, 3];
plot(pts(1,:), pts(2,:))
axis ([0 15 0 15])
hold on
for angle = 0.05:0.05:1
A = [ cos(angle), -sin(angle); sin(angle), cos(angle) ];
pr = A * pts;
plot(pr(1,:), pr(2,:))
end
