-- 코드를 입력하세요
SELECT TO_NUMBER(to_char(DATETIME, 'HH24')) HOUR, count(*) count
from ANIMAL_OUTS
group by to_char(DATETIME, 'HH24')
having to_char(DATETIME, 'HH24') between '09' and '19'
order by 1