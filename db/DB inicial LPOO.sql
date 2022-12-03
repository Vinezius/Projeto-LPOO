begin

create table Participante(
	
	idParticipante serial not null,
	idLance integer,
	idLeilao integer not null,
	login varchar,
	senha varchar,
	nome varchar,
	email varchar,
	endereco varchar,
	telefone varchar,
	
	primary key(idParticipante)
	
);
	
create table Lance(

	idLance serial not null,
	idItem integer not null,
	idParticipante integer not null,
	valorLance real,
	horaLance time default current_time,

	primary key(idLance)

);

create table Leilao(

	idLeilao serial not null,
	idLance integer not null, --leilao vai precisar de um idlance?
	idItem integer not null,
	dtaInicio date default current_date,
	horInicio time default current_time,
	dtaFinal date,
	horFinal time,
	
	primary key(idLeilao)

);

create table ItemLeilao(

	idItem serial not null,
	idLeilao integer not null,
	titulo varchar,
	descricao text,
	lanceMinimo real,
	caminhoFoto varchar,
	arrematado boolean,
	
	primary key(idItem)
	
);
	
alter table if exists Participante
	add constraint fk_participante_1
		foreign key (idLance) references Lance(idLance);
	
alter table if exists Participante
	add constraint fk_participante_2
		foreign key (idLeilao) references Leilao(idLeilao);
	
	alter table if exists Lance
	add constraint fk_Lance_1
		foreign key (idItem) references ItemLeilao(idItem);
	
	alter table if exists Lance
	add constraint fk_Lance_2
		foreign key (idParticipante) references Participante(idParticipante);
	
	alter table if exists Leilao
	add constraint fk_Leilao_1
		foreign key (idLance) references Lance(idLance);
	
	alter table if exists Leilao
	add constraint fk_Leilao_2
		foreign key (idItem) references ItemLeilao(idItem);
	
	alter table if exists ItemLeilao
	add constraint fk_ItelLeilao_1
		foreign key(idLeilao) references Leilao(idLeilao);
	
rollback
commit