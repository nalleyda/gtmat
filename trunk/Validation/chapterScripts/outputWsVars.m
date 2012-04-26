function [] = outputWsVars(w, fname)

[numRows numCols] = size(w);
vals = cell(numRows, 1);
strs = cell(numRows, 1);
%fid = fopen(fname, 'a');
fid = fopen(fname, 'w');

for cr=1:numRows
    disp(strcat('fid0=',fid))
    var = evalin('base', w{cr, 1});
    vals{cr, 1} = var;
    if iscell(var)
        fprintf(fid, '%s = ', w{cr, 1});
        dlmcell2(fname,fid, var, '-a');
    elseif isstruct(var)
        %c = struct2cell(var);
        [r c] = size(fieldnames(var));
        vec = 1:r;
        [str cellstr so] = struct2str(var, 0, vec);
        t = strrep(cellstr{end}, '; }', ' }');
        cellstr{end} = t;
        C = strtrim(cellstr);
        %testing this w/ dlmcell
        
        fprintf(fid, '%s = ', w{cr, 1});
        dlmcell2(fname,fid, C, '-a');
    else
        %fid = fopen(fname, 'a');
        if ischar(var)
            format = '%s = %s\n';
        else isnumeric(var)
            [r c] = size(var);
            t='[ ';
            if r*c>1  
                for i=1:r-1
                    t = [t, num2str(var(i,:)), '; '];
                end
                t = [t, num2str(var(end,:)), ' ]'];
                var = t;
            else
                var = num2str(vals{cr, 1});
            end
                    
            format='%s = %s\n';
            %var = num2str(vals{cr, 1});
        end
        disp(var);
        fprintf(fid, format, w{cr, 1}, var);
        
    end
end
fclose(fid);
