DROP TABLE IF EXISTS person;

CREATE TABLE person (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL
);

INSERT INTO person (name) VALUES  ('Billy'),  ('Joanne');