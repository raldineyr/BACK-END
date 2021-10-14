select * from estados

select nome, sigla from estados

select sigla, nome as 'Nome do Estado' from estados
where regiao = 'Nordeste'

select nome, regiao from estados
where populacao >= 10
order by populacao desc
