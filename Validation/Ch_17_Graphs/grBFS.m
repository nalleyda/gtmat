 function D = grBFS(A, home, target)
% Listing 17-10 - Breadth-first graph search
% A - an adjacency matrix 
% home  starting node index
% target  ending node index
% produce the adjacency matrix D of the 
 
% If no such path exists, return []
% Create a queue and enqueue a path containing home
 q = qEnq([], home);
% While the queue is not empty
 while ~isempty(q)
    % Dequeue a path
     [q current] = qDeq(q);
        % If this path reaches the destination, stop
     if current(end) == target   % success exit
         D = sparse([0]);
            % build a new adjacency matrix 
            % from the path
         for ans = 1:length(current)-1
             D(current(ans), current(ans+1)) = 1;
         end
         return;   % exit the function
      end  % if current == target
        % Traverse the children of the last node
     thisNode = current(end);
     children = find(A(thisNode,:) ~= 0);
     for thisChild = children
            % If the child is not on the path
         if ~any(thisChild == current)
                % Enqueue the new path
             q = qEnq(q, [current thisChild]);
         end % if ~any(thisChild == current)
     end % for thisChild = children
 end % while q not empty
% If we reach here we never found a path
 D = [];

