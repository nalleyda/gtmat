Script
GT_Mat version:1.11: root node:7
|0|3|22|4'all'|% CLOSE
|1|5|54|59'makeGraph'|84';'|% GETS
|2|6|54|59'start'|40'1'|84';'|% GETS
|3|8|67|59'ro'|0')'|% MINUS
|4|8|54|1'3'|% GETS
|5|9|58|75'on'|% HOLD
|6|13|54|59'str'|% GETS
|7|1|9|20'clear'|19'clc'|1'0'|1'1'|1'2'|0'while start > 0
gplot(A, coord,'|1'4'|1'5'|0'for index = 1:length(coord)
str = char(A + index - 1);
text(coord(index,1) + 0.2, ...
coord(index,2) + 0.3,'|1'6'|% BODY
