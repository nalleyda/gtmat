% Listing 9-3 - Wrapper implementation for factorial
 function result = wfact(N)
 % computation of N!
     if (N < 0) || ((N - floor(N)) > 0)
         error('bad parameter for fact');
     else
         result = local_fact(N);
     end
end

 function result = local_fact(N)
 % recursive computation of N!
 %    fprintf('fact( %d )\n', N);
     if N == 0
         result = 1;
     else
         result = N * local_fact(N - 1);
     end
end
