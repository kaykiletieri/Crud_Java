create database bd_distribuidora;
use bd_distribuidora;

create table bebidas(
	idbebida int not null auto_increment,
    nomebebida varchar(45),
    valorbebida double,
    qtdebebida int,
    primary key (idbebida)
);

select*from bebidas;