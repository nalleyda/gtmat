clear
clc
%
%   This program tests the selection,merge and quick sort algorithm by
%   sorting an array that is filled with random numbers.
disp('------------------------------------------------');
disp('Start sort test');
disp('------------------------------------------------');
maxSize = 32768*4
iterations = 64
a = rand(maxSize,1);
size = 4;
loop = 1;
while size <= maxSize
%
% calculate the loop overhead
%
    tic;
    for iter = 1 : iterations*100
	    b = a(1:size);
    end
%    disp('Original'); b
    overhead = toc / (iterations*100);
%
% test selection sort over 10 iterations
%
    tic;
    slow = iterations / 10;
    if slow < 1
        slow = 1;
    end
    for iter = 1 : slow
	    b = selectionsort(a(1:size));
    end
%    disp('Selection'); b
    select = (toc / slow) - overhead;
%
% test insertion sort over 10 iterations
%
    tic;
    for iter = 1 : slow
	    b = insertionsort(a(1:size));
    end
%    disp('Insertion'); b
    insert = (toc / slow) - overhead;
%
% test merge sort over 100 iterations
%
    tic;
    for iter = 1 : iterations
	    b = mergesort(a(1:size));
    end
%    disp('Merge'); b
    merged = (toc / iterations) - overhead;
%
% test quick sort over 100 iterations
%
    tic;
    for iter = 1 : iterations
        b = quicksort(a(1:size), 1, size);
    end
%    disp('Quick'); b
    quick = (toc / iterations) - overhead;
%
% test matlab sort over 100 iterations
%
    tic;
    for iter = 1 : iterations * 1000
        b = a(1:size);
        b = b';
        b = sort(b);
    end
%    disp('Matlab'); b
    matlab = (toc / iterations) - overhead*1000;
%
% show results
%
    disp(sprintf('Size: %f; Sel: %f; Ins: %f; Merge: %f; Quick: %f; Matlab: %f / 1000', ...
        size, select, insert, merged, quick, matlab));
    sz(loop) = size;
    if select < 0
        select = - select;
    end
    sl(loop) = select;
    if insert < 0
        insert = - insert;
    end
    in(loop) = insert;
    if merged < 0
        merged = - merged;
    end
    mg(loop) = merged;
    if quick < 0
        quick = - quick;
    end
    qk(loop) = quick;
    ml(loop) = matlab;
    loop = loop + 1;
    size = size * 2;
    iterations = iterations / 2;
    if iterations < 2
        iterations = 2;
    end
end
save sortdata