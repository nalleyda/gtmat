[a, b] = max(1,2)

% This file is meant to cause the grammar great pains - it should test
% every oddity that MATLAB allows. Add as much weird code to it as you can
% come up with. Eventually, this should be a thoroughly convincing test
% that no student can ever come up with a valid syntax to break our grammar.

%Hi, I'm a comment with all manner of terrible things inside me.
%~!@#$%^&*)(-_+=}{]{\|/?.>,<        end

% Comments should be removed with highest priority.


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% If it's commented out, it DOESN'T WORK (i.e., we can't parse it)
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

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

h.fieldname = 'fieldname'

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

o = {{true, [1, true], {['a' 65]}}, min(max(i)) == 3}%any(max(i) == 3)} % any() doesn't exist yet

p = (1:5).*(6:10)*pi*(11:15)'

q = (1:5)./(6:10)/pi*(11:15)'

r = [1,2]/[1,2;3,4]/(2*pi)



% FAILS (where are s and t?)
if  min(max(j)) > 5 && 4 < 3 | 7*3-2:4 > 10
    s = 1
    if j > 3
        switch 'a'
            case 1
                t = 1
            case 65
                t = 2
            otherwise
                t = 3
        end
    else
        t = 4
    end
elseif ('abc' > 2)
    s = 2
    if 1 < 2
        switch 1
            case 1
                if 3 < 4
                    t = 5
                else
                    t = 6
                end
            otherwise 
                t = 7
        end
    else
        t = 8
    end
elseif 17
    s = 3
else
    s = 4
end

t = ~-+~-2

u = -~+'asdf'

st.(3)

%{
[1,2;[2,3];2,4]
[x>3; y < 2]



(5+sum([3,2]))



{}
['a', b, {c}]
x(('a'+2),[2])
{a}:8
a:b:c:d:e

[[[],[b]];[[a],[]]]

[A,1].^st.x; 
%}

