% 15.1	The subject of thermodynamics makes extensive use of tables. Although many properties can be described by fairly simple equations, others are poorly understood, or the equations describing their behavior are very complicated. It is much easier just to tabulate the data. For example, consider the data for steam at 0.1 MPa (approximately 1 atm), given in the following table. 
%        Temperature, C		u, Internal Energy, kJ/kg 
% 100				2506.7
% 150				2582.8
% 200				2658.1
% 250				2733.7
% 300				2810.4
% 400				2967.9
% 500				3131.6
% Use linear interpolation to determine the internal energy at 21.5° C.
% Use linear interpolation to determine the temperature if the internal energy is 2600 kJ/kg.
% 15.2	Electric power plants use steam as a “working fluid”. The science of thermodynamics makes extensive use of tables when systems such as a power plant are analyzed. Depending on the system of interest you may only need a portion of the table, such as the following:
% Temperature	Specific Volume	Internal Energy	Enthalpy
%    C		     m3/kg           kJ/kG		 kJ/kg
%   100		   1.6958	   	2506.7		2676.2
%   150		   1.9364	   	2582.8		2776.4
%   200		   2.172	   	2658.1		2875.3
%   250		   2.406	   	2733.7		2974.3
%   300		   2.639	   	2810.4		3074.3
%   400		   3.103	   	2967.9		3278.2
%   500		   3.565	   	3131.6		3488.1
% Notice that this table is spaced at 50° intervals at first, and then at 100° intervals. Assume that you have a project that requires you to use this table, and you would prefer not to have to perform a linear interpolation every time you use it. Use MATLAB to create a table, applying linear interpolation, with a temperature spacing of 25°.
% 15.3	Determining how much water will flow through a culvert is not as easy as it might seem at first. The channel could have a non-uniform shape, obstructions might influence the flow, friction is important, and so forth. A numerical approach allows us to fold all of those concerns into a model of how the water actually behaves.
% Consider the following data collected from an actual culvert:
%        	Height, ft			Flow, ft3/sec
% 0				 0
% 1.7				 2.6
% 1.95				 3.6
% 2.60				 4.03
% 2.92				 6.45
% 4.04				11.22
%       30.61
% Compute a best-fit linear, quadratic, and cubic fit for the data, and plot the information on the same graph. Which model best represents the data? (Linear is first order, quadratic is second order, and cubic is third order.)
% 15.4	The population of Earth is expanding rapidly, as is the population of the United States. MATLAB includes a built-in data file called census that contains U.S. census data since 1790. The data file contains two variables, cdate which contains the census dates, and pop, which lists the population in millions. To load the file into your workspace, type the following:
% >> load census
% Use the curve fitting toolbox to find an equation that represents the data.
% 15.5	Generate f(x) = x2 for x = [-3 -1 0 2 5 6]
% a.		Compute and plot the linear and cubic-spline interpolation of the data points over the range [?3:0.05:6]
% b.	Compute the value of f(4) using linear interpolation and cubic-spline interpolation. What are the respective errors when the answer is compared with the actual value of f(4)?
% 15.6	Assume that the following set of temperature measurements is taken from the cylinder head in a new engine that is being tested for possible use in a race car:
%            Time, sec		    Temperature, °F
%   0				  0
% 1.0				 20
% 2.0				 60
% 3.0				 68
% 4.0				 77
% 5.0				110
% a.	Compare plots of these data, assuming linear interpolation and assuming cubic-spline interpolation for values between the data points, using time values from 0 to 5 in increments of 0.1 s.
% b.	Using the data from part (a), find the time value for which there is the largest difference between its linear interpolated temperature and its cubic interpolated temperature.
% 15.7	Assume that we measure temperatures at three points around the cylinder head in the engine from Programming Project 6, instead of at just one point. The set of data is then the following:
%                  	Time, sec     Temp1	  Temp2	          Temp3
%   0	     0	     0	     0
% 1.0	    20	    25	    52
% 2.0	    60	    62	    90
% 3.0	    68	    67	    91
% 4.0	    77	    82	    93
% 5.0	   110	   103	    96
% a.	Assume that these data have been stored in a matrix with six rows and four columns. Determine interpolated values of temperature at the three points in the engine at 2.6 seconds using linear interpolation.
% b.	Using the information from part (a) determine the time when the temperature reached 75° at each of the three points in the cylinder head.
% 15.8 	The guidance system for a spacecraft often uses a sensor called an accelerometer, which is an electromechanical device that produces an output voltage proportional to the applied acceleration. Assume that an experiment has yielded the following set of data:
%                     Acceleration		          Voltage
%   4				0.593
%   2				0.436
%   0				0.061
%   2				0.425
%   4				0.980
%   6				1.213
%   8				1.646
%  10				2.158
% a.	Determine the linear equation that best fits this set of data. Plot the data points and the linear equation.
% b.	Determine the sum of the squares of the distances of these points from the line of best fit determined in part (a).
% c.	Compare the error sum from part (b) with the same error sum computed from the best quadratic fit. What do these sums tell you about the two models for the data?
% 15.9	Compute tan(x) for x = [-1:0.05:1]. 
% a.	Compute the best-fit polynomial of order four that approximates tan(x). Plot tan(x) and the generated polynomial on the same graph. What is the sum of square error of the polynomial approximation for the data points in x?
% b.	Compute tan(x) for x = [-2:0.05:2]. Using the polynomial generated in part (a), compute values of y from ?2 to 2, corresponding to the x vector just defined. Plot tan(x), and the values generated from the polynomial on the same graph. Why aren’t they the same shape?
% 15.10	The following data set represents the time and altitude values for a sounding rocket that is performing high-altitude atmospheric research on the ionosphere.
% a.	Determine the equation that best represents the data, using the interactive curve fitting tools available in MATLAB 7.
% b.	Plot the altitude data. The velocity function is the derivative of the altitude function. Using numerical differentiation, compute the velocity values from the data, using a backward difference. Plot the velocity data. (Note that the rocket is a two-stage rocket.)
% c.	The acceleration function is the derivative of the velocity function. Using the velocity data determined from part (b), compute the acceleration data using backward difference. Plot the acceleration data.
%                    Time, sec		                     Altitude, m
%   0				     60
%  10				  2,926
%  20				 10,170
%  30				 21,486
%  40				 33,835
%  50				 45,251
%  60				 55,634
%  70				 65,038
%  80				 73,461
%  90				 80,905
% 100				 87,368
% 110				 92,852
% 120				 97,355
% 130				100,878
% 140				103,422
% 150				104,986
% 160				106,193
% 170				110,246
% 180				119,626
% 190				136,106
% 200				162,095
% 210				199,506
% 220				238,775
% 230				277,065
% 240				314,375
% 250				350,704
% 15.11	Although MATLAB makes it easy to find the roots of a function, sometimes all that is needed is a quick estimate. This can be done by plotting a function and zooming in very close to see where the function equals zero. Since MATLAB draws straight lines between data points on a plot, it is good to draw circles or stars at each data point, in addition to straight lines connecting the points. Plot the following function and zoom in to find the roots:
% >> n = 5;
% >> x = linspace(0, 2*pi, n);
% >> y = x .* sin(x) + cos(1/2*x).^2 – 1./(x – 7);
% >> plot(x, y, '-o')
% 15.12	Consider the data points in the following vectors:
% >> x = [0.1 0.3 5 6 23 24];;
% >> y = [2.8 2.6 18.1 26.8 486.1 530]
% a.	Determine the best-fit polynomial of order 2 to the data. Calculate the sum of squares for your results. Plot the best-fit polynomial for the six data points.
% b.	Generate a new x vector containing 250 points evenly spaced between 0.1 and 25. Using the coefficients from part (a), generate and plot the corresponding y values.
% c.	Compute and an estimate of dy/dx using the new values in part (b). 
% d.	Compute second and third order polynomial fit to the derivative data in part (c). Plot each polynomial. Why is the use of polynomial fits to derivative data important? 
% 15.13	The function f(x) is defined by f(x) = 4 e-x. Plot this function over the interval [0, 1] with a suitable number of points. Use numerical integration techniques to estimate the integral of f(x) over [0, 0.5] and [0, 1]. Compare these results to the theoretical answer.
