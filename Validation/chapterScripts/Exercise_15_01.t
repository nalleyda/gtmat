Script
GT_Mat version:1.11: root node:32
|0|3|22|4'all'|% CLOSE
|1|4|26|40'0'|40'5'|% COLON
|2|4|54|59'x'|1'1'|84';'|% GETS
|3|5|57|40'0'|40'20'|40'60'|40'68'|40'77'|40'110'|% HCAT
|4|5|95|1'3'|% VCAT
|5|5|54|59'y'|1'4'|84';'|% GETS
|6|6|10|59'interp1'|59'x'|59'y'|40'1.5'|% CALL
|7|6|54|1'6'|% GETS
|8|7|26|40'0'|40'0.2'|40'5'|% COLON
|9|7|54|59'new_x'|1'8'|% GETS
|10|8|10|59'length'|59'new_x'|% CALL
|11|8|54|1'10'|% GETS
|12|9|10|59'interp1'|59'x'|59'y'|59'new_x'|% CALL
|13|9|54|59'new_y'|1'12'|% GETS
|14|10|10|59'length'|59'new_y'|% CALL
|15|10|54|1'14'|% GETS
|16|11|10|59'plot'|59'x'|59'y'|% CALL
|17|11|54|1'16'|% GETS
|18|12|58|75'on'|% HOLD
|19|13|10|59'plot'|59'new_x'|59'new_y'|86'o'|% CALL
|20|13|54|1'19'|% GETS
|21|14|71|40'1'|% NEGATE
|22|14|71|40'20'|% NEGATE
|23|14|57|1'21'|40'7'|1'22'|40'120'|% HCAT
|24|14|95|1'23'|% VCAT
|25|14|6|1'24'|% AXIS
|26|15|10|59'title'|86'linear Interpolation Plot'|% CALL
|27|15|54|1'26'|% GETS
|28|16|10|59'xlabel'|86'x values'|% CALL
|29|16|54|1'28'|84';'|% GETS
|30|16|10|59'ylabel'|86'y values'|% CALL
|31|16|54|1'30'|% GETS
|32|1|9|20'clear'|19'clc'|1'0'|1'2'|1'5'|1'7'|1'9'|1'11'|1'13'|1'15'|1'17'|1'18'|1'20'|1'25'|1'27'|1'29'|1'31'|% BODY
