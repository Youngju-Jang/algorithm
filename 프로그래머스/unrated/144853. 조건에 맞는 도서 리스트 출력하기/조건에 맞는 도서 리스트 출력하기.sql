-- 코드를 입력하세요
SELECT BOOK_ID,	to_char(PUBLISHED_DATE, 'yyyy-mm-dd') PUBLISHED_DATE
from book
where CATEGORY = '인문' and to_char(PUBLISHED_DATE,'yyyy') = 2021
order by PUBLISHED_DATE asc
;