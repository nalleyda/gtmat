function newCDs = addValue( CDs )
% Listing 10-5 - Adding value to a CD collection
%  newCDs = addValue( CDs )
% add the value attribute
 for index = 1:length(CDs)
     CD = CDs(index);
     CD.value = CD.stars / (CD.price + eps);
     newCDs(index) = CD;
 end

