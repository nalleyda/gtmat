ca = {1 'abc' [2 3]}
a = 3;
b = 4;
c = 'ordinary string'
d = c + a
str = char(d);
ln = length(str)        
if a > b
    a = b + 1
elseif a < b
    b = a - b
    c = 42
    d = 4
else
    b = 4
    c = a - b        
end
2 + a*b
x = 8.3
y = x + 3.95
z = 3 * (-x + y) * 4
v = []
v6 = [2;3;4;5]
v7 = [1 2 x; 3, 4, y]
w = [x y]
z = sqrt(w)
p = sqrt(v7)
v = [1 2 3 4 5]
v = 2:5
v = 5:2:11
for ndx = v
    a = a + ndx
    b = b + 1
end
while b > 0
   a = a + b
   b = b - 1
end
x = 4
switch x
   case 1
      y = 1
   case 2
      y = 2
   case {3, 4, 5}
      y = 'found one of the cell answers'
   otherwise
      y = 3
end
month = 'Mar'
leap = 1
switch month
case {'Jan', 'Mar', 'May', 'July', 'Aug', 'Oct','Dec'}
     days = 31
case {'April','Sept','June','Nov'}
     days = 30
case 'Feb'
     if leap > 0
         days = 29
     else
         days = 28
     end
otherwise
     error('bad month')
end
