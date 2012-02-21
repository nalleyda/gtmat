function out = fib(n)

if (n <= 1) 
	out = n
else
	out = fib(n-1) + fib(n-2)
end

end
