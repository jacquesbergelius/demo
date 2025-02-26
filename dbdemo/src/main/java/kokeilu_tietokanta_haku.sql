--
-- Tee haku jossa haetaan työntekijää jonka palkka on suurempi kuin pomon palkka
--

--
-- Written by Jarkko Vuori 2022-2025
--

USE ihmiset;
SELECT e.etunimi, e.sukunimi, e.palkka, m.etunimi, m.sukunimi, m.palkka
FROM tyontekija e, tyontekija m
WHERE e.pomo = m.ID AND e.palkka > m.palkka;

