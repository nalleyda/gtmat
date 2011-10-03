% Listing 13-3 - Making a collage
 clear
 clc
 close all

 dog = imread('Pep.jpg');
 lake = imread('Lake.jpg');

 [rows, cols, clrs] = size(dog);
 pheight = rows/2; pwidth = cols/2
 border = 40;
 overallw = 2*pwidth + 5*border;
 overallh =  pheight + 4*border;
 frameR = 150; frameG = 100; frameB = 50;
  matR = 255;  matG = 255;  matB = 200;
 % make the outside frame
 frame = uint8(ones( overallh, overallw ));
 collage = uint8(zeros( overallh, overallw, 3 ));
 collage(:, :, 1) = frame * frameR;
 collage(:, :, 2) = frame * frameG;
 collage(:, :, 3) = frame * frameB;
 % insert the mat
 mat = uint8(ones( overallh - 2*border, ...
                    overallw - 2*border ));
 collage(border+1:overallh-border, ...
         border+1:overallw-border,1) = mat*matR;
 collage(border+1:overallh-border, ...
         border+1:overallw-border,2) = mat*matG;
 collage(border+1:overallh-border, ...  
         border+1:overallw-border,3) = mat*matB;
 % crop the dog picture
 left = 180;  % a judgment call
 dogCr = dog( end - pheight + 1: end, ...
              left + 1: left + pwidth, :);
 collage(2*border+1:2*border + pheight, ... 
         2*border+1:2*border + pwidth, :) = dogCr;
 % shrink the lake picture
 lakeSh = lake( 1:2:end, 1:2:end, :);
 collage(2*border+1:2*border + pheight,  ...
         3*border+pwidth+1:3*border+2*pwidth,:) ...
                                   = lakeSh;
 image(collage)
 axis equal
 axis off
 imwrite(collage,'collage.jpg','jpg')



