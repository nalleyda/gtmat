 clear
 clc
 
 fh = fopen('GTMat_Listing_Test.txt','w');

 %% Listing_02_1
 A = 3;   % the first side of a triangle
 B = 4;   % the second side of a triangle
 hypSq = A^2 + B^2;   % the square of the 
                      % hypotenuse
 H = sqrt(hypSq);      % the answer
 fprintf(fh,'hypSq = %d\n',hypSq);
 fprintf(fh,'H = %d\n',H);
 
 %% Listing_02_2
 cmPerInch = 2.54;     % general knowledge
 inchesPerFt = 12;     % general knowledge
 metersPerCm = 1/100;  % general knowledge
 MetersPerFt = metersPerCm * cmPerInch * inchesPerFt;
 
 startFt = 25000;  % ft - given
 startM = startFt * MetersPerFt;
 
 fprintf(fh,'MetersPerFt = %d\n',startM);
 
 %% Listing_02_3
 g = 9.81;  % m/sec^2
 top = 100; % km - given
 
 s = (top*1000) - startM;  % m
 
 initial_v = (2*g*s)^0.5; % the final answer
 
 fprintf(fh,'initial_v = %d\n',initial_v);
 
 %% Listing_03_1  Vector Indexing Script
 A = [2 5 7 1 3 4];
 odds = 1:2:length(A);    	
                         	
 vec3_1 = A(odds);
 fprintf(fh,'vec3_1 = %d\n',vec3_1);
 vec3_2 = A(1:2:end);
 Arrfprintf(fh,'vec3_2 = %d\n',vec3_2);
 B(odds) = A(2:2:end);
 B(2:2:end) = 99;
 vec3_3 = B;
 Arrfprintf(fh,'vec3_3 = %d\n',vec3_3);
 small = A < 4;
 vec3_4 = small;
 Arrfprintf(fh,'vec3_4 = %d\n',vec3_4);
 A(small) = A(small) + 10;
 A(A < 4) = A(A < 4) + 10;
 vec3_5 = A;
 Arrfprintf(fh,'vec3_5 = %d\n',vec3_5);
 
 %% Listing_03_2  Script to solve vector problems 
 PA = [0 1 1];
 PB = [1 1 0];
 P = [2 1 1];
 M = [4 0 1];
 vec3_6 = M;
 Arrfprintf(fh,'vec3_6 = %d\n',vec3_6);
 % find the resultant of PA and PB
 PC = PA + PB;
 Arrfprintf(fh,'PC = %d\n',PC);
 % find the unit vector in the direction of PC
 mag = sqrt(sum(PC.^2));
 Arrfprintf(fh,'mag = %d\n',mag);
 unit_vector = PC/mag;
 Arrfprintf(fh,'unit_vector = %d\n',unit_vector);
 % find the moment of the force PC about M
 %  this is the cross product of MP and PC
 MP = P - M;
 Arrfprintf(fh,'MP = %d\n',MP);
 moment = cross( MP, PC );
 Arrfprintf(fh,'moment = %d\n',moment);
 
 %% Listing_03_3  Array Manipulation Script
 clear B
 A = [2 5 7 3; 1 3 4 2];
 [rows, cols] = size(A);
 odds = 1:2:cols;    	      
 arr3_1 = A(:, odds);
 Arrfprintf(fh,'arr3_1 = %d\n',arr3_1);
 arr3_2 = A(end, 1:2:end);
 Arrfprintf(fh,'arr3_2 = %d\n',arr3_2);
 B(:, odds) = A(:, 2:2:end);
 Arrfprintf(fh,'arr3_3 = %d\n',B);
 B(1, 2:2:end) = 99;
 Arrfprintf(fh,'arr3_4 = %d\n',B);
 small = A < 4;
 Arrfprintf(fh,'small = %d\n',small);
 A(small) = A(small) + 10;
 Arrfprintf(fh,'A = %d\n',A);
 A(A < 4) = A(A < 4) + 10;
 Arrfprintf(fh,'A = %d\n',A);
 small_index = find(small);
 fprintf(fh,'small_index = %d\n',small_index);
 A(small_index) = A(small_index) + 100;
 Arrfprintf(fh,'A = %d\n',A);

 %% Listing_03_4
% soil depth data for each square produced by the survey 
dpth = [8  8  9  8  8  8  8  8  7  8  7  7  7  7  8  8  8  7;
        8  8  8  8  8  8  8  7  7  7  7  7  8  7  8  8  8  7;
        8  8  8  8  7  7  8  7  8  8  8  8  8  7  8  8  8  8;
        7  7  7  8  7  8  8  8  8  8  8  8  7  6  7  7  7  7;
        8  8  8  8  8  8  8  8  7  7  7  7  7  6  6  7  7  8;
        8  7  7  8  7  7  8  7  7  7  7  7  7  7  7  7  7  8;
        9  8  8  9  8  7  8  7  7  7  7  7  6  7  6  7  7  8;
        8  8  8  9  9  8  8  8  7  6  6  6  6  7  7  8  7  8;
        9  8  8  7  7  7  7  7  7  6  6  7  7  7  8  8  7  8;
        9  8  8  7  7  7  6  7  7  6  6  8  8  8  9  9  7  8;
        9  9  8  8  8  8  7  7  7  7  7  8  8  9  9  9  8  8;
        9  8  8  7  7  8  7  7  7  7  8  8  9  9  9  8  7  8];
 
% estimated proportion of each square that should be excavated
area = [1  1  1  1  1  1  1  1  1  1 .3  0  0  0  0  0  0  0;
        1  1  1  1  1  1  1  1  1  1 .7  0  0  0  0  0  0  0;
        1  1  1  1  1  1  1  1  1  1  1 .8 .4  0  0  0  0  0;
        1  1  1  1  1  1  1  1  1  1  1  1  1 .8 .3  0  0  0;
        1  1  1  1  1  1  1  1  1  1  1  1  1  1 .7 .2  0  0;
        1  1  1  1  1  1  1  1  1  1  1  1  1  1  1 .6  0  0;
        0  0  0 .7  1  1  1  1  1  1  1  1  1  1  1 .8  0  0;
        0  0  0 .7  1  1  1  1  1  1  1  1  1  1  1 .7  0  0;
        0  0  0 .4  1  1  1  1  1  1  1  1  1  1  1 .6  0  0;
        0  0  0 .1 .8  1  1  1  1  1  1  1  1  1  1  1 .4  0;
        0  0  0  0 .2 .7  1  1  1  1  1  1  1  1  1  1 .9 .1;
        0  0  0  0  0  0 .4 .8 .9  1  1  1  1  1  1  1  1 .6];
    
 square_volume = dpth .* area;
 Arrfprintf(fh,'square_volume = %d\n',square_volume);
 total_soil = sum(sum(square_volume));
 Arrfprintf(fh,'total_soil = %d\n',total_soil);
 
 %% Listing_04_1	if statement example
 %day = input('enter a day(1-7): ');
 day = 1;
 if day == 7 	% Saturday
 	state = 'weekend';
 elseif day == 1 	% Sunday
 	state = 'weekend';
 else
 	state = 'weekday';
 end 
 Arrfprintf(fh,'state = %d\n',state);
 
%% Listing 4-2	Script with if statements
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


 
 fclose(fh)