% Listing 9-4 - Tail recursive factorial implementation
 function ans = tfact(N)
 % computation of N!
    ans = local_fact(N, 1);

 function ans = local_fact(N, res)
 %    fprintf('local_fact( %d, %d )\n', N, res);
     if N == 0
         ans = res;
     else
         ans = local_fact(N - 1, N * res);
     end
