-- 코드를 입력하세요
SELECT HISTORY_ID,	CAR_ID,	to_char(START_DATE,'yyyy-mm-dd') START_DATE,	to_char(END_DATE,'yyyy-mm-dd') END_DATE,	
-- (end_date - start_date),
case when (end_date - start_date) + 1>= 30
    then '장기 대여'
    else '단기 대여'
end RENT_TYPE
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where to_char(START_DATE,'mm') = 9
order by 1 desc