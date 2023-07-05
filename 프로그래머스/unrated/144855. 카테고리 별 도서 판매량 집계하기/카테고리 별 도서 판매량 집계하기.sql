-- 코드를 입력하세요
SELECT b.CATEGORY, sum(bs.SALES)
from BOOK_SALES bs join BOOK b
on bs.book_id = b.book_id
where to_char(bs.SALES_DATE,'yyyymm') = '202201'
group by CATEGORY
order by category asc