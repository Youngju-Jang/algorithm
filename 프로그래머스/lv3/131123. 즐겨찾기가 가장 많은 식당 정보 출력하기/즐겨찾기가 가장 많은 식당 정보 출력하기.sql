-- 코드를 입력하세요
select i.FOOD_TYPE,	i.REST_ID,	i.REST_NAME,	i.FAVORITES
from (SELECT REST_ID, 
            rank() over (partition by FOOD_TYPE order by FAVORITES desc) AS rnk
from REST_INFO) t left outer join REST_INFO i
on t.rest_id = i.rest_id
where t.rnk = 1
order by FOOD_TYPE desc