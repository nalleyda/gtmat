Script
GT_Mat version:1.7: root node:25
|0|3|20|4'all'|% CLOSE
|1|7|52|37'0'|37'1'|37'1'|% HCAT
|2|7|88|1'1'|% VCAT
|3|7|50|54'PA'|1'2'|% GETS
|4|8|52|37'1'|37'1'|37'0'|% HCAT
|5|8|88|1'4'|% VCAT
|6|8|50|54'PB'|1'5'|% GETS
|7|9|52|37'2'|37'1'|37'1'|% HCAT
|8|9|88|1'7'|% VCAT
|9|9|50|54'P'|1'8'|% GETS
|10|10|52|37'4'|37'0'|37'1'|% HCAT
|11|10|88|1'10'|% VCAT
|12|10|50|54'M'|1'11'|% GETS
|13|12|76|54'PA'|54'PB'|% PLUS
|14|12|50|54'PC'|1'13'|% GETS
|15|14|33|54'PC'|37'2'|% DOTCARET
|16|14|10|54'sum'|1'15'|% CALL
|17|14|10|54'sqrt'|1'16'|% CALL
|18|14|50|54'mag'|1'17'|% GETS
|19|15|30|54'PC'|54'mag'|% DIV
|20|15|50|54'unit_vector'|1'19'|% GETS
|21|18|62|54'P'|54'M'|% MINUS
|22|18|50|54'MP'|1'21'|% GETS
|23|19|10|54'cross'|54'MP'|54'PC'|% CALL
|24|19|50|54'moment'|1'23'|% GETS
|25|1|9|18'clear'|17'clc'|1'0'|18'clear'|17'clc'|1'3'|1'6'|1'9'|1'12'|1'14'|1'18'|1'20'|1'22'|1'24'|% BODY