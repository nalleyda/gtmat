%% Listing 4-8	Loop-and-a-half example
 R = 1;					
 while R > 0					
     R = 2% input('Enter a radius: ');	
     if R > 0				
         area = pi * R^2;
         circum = 2 * pi * R;
         fprintf('area = %f; circum = %f\n', ...
             area, circum);
     end
     R = 0
 end
