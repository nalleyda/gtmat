clear
clc

v = [1, 2, 3]
w = 1:2:10;
[rows, cols, junk] = size(w)
if rows ~= 1 || cols ~= 5 || junk ~= 1
    error('aFnTest line 8')
end
[vv ww] = meshgrid(v, w)
xx = meshgrid(w, v)
rn = ceil(rand(1,10)*1000)
[junk order] = sort(rn)
fn = floor(rand(1,10)*1000)
ouch = sort(fn)
[val where] = min(fn)
[val where] = max(rn)
it = min(rn)
that = max(fn)



