% Listing 15-8 - Differentiating a function
clear
clc
close all

 x = -7:0.1:9;
 f = polyval([0.0333,-0.3,-1.3333,16,0,-187.2,0], x);
 plot(x, f)
 hold on
 df = diff(f)./diff(x);
 plot(x(2:end), df, 'g')
 grid
 legend({'f(x)','f '' (x)'})
