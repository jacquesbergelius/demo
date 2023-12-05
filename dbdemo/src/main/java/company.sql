-- First create the database
DROP DATABASE IF EXISTS company;
CREATE DATABASE company;
USE company;

-- Then one simple table for demo
CREATE TABLE EMPLOYEE (
    id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    salary DECIMAL(10, 2) NOT NULL,
    PRIMARY KEY (id)
);

-- Put data onto it
INSERT INTO EMPLOYEE (first_name, last_name, email, salary) VALUES
    ('John', 'Doe', 'johndoe@somemail.com', 1000.00),
    ('Mary', 'Smith', 'msmith@goodmail.com', 2000.00),
    ('Peter', 'Jones', 'peterjones@greatmail.com', 3000.00);

Create a user for an application	access
CREATE USER appuser@localhost identified by 'sAL_a5ana';    -- user in the same machine were we run the db server
GRANT ALL PRIVILEGES ON company.* TO appuser@localhost;   	-- give rights to the user
FLUSH PRIVILEGES;                                           -- ensure that the rights are written to the system
