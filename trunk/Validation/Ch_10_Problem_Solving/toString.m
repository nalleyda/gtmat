 function str = toString(item)
% Listing 10-3 - The toString(...) helper function
% str = toString(item)
% convert an object of any class to string form
 if isa(item, 'char')
     str = ['''' item ''''];
 elseif isa(item, 'double') 
     if length(item) == 1
         str = sprintf('%g', item );
     else
         str = '[';
         for in = 1:length(item)
            str = [str sprintf(' %g', item(in) )];
         end
         str = [str ' ]'];
     end
 elseif isa(item, 'struct')
     nms = fieldnames(item);
     str = [];
     for in = 1:length(nms)
         nm = nms{in};
         str=[str nm ': ' toString(item.(nm)) 13];
     end
 else
     str = 'unknown data';
 end

