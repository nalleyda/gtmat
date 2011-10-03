 function writeCDs(CDs, filename)
% Listing 10-4 - Function to write CDs to a text file
% writeCDs(CDs, filename)
 % write a text file from which a general
 % structure can be retrieved

 fh = fopen( filename, 'w');
 attribs = fieldnames(CDs);
 fprintf(fh,'%d\t%d\n', ...
                 length(CDs),length(attribs) );
 for index = 1:length(attribs)
     fprintf(fh, '%s\t', attribs{index} );
 end
 fprintf(fh,'\n');  
 for index = 1:length(attribs)
     att = attribs{index};
     type{index} = class(CDs(1).(att));
     fprintf(fh, '%s\t', type{index} );
 end
 fprintf(fh,'\n');
 for CD = CDs 
     for index = 1:length(attribs)
         switch class(CD.(attribs{index}))
           case 'char'
              str = ['"' CD.(attribs{index}) '"'];
           case 'double'
              str=sprintf('%g', ...
                        CD.(attribs{index}) );
         end
         fprintf(fh, '%s\t', str );      
     end
     fprintf(fh,'\n'); 
 end
 fclose(fh);

 
