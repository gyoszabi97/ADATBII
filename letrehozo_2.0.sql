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

INSERT INTO tantargyak VALUES (1, 'Kalkulus I');
INSERT INTO tantargyak VALUES (2, 'Programozás alapjai');
INSERT INTO tantargyak VALUES (3, 'Programozás I');
INSERT INTO tantargyak VALUES (4, 'Programozás II');
INSERT INTO tantargyak VALUES (5, 'Operációs rendszerek');
INSERT INTO tantargyak VALUES (6, 'Diszkrét matematika I');
INSERT INTO tantargyak VALUES (7, 'Diszkrét matematika II');
INSERT INTO tantargyak VALUES (8, 'Sztochasztika alapjai');
INSERT INTO tantargyak VALUES (9, 'Multimédia');
INSERT INTO tantargyak VALUES (10, 'Logika és informatikai alkalmazásai');



INSERT INTO kerdesek VALUES (1,1,'Milyen sorozatról beszélünk, akkor, ha a rákövetkező elem nem kisebb vagy egyenlő, mint az előző?');
INSERT INTO kerdesek VALUES (2,1,'Milyen sorozatról beszélünk, akkor, ha a rákövetkező elem nem nagyobb vagy egyenlő, mint az előző?');
INSERT INTO kerdesek VALUES (3,1,'Az alábbiak közül melyiknek a deriváltja önmaga?');
INSERT INTO kerdesek VALUES (4,1,'Mit mondhatunk az f függvényünkre, ha tudjuk, hogy (a;b) intervallumon f"(x) >= 0?');
INSERT INTO kerdesek VALUES (5,1,'Mikor mondhatjuk egy függvényre, hogy Riemann-integrálható?');
INSERT INTO kerdesek VALUES (6,2,'Mi az, amit a legkevésbé valószínű, hogy tartalmaz egy header fájl?');
INSERT INTO kerdesek VALUES (7,2,'Mit ad meg egy nyelv szintaxisa?');
INSERT INTO kerdesek VALUES (8,2,'Mely utasításnak nem lesz érdemi hatása az "int [5][12] deklaráció esetén?');
INSERT INTO kerdesek VALUES (9,2,'Mi az algoritmus vezérlése?');
INSERT INTO kerdesek VALUES (10,2,'Mit ábrázol egy folyamatábra?');
INSERT INTO kerdesek VALUES (11,3,'Valamilyen entitás, ami lehet a való világból vagy elvonatkoztatott dolog. Melyik fogalom ez?');
INSERT INTO kerdesek VALUES (12,3,'Mivel rendelkezhet egy objektum?');
INSERT INTO kerdesek VALUES (13,3,'Minek a speciális formája az aggregáció?');
INSERT INTO kerdesek VALUES (14,3,'Melyik paranccsal tudunk öröklődést létrehozni a programunkban?');
INSERT INTO kerdesek VALUES (15,3,'Mitől lehet egy osztály absztrakt?');
INSERT INTO kerdesek VALUES (16,4,'Az alábbiak közül melyek a szintaxisbeli különbségek a C és C++ között?');
INSERT INTO kerdesek VALUES (17,4,'Az alábbiak közül melyik NEM egy ingyenes C/C++ fejlesztői környezet?');
INSERT INTO kerdesek VALUES (18,4,'Az alábbiak közül melyik egy <stdlib.h> -hoz tartozó dinamikus memóriakezelő eljárás?');
INSERT INTO kerdesek VALUES (19,4,'Az alábbiak közül melyik NEM vonatkozik a processzor makrókra?');
INSERT INTO kerdesek VALUES (20,4,'Mely operátorokat lehet osztályokra is kiterjeszteni?');
INSERT INTO kerdesek VALUES (21,5,'Melyik Linux-beli rendszerkönyvtár tartalmazza a kritikus beállításokat?');
INSERT INTO kerdesek VALUES (22,5,'Az alábbiak közül melyik NEM az "ls"-hez kapcsolódó parancsopció?');
INSERT INTO kerdesek VALUES (23,5,'Az operációs rendszerek történetének hanyadik generációjába tartozik az 1955-65-ig tartó időszak?');
INSERT INTO kerdesek VALUES (24,5,'Az alábbiak közül melyik parancs szolgál a különböző jogok megadására?');
INSERT INTO kerdesek VALUES (25,5,'Mire szolgál a touch parancs?');
INSERT INTO kerdesek VALUES (26,6,'Az alábbiak közül melyikkel egyenértékű a c(AB) kifejezés?');
INSERT INTO kerdesek VALUES (27,6,'Az alábbaik közül melyik a logikai "ÉS" művelet másik elnevezése?');
INSERT INTO kerdesek VALUES (28,6,'Ha A és B értéke hamis, akkor az alábbi műveletek közül melyik NEM lesz hamis?');
INSERT INTO kerdesek VALUES (29,6,'Ha A és B értéke egyaránt igaz, az alábbiak közül melyik kifejezés lesz hamis?');
INSERT INTO kerdesek VALUES (30,6,'Olyan formula, mely minden kiértékelésre igaz értéket ad. Melyik fogalom ez?');
INSERT INTO kerdesek VALUES (31,7,'Hányféleképpen rakhatók sorba a "ballada" szó betűi úgy, hogy két mássalhangzó nem kerülhet egymás mellé?');
INSERT INTO kerdesek VALUES (32,7,'Hányféleképpen rakhatók sorba a "ballada" szó betűi úgy, hogy két mássalhangzó nem kerülhet egymás mellé. Melyik művelettel oldható meg a feladat?');
INSERT INTO kerdesek VALUES (33,7,'Egy boltban 5 féle CD kapható (mindből van elegendő). Hányféleképpen tudunk venni egyszerre 4 CD-t?');
INSERT INTO kerdesek VALUES (34,7,'Egy boltban 5 féle CD kapható (mindből van elegendő). Ha egyszerre 4 CD-t akarunk venni, melyik művelettel lehet kiszámolni?');
INSERT INTO kerdesek VALUES (35,7,'A kongruencia-rendszereknél mi a modulo szám?');
INSERT INTO kerdesek VALUES (36,8,'Egy véletlen kísérlet lehetséges eredményei. Melyik definícióról van szó?');
INSERT INTO kerdesek VALUES (37,8,'Miből áll a valószínúségi mező?');
INSERT INTO kerdesek VALUES (38,8,'Melyik szabály ez: P(A\B) = P(A) -P(AꓵB)?');
INSERT INTO kerdesek VALUES (39,8,'A és B pozitív valószínűségi esemény, akkor, ha…');
INSERT INTO kerdesek VALUES (40,8,'Egy eseménytérnek csak véges sok eleme van, és mindn kimenetelnek egyforma a valószínűsége. Milyen valószínűségi mezőről van szó?');
INSERT INTO kerdesek VALUES (41,9,'Melyik Action Script utasítással lehet elugrani egy képkockára és elindítani a lejátszást?');
INSERT INTO kerdesek VALUES (42,9,'Melyik vállalathoz kötődik a PostScript " de facto" szabvány?');
INSERT INTO kerdesek VALUES (43,9,'Melyik NEM nemzeti szabványügyi testület?');
INSERT INTO kerdesek VALUES (44,9,'Milyen színátmenetek vannak Flash-ben?');
INSERT INTO kerdesek VALUES (45,9,'Melyik függvénnyel lehet rendezni egy tömböt?');
INSERT INTO kerdesek VALUES (46,10,'Olyan formula, melyben nem fordul elő egyetlen változó sem szabadon. Melyik fogalom ez?');
INSERT INTO kerdesek VALUES (47,10,'Olyan változó, melyben csak 0-ad rendű predikátumszimbólumok vannak. Melyik fogalom ez?');
INSERT INTO kerdesek VALUES (48,10,'Ha F, G, H tetszőlees formula, akkor az alábbiak közül melyik Hilbert rendszerének axiomája?');
INSERT INTO kerdesek VALUES (49,10,'Ha F egy formula, akkor mit jelöl a Mod(F)?');
INSERT INTO kerdesek VALUES (50,10,'Hogyan nevezzük a 0 paritású függvényjeleket?');



INSERT INTO lehetsegesValaszok VALUES (1,1,'Alulról korlátos','Felülről korlátos','Monoton növekvő','Monoton csökkenő');
INSERT INTO lehetsegesValaszok VALUES (2,2,'Alulról korlátos','Felülről korlátos','Monoton növekvő','Monoton csökkenő');
INSERT INTO lehetsegesValaszok VALUES (3,3,'ln x','e^x','sin x','arccos x');
INSERT INTO lehetsegesValaszok VALUES (4,4,'konkáv','konvex','felülről korlátos','alulról korlátos');
INSERT INTO lehetsegesValaszok VALUES (5,5,'ha minden normális felosztássorozat esetén konvergens','ha részintervallumokon is integrálható','ha monoton növekvő','ha kétszer deriválható');
INSERT INTO lehetsegesValaszok VALUES (6,6,'változó deklarációk','kontans deklarációk','függvény deklarációk','újabb header include-ok');
INSERT INTO lehetsegesValaszok VALUES (7,7,'Azt, hogy milyen előre megírt függvényeket használhatunk.','Azt, hogy mi a nyelv foglalt azonosítóinak jelentése','Azt, hogy mik a nyelvben érvényes jelsorozatok','Azt, hogy a szövegszerkesztőben milyen színnel jelennek meg az egyes elemek.');
INSERT INTO lehetsegesValaszok VALUES (8,8,'A[0][2] = A[2][0]','A[0][25] = A[2][1]','A[0][42] = A[4][2]','A[0][37] = A[2][7]');
INSERT INTO lehetsegesValaszok VALUES (9,9,'A szerkezeti ábra','A szekvenciálisan végrehajtott utasítások összessége','Az az előírás, amely megadja, hogy milyen műveleteket milyen sorrendben kell végrehajtani','Az az egység, amelyet az értékkészlet és a műveletek határoznak meg');
INSERT INTO lehetsegesValaszok VALUES (10,10,'A program szerkezetét, felépítésését','A forrásnyelvben érvényes jelsorozatokat','A program függvényei közötti lehetséges hívásokat','A program utasításait, elágazási pontjait, és ezek lehetséges sorrendjeit.');
INSERT INTO lehetsegesValaszok VALUES (11,11,'osztálydiagram','osztály','objektum','asszociáció');
INSERT INTO lehetsegesValaszok VALUES (12,12,'identitás','állapot','viseledés','mindhárommal rendelkezhet');
INSERT INTO lehetsegesValaszok VALUES (13,13,'implementáció','asszociáció','öröklődés','polimorfizmus');
INSERT INTO lehetsegesValaszok VALUES (14,14,'extends','public class','private','import');
INSERT INTO lehetsegesValaszok VALUES (15,15,'ha nincs implementációja','ha objektumba csomagolja a primitív típust','ha csak interfészként van használva','ha az adat és a program is ott van');
INSERT INTO lehetsegesValaszok VALUES (16,16,'egy soros komment','a for ciklusban deklaráható ciklusváltozó','adhatunk default paramétereket eljárásoknak','mindhárom');
INSERT INTO lehetsegesValaszok VALUES (17,17,'Cygwin','Java C++','GCC','Turbo C++');
INSERT INTO lehetsegesValaszok VALUES (18,18,'malloc','free','realloc','mindhárom');
INSERT INTO lehetsegesValaszok VALUES (19,19,'olyan váltzókat hoz létre, melyeket egy másik process is használ','képes a forrásprogram sorait módosítani','a fordító program előtt fut le','token helyettesítéseket képes előírni');
INSERT INTO lehetsegesValaszok VALUES (20,20,'.','[]','|','<<=');
INSERT INTO lehetsegesValaszok VALUES (21,21,'/boot','/etc','dev','/home');
INSERT INTO lehetsegesValaszok VALUES (22,22,'ls -l','ls -a','ls -9','ls -C');
INSERT INTO lehetsegesValaszok VALUES (23,23,'1.','2.','3.','4.');
INSERT INTO lehetsegesValaszok VALUES (24,24,'echo','mkdir','chmod','cd');
INSERT INTO lehetsegesValaszok VALUES (25,25,'fájlok másolására','könytár létrehozására','aktuális könyvtár megváltoztatására','a fájl időbélyegének megváltoztatására');
INSERT INTO lehetsegesValaszok VALUES (26,26,'(cA)B','c(A+B)','cA + cB','AB');
INSERT INTO lehetsegesValaszok VALUES (27,27,'diszjunkció','konjukció','negáció','ekvivalencia');
INSERT INTO lehetsegesValaszok VALUES (28,28,'AVB','AΛB','A↔B','mindhárom');
INSERT INTO lehetsegesValaszok VALUES (29,29,'AΛB','A↔B','mindkettő','egyik sem');
INSERT INTO lehetsegesValaszok VALUES (30,30,'diszjuntiv normálforma','tautológia','ekvivalencia','szürjektív normálforma');
INSERT INTO lehetsegesValaszok VALUES (31,31,'1','6','12','18');
INSERT INTO lehetsegesValaszok VALUES (32,32,'ismétléses kombináció','ismétlés nélküli kombináció','ismétléses permutáció','diofantoszi egyenlet');
INSERT INTO lehetsegesValaszok VALUES (33,33,'40','50','60','70');
INSERT INTO lehetsegesValaszok VALUES (34,34,'ismétléses kombináció','ismétlés nélküli kombináció','ismétléses permutáció','diofantoszi egyenlet');
INSERT INTO lehetsegesValaszok VALUES (35,35,'az osztandó szám','az osztás utáni maradék értéke','egy szorzóérték','a végén még hozzáadandó érték');
INSERT INTO lehetsegesValaszok VALUES (36,36,'eseménytér','valószínűség','monotonitás','kimenetel');
INSERT INTO lehetsegesValaszok VALUES (37,37,'alaphalmazból','vizsgált eredmények rendszeréből','egyes valósínűségekből','mindháromból');
INSERT INTO lehetsegesValaszok VALUES (38,38,'Poincaré-formula','kivonási szabály','szita formula','láncszabály');
INSERT INTO lehetsegesValaszok VALUES (39,39,'P(A\B)= P(A)','P(B\A) = P(B)','A és B független egymástól','mindhárom');
INSERT INTO lehetsegesValaszok VALUES (40,40,'diszkrét','klasszikus','geometriai','egyik sem');
INSERT INTO lehetsegesValaszok VALUES (41,41,'gotoAndStop','gotoAndPlay','gotoAndStart','menjÉsJátszdLe');
INSERT INTO lehetsegesValaszok VALUES (42,42,'AutoDesk','Microsoft','Adobe','Apple');
INSERT INTO lehetsegesValaszok VALUES (43,43,'ISO','ANSI','BSI','DIN');
INSERT INTO lehetsegesValaszok VALUES (44,44,'univerzális és totális','lokális és globális','lineáris és radiális','brutális és morális');
INSERT INTO lehetsegesValaszok VALUES (45,45,'array.eval()','array.sort()','array.push()','array()');
INSERT INTO lehetsegesValaszok VALUES (46,46,'mondat','zárt formula','mindkettő','egyik sem');
INSERT INTO lehetsegesValaszok VALUES (47,47,'ítéletváltozó','predikátumváltozó','klóz','literál');
INSERT INTO lehetsegesValaszok VALUES (48,48,'(F → (G → F))','((F → ↓)→ ↓)→ F','egyik sem','mindkettő');
INSERT INTO lehetsegesValaszok VALUES (49,49,'azon struktúrák halmazát, melyek F-et kielégítik','azon struktúrák halmazát, melyek Σ-ot kielégítik','azt, hogy Σ kielégíthetetlen','egyik sem');
INSERT INTO lehetsegesValaszok VALUES (50,50,'alapterm','konstans','klóz','formula');