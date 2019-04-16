

/*drop table b_kerdesek;
drop table b_tantargyak;
drop table b_hallgato;*/

/*create table b_Tantargyak(
    TemakorID number(15) PRIMARY KEY,
	TargyNeve Varchar2(100)
);

create table b_kerdesek(
    KerdesID number(15) primary key,
    TemakorID number(15) constraint TemakorID references b_Tantargyak
);

CREATE TABLE b_Hallgato(
	Nickname Varchar2(100) PRIMARY KEY,
	Kredit Varchar2(100)
);*/

insert into b_hallgato values('asd3','1213');

Select * From b_Hallgato Where nickname = asd;


/*CREATE TABLE Kerdesek(
	KerdesID number(10) PRIMARY KEY,
	TemakorID number(10) CONSTRAINT TemakorID REFERENCES Tantargyak,
	Kerdes Varchar2
);*/

/*CREATE TABLE HelyesValaszok(
	ID INTEGER PRIMARY KEY,
	KerdesID INTEGER CONSTRAINT KerdesID REFERENCES Kerdesek,
	Betujel Varchar2,
	HelyesValasz Varchar2
);

CREATE TABLE LehetsegesValaszok(
	LVID INTEGER PRIMARY KEY,
	KerdesID INTEGER CONSTRAINT KerdesID REFERENCES Kerdesek,
	ValaszA Varchar2,
	ValaszB Varchar2,
	ValaszC Varchar2,
	ValaszD Varchar2

);

CREATE TABLE Sugo(
	SID INTEGER PRIMARY KEY,
	KerdesID INTEGER CONSTRAINT KerdesID REFERENCES Kerdesek,
	Sugas Varchar2
);

CREATE TABLE Puska(
	PID INTEGER PRIMARY KEY,
	KerdesID INTEGER CONSTRAINT KerdesID REFERENCES Kerdesek,
	Loszer Varchar2
);



CREATE TABLE KreditNyeremeny(
	KID INTEGER PRIMARY KEY,
	TemakorID INTEGER CONSTRAINT TemakorID REFERENCES Tantargyak,
	KreditErtek Varchar2,
	Tantargy Varchar2
);

CREATE TABLE Tantargyak(
	TemakorID INTEGER PRIMARY KEY,
	TargyNeve Varchar2
);
*/