 function newCDs = filterCDs( CDs, attrib, value )
% Listing 10-6 - Filtering a CD collection
%  newCDs = filterCDs( CDs, attrib, value )
% get rid of all CDs with the attribute 
%                    equaling the given value
 index = 1;
 for CD = CDs
     if ~valueEq( CD.(attrib), value )
         newCDs(index) = CD;
         index = index + 1;
     end
 end
 if index == 1
     newCDs = [];
 end

