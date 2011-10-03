
x = 1:5;
y = 10:-1:5;

if x(end) ~= 5
	z = 'FAILED endTest (1)'
end

if x(end-3) ~= 2
	z = 'FAILED endTest (2)'
end

a = x(floor(end/2)) %This currently breaks

b = x(y(end))       %This also currently breaks
