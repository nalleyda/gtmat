function [] = outputWsVars(w, fname)

[numRows numCols] = size(w);
vals = cell(numRows, 1);
strs = cell(numRows, 1);
fid = fopen(fname, 'a');

for cr=1:numRows
    disp(strcat('fid0=',fid))
    var = evalin('base', w{cr, 1});
    vals{cr, 1} = var;
    if iscell(var)
        fprintf(fid, '%s= ', w{cr, 1});
        dlmcell2(fname,fid, var, '-a');
    elseif isstruct(var)
        c = struct2cell(var);
        fprintf(fid, '%s= ', w{cr, 1});
        dlmcell2(fname,fid, c, '-a');
    else
        %fid = fopen(fname, 'a');
        if ischar(var)
            format = '%s= %s\n';
        else isnumeric(var)
            format='%s= %s\n';
            var = num2str(vals{cr, 1});
        end
        disp(strcat('fid=',fid))
        fprintf(fid, format, w{cr, 1}, var);
        
    end
end
fclose(fid);
