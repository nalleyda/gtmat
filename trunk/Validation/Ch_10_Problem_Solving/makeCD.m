function ans = makeCD(gn, ar, ti, yr, st, pr)
% Listing 7-3 - Constructor for a CD structure 
% integrate CD data into a structure
    ans.genre = gn ;
    ans.artist = ar ;
    ans.title = ti;
    ans.year = yr;
    ans.stars = st;
    ans.price = pr;
