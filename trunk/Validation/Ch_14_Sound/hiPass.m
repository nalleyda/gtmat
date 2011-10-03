function filter = hiPass(f, m)
% build a high pass filter cutting of at item f of m/2
n = m/2;
flt = [zeros(1,f-1) 0.5 ones(1,n-f)];
for index = 1:10
    flt(f-index) = flt(f-index+1)/2;
    flt(f+index) = 1 - flt(f - index);
end
filter = [flt 1 flt(end:-1:2)]';

