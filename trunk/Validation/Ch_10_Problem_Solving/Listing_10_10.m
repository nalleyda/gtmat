% Listing 10-10 - Country analysis
% build the country array 
clear
clc

 worldData = buildData('World_data.xls');
 
 best = findBest(worldData);
 
 fprintf('best country is %s\n', ...
     worldData(best).name)
