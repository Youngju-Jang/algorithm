-- 코드를 입력하세요
-- SELECT START_DATE,END_DATE, 
-- START_DATE-to_date('2022-10-16', 'yyyy-mm-dd'),
-- END_DATE-to_date('2022-10-16', 'yyyy-mm-dd')
-- from CAR_RENTAL_COMPANY_RENTAL_HISTORY
-- where START_DATE-to_date('2022-10-16', 'yyyy-mm-dd') <=0
-- and END_DATE-to_date('2022-10-16', 'yyyy-mm-dd')>=0

select CAR_ID, max(AVAILABILITY)
from 
    (select CAR_ID,
    case 
        when
            (START_DATE-to_date('2022-10-16', 'yyyy-mm-dd') <=0
            and END_DATE-to_date('2022-10-16', 'yyyy-mm-dd')>=0) 
        then '대여중'
    else '대여 가능' end as AVAILABILITY
    from (select * from CAR_RENTAL_COMPANY_RENTAL_HISTORY ))
group by car_id
order by CAR_ID desc

