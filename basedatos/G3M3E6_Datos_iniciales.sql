USE G3M3E6;
ALTER TABLE pelicula AUTO_INCREMENT=1001;
ALTER TABLE serie AUTO_INCREMENT=2001;

	-- Datos usuarios--
insert into usuario values('lucky', 'Pedro Perez');
insert into usuario values('malopez', 'Maria Lopez');
insert into usuario values('diva', 'Ana Diaz');
insert into usuario values('dreamer', 'Luis Rojas');
insert into usuario values('ninja', 'Andres Cruz');
insert into usuario values('neon', 'Nelson Ruiz');
insert into usuario values('rose', 'Claudia Mendez');
insert into usuario values('green', 'Jorge Rodriguez');

	-- Datos peliculas--
insert into pelicula values('Los Vengadores', 'Pelicula de superheroes basada en Marvel Comics. Nick Fury director de SHIELD recluta a Tony Stark, Steve Rogers, Bruce Banner y Thor para forma un equipo y evitar que Loki, hermano de Thor, se apodere de la tierra', 1990, 'Joss Whedon');
insert into pelicula values('Interestelar', 'Pelicula de ciencia ficción, donde la humanidad lucha por sobrevivir. La pelicula cuenta una historia de un grupo de astronautas que viajan a traves de un agujero de gusano en busca de un nuevo hogar', 2014, 'Christopher Nolan');
insert into pelicula values('El viaje de Chihiro', 'Pelicula de animación japonesa. Es la historia de una niña de 12 años, quien se ve atrapada por un mundo mágico y sobrenatural, teniendo como misión buscar su libertad y la de sus padres y regresar al mundo real.', 2001, 'Hayo Miyazaki');
insert into pelicula values('Parasitos', 'Pelicula de drama, suspenso y humor negro. Toca temas como las diferencias sociales y vulnerabilidad del espiritu humano', 2019, 'Bong Joon-ho');
insert into pelicula values('Mas alla de los sueños', 'Pelicula de drama, narra una historia trágica de una familia, donde el padre va en busca de sus esposa al mas allá para recuperarla.', 1998, 'Vincent Ward');
/*
insert into pelicula values(1001, 'Los Vengadores', 'Pelicula de superheroes basada en Marvel Comics. Nick Fury director de SHIELD recluta a Tony Stark, Steve Rogers, Bruce Banner y Thor para forma un equipo y evitar que Loki, hermano de Thor, se apodere de la tierra', 1990, 'Joss Whedon');
insert into pelicula values(1002, 'Interestelar', 'Pelicula de ciencia ficción, donde la humanidad lucha por sobrevivir. La pelicula cuenta una historia de un grupo de astronautas que viajan a traves de un agujero de gusano en busca de un nuevo hogar', 2014, 'Christopher Nolan');
insert into pelicula values(1003, 'El viaje de Chihiro', 'Pelicula de animación japonesa. Es la historia de una niña de 12 años, quien se ve atrapada por un mundo mágico y sobrenatural, teniendo como misión buscar su libertad y la de sus padres y regresar al mundo real.', 2001, 'Hayo Miyazaki');
insert into pelicula values(1004, 'Parasitos', 'Pelicula de drama, suspenso y humor negro. Toca temas como las diferencias sociales y vulnerabilidad del espiritu humano', 2019, 'Bong Joon-ho');
insert into pelicula values(1005, 'Mas alla de los sueños', 'Pelicula de drama, narra una historia trágica de una familia, donde el padre va en busca de sus esposa al mas allá para recuperarla.', 1998, 'Vincent Ward');
/**/

	-- Datos Series--
insert into serie values('The walking dead', 11, 153);
insert into serie values('Viaje a las estrellas: la serie original', 3, 80);
insert into serie values('Glow', 3, 30);
insert into serie values('La casa de papel', 4, 31);
insert into serie values('Friends', 10, 236);
insert into serie values('Arrow', 8, 170);
insert into serie values('The big bang theory', 12, 279);
insert into serie values('Vikingos', 6, 79);

/*
insert into serie values(2001, 'The walking dead', 11, 153);
insert into serie values(2002, 'Viaje a las estrellas: la serie original', 3, 80);
insert into serie values(2003, 'Glow', 3, 30);
insert into serie values(2004, 'La casa de papel', 4, 31);
insert into serie values(2005, 'Friends', 10, 236);
insert into serie values(2006, 'Arrow', 8, 170);
insert into serie values(2007, 'The big bang theory', 12, 279);
insert into serie values(2008, 'Vikingos', 6, 79);
/**/
