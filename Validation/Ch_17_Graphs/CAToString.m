 function str = CAToString(ca)
% Listing 17-4 - Converting a cell array to a string
% Traverse a cell array to make a string
 str = '';
 for in = 1:length(ca)
     str = [str toString(ca{in}) 13];
 end

