 function transformation = rotation(angle)
% Listing 12-2 - Compute a rotation matrix
%        transformation = rotation(angle)
 % rotate by the angle (radians)
 transformation = [ cos(angle), -sin(angle)
                    sin(angle),  cos(angle) ];


