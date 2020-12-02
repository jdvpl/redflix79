DROP SCHEMA IF EXISTS redflix79;
CREATE SCHEMA redflix79;
USE redflix79;

CREATE TABLE pelicula (
	idpelicula int not null primary key,
    titulopelicula varchar(100) not null,
    resumenpel mediumtext,
    yearpel integer,
    nombredirector varchar(50)
);

CREATE TABLE serie (
	idserie int not null primary key,
    tituloserie varchar(100) not null,
    temporadasserie int,
    capitulosserie int
);

CREATE TABLE usuario (
	aliasuser varchar(50) not null primary key,
    nombreuser varchar(100)
);
INSERT INTO pelicula VALUES (1001,'Los Vengadores','Pelicula de superheroes basada en Marvel Comics. Nick Fury director de SHIELD recluta a Tony Stark, Steve Rogers, Bruce Banner y Thor para forma un equipo y evitar que Loki, hermano de Thor, se apodere de la tierra.',1990,'Joss Whedon');
INSERT INTO pelicula VALUES (1002,'Interestelar','Pelicula de ciencia ficción, donde la humanidad lucha por sobrevivir. La pelicula cuenta una historia de un grupo de astronautas que viajan a traves de un agujero de gusano en busca de un nuevo hogar.',2014,'Christopher Nolan');
INSERT INTO pelicula VALUES (1003,'El viaje de Chihiro','Pelicula de animación japonesa. Es la historia de una niña de 12 años, quien se ve atrapada por un mundo mágico y sobrenatural, teniendo como misión buscar su libertad y la de sus padres y regresar al mundo real.',2001,'Hayo Miyazaki');
INSERT INTO pelicula VALUES (1004,'Parasitos','Pelicula de drama, suspenso y humor negro. Toca temas como las diferencias sociales y vulnerabilidad del espiritu humano',2019,'Bong Joon-ho');
INSERT INTO pelicula VALUES (1005,'Mas alla de los sueños','Pelicula de drama, narra una historia trágica de una familia, donde el padre va en busca de sus esposa al mas allá para recuperarla.',1998,'Vincent Ward');

INSERT INTO serie VALUES (2001,'The walking dead',11,153);
INSERT INTO serie VALUES (2002,'Viaje a las estrellas: la serie original',3,80);
INSERT INTO serie VALUES (2003,'Glow',3,30);
INSERT INTO serie VALUES (2004,'La casa de papel',4,31);
INSERT INTO serie VALUES (2005,'Friends',10,236);
INSERT INTO serie VALUES (2006,'Arrow',8,170);
INSERT INTO serie VALUES (2007,'The big bang theory',12,279);
INSERT INTO serie VALUES (2008,'Vikingos',6,79);

INSERT INTO usuario VALUES ('lucky','Pedro Perez');
INSERT INTO usuario VALUES ('malopez','Maria Lopez');
INSERT INTO usuario VALUES ('diva','Ana Diaz');
INSERT INTO usuario VALUES ('dreamer','Luis Rojas');
INSERT INTO usuario VALUES ('ninja','Andres Cruz');
INSERT INTO usuario VALUES ('neon','Nelson Ruiz');
INSERT INTO usuario VALUES ('rose','Claudia Mendez');
INSERT INTO usuario VALUES ('green','Jorge Rodriguez');
