/* DELETE 'pscPolideportivo' database*/
DROP SCHEMA IF EXISTS pscPolideportivo;
/* DELETE USER 'spq' AT LOCAL SERVER*/
DROP USER IF EXISTS 'spq'@'localhost';

/* CREATE 'pscPolideportivo' DATABASE */
CREATE SCHEMA pscPolideportivo;
/* CREATE THE USER 'spq' AT LOCAL SERVER WITH PASSWORD 'spq' */
CREATE USER IF NOT EXISTS 'spq'@'localhost' IDENTIFIED BY 'spq';

GRANT ALL ON pscPolideportivo.* TO 'spq'@'localhost';