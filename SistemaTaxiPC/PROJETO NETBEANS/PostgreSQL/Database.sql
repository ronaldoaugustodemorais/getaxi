DROP TABLE motorista;
CREATE TABLE motorista(
	idmotorista serial PRIMARY KEY,
	nome varchar(50) NOT NULL,
	cnh char(8) NOT NULL,
	cpf char(14) NOT NULL,
	data_admissao char(8),
	data_nascimento char(8),
	estado char(2),
	cidade varchar(15),
	rua varchar(30),
	telefone varchar(14)
);

DROP TABLE veiculo;
CREATE TABLE veiculo(
	idveiculo serial PRIMARY KEY,
	ano integer NOT NULL,
	marca varchar(15) NOT NULL,
	placa char(8) NOT NULL,
	idmotorista integer REFERENCES motorista(idmotorista)
);

DROP TABLE chamada;
CREATE TABLE chamada(
	protocolo serial PRIMARY KEY,
	passageiro  varchar(45) NOT NULL,
	localpartida varchar(50) NOT NULL,
	localchegada varchar(50) NOT NULL	
);

DROP TABLE atendente;
CREATE TABLE atendente(
	idatendente serial PRIMARY KEY,
	nome varchar(50) NOT NULL,	
	cpf char(14) NOT NULL,
	estado char(2),
	cidade varchar(30),
	rua varchar(30),
	telefone varchar(14)
);

DROP TABLE usuario;
CREATE TABLE usuario(
	idusuario serial PRIMARY KEY,
	cpf char(14) NOT NULL,
	nome varchar(50) NOT NULL,
	estado char(2),
	cidade varchar(30),
	rua varchar(30),
	telefone varchar(14)
);

DROP TABLE solicita_taxi;
CREATE TABLE solicita_taxi(
	idusuario integer REFERENCES usuario(idusuario),
	idatendente integer REFERENCES atendente(idatendente)
);

DROP TABLE registro_chamada;
CREATE TABLE registro_chamada(
	protocolo integer,
	idatendente integer REFERENCES atendente(idatendente),
	idmotorista integer REFERENCES motorista(idmotorista)
);