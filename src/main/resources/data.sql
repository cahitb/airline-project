CREATE TABLE companies (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  company_name VARCHAR(250) NOT NULL
);

CREATE TABLE airlines (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  airline_name VARCHAR(250) NOT NULL
);

CREATE TABLE routes (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  from_airline_id INT,
  to_airline_id INT
);

CREATE TABLE flights (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  company_id INT,
  route_id INT,
  price INT,
  capacity INT,
  sold INT
);