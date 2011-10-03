function lower = partition(a, from, to)
%
%   This function partitions a column array for the quick sort 
%   algorithm
%
%    disp(sprintf('partition(a, %d, %d)', from, to ));
%    a
  pivot = a(from);
  i = from - 1;
  j = to + 1;
  while (i < j)
      i = i + 1;
      while (a(i) < pivot) 
          i = i + 1;
      end
      j = j - 1;
      while (a(j) > pivot) 
          j = j - 1;
      end
      if (i < j) 
%          swap(a, i, j);
          temp = a(i);
          a(i) = a(j);
          a(j) = temp;
      end
  end
  lower = j;
  assignin('caller',inputname(1), a);