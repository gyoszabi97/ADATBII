CREATE TABLE Kerdesek IF NOT EXISTS(
	KerdesID INTEGER PRIMARY KEY,
	TemakorID INTEGER REFERENCES Tantargyak(TemakorID),
	Kerdes Varchar2
);

CREATE TABLE HelyesValaszok IF NOT EXISTS(
	ID INTEGER PRIMARY KEY,
	KerdesID INTEGER REFERENCES Kerdesek(KerdesID),
	Betujel Varchar2,
	HelyesValasz Varchar2
);

CREATE TABLE LehetsegesValaszok IF NOT EXISTS(
	LVID INTEGER PRIMARY KEY,
	KerdesID INTEGER REFERENCES Kerdesek(KerdesID),
	ValaszA Varchar2,
	ValaszB Varchar2,
	ValaszC Varchar2,
	ValaszD Varchar2

);

CREATE TABLE Sugo IF NOT EXISTS(
	SID INTEGER PRIMARY KEY,
	KerdesID INTEGER REFERENCES Kerdesek(KerdesID),
	Sugas Varchar2
);

CREATE TABLE Puska IF NOT EXISTS(
	PID INTEGER PRIMARY KEY,
	KerdesID INTEGER REFERENCES Kerdesek(KerdesID),
	Loszer Varchar2
);

CREATE TABLE Hallgato IF NOT EXISTS(
	Nickname INTEGER PRIMARY KEY,
	Kredit Varchar2
);

CREATE TABLE KreditNyeremeny IF NOT EXISTS(
	KID INTEGER PRIMARY KEY,
	TemakorID INTEGER REFERENCES Tantargyak(TemakorID),
	KreditErtek Varchar2,
	Tantargy Varchar2
);

CREATE TABLE Tantargyak IF NOT EXISTS(
	TemakorID INTEGER PRIMARY KEY,
	TargyNeve Varchar2
);

INSERT INTO kerdesek VALUES (?,?,?);