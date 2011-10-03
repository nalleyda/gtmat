function it = testFunc(n)

A = 1:n
it = A(1:2:end)
% xx = A('this could be', ...
%        	 ' the ', end)
if A > 42
    it = helper(A)
else
    it = helper(A-1)
end
end

function res = helper(f)
    res = f(end:-1:1)
    res = f(end/2:-2:1)
end
