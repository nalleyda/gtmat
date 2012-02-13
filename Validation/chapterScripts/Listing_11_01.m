clear
clc
close all
% Listing 11.01 Creating a subplot
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
title('4 - e^x');
Listing 11.02 Simple 2-D plots
 = linspace(-1.5, 1.5, 30);
1 = x;
2 = x.^2;
3 = x.^3;
4 = x.^4;
 THIS WITH A FOR LOOP
xlabel('x')
ylabel('value')
title('powers of x')
legend({'1', '2', '3', '4'}, ...
'Location','SouthEast')
