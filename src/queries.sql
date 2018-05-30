Create table Reiziger(
	reizigerID integer,
	voorletters varchar(10),
	tussenvoegsel varchar(10),
	achternaam varchar(10),
	gebortedatum date
);

Create table ov_chipkaart(
	kaartnummer integer,
	geldigtot date,
	klasse integer,
	saldo integer,
	reizigerid integer
);

insert into REIZIGER (reizigerid, voorletters, tussenvoegsel, achternaam, gebortedatum) values (1, 'j', 'Zone', 'Johnna', '04.05.1992');


	insert into ov_chipkaart (kaartnummer, geldigtot, klasse, saldo, reizigerid) values (1, '10.05.2024', 2, 5, 1), (2, '10.05.2028', 1, 10, 1);