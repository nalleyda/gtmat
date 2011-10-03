% Listing 8-2 - Script to list a text file
clear
clc

 fn = input( 'file name: ', 's' );
 fh = fopen( fn, 'r' );
 ln = '';
 while ischar( ln )
     ln = fgets( fh );
     if ischar( ln )
         fprintf( ln );
     end
 end
 fclose( fh );


