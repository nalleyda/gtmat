clear
clc
clf
load sortdata;
loglog(sz,sl*100);
hold on;
title('Comparison of Sort Algorithms');
xlabel('Number of Items Sorted');
ylabel('Relative Sort Time');
loglog(sz,in*1000,'g.');
mg = mg .* (mg > 0);
loglog(sz,mg,'.');
loglog(sz,qk,'--');
qk = qk .* (qk > 0);
loglog(sz,ml,'.-');
ml = ml .* (ml > 0);
num = 4;
i = 1;
while num < 60000
    n(i) = num;
    nsq(i) = num * num / 100000;
    nlogn(i) = num * log(num) / 10000;
    num = num * 2;
    i = i + 1;
end
loglog(n, nsq, 'r');
loglog(n, nlogn, 'r--'); 
legend('Selection','Insertion','Merge','Quick', 'Matlab', 'N squared', 'N log N', 2);
