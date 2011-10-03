% 13-1	Consider the following image (assume it is a perfect square), saved under the file mysquare.jpg:
% 
% 
% 
% 
% And the following code:
% b = imread('mysquare.jpg');
% [n,m,l] = size(b);
% a = b(1:end, 1:n/2, :);
% c = b(1:end, (n/2 + 1):end, :);
% b = [c a];
% imshow(b);
% Which of these will the picture shown on the last line most resemble?
% a.  	        b.	               c.              d.
% 
% 
% 
% 
% 
% 
% 
% 
% 13-2	Given an image file called american_flag.jpg in which the colors are red, white, and blue, and the code is as follows:
% af = imread('american_flag.jpg');
% [r1,c1] = find(af(:,:,1) == 255 …
%             && af(:,:,2) == 0 …
%             && af(:,:,3) == 0); 
% [r2,c2] = find(af(:,:,1) == 0 …
%             && af(:,:,2) == 0 …
%             && af(:,:,3) == 255);
% [r3,c3] = find(af(:,:,1) == 255 …
%             && af(:,:,2) == 255 …
%             && af(:,:,3) == 255);
% af(r1,c1,:) = 0;
% af(r2,c2,:) = 255;
% af(r3,c3,2:3) = 0;
% image(af)
% What happens in the resulting image?
% 13-3	Given the following code:
% buzz = imread(‘GTBuzz.jpg’);
% Which of the following lines of code would cause buzz to be displayed in the greenest color? 
% a.	buzz(:, :, 1) = 0;
% b.	buzz(:, :, 1) = 255;
% c.	buzz(:, :, 2) = 0;
% d.	buzz(:, :, 2) = 255;
% e.	buzz(:, :, 3) = 0;
% g.	buzz(:, :, 3) = 255;
% 13-4	The edge detection algorithm in Section 13.5 applies only to true color images. Rewrite it to apply it to bit-mapped images.
% 13-5	Write a script that reads the image uselessTA.jpg and converts it into a RGB matrix. The script then displays a sub-image of uselessTA.jpg. The sub-image starts at pixel number 50 on both the x and y axes. The height and width of the sub-image are each 50 pixels.
% 13-6	Consider this code that reads in an image saved as myimage.jpg:
% b = imread('myimage.jpg');
% [m,n,l] = size(b);
% count = 0;
% for i = 1:m
%   for j = 1:n
%      if ( <A> (double(b(i, j, <B> )))) == <C>  
%            count = count + 1;
%      end
%   end
% end
% 
% What would you put in the place of <A>, <B>,  and <C> to give you the number of completely white pixels in the image?
% 13-7	You are provided an image and your job is to convert the full-sized image to one that is one-fourth of the original size. Normally when image processing software is required to resize an image, a complex resizing algorithm is used to accomplish the conversion. We will attempt to duplicate this conversion.
% Write a function called resizeMe that takes in a string as an input corresponding to an image file name. The function should then resize the image to one-fourth its original size and display it. 
% Additionally your function should use the built-in function imwrite to create an image file containing the new image, named with the original file name preceded by ‘SM’. For example, if the original file is called yellow_bird.jpg, the new file should be called SMyellow_bird.jpg.
% Note: Your function should work with ALL .jpg files! So be sure to test it with multiple files of different sizes. Remember image matrices have to be of type uint8, so make sure to cast the result at the end.
% You must use iteration to accomplish this task.
% <Begin Hint>
% Hint: To generate a pixel in the smaller image, take the average of four pixels that make up a square at that position in the original image.
% <End Hint>
% 13-8	Write a function called IMrotate that takes in an image matrix and a number. The number represents the number of times the function will rotate the image by 90°. A negative number signifies counter-clockwise rotation and a positive one signifies clockwise rotation. You are not allowed to use the built-in function rot90(...).
% <Begin Hint>
% Hint: Rotating counter-clockwise once is the same as rotating clockwise three times.
% <End Hint>
%  
