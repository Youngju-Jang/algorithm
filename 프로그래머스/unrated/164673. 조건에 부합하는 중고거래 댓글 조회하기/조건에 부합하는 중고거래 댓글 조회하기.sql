-- 코드를 입력하세요
SELECT b.TITLE,	b.BOARD_ID,	r.REPLY_ID,	r.WRITER_ID, r.CONTENTS, to_char(r.CREATED_DATE, 'yyyy-mm-dd') "CREATED_DATE"
From USED_GOODS_BOARD b, USED_GOODS_REPLY r
where to_char(b.CREATED_DATE,'yyyy-mm') = '2022-10'
and b.BOARD_ID = r.BOARD_ID
order by r.created_date asc, b.title asc;