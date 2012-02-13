clear
clc
close all
% Listing 13.05 Rotating a globe
WM = imread('figure_13_15_map_projection.jpg');
WM(:,end+1,:) = WM(:,1,:);
snow = mean(mean(WM(1,:,:)));
[WMr, WMc, clr] = size(WM);
rowsperdeglat = WMr/170
add = floor(rowsperdeglat * 5)
addlayer = uint8(ones(add, WMc) * snow);
toAdd(:,:,1) = addlayer;
toAdd(:,:,2) = addlayer;
toAdd(:,:,3) = addlayer;
worldMap = [toAdd; WM; toAdd];
[nlat nlong clr] = size(worldMap)
lat = double(0:nlat-1) * pi / nlat;
long = double(0:nlong-1) * 2 * pi / (nlong-1);
[th phi] = meshgrid(long, lat);
radius = 10;
zz = radius * cos(phi);
xx = radius * sin(phi) .* cos(th);
yy = radius * sin(phi) .* sin(th);
wM = double(worldMap) / 256;
surf(xx, yy, zz, wM);
shading interp
axis equal, axis off, axis tight
th = 0;
while true
th = th - 1;
view([th 20]);
lightangle(th+50, 20)
pause(.001)
end
