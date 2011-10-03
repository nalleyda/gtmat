% Listing 14-2 - Play a tune fragment poorly
%  run this immediately after Listing 14-1

 smallworld = [ 1 3; 
                   1 1; 
                   3 2; 
                   1 2; 
                   2 3; 
                   2 1; 
                   2 4] 
 l = length(smallworld);
 for i = 1:l
     f = freq(smallworld(i,1));
     n = cnt(smallworld(i,1)) * smallworld(i,2);
     sound(note(1:n), f);
     pause(wait*smallworld(i,2));
 end

