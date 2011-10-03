clear
clc
clf

figure(1);
% extract 'we've got a problem'
[houston, Fsh] = wavread('a13prob.wav');
subplot(1, 2, 1)
plot(houston);
%sound(houston, Fsh);
%pause(length(houston)/Fsh)
clip = 110000;
prob = houston(clip:end)*2;
subplot(1, 2, 2)
plot(prob)
%sound(prob, Fsh)
%pause(length(prob)/Fsh)
figure
[damn, Fsd] = wavread('givdamn2.wav');
subplot(1, 2, 1)
plot(damn);
%sound(damn, Fsd);
%pause(length(damn)/Fsd)
lo = 4500;
hi = 8700;
sdamn = [damn(1:lo); damn(hi:end) ] * .5;
subplot(1, 2, 2)
plot(sdamn);
%sound(sdamn, Fsd);
%pause(sdamn/Fsd);
[truth, Fst] = wavread('truth1.wav');
figure
speech = [prob; sdamn; truth * .7];
plot(speech);
sound(speech, Fst);


