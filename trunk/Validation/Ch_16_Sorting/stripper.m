 clear
 clc
 
 ifn = input( 'input file name: ', 's' );
 ofn = input( 'output file name: ', 's' );
 ih = fopen( ifn, 'r' );
 oh = fopen( ofn, 'w' );
 ln = '';
 while ischar( ln )
     ln = fgets( ih );
     if ischar( ln )
         lndot = find(ln == '.');
         if length(lndot > 0)
             n = lndot(1)+1;
             fprintf( oh, '%s', ln(n:end) );
         else
             fprintf( oh, '%s', ln);
         end
     end
 end
 fclose( ih );
 fclose( oh );
