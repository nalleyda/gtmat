% Listing 9-7 - Initial zero crossings
clear
clc
close all

 px = linspace(-6.3, 8.4,300);
 py = f(px);
 plot(px, py)
 grid on
 hold on
 px = linspace(-6.3, 8.4, 19);
 py = f(px);
 zeros = find(py(1:end-1) .* py(2:end) <= 0)
 disp('zeros occur just after')
 ndx = find(zeros);
 
 plot(px(ndx), py(ndx), 'k*')
 plot(px(ndx+1), py(ndx+1), 'k*')
 
 root = findZero([px(zeros(3)) px(zeros(3)+1)])
 plot(root, f(root), 'r*')