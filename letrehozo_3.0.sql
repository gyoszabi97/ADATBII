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
	Kredit Varchar2,
	SzobaNev Varchar2(30)
);

CREATE TABLE KreditNyeremeny IF NOT EXISTS(
	/*KID INTEGER PRIMARY KEY,*/
	TemakorID INTEGER REFERENCES Tantargyak(TemakorID),
	KreditErtek Varchar2,
	/*Tantargy Varchar2*/
);

CREATE TABLE Tantargyak IF NOT EXISTS(
	TemakorID INTEGER PRIMARY KEY,
	TargyNeve Varchar2
);

CREATE TABLE Szoba IF NOT EXISTS(
	SzobaNev Varchar2(30) PRIMARY KEY
	
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
INSERT INTO kerdesek VALUES (8,2,'Mely utasításnak nem lesz érdemi hatása az "int [5][12]" deklaráció esetén?');
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
INSERT INTO kerdesek VALUES (38,8,'Melyik szabály ez: P(A\B) = P(A) - P(AꓵB)?');
INSERT INTO kerdesek VALUES (39,8,'A és B pozitív valószínűségi esemény, akkor, ha…');
INSERT INTO kerdesek VALUES (40,8,'Egy eseménytérnek csak véges sok eleme van, és minden kimenetelnek egyforma a valószínűsége. Milyen valószínűségi mezőről van szó?');
INSERT INTO kerdesek VALUES (41,9,'Melyik Action Script utasítással lehet elugrani egy képkockára és elindítani a lejátszást?');
INSERT INTO kerdesek VALUES (42,9,'Melyik vállalathoz kötődik a PostScript " de facto" szabvány?');
INSERT INTO kerdesek VALUES (43,9,'Melyik NEM nemzeti szabványügyi testület?');
INSERT INTO kerdesek VALUES (44,9,'Milyen színátmenetek vannak Flash-ben?');
INSERT INTO kerdesek VALUES (45,9,'Melyik függvénnyel lehet rendezni egy tömböt?');
INSERT INTO kerdesek VALUES (46,10,'Olyan formula, melyben nem fordul elő egyetlen változó sem szabadon. Melyik fogalom ez?');
INSERT INTO kerdesek VALUES (47,10,'Olyan változó, melyben csak 0-ad rendű predikátumszimbólumok vannak. Melyik fogalom ez?');
INSERT INTO kerdesek VALUES (48,10,'Ha F, G, H tetszőleges formula, akkor az alábbiak közül melyik Hilbert rendszerének axiomája?');
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
INSERT INTO lehetsegesValaszok VALUES (19,19,'olyan változókat hoz létre, melyeket egy másik process is használ','képes a forrásprogram sorait módosítani','a fordító program előtt fut le','token helyettesítéseket képes előírni');
INSERT INTO lehetsegesValaszok VALUES (20,20,'.','[]','|','<<=');
INSERT INTO lehetsegesValaszok VALUES (21,21,'/boot','/etc','/dev','/home');
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



INSERT INTO helyesValaszok VALUES (1,'C', 'Monoton növekvő');
INSERT INTO helyesValaszok VALUES (2,'D', 'Monoton csökkenő');
INSERT INTO helyesValaszok VALUES (3,'B', 'e^x');
INSERT INTO helyesValaszok VALUES (4,'B', 'konvex');
INSERT INTO helyesValaszok VALUES (5,'A', 'ha minden normális felosztássorozat esetén konvergens');
INSERT INTO helyesValaszok VALUES (6,'A', 'változó deklarációk');
INSERT INTO helyesValaszok VALUES (7,'C', 'Azt, hogy mik a nyelvben érvényes jelsorozatok');
INSERT INTO helyesValaszok VALUES (8,'B', 'A[0][25] = A[2][1]');
INSERT INTO helyesValaszok VALUES (9,'C', 'Az az előírás, amely megadja, hogy milyen műveleteket milyen sorrendben kell végrehajtani');
INSERT INTO helyesValaszok VALUES (10,'D', 'A program utasításait, elágazási pontjait, és ezek lehetséges sorrendjeit.');
INSERT INTO helyesValaszok VALUES (11,'C', 'objektum');
INSERT INTO helyesValaszok VALUES (12,'D', 'mindhárom');
INSERT INTO helyesValaszok VALUES (13,'B', 'asszociáció');
INSERT INTO helyesValaszok VALUES (14,'A', 'extends');
INSERT INTO helyesValaszok VALUES (15,'C', 'ha csak interfészként van használva');
INSERT INTO helyesValaszok VALUES (16,'D', 'mindhárom');
INSERT INTO helyesValaszok VALUES (17,'B', 'Java C++');
INSERT INTO helyesValaszok VALUES (18,'D', 'mindhárom');
INSERT INTO helyesValaszok VALUES (19,'A', 'olyan változókat hoz létre, melyeket egy másik process is használ');
INSERT INTO helyesValaszok VALUES (20,'A', '.');
INSERT INTO helyesValaszok VALUES (21,'B', '/etc');
INSERT INTO helyesValaszok VALUES (22,'C', 'ls -9');
INSERT INTO helyesValaszok VALUES (23,'B', '2.');
INSERT INTO helyesValaszok VALUES (24,'C', 'chmod');
INSERT INTO helyesValaszok VALUES (25,'D', 'a fájl időbélyegének megváltoztatására');
INSERT INTO helyesValaszok VALUES (26,'A', '(cA)B');
INSERT INTO helyesValaszok VALUES (27,'B', 'konjukció');
INSERT INTO helyesValaszok VALUES (28,'C', 'A↔B');
INSERT INTO helyesValaszok VALUES (29,'D', 'egyik sem');
INSERT INTO helyesValaszok VALUES (30,'B', 'tautológia');
INSERT INTO helyesValaszok VALUES (31,'C', '12');
INSERT INTO helyesValaszok VALUES (32,'C', 'ismétléses permutáció');
INSERT INTO helyesValaszok VALUES (33,'D', '70');
INSERT INTO helyesValaszok VALUES (34,'A', 'ismétléses kombináció');
INSERT INTO helyesValaszok VALUES (35,'B', 'az osztás utáni maradék értéke');
INSERT INTO helyesValaszok VALUES (36,'D', 'kimenetel');
INSERT INTO helyesValaszok VALUES (37,'D', 'mindháromból');
INSERT INTO helyesValaszok VALUES (38,'B', 'kivonási szabály');
INSERT INTO helyesValaszok VALUES (39,'D', 'mindhárom');
INSERT INTO helyesValaszok VALUES (40,'B', 'klasszikus');
INSERT INTO helyesValaszok VALUES (41,'B', 'gotoAndPlay');
INSERT INTO helyesValaszok VALUES (42,'C', 'Adobe');
INSERT INTO helyesValaszok VALUES (43,'A', 'ISO');
INSERT INTO helyesValaszok VALUES (44,'C', 'lineáris és radiális');
INSERT INTO helyesValaszok VALUES (45,'B', 'array.sort()');
INSERT INTO helyesValaszok VALUES (46,'C', 'mindkettő');
INSERT INTO helyesValaszok VALUES (47,'A', 'ítéletváltozó');
INSERT INTO helyesValaszok VALUES (48,'D', 'mindkettő');
INSERT INTO helyesValaszok VALUES (49,'A', 'azon struktúrák halmazát, melyek F-et  kielégítik');
INSERT INTO helyesValaszok VALUES (50,'B', 'konstans');



INSERT INTO kreditNyeremeny VALUES (1, '4');
INSERT INTO kreditNyeremeny VALUES (2, '8');
INSERT INTO kreditNyeremeny VALUES (3, '6');
INSERT INTO kreditNyeremeny VALUES (4, '6');
INSERT INTO kreditNyeremeny VALUES (5, '5');
INSERT INTO kreditNyeremeny VALUES (6, '6');
INSERT INTO kreditNyeremeny VALUES (7, '5');
INSERT INTO kreditNyeremeny VALUES (8, '5');
INSERT INTO kreditNyeremeny VALUES (9, '4');
INSERT INTO kreditNyeremeny VALUES (10, '5');




INSERT INTO Puska VALUES (1,1,'mon↑');
INSERT INTO Puska VALUES (2,2,'mon↓');
INSERT INTO Puska VALUES (3,3,'(sin x) deriváltja cos x');
INSERT INTO Puska VALUES (4,4,'f"(x) >= 0');
INSERT INTO Puska VALUES (5,5,'az integrál jellemzői az integrálandó f(x) függvény és az [a,b] intervallum, amin integrálunk');
INSERT INTO Puska VALUES (6,6,'a header fájlok függvány deklarációkat tartalmaznak');
INSERT INTO Puska VALUES (7,7,'szintaxis: nyelvben érvényes jelsorozatok');
INSERT INTO Puska VALUES (8,8,'int [][] = 2D tömb');
INSERT INTO Puska VALUES (9,9,'Alg. vez.: milyen műveleteket milyen sorrendben kell végrehajtani');
INSERT INTO Puska VALUES (10,10,'a folyamatábrákban van elágazási pont');
INSERT INTO Puska VALUES (11,11,'asszociáció = összekapcsolódás');
INSERT INTO Puska VALUES (12,12,'egy objektum rendelkezhet identitással, állapottal és viseledéssel');
INSERT INTO Puska VALUES (13,13,'interfészt az implements kulcsszóval lehet implementálni');
INSERT INTO Puska VALUES (14,14,'private = csak az osztály látja');
INSERT INTO Puska VALUES (15,15,'public class classname implements interfacename');
INSERT INTO Puska VALUES (16,16,'C vs C++: a for ciklusban deklaráható ciklusváltozó');
INSERT INTO Puska VALUES (17,17,'GCC, Turbo C++ stb.');
INSERT INTO Puska VALUES (18,18,'malloc, realloc -hoz kell stdlib.h');
INSERT INTO Puska VALUES (19,19,'processzor makró: másik process használatához');
INSERT INTO Puska VALUES (20,20,'osztályokban nincs []');
INSERT INTO Puska VALUES (21,21,'/stb');
INSERT INTO Puska VALUES (22,22,'ls -l, -a, -b, -d, -n');
INSERT INTO Puska VALUES (23,23,'45-55 1. generáció');
INSERT INTO Puska VALUES (24,24,'mkdir - mappa / könyvtár létrehozása');
INSERT INTO Puska VALUES (25,25,'mkdir - mappa / könyvtár létrehozása');
INSERT INTO Puska VALUES (26,26,'pl.: cAB = c(AB)');
INSERT INTO Puska VALUES (27,27,'negálás: p => -p');
INSERT INTO Puska VALUES (28,28,'AΛB csak akkor igaz, ha A és B igazak');
INSERT INTO Puska VALUES (29,29,'AΛB csak akkor igaz, ha A és B igazak');
INSERT INTO Puska VALUES (30,30,'az ekvivalencia egyenértékűséget jelent');
INSERT INTO Puska VALUES (31,31,'ismétléses permutáció');
INSERT INTO Puska VALUES (32,32,'diofantoszi egyenlet: ax + by = c');
INSERT INTO Puska VALUES (33,33,'70');
INSERT INTO Puska VALUES (34,34,'Ha adott n különböző elemből úgy választunk ki k darabot, hogy egyet többször is (ismétlődve is) kiválasztunk, akkor ismétléses kombinációról beszélünk');
INSERT INTO Puska VALUES (35,35,'modulo = maradék');
INSERT INTO Puska VALUES (36,36,'kimenetel: véletlen kísérlet lehetséges eredményei');
INSERT INTO Puska VALUES (37,37,'valószínúségi mező: vizsgált eredmények rendszere az egyes valószínűségekből');
INSERT INTO Puska VALUES (38,38,'P(A\B) = minden ami nem B');
INSERT INTO Puska VALUES (39,39,'két esemény pozitív valósznűségi esemény, ha független egymástól, P(A\B)= P(A) ...');
INSERT INTO Puska VALUES (40,40,'diszkrét valószínűségi mezőről van szó, ha az eseménytér véges vagy megszámlálhatóan végtelen');
INSERT INTO Puska VALUES (41,41,'gotoAndPlay: lejátszáshoz');
INSERT INTO Puska VALUES (42,42,'de facto => Adobe');
INSERT INTO Puska VALUES (43,43,'szabványügyi testületek: ANSI, BSI, DIN');
INSERT INTO Puska VALUES (44,44,'linearGradient, radialGradient');
INSERT INTO Puska VALUES (45,45,'tömbSzORTírozás()');
INSERT INTO Puska VALUES (46,46,'olyan formula, melyben nem fordul elő változó szabadon, mondat illetve zárt formula');
INSERT INTO Puska VALUES (47,47,'ítéletváltozó: 0-ad rendű predikátumváltozók');
INSERT INTO Puska VALUES (48,48,'Hilbert-axioma: (F → (G → F)), ((F → ↓)→ ↓)→ F');
INSERT INTO Puska VALUES (49,49,'Mod(F): azon struktúrák halmazát, melyek F-et  kielégítik');
INSERT INTO Puska VALUES (50,50,'0 paritású függvényjel = konstans');





INSERT INTO Sugo VALUES (1,1,'↑');
INSERT INTO Sugo VALUES (2,2,'↓');
INSERT INTO Sugo VALUES (3,3,'vagy B vagy C a helyes válasz');
INSERT INTO Sugo VALUES (4,4,'vagy A vagy B a helyes válasz');
INSERT INTO Sugo VALUES (5,5,'az első és utolsó válaszlehetőség között van a helyes válasz');
INSERT INTO Sugo VALUES (6,6,'vagy A vagy C a helyes válasz');
INSERT INTO Sugo VALUES (7,7,'az utolsó 2 válaszlehetőség közül az egyik a megfejtés');
INSERT INTO Sugo VALUES (8,8,'az első 2 válaszlehetőség közül az egyik a megfejtés');
INSERT INTO Sugo VALUES (9,9,'vagy A vagy C a helyes megfejtés');
INSERT INTO Sugo VALUES (10,10,'az első vagy az utolsó válaszlehetőség a jó');
INSERT INTO Sugo VALUES (11,11,'B avgy C a jó válasz');
INSERT INTO Sugo VALUES (12,12,'vagy az A vagy a D a megfejtés');
INSERT INTO Sugo VALUES (13,13,'B és D között gondolkozz');
INSERT INTO Sugo VALUES (14,14,'vagy az első vagy az utolsó a jó válasz');
INSERT INTO Sugo VALUES (15,15,'A vagy C');
INSERT INTO Sugo VALUES (16,16,'az utolsó 2 válaszlehetőség között vacilálj');
INSERT INTO Sugo VALUES (17,17,'B vagy C a jó válasz');
INSERT INTO Sugo VALUES (18,18,'B és C tuti nem jó válasz');
INSERT INTO Sugo VALUES (19,19,'az utolsó sor tele van rossz válaszlehetőségekkel');
INSERT INTO Sugo VALUES (20,20,'B és D tuti nem jó válasz');
INSERT INTO Sugo VALUES (21,21,'A és C rossz válaszok');
INSERT INTO Sugo VALUES (22,22,'az első sorban csak rossz válaszok vannak');
INSERT INTO Sugo VALUES (23,23,'vagy B vagy D lesz');
INSERT INTO Sugo VALUES (24,24,'B és D tuti rossz');
INSERT INTO Sugo VALUES (25,25,'C és D. Közülük az egyik');
INSERT INTO Sugo VALUES (26,26,'C és D = hamis');
INSERT INTO Sugo VALUES (27,27,'A és C nem jó');
INSERT INTO Sugo VALUES (28,28,'B és C között gondolkozz');
INSERT INTO Sugo VALUES (29,29,'vagy A vagy D a helyes megfejtés');
INSERT INTO Sugo VALUES (30,30,'B vagy D a jó');
INSERT INTO Sugo VALUES (31,31,'vagy az A vagy a C a jó válasz');
INSERT INTO Sugo VALUES (32,32,'A és B tuti nem jó válasz');
INSERT INTO Sugo VALUES (33,33,'vagy az első vagy az utolsó a megfelelő');
INSERT INTO Sugo VALUES (34,34,'vagy az első vagy a második a megfelelő');
INSERT INTO Sugo VALUES (35,35,'harmadik és negyedik tuti nem jó válasz');
INSERT INTO Sugo VALUES (36,36,'az utolsó 2 között gondolkozz tovább');
INSERT INTO Sugo VALUES (37,37,'a második és harmadik válaszlehetőséget választva tuti biztos, hogy kiesel');
INSERT INTO Sugo VALUES (38,38,'B és D. szerintem az egyik a jó válasz');
INSERT INTO Sugo VALUES (39,39,'a középső 2 válaszlehetőség nem jó');
INSERT INTO Sugo VALUES (40,40,'az első és utolsó válaszlehetőség jó válaszok, más kérdésekre');
INSERT INTO Sugo VALUES (41,41,'az utolsó sort zárd ki');
INSERT INTO Sugo VALUES (42,42,'A és D tuti rosszak');
INSERT INTO Sugo VALUES (43,43,'első vagy második');
INSERT INTO Sugo VALUES (44,44,'első 2 tuti rossz válasz');
INSERT INTO Sugo VALUES (45,45,'B és C közül válassz');
INSERT INTO Sugo VALUES (46,46,'második és harmadik válaszlehetőség között van a helyes megoldás');
INSERT INTO Sugo VALUES (47,47,'vagy az első vagy az utolsó lesz a jó');
INSERT INTO Sugo VALUES (48,48,'az első sort ki is zárhatod');
INSERT INTO Sugo VALUES (49,49,'a középső kettőt ne válaszd ha jót akarsz');
INSERT INTO Sugo VALUES (50,50,'az első és utolsó válaszlehetőség tuti jó válasz, más kérdésekre');