 function theCD = bestValue(CDs)
% Listing 10-8 - Finding the best CD
% theCD = bestValue(CDs)
% find the CD with best value
 theCD = CDs(1);
 bestVal = theCD.value;
 for index = 2:length(CDs)
     CD = CDs(index);
     if CD.value > bestVal
         theCD = CD;
         bestVal = CD.value;
     end
 end
