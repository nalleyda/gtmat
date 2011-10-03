Script
GT_Mat version:1.7: root node:48
|0|3|20|4'all'|% CLOSE
|1|5|52|37'2'|37'5'|37'7'|37'3'|% HCAT
|2|6|52|37'1'|37'3'|37'4'|37'2'|% HCAT
|3|5|88|1'1'|1'2'|% VCAT
|4|5|50|54'A'|1'3'|% GETS
|5|7|16|54'rows'|54'cols'|% CHCAT
|6|7|64|1'5'|54'size'|54'A'|% MULTI_RETURN
|7|8|24|37'1'|37'2'|54'cols'|% COLON
|8|8|50|54'odds'|1'7'|% GETS
|9|9|10|54'disp'|81'odd columns of A using predefined indices'|% CALL
|10|9|50|1'9'|% GETS
|11|10|10|54'A'|24':'|54'odds'|% CALL
|12|10|50|1'11'|% GETS
|13|11|10|54'disp'|81'odd columns of A using anonymous indices'|% CALL
|14|11|50|1'13'|% GETS
|15|12|24|37'1'|37'2'|42'end'|% COLON
|16|12|10|54'A'|42'end'|1'15'|% CALL
|17|12|50|1'16'|% GETS
|18|13|10|54'disp'|81'put evens into odd values in a new array'|% CALL
|19|13|50|1'18'|% GETS
|20|14|24|37'2'|37'2'|42'end'|% COLON
|21|14|10|54'A'|24':'|1'20'|% CALL
|22|14|56|54'B'|24':'|54'odds'|1'21'|% INDEX
|23|15|10|54'disp'|81'set the even values in B to 99'|% CALL
|24|15|50|1'23'|% GETS
|25|16|24|37'2'|37'2'|42'end'|% COLON
|26|16|56|54'B'|37'1'|1'25'|37'99'|% INDEX
|27|17|10|54'disp'|81'find the small values in A'|% CALL
|28|17|50|1'27'|% GETS
|29|18|61|54'A'|37'4'|% LT
|30|18|50|54'small'|1'29'|% GETS
|31|19|10|54'disp'|81'add 10 to the small values'|% CALL
|32|19|50|1'31'|% GETS
|33|20|10|54'A'|54'small'|% CALL
|34|20|76|1'33'|37'10'|% PLUS
|35|20|56|54'A'|54'small'|1'34'|% INDEX
|36|21|10|54'disp'|81'this can be done in one ugly operation'|% CALL
|37|21|50|1'36'|% GETS
|38|22|61|54'A'|37'4'|% LT
|39|22|61|54'A'|37'4'|% LT
|40|22|10|54'A'|1'39'|% CALL
|41|22|76|1'40'|37'10'|% PLUS
|42|22|56|54'A'|1'38'|1'41'|% INDEX
|43|23|10|54'find'|54'small'|% CALL
|44|23|50|54'small_index'|1'43'|% GETS
|45|24|10|54'A'|54'small_index'|% CALL
|46|24|76|1'45'|37'100'|% PLUS
|47|24|56|54'A'|54'small_index'|1'46'|% INDEX
|48|1|9|18'clear'|17'clc'|1'0'|1'4'|1'6'|1'8'|1'10'|1'12'|1'14'|1'17'|1'19'|1'22'|1'24'|1'26'|1'28'|1'30'|1'32'|1'35'|1'37'|1'42'|1'44'|1'47'|% BODY
