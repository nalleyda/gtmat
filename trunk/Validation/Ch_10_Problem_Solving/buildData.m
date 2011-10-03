 function worldData = buildData(name)
% Listing 10-11 - Building the country data
 
% read the spreadsheet into a data array 
%               and a text cell array
 [data txt] = xlsread(name);
 country = ' ';  % force the first data row 
                    % to change the country
 cntry_index = 0;
%  Traverse the data and cell arrays producing
%    an array of structures,
%    one for each country 
 
 for row = 1:length(data)
    % Because the text data in txt contains
    %  the header row of the spreadsheet, 
    %  the data at a given row belongs to the country 
  
    % if the country name changes, 

     if ~strcmp(txt{row+1}, country)
         col = 1;
         country = txt{row+1};
         cntry_index = cntry_index + 1;
         cntry.year = 1;
         cntry.pop = 1;
         cntry.gdp = 1;
     end
     cntry.name = country;
     cntry.year(col) = data(row, 1);
     cntry.pop(col)  = data(row, 2);
     cntry.gdp(col) = data(row, 5);
     col = col + 1;
     worldData(cntry_index) = cntry;
 end


