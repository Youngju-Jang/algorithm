-- 코드를 입력하세요
-- SELECT distinct a.car_id
-- from
( 
    select CAR_ID
    from CAR_RENTAL_COMPANY_CAR
    where CAR_TYPE = '세단'
) 
-- a inner join
intersect
(
    select CAR_ID
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY
    where to_char(START_DATE,'mm') = 10 
    -- or to_char(end_date, 'mm') = 10
) 
-- b
-- on a.car_id = b.car_id
order by 1 desc
