select * from estados where id = 255

INSERT INTO cidades (nome, area, estado_id)
VALUES ('Campinas', 795, 255)

Select * from cidades

INSERT INTO cidades (nome, area, estado_id)
VALUES ('Niteroi', 133.9, 250)

INSERT INTO cidades (nome, area, estado_id)
VALUES (
    'Caruaru',
     920.6,
    (select id from estados where sigla = 'PE')  
)

INSERT INTO cidades (nome, area, estado_id)
VALUES(
    'Salvador',
     2.90,
     (select id from estados where sigla = 'BA')
)

INSERT INTO cidades (nome, area, estado_id)
VALUES(
    'Simões Filho',
    0.13,
    (select id from estados where sigla = 'BA')
)

INSERT INTO cidades (nome, area, estado_id)
VALUES(
    'Fortaleza',
     2.00,
    (select id from estados where sigla = 'CE')
)


