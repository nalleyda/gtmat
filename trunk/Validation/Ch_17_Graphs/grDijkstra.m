 function D = grDijkstra(A, home, target)
% Listing 17-12 - Code for Dijkstras algorithm
% A - an adjacency matrix 
 
% Create a priority queue
% Enqueue a path with containing home with length 0
 pq = pqEnq([], Path(home, 0));
 while ~isempty(pq)
    % Dequeue a path
     [pq current] = qDeq(pq);
    % If this path is to the destination quit
     if pthGetLast(current) == target
         D = sparse(0);
         answer = current.nodes;
         for ans = 1:length(answer)-1
             D(answer(ans), answer(ans+1)) = 1;
         end
         return;
     end  % if last(current) == target
    % put the children of the last node in the path
     endnode = pthGetLast(current);
     children = A(endnode,:);
     children = find(children ~= 0);
     for achild = children
         len = A(endnode, achild);
        % If the child is not on the path
         if ~any(achild == current.nodes)
            % Add it to the path
            clone = current;
             clone = Path( [clone.nodes achild], ...
                            current.key + len );
            % Enqueue the new path to that length
             pq = pqEnq(pq, clone);
         end % if ~any child == current.nodes
     end % for achild = children
 end % if pq not empty
% If we reach here we never found a path
 D = [];

 function ret = Path(nodes, len)
    % Path constructor
       ret.nodes = nodes; 
       ret.key = len;

 function ret = pthGetLast(apath)
    % Returns number of last node on a path
     ret = apath.nodes(end);



