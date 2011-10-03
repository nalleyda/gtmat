% Listing 8-4 - Script to copy a text file
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
          fprintf( oh, ln );
      end
  end
  fclose( ih );
  fclose( oh );
