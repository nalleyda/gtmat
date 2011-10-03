function b = merge(first, second)
%      Merges two sorted arrays into the array to be sorted by this
%      merge sorter. 

% merge both halves into the temporary array
      iFirst = 1;  % next element to consider in the first array
      iSecond = 1; % next element to consider in the second array
      out = 1;     % next open position in a
      sf = size(first);  % as long as neither i1 nor i2 past the end,
      ss = size(second); % move the smaller element into a
     while (iFirst <= sf(1)) & (iSecond <= ss(1))
         if first(iFirst) < second(iSecond)
            b(out,1) = first(iFirst);
            iFirst = iFirst + 1;
         else
            b(out,1) = second(iSecond);
            iSecond = iSecond + 1;
         end
         out = out + 1;
     end
      while iFirst <= sf(1) % copy any remaining entries of the first array
          b(out,1) = first(iFirst);
          out = out + 1;
          iFirst = iFirst + 1;
      end
      
      while iSecond <= ss(1) % copy any remaining entries of the second array
          b(out,1) = second(iSecond);
          out = out + 1;
          iSecond = iSecond + 1;
      end
