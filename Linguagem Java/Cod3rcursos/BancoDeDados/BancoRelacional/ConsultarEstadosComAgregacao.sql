select 
    regiao as 'Região',
    sum(populacao) as Total
from estados
group by regiao 
order by Total desc

-- sum é a soma
select sum(populacao) as Total
from estados

-- avg é a média
select avg(populacao) as Total
from estados
