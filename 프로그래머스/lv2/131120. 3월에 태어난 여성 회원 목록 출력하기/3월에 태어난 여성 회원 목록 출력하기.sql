-- 코드를 입력하세요
SELECT MEMBER_ID,	MEMBER_NAME,	GENDER,	to_char(DATE_OF_BIRTH, 'yyyy-mm-dd') DATE_OF_BIRTH
from MEMBER_PROFILE
where gender = 'W' and TLNO is not null and to_char(DATE_OF_BIRTH, 'mm')= 3  
order by member_id asc