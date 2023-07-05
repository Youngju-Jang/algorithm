-- 코드를 입력하세요
SELECT YEAR,to_number(MONTH),GENDER, count(distinct user_id) users
from (
    SELECT 
        to_char(s.sales_date,'yyyy') AS YEAR,
        to_char(s.sales_date,'MM') AS MONTH,	
        u.GENDER, 
        u.user_id user_id
    from ONLINE_SALE s left outer join USER_INFO  u
    on s.USER_ID = u.USER_ID
    where u.GENDER is not null
    )
group by YEAR, MONTH, GENDER
order by 1, 2, 3

-- SELECT YEAR, TO_NUMBER(MONTH) AS MONTH ,GENDER, COUNT(DISTINCT USER_ID) AS USERS 
-- FROM
-- (SELECT 
--  TO_CHAR(SALES_DATE,'YYYY')AS YEAR,
--  TO_CHAR(SALES_DATE,'fmMM') AS MONTH, 
--  GENDER, USER_INFO.USER_ID 
--  FROM USER_INFO,ONLINE_SALE
-- WHERE USER_INFO.USER_ID = ONLINE_SALE.USER_ID AND GENDER IS NOT NULL)
-- GROUP BY YEAR, MONTH, GENDER
-- ORDER BY YEAR ,MONTH,GENDER