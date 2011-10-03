 function bestn = findBestn(worldData, n)
% find the indices of the n best countries
% according to the criterion in the function
% fold
% we first map world data to add the field 
%   growth     
 for ndx = 1:length(worldData)
   cntry = worldData(ndx);
   worldData(ndx).growth = fold(cntry);
 end
% now, sort on this criterion
 values = [worldData.growth];
 [junk order] = sort(values);
% filter these to keep the best 10
 bestn = order(end-n+1:end);
 
