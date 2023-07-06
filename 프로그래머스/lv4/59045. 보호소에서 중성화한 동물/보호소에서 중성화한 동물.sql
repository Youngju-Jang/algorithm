-- 코드를 입력하세요
SELECT ori.ANIMAL_ID, ori.ANIMAL_TYPE, ori.NAME
from 
( 
    select ANIMAL_ID
    from ANIMAL_INS
    where SEX_UPON_INTAKE like 'Intact%'
) i
 inner join 
(
    select ANIMAL_ID
    from ANIMAL_OUTS
    where SEX_UPON_OUTCOME not like 'Intact%'
) o
on i.ANIMAL_ID = o.ANIMAL_ID
inner join
ANIMAL_OUTS ori
on i.animal_id = ori.animal_id
order by 1