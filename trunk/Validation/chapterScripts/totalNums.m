% Listing 7-2 - Cell array processing example
 function ans = totalNums(ca)
 % count the numbers in a cell array
     ans =  0 ;
     for in =  1 :length(ca)
         item = ca{in} ;     % extract the item
         if isnumeric(item) % check if a vector
             ans = ans + prod(size(item));
         end
     end
