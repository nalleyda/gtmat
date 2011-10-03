function goto(dir, upFirst)

global useMatlab
if useMatlab
    if upFirst
        !cd ..
    end
    !cd dir
else
    if upFirst
        cd ..
    end
    cd dir
end