--
-- Useful SQL-commands for the Python/java course (Python Lecture 8 and Java Submodule 7.1)
--
-- Written by Jarkko Vuori 2022-2025
--

-- Batch processing
SOURCE filename;                    -- reads commands from the file

-- Database manipulation (creating a database and using it)
DROP DATABASE IF EXISTS people;
CREATE DATABASE people;
USE people;
SHOW DATABASES;                     -- show databases you have on your system

-- Creating a user for the database (for accessing the database e.g. from the program)
create user dbuser@localhost identified by 'sAL_a5ana';     -- user in the same machine were we run the db server
select User from mysql.user;                                -- shows current users
grant all privileges on people.* TO dbuser@localhost;   	-- give rights to the user
show grants for dbuser@localhost;                           -- show the rights of the given user
flush privileges;                                           -- ensure that the rights are written to the system

-- Manipulating tables (in a database)
show tables from x;                 -- show tables in one database x
show create table x;                -- show SQL commands used to create a given table x
describe x;                         -- show the structure of the given table x

-- Delete row(s)
delete from employee where id=5;	-- deletes a selected row

-- retrieving data
-- SELECT - which columns are needed
-- FROM   - from which tables data is gathered
-- WHERE  - conditionals for filtering the data
select * from x limit 1;                                    -- limit n limits the number of rows to n to be shown
select * from ankkalinnalainen where sukunimi = "Ankka";    -- where filters the output
select * from ankkalinnalainen where sukunimi like "%i%";   -- '%' means whatever character(s)
select * from ankkalinnalainen order by sukunimi desc;      -- order by sorts the output (desc/asc)
select id as identifier from ankkalinnalainen;              -- as changes the name of the result column
SELECT COUNT(abbreviation) FROM current;					-- it is possible to add functions to queries
SELECT MAX(rate) FROM current;

-- For SQL joins, look these:
-- https://ugoproto.github.io/ugodoc/introduction_to_sql_joins/
-- https://www.datacamp.com/tutorial/introduction-to-sql-joins
-- For SQL inner queries (or sub queries), look these:
-- https://www.tutorialspoint.com/sql/sql-sub-queries.htm
