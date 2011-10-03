Script
GT_Mat version:1.7: root node:41
|0|3|20|4'all'|% CLOSE
|1|7|52|37'2'|37'5'|37'7'|37'1'|37'3'|37'4'|% HCAT
|2|7|88|1'1'|% VCAT
|3|7|50|54'A'|1'2'|% GETS
|4|8|10|54'length'|54'A'|% CALL
|5|8|24|37'1'|37'2'|1'4'|% COLON
|6|8|50|54'odds'|1'5'|% GETS
|7|10|10|54'disp'|81'odd values of A using predefined indices'|% CALL
|8|10|50|1'7'|% GETS
|9|11|10|54'A'|54'odds'|% CALL
|10|11|50|1'9'|% GETS
|11|12|10|54'disp'|81'test double quotes ' here'|% CALL
|12|12|50|1'11'|% GETS
|13|13|24|37'1'|37'2'|42'end'|% COLON
|14|13|10|54'A'|1'13'|% CALL
|15|13|50|1'14'|% GETS
|16|14|10|54'disp'|81'put evens into odd values in a new array'|% CALL
|17|14|50|1'16'|% GETS
|18|15|24|37'2'|37'2'|42'end'|% COLON
|19|15|10|54'A'|1'18'|% CALL
|20|15|56|54'B'|54'odds'|1'19'|% INDEX
|21|16|10|54'disp'|81'set the even values in B to 99'|% CALL
|22|16|50|1'21'|% GETS
|23|17|24|37'2'|37'2'|42'end'|% COLON
|24|17|56|54'B'|1'23'|37'99'|% INDEX
|25|18|10|54'disp'|81'find the small values in A'|% CALL
|26|18|50|1'25'|% GETS
|27|19|61|54'A'|37'4'|% LT
|28|19|50|54'small'|1'27'|% GETS
|29|20|10|54'disp'|81'add 10 to the small values'|% CALL
|30|20|50|1'29'|% GETS
|31|21|10|54'A'|54'small'|% CALL
|32|21|76|1'31'|37'10'|% PLUS
|33|21|56|54'A'|54'small'|1'32'|% INDEX
|34|22|10|54'disp'|81'this can be done in one ugly operation'|% CALL
|35|22|50|1'34'|% GETS
|36|23|61|54'A'|37'10'|% LT
|37|23|61|54'A'|37'10'|% LT
|38|23|10|54'A'|1'37'|% CALL
|39|23|76|1'38'|37'10'|% PLUS
|40|23|56|54'A'|1'36'|1'39'|% INDEX
|41|1|9|18'clear'|17'clc'|1'0'|18'clear'|17'clc'|1'3'|1'6'|1'8'|1'10'|1'12'|1'15'|1'17'|1'20'|1'22'|1'24'|1'26'|1'28'|1'30'|1'33'|1'35'|1'40'|% BODY
