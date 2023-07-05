-- 코드를 입력하세요
select temp.AUTHOR_ID,	a.AUTHOR_NAME,	temp.CATEGORY,	temp.TOTAL_SALES
from 
    (SELECT b.AUTHOR_ID, b.CATEGORY, sum(b.PRICE * s.SALES) TOTAL_SALES
    from BOOK_SALES s join BOOK b 
        on s.book_id = b.book_id
    where to_char(s.SALES_DATE,'yyyymm') = '202201'
    group by b.AUTHOR_ID, b.CATEGORY) temp 
    left outer join author a
on temp.author_id = a.author_id
order by AUTHOR_ID, CATEGORY desc;