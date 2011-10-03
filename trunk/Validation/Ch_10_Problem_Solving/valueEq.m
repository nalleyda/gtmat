 function ans = valueEq( A, B )
% Listing 10-7 - Helper function with a generic equality test
 % are A and B equal, regardless of data type?
 switch class(A)
     case 'char'
         ans = strcmp(A, B);
     otherwise
         ans = (A == B);
 end

