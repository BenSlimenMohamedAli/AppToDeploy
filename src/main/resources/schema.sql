DROP TABLE IF EXISTS weatherstations;

CREATE TABLE weatherstations (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  wslocation VARCHAR(250) NOT NULL,
  temperature FLOAT DEFAULT NULL,
  airpressure FLOAT DEFAULT NULL,
  windspeed FLOAT DEFAULT NULL
);