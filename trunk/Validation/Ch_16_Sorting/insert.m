function b = insert(a, v)
% this function inserts the value v into the array a
%
i = 1;
sz = length(a);
done = 0;
while i <= sz
    if v < a(i,1)
        done = 1;
        j = sz + 1;
        while j > i
            a(j,1) = a(j-1);
            j = j - 1;
        end
        a(i,1) = v;
        i = sz + 1;
    else
        i = i + 1;
    end
end

if done == 0 
    a(sz+1,1) = v;
end

b = a;
        