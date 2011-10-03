function realCSVwrite(ca, name)
    
    fh = fopen(name, 'w');
    [rows cols] = size(ca);
    for r = 1:rows
        for c = 1:cols
            item = ca{r, c};
            if ~isempty(item)
                writeToFile(fh, item);
            end
            if c < cols
                fprintf(fh, ',');
            else
                fprintf(fh, '\n');
            end
        end
    end
    
    fclose(fh);
end

function writeToFile(fh, item)
    if ischar(item)
        if any(item == ',')
            item = ['"' item '"'];
        end
    else
        item = num2str(item);
    end
    fprintf(fh,'%s', item);
end