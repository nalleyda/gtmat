% Listing 17.07 Constructing a simple graph
% edge weights
cost = [2 2 2 2 2 3 3 3 3 1 2 1 3];
% edge directions [0: both; 1: forward; 2: back]
%                        1 1 1 1
%      1 2 3 4 5 6 7 8 9 0 1 2 3
% from A A A A A B B C D F E G E
%   to B C D E F F C D E G G H H 
dir = [1 1 1 0 1 1 1 1 0 1 1 1 0];
% connectivity
node = [ 1 2 3 4 5; ... % edges from A
        1 6 7 0 0; ... % edges from B
    2 7 8 0 0; ... % edges from C
    3 8 9 0 0; ... % edges from D
    4 11 13 9 0; ... % edges from E
    5 6 10 0 0; ... % edges from F
    10 11 12 0 0; ... % edges from G
    12 13 0 0 0]; % edges from H
% coordinates
coord = [ 5 6; ... % A
          3 9; ... % B
          1 6; ... % C
          3 1; ... % D
          6 2; ... % E
          6 8; ... % F
          9 7; ... % G
          10 2]; % H
A = grAdjacency( node, cost, dir )
