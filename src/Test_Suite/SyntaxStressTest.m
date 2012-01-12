% This file is meant to cause the grammar great pains - it should test
% every oddity that MATLAB allows. Add as much weird code to it as you can
% come up with. Eventually, this should be a thoroughly convincing test
% that no student can ever come up with a valid syntax to break our grammar.

%Hi, I'm a comment with all manner of terrible things inside me.
%~!@#$%^&*)(-_+=}{]{\|/?.>,<        end

% Comments should be removed with highest priority.

'Strings should be removed with second highest priority) (. See?'

('Strings in parentheses still work');

a = 'Strings should be removed with second highest priority) (. See?';

b = ('Strings in parentheses still work')

c = []

d = {{{{[[[]]]}}}}

e = (1)-2-((3)-((4)-(5)))-(((6)))-((7)-((8)))

f = (1)/2/((3)/((4)/(5)))/(((6)))/((7)/((8)))

g = 1 + (2 * ((3 - 4) / 5))

h.a = a

h.('fieldname') = 'fieldname'

h.(h.fieldname) = 'fn2'

h.(h.fieldname) = 7

i = [1,2,    3  4,  5;[6 7 8, 9, 10; 11, 12, 13, 14, 15]]

j = i(1:1, :)

k = i(-1 + (min(max(j-4)) + 1)*(1/2) + 1: end, [1, 3, 4])

l = (k''')''

m = [l(:) ; i(:) ; [[1:5]]']

n = ['this is a two line command,'...
10, 'this is the second line']

o = {{true, [1, true], {['a' 65]}}, any(max(i) == 3)}

p = (1:5).*(6:10)*pi*(11:15)'

q = (1:5)./(6:10)/pi*(11:15)'

r = [1,2]/[1,2;3,4]/(2*pi)












