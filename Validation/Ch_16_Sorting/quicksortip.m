 function quicksortip(from, to)
% Listing 16-4 - Quick sort in place
 %
 %  This function sorts a column array, 
 %  using the quick sort algorithm in place
 %
 if (from < to) 
   p = partition(from, to);
   quicksortip(from, p);
   quicksortip(p + 1, to);
 end

 function lower = partition(from, to)
 global b
 pivot = b(from); i = from - 1; j = to + 1;
 while (i < j)
   i = i + 1;
   while lt(b(i), pivot) 
     i = i + 1;
   end
   j = j - 1;
   while gt(b(j), pivot) 
     j = j - 1;
   end
   if (i < j) 
     temp = b(i); % this section swaps
     b(i) = b(j); % b(i) with b(j)
     b(j) = temp;
   end
 end
 lower = j;
