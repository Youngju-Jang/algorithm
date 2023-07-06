-- 코드를 입력하세요
select FLAVOR from(
SELECT f.FLAVOR, (f.TOTAL_ORDER+ j.TOTAL_ORDER) TOTAL_ORDER
from FIRST_HALF f
full outer join
(
    select FLAVOR,	sum(TOTAL_ORDER) TOTAL_ORDER
    from JULY
    group by FLAVOR
) j
on f.FLAVOR = j.FLAVOR
order by 2 desc
)where rownum <=3