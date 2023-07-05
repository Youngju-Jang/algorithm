-- 코드를 입력하세요
select CATEGORY, price	MAX_PRICE,	PRODUCT_NAME
from (SELECT CATEGORY,	
    RANK() OVER 
				(PARTITION BY CATEGORY
				ORDER BY PRICE desc) AS rnk,	PRODUCT_NAME, price
from FOOD_PRODUCT 
where CATEGORY in ( '과자', '국', '김치', '식용유'))
where rnk = 1
order by MAX_PRICE desc