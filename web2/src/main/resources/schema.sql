DROP TABLE IF EXISTS Examen;
CREATE TABLE Examen (
 
    id int PRIMARY KEY,
    asignatura VARCHAR(255) NOT NULL,
   	texto VARCHAR(255) NOT NULL,
    nota number NOT NULL
	
);