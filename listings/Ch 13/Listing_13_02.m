clear
clc
close all
% Listing 13.02 Replacing the gray sky
v = imread('Vienna.jpg');
w = imread('Witney.jpg');
thres = 160;
layer = (v(:,:,1) > thres) ...
& (v(:,:,2) > thres) ...
& (v(:,:,3) > thres);
mask(:,:,1) = layer;
mask(:,:,2) = layer;
mask(:,:,3) = layer;
mask(700:end,:,:) = false;
nv = v;
nv(mask) = w(mask);
image(nv);
imwrite(nv, 'newVienna.jpg', 'jpg')
