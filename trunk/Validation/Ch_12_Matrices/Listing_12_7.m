% Listing 12-7 - Linear curve fit
clear
clc

 % the file gasoline.dat contains two data 
 % columns:  the miles driven and the gas used.
 r = dlmread('gasoline.dat');
 x = r(:,2)';
 y = r(:,1)';
 plot(x, y, 'rx');
 hold on
 title('gas vs miles');
 ylabel('miles');
 xlabel('gallons');
 c = [ sum(x.^2) sum(x); sum(x) 1];
 rhs = [sum(x.*y); sum(y)]
 a = c \ rhs;
 plot(x, a(1)*x + a(2)) 
 fprintf('average mpg = %f\n', a(1) );

