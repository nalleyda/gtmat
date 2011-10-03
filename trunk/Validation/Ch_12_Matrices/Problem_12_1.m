% 12.1	Do the following matrix exercises:
% a.		Create a 5 × 6 matrix A that contains random numbers between 0 and 10.
% b.	Create a 6 × 5 matrix B that contains random numbers between 0 and 10.
% c.		Find the inverse of matrix A*B and store it in the variable, C.
% d.	Create a new matrix D that is the same as A except that all values less than 5 are replaced by zero. (Do not use iteration to create D).
% e.		Create a new matrix F that is the same as A except that all values less than 5 are replaced by zero; use iteration to create F.
% f.	Create a new matrix G that is the “horizontal” reverse of A. For example:
%  [1 2 3         [3 2 1
%   3 2 5    =>    5 2 3
%   1 7 4]         4 7 1]
% g.	Find the minimum value among all the elements in A and store your answer in the variable H.
% 
% 12.2	Which of the following statements is true?
% 	a.	eye(5) is equivalent to eye(5,5)
% 	b.	size(eye(size(A))) is equal to size(A)
% 	c.	Typing “eye” at the command prompt will produce an error
% 12.3	Write a short script to solve the system of linear equations:
% 	2x + 5y + 7z = 9
% 	3x + 2y + 3z = 2
% 	  x + 3y + 2z = 5
% 12.4	As an enthusiastic and motivated student, you decided to buy plenty of pens for all your classes this semester. This spending spree occurred at the unfortunate time before you realized that your engineering classes required little use for “ink”. So now you’re left with four different types of pens and no receipt—you only remember the total amount you spent, and not the price of each type of pen.
% You decide to get together with three of your friends who coincidentally did the same thing as you, buying the same four types of pens and knowing only the total amount. In order to find the price of each individual pen, you create the following matrix called data, where each column represents a different type of pen and each row represents a different person. 
%             pen1   pen2   pen3   pen4
%    data =    3      6      2      5   <-you
%  	       4      7      5      2   <-friend 1
%  	       1      3      12     6   <-friend 2
%  	       2      8      2      4   <-friend 3
% Then you generate a column vector totals, which contains the totals each of you and your friends spent on the pens.
%    totals =   19.60
%         18.78
%         25.59
%         19.26	
% Using the matrix data and the vector totals, find the column vector prices that contains the price of each type of pen.
% 12.5	World Leaders have decided to come up with a single currency for the world. This new currency called the eullar is defined by the following:
% •	Seven dollars and three euros equals seventy-one eullars
% •	One dollar and two euros equals twenty eullars
% As a reputed economist, your job is to determine the value of a dollar in terms of eullars. Write a script to compute and print the value of the dollar in eullars. For example, your script might print 1 dollar = 4.64 eullars.
