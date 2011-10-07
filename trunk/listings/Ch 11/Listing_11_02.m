% Listing 11.2 Simple 2-D plots
x = linspace(-1.5, 1.5, 30);
clr = 'rgbk';
for pwr = 1:4
    plot(x, x.^pwr, clr(pwr))
    hold on
end
xlabel('x')
ylabel('x^N')
title('powers of x')
legend({'1', '2', '3', '4'}, ...
          'Location','SouthEast')
