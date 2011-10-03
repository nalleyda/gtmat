 function ans = fold(st)
% s1 is the rate of growth of population
 pop = st.pop(~isnan(st.pop));
 yr = st.year(~isnan(st.pop));
 s1 = slope(yr, pop)/mean(pop);
% s2 is the rate of growth of the GDP
 gdp = st.gdp(~isnan(st.gdp));
 yr = st.year(~isnan(st.gdp));
 s2 = slope(yr, gdp)/mean(gdp);
% Measure of merit is how much faster
%  the gdp grows than the population
 ans = s2 - s1;

