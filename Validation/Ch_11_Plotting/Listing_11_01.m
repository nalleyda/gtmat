% Listing 11-1 - Creating a subplot
 clear
 clc
 close all

 x = -2*pi:.05:2*pi;
 subplot(2,3,1)
 plot(x, sin(x))
 title('1 - sin(x)');

 subplot(2,3,2)
 plot(x, cos(x))
 title('2 - cos(x)');

 subplot(2,3,3)
 plot(x, tan(x))
 title('3 - tan(x)');

 subplot(2,3,4)
 plot(x, x.^2)
 title('4 - x^2');

 subplot(2,3,5)
 plot(x, sqrt(x))
 title('5 - sqrt(x)');

 subplot(2,3,6)
 plot(x, exp(x))
 title('6 - e^x');

