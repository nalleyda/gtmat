clear
clc
%% Listing 4-2	Script with if statements
 grade = 78 % input('what grade? ');
 if grade >= 90
     letter = 'A'
 elseif grade >= 80
     letter = 'B'
 elseif grade >= 70
     letter = 'C'
 elseif grade >= 60
     letter = 'D'
 else
     letter = 'F'
 end
