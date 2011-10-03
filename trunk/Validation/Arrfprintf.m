function Arrfprintf(fh,str,val)
       
    [tok rest] = strtok(str,'%d');
    fprintf(fh, [tok '\n[']) %start up printing
    string = '';
    for x = 1:size(val,2)
        if x == 1
            string = [string '%2.0f'];
        else
            string = [string '%4.0f']; %leaves 4 spaces b/w values
        end
    end
            
    for i = 1:size(val,1)
        if i == size(val,1)
            fprintf(fh, [string ' ]\n '],val(i,:));
        else
            fprintf(fh, [string '\n '],val(i,:));
        end
    end
    
end