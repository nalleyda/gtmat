clear
clc
%% Listing 4-1	if statement example
 day = 3; %input('enter a day(1-7): ');
 if day == 7 	% Saturday
 	state = 'weekend'
 elseif day == 1 	% Sunday
 	state = 'weekend'
 else
 	state = 'weekday'
 end 
 
