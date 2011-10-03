% Listing 12-8 - Analyzing ceramic composition
clear
clc
% Compound Compositions:
%
%   Material     Silica   Alumina    CaO     MgO
%   Feldspar      0.695     0.175    0.008   0.122
%   Diatomite     0.897     0.0372   0.0035  0.0623
%   Magnesite     0.067     0.023    0.06    0.85
%   Talc          0.692     0.016    0.025   0.267
%
%  Need mix       67%          5%      2%     26%
 A = [0.6950    0.8970    0.0670    0.6920
      0.1750    0.0372    0.0230    0.0160
      0.0080    0.0035    0.0600    0.0250
      0.1220    0.0623    0.8500    0.2670 ]
 
 B = [67 5 2 26]'
 
 W = (inv(A) * B)'
