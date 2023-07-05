-- 코드를 입력하세요
SELECT ANIMAL_TYPE, count(*) count
from ANIMAL_INS 
group by ANIMAL_TYPE
having ANIMAL_TYPE in ('Cat', 'Dog')
order by 1