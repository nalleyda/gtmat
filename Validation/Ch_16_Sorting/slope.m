 function sl = slope(x, y)
% Estimate the slope of a curve
 if length(x) == 0 || x(end) == x(1)
   error('bad data')
 else
   coef = polyfit(x, y, 1);
   sl = coef(1);
 end
