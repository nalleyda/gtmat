clear
clc
close all
% Listing 12.06 Analyzing ceramic composition
A = [0.6950 0.8970 0.0670 0.6920
0.1750 0.0372 0.0230 0.0160
0.0080 0.0035 0.0600 0.0250
0.1220 0.0623 0.8500 0.2670]
B = [67 5 2 26]'
W = (inv(A) * B)' 
