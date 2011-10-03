clear
clc
a = 4
b = 5;
v = 'last'
a.first = 'Fred'
a.(v) = 'Jones'
a.age = 42

it = a.age

a(2) = a

a(2).(v) = 'Smith'
a(1).first = 'Sally Ann'
a(3).middle = 'the great'

for ndx = 1:length(a)
   a(ndx)
end
n = a(2).first
kl = a(1).(v)

xx = [1 2 3 4]
xy = [a.age]
yy = {'abc',[1 2 3] xx}
yz = {a.first}
zz = {a.(v)}



