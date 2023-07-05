-- 코드를 입력하세요
SELECT MCDP_CD as "진료과코드" , sum(1) as "5월예약건수"
from APPOINTMENT 
where to_char(APNT_YMD,'yyyymm') = '202205'
group by MCDP_CD
order by 2 asc, 1 asc