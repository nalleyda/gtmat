% Listing 16-6 - Sorting CDs
clear
clc

 buildCDs
 prices = [cds.price];
 [np order] = sort(prices);
 mostExpensive = cds(order(end))
 
 artists = {cds.artist};
 [junk order] = sort(artists);
 for index = order
   cd = cds(index);
   fprintf('%30s:%s\n', cd.artist, cd.title)
 end
