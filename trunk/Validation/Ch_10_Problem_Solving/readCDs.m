 function CDs = readCDs(filename)
% Listing 10-1 - Custom structure read function
% CDs = readCDs(filename)
% read a text file describing the CD collection.
 % The first line specifies the number of CDs and
 % attributes
 % The second line lists the attributes
 % The 3rd line lists the class of each attribute
 % Subsequent lines list the data for each CD, 
 %   one line per CD
 fh = fopen(filename, 'r');
 ns = textscan(fh, '%d %d', 1);
 noCDs = ns{1};
 noAtts = double(ns{2});
 temp = textscan(fh, '%s\t', noAtts );
 att = temp{1};
 temp = textscan(fh, '%s\t', noAtts );
 type = temp{1};
 form = '';
 for at = 1:noAtts
     switch type{at}
         case 'char'
             form = [form '%q'];
         case 'double'
             form = [form '%f'];
     end
     if at < noAtts
         form = [form ' '];
     end
 end
 for line = 1:noCDs
     temp = textscan(fh, form, 1 );
     for at = 1:noAtts
         value = temp{at};
         switch type{at}
             case 'char'
                 value = value{1};
         end
         CD.(att{at}) = value;
     end
     CDs(line) = CD;
 end
 fclose(fh);

