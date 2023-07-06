-- 코드를 입력하세요
select p.MEMBER_NAME,	r.REVIEW_TEXT,	to_char(r.REVIEW_DATE,'yyyy-mm-dd') REVIEW_DATE
from REST_REVIEW r left outer join MEMBER_PROFILE p 
on p.MEMBER_ID = r.MEMBER_ID
where r.MEMBER_ID = (
    select MEMBER_ID
    from (
        SELECT MEMBER_ID, count(member_id)
        from REST_REVIEW
        group by MEMBER_ID
        order by 2 desc
    )
    where rownum = 1
)
order by 3 asc, 2 