select e.nome as Empresas, c.nome as Cidades
from empresas e, empresas_unidades eu, cidades c
where e.id = eu.empresa_id
and c.id = eu.cidade_id
and sede
