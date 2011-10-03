 function K = simpson( v, a, b )
% Listing 15-6 - Simpson's rule integration
 %  h = simpson(v, a, b )
K = (b-a) * (v(1) + v(end) + ...
  4*sum(v(2:2:end-1)) + ...
  2*sum(v(3:2:end-2)) ) / (3*(length(v) - 1) );

