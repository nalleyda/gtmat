 function ans = islt(a, b)
% Listing 17-2 - Comparing two objects
% comparing two objects
 acl = class(a);
 ans = false;
 if isa(b, acl)
     switch acl
       case 'double'
         ans = a < b;
       case 'struct'
         if isfield(a, 'key')
             ans = a.key < b.key;
         elseif isfield(a, 'dod')
             ans = age(a) < age(b);
         else
             error('comparing unknown structures')
         end
       otherwise
       error(['can''t compare ' acl 's'])
     end     
 end
