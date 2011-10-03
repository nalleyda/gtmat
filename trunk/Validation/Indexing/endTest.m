
x = 1:5
y = 10:-1:5

if x(end) ~= 5
	z = 'FAILED endTest (1)'
end

if x(end-3) ~= 2
	z = 'FAILED endTest (2)'
end

a = x(floor(end/2)) %This currently breaks

b = x(y(end))       %This also currently breaks

m = magic(7)
m(1, floor(end/2)) = 42
m(ceil(end/2)) = 99
m(ceil(end/2), end) = -42

it = m(end, end, end, end)
it = m(sqrt(end), min([end b]), end/2, end)
