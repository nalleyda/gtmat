clear
clc
close all
% Listing 07.04 Building a structure array using struct(...)
genres = {'Blues', 'Classical', 'Country' };
artists = {'Clapton, Eric', 'Bocelli, Andrea', 'Twain, Shania' };
years = { 2004, 2004, 2004 };
stars = { 2, 4.6, 3.9 };
prices = { 18.95, 14.89, 13.49 };
cds = struct( 'genre',  genres, ...
			   'artist', artists, ... 
			   'year', years, ... 
			   'stars', stars, ...
			   'price', prices)