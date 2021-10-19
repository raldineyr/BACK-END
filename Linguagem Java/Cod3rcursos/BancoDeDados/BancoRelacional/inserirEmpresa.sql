ALTER TABLE empresas MODIFY cnpj VARCHAR(14);

INSERT INTO empresas
    (nome, cnpj)
VALUES
    ('Bradesco',70452503000183),
    ('Vale',56717924000168),
    ('Cielo',70029442000146);

desc empresas;
desc prefeitos;
select * from empresas;
select * from cidades;

INSERT INTO empresas_unidades
    (empresa_id, cidade_id, sede)
VALUES
(1, 1, 1), 
(1, 2, 0),
(2, 1, 0),
(2, 2, 1);
