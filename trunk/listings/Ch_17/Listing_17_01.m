clear
clc
close all
% Listing 17.01 Enqueue and dequeue functions
function q = qEnq(q, data)
% enqueue onto a queue
q = [q {data}];
function [q ans] = qDeq(q)
% dequeue
ans = q{1};
q = q(2:end);
