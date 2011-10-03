function [nums txt raw] = realCSVread(name)

    brow = 10000;
    erow = 0;
    bcol = 10000;
    ecol = 0;
    
    % it = csvread('grades.csv')
    % tried that = didn't work

    fh = fopen(name, 'r');

    str = '';
    row = 1;
    while ischar(str)
        str = fgetl(fh);
        if ischar(str)
            % do stuff with the string
            str = fixCommas(str);
            col = 1;
            while length(str) > 0
               [token str] = strtok(str, ',');
               found = convertToken(token);
               if ~isempty(found) && isnumeric(found)
                  % check the bounds of the num array
                  if row < brow,brow = row; end
                  if row > erow,erow = row; end
                  if col < bcol,bcol = col; end
                  if col > ecol,ecol = col; end
               end
               raw{row, col} = found;
               col = col + 1; 
            end
        end
        row = row + 1;
    end
    fclose(fh);
    % build the nums array
    txt = raw;
    numrows = erow - brow + 1;
    numcols = ecol - bcol + 1;
    nums = zeros(numrows, numcols);
    for row = 1:numrows
        for col = 1:numcols
            it = raw{row + brow - 1, col + bcol - 1};
            if isnumeric(it)
                % fix the txt array
                txt{row + brow - 1, col + bcol - 1} = '';
            else
                it = NaN;
            end
            nums(row, col) = it;
        end
    end
end

function it = convertToken(it)
    if length(it) == 0 || it(1) == '#'
        it = [];
    elseif it(1) >= '0' && it(1) <= '9'
        it = str2num(it);
    else
        it(it == '$') = ',';
        if it(1) == '"'
            it = it(2:end-1);
        end
    end
end


function str = fixCommas(str)
    % change all commas after odd num of " to $
    NQ = 0;
    ndx = 1;
    while ndx <= length(str)
        ch = str(ndx);
        switch ch
            case '"'
                NQ = NQ+1;
            case ','
                if mod(NQ,2) == 1
                    str(ndx) = '$';
                elseif ndx < length(str) ...
                        && str(ndx+1) == ','
                    str = [str(1:ndx) ...
                           '#' str(ndx+1:end)];
                elseif ndx == length(str)
                    str = [str '#'];
                end
        end
        ndx = ndx + 1;
    end
end