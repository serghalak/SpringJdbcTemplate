DROP TABLE IF EXISTS PERSONS;
CREATE TABLE PERSONS(ID BIGINT PRIMARY KEY, NAME VARCHAR(255));
DROP TABLE IF EXISTS PERSONS1;
CREATE TABLE PERSONS1(ID BIGSERIAL PRIMARY KEY, NAME VARCHAR(255));