-- 코드를 입력하
SELECT distinct count(distinct NAME) count
from ANIMAL_INS
where name is not null