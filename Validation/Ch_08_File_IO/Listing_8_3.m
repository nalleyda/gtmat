% Listing 8-3 - Listing a file using tokens 
clear
clc

 fn = input( 'file name: ' , 's' );
 fh = fopen( fn, 'r' );
 ln = '';
 while ischar( ln )
     ln = fgetl( fh );
     if ischar( ln )
         ca = [];
         while ~isempty( ln )
             [tk, ln] = strtok( ln );
             ca = [ca {tk}];
         end
         disp( ca );
     end
 end
 fclose( fh );
