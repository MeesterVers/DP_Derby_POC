Create table Reiziger(
	reizigerid integer NOT NULL,
	voorletters varchar(10),
	tussenvoegsel varchar(10),
	achternaam varchar(10),
	gebortedatum date,
	PRIMARY KEY (reizigerID)
);

Create table ov_chipkaart(
	kaartnummer integer NOT NULL,
	geldigtot date,
	klasse integer,
	saldo integer,
	reizigerid integer,
	PRIMARY KEY (kaartnummer),
	FOREIGN KEY (reizigerid) REFERENCES Reiziger(reizigerid)
);

INSERT INTO REIZIGER (reizigerid, voorletters, tussenvoegsel, achternaam, gebortedatum) VALUES (1, 'j', 'Zone', 'Johnna', '04.05.1992');
INSERT INTO ov_chipkaart (geldigtot, klasse, saldo, reizigerid) VALUES (1, '10.05.2024', 2, 5, 1), (2, '10.05.2028', 1, 10, 1);


----------------------------------------
-- join query
SELECT * FROM REIZIGER
INNER JOIN OV_CHIPKAART
ON REIZIGER.REIZIGERID = OV_CHIPKAART.REIZIGERID;