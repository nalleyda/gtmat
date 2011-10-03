% Listing 16-7Updated world data analysis
clear
clc

 worldData = buildData('World_data.xls');
 n = 20;
 bestn = findBestn(worldData, n);
 fprintf('best %d countries are:\n', n)
 for best = bestn(end:-1:1)
   fprintf('%s\n', worldData(best).name)
 end

