-- 코드를 입력하세요
SELECT count(user_id) USERS
from USER_INFO 
where to_char(JOINED, 'yyyy') = '2021' 
and age between 20 and 29