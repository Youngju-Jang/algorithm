-- 코드를 입력하세요
select u.USER_ID,	u.NICKNAME,	temp.TOTAL_SALES
from 
    (SELECT WRITER_ID, sum(PRICE) TOTAL_SALES
    from USED_GOODS_BOARD
    where STATUS = 'DONE'
    group by WRITER_ID
    having sum(PRICE) >= 700000) temp 
    left outer join USED_GOODS_USER u
on temp.WRITER_ID = u.USER_ID
order by TOTAL_SALES asc