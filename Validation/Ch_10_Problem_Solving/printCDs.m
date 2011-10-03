 function printCDs(CDs, filename, attrib)
% Listing 10-2 - Listing one field to a text file
 % usage: printCDs(CDs, filename, attrib) 
 % print the specified attribute of all the CDs
 %   attrib must be one of the attributes as 
 %                         a character string
 fh = fopen(filename, 'w');
 for CD = CDs
     fprintf( fh, '%s: %s\n', ...
             attrib, toString(CD.(attrib)) );
 end
 fclose(fh);

