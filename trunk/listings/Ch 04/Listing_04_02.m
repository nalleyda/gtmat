clear
clc
close all
% Listing 04.02 Script with if statements
grade = input('what grade? ');
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
 Listing 04.03 The if statement with a logical vector
A = [true true false]
if A
% will not execute
end
A(3) = true;
if A
% will execute
end
