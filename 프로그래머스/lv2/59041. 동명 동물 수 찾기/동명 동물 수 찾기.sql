-- 코드를 입력하세요
SELECT NAME, count(*) count
from ANIMAL_INS
where name is not null 
group by NAME

having count(*) >= 2 
order by name