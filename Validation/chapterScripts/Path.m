% Listing 17.12 Helper functions for Dijkstra's algorithm
function ret = Path(nodes, len)
% Path constructor
ret.nodes = nodes;
ret.key = len;
end
