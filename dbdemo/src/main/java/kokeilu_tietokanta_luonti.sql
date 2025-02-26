--
-- Luo kokeilutietokanta Python kurssin esimerkkiä mukaillen
--
-- MariaDB-palvelimella täytyy olla käyttäjä dbuser. Sen voit luoda vaikka näin (kun tietokanta ihmiset on luotu):
--	create user dbuser@localhost identified by 'sAL_a5ana';
--	grant all privileges on ihmiset.* TO dbuser@localhost;
--	flush privileges;

--
-- Written by Jarkko Vuori 2022
--

DROP DATABASE IF EXISTS ihmiset;
CREATE DATABASE ihmiset;
USE ihmiset;

CREATE TABLE tyontekija(
	ID INTEGER NOT NULL auto_increment,
	sukunimi VARCHAR(40),
	etunimi VARCHAR(40),
	lahiosoite VARCHAR(40),
	postino VARCHAR(40),
	puhelin VARCHAR(40),
	palkka INTEGER,
	pomo INTEGER REFERENCES tyontekija(ID),
	PRIMARY KEY (id)
);

-- Huomaa että viitattaessa pomoon (sen ID), kyseinen rivi täytyy olla jo olemassa (= pomo pitää olla luotu ennen työntekijää)
INSERT INTO tyontekija(sukunimi, etunimi, lahiosoite, postino, puhelin, palkka, pomo)
VALUES("Mynttinen", "Pekko", "Puistoraitti 1", "00520", "040-584512", 2133, NULL),
("Virtanen", "Liisi", "Ruusuraitti 18", "00960", "050-296767", 4461, 1),
("Rojola", "Mimmi", "Lehmustie 10", "01150", "050-085274", 5008, 1),
("Mikkonen", "Veikko", "Käpypuisto 19", "00690", "040-556145", 2323, 2),
("Ahola", "Oiva", "Mäntypolku 2", "01020", "050-160969", 3736, 1),
("Joeli", "Henrik", "Jalavapolku 5", "02670", "040-067335", 4259, 3),
("Palmu", "Taina", "Kukkaraitti 3", "02630", "042-006705", 2188, 6),
("Mäki-Tuuri", "Armas", "Puistokuja 22", "01070", "050149281", 2368, 7),
("Koivistoinen", "Ulpu", "Puistokatu 9", "00380", "042-637850", 2618, 1),
("Huovila", "Reima", "Katajatie 16", "01550", "041-918868", 5246, 1);


