CREATE TABLE drivers (
   id INT IDENTITY NOT NULL,
   first_name VARCHAR(50) NOT NULL,
   last_name VARCHAR(50) NOT NULL,
   team VARCHAR(150) NOT NULL,
   car_number INT NOT NULL,
   country VARCHAR(50),
   poles INT NULL,
   wins INT NULL,
   podiums INT NULL
);