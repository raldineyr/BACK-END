update estados
set nome = 'Paraná'
where sigla = 'PR'

select estados.nome from estados where sigla = 'PR'

update estados
set nome = 'Parana', populacao = 11.32
where sigla = 'PR'

select est.nome, sigla, populacao
from estados est 
where sigla = 'PR'
