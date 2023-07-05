-- 코드를 입력하세요
select
    EXTRACT(MONTH FROM B.START_DATE) AS MONTH,
    A.CAR_ID, 	
    count(A.CAR_ID) RECORDS
from (
    SELECT distinct car_id
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY
    -- where  to_char(START_DATE, 'yyyymm') BETWEEN '202208' and '202210'
    where START_DATE BETWEEN TO_DATE('2022-08-01','YYYY-MM-DD') AND TO_DATE('2022-10-31','YYYY-MM-DD')
    group by car_id
    having count(*) >= 5
    ) A 
left outer join CAR_RENTAL_COMPANY_RENTAL_HISTORY B
on A.car_id = B.car_id
where B.START_DATE BETWEEN TO_DATE('2022-08-01','YYYY-MM-DD') AND TO_DATE('2022-10-31','YYYY-MM-DD')
group by EXTRACT(MONTH FROM B.START_DATE), A.CAR_ID
having count(A.CAR_ID) >= 1
order by 1 asc, 2 desc;
