function b = domerge(first, second)
%
%      Merges two sorted arrays into the array to be sorted by this
%      merge sorter. 
%      @param first the first sorted array
%      @param second the second sorted array
%

% merge both halves into the temporary array

      iFirst = 1;
      % next element to consider in the first array
      iSecond = 1;
      % next element to consider in the second array
      out = 1; 
      % next open position in a

      % as long as neither i1 nor i2 past the end, move
      % the smaller element into a
      sf = size(first);
      ss = size(second);
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
     
%     disp(sprintf('iF: %d; s1: [%d,%d]; iS: %d; s2: [%d,%d]', ...
%         iFirst, size(first), iSecond, size(second) ) );

      % note that only one of the two while loops
      % below is executed

      % copy any remaining entries of the first array
      while iFirst <= sf(1)
          b(out,1) = first(iFirst);
          out = out + 1;
          iFirst = iFirst + 1;
      end
      % copy any remaining entries of the second array
      while iSecond <= ss(1)
          b(out,1) = second(iSecond);
          out = out + 1;
          iSecond = iSecond + 1;
      end
