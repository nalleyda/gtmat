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
        
