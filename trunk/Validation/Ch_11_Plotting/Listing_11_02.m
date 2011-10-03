% Listing 11-2 - Simple 2-D plots
 clear
 clc
 close all
 x = linspace(-1.5, 1.5, 30);
 y1 = x;
 y2 = x.^2;
 y3 = x.^3;
 y4 = x.^4;
 plot(x,y1)
 hold on
 plot(x,y2)
 plot(x,y3)
 plot(x,y4)
 xlabel('a long X label')
 ylabel('an even longer Y label')
 zlabel('a Z label doesn''t belong here')
 title('powers of x') 
%legend({'1','2','3','4'}, ...
%            'Location','SouthEast')

