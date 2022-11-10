DROP TABLE IF EXISTS fabricantes;

create table fabricantes(
	id int auto_increment,
    nombre varchar(100),
    primary key (id)
);

insert into fabricantes (nombre)
values ('Fabricante1');
insert into fabricantes (nombre)
values ('Fabricante2');
insert into fabricantes (nombre)
values ('Fabricante3');

drop table if exists articulos;

create table articulos(
	id int auto_increment,
    nombre varchar(100),
    precio int,
    fabricante int,
    primary key (id),
    FOREIGN KEY (fabricante) REFERENCES fabricantes (id) 
	ON DELETE CASCADE ON UPDATE CASCADE
);

insert into articulos (nombre, precio, fabricante)
values ('Art1', 10, 1);
insert into articulos (nombre, precio, fabricante)
values ('Art2', 15, 2);
insert into articulos (nombre, precio, fabricante)
values ('Art3', 50, 3);