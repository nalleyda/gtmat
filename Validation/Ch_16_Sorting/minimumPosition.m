function ans = minimumPosition(a, from)
%
%      Finds the smallest element in a tail range of the array
%      from is the first position in a to compare
%      return the position of the smallest element in the
%      range a[from]...a[a.length]
%
     ans = from;
     for i = from : length(a)
         if a(i) < a(ans) 
%             disp(sprintf('smallest at: %d', i));
             ans = i;
         end
     end