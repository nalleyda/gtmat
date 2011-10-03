 function theCD = findCD(CDs, attrib, value)
% Listing 10-9 - Searching for a specific CD
%   theCD = findCD(CDs, attrib, value)
% find the specific CD
 index = 1;
 found = false;
 while (index <= length(CDs)) && ~found
     CD = CDs(index);
     if valueEq(CD.(attrib), value)
         found = true;
         theCD = CD;
     else
         index = index + 1;
     end
 end
 if ~found
     theCD = [];
 end
