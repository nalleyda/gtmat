clear
clc
close all
car = imread('Volta.jpg');
% size the plot to fit the image
% and no axes
%imshow(car)
%figure
% stretch the image to standard
% plot and added axes
imshow(car)
[rows cols clrs] = size(car)
lr = car(:, cols:-1:1, [1 1 3]);
figure
imshow(lr)
%cols = 20
%x = (1:cols) - floor(cols/2)
%z = x ./ 2
%y = (x.^2) ./ max(x)
%hold on
%plot(x+100, y)


