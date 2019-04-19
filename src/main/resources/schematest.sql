create table Objeto
(
   id integer not null,
   texto varchar(255) not null,
   boleano bit not null,
   primary key(id)
);

create table ObjetosDoObjeto
(
   id integer not null,
   id_objeto_pai integer not null,
   id_objeto_filho integer not null,
   primary key(id)
);

CREATE SEQUENCE objetoid_sequence START WITH 6 INCREMENT BY 1;

INSERT INTO Objeto (id, texto, boleano) VALUES (1, 'Um', true);
INSERT INTO Objeto (id, texto, boleano) VALUES (2, 'Dois', true);
INSERT INTO Objeto (id, texto, boleano) VALUES (3, 'Tres', true);
INSERT INTO Objeto (id, texto, boleano) VALUES (4, 'Quatro', true);
INSERT INTO Objeto (id, texto, boleano) VALUES (5, 'Cinto', true);

INSERT INTO ObjetosDoObjeto (id, id_objeto_pai, id_objeto_filho) VALUES (1, 1, 2);
INSERT INTO ObjetosDoObjeto (id, id_objeto_pai, id_objeto_filho) VALUES (2, 1, 2);
INSERT INTO ObjetosDoObjeto (id, id_objeto_pai, id_objeto_filho) VALUES (3, 3, 2);
INSERT INTO ObjetosDoObjeto (id, id_objeto_pai, id_objeto_filho) VALUES (4, 3, 2);