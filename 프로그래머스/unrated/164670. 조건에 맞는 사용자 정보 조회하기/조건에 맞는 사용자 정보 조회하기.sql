-- 코드를 입력하세요
SELECT 
UGU.USER_ID	
,UGU.NICKNAME	
,UGU.CITY||' '||UGU.STREET_ADDRESS1||' '||UGU.STREET_ADDRESS2 전체주소	
    ,REGEXP_REPLACE(UGU.TLNO, '(\d{3})(\d{4})(\d{4})', '\1-\2-\3') 전화번호
FROM USED_GOODS_USER UGU JOIN 
(
    SELECT WRITER_ID,COUNT(WRITER_ID) CNT
    FROM USED_GOODS_BOARD
    GROUP BY WRITER_ID
) UGB
ON UGB.CNT >= 3
AND UGU.USER_ID = UGB.WRITER_ID
ORDER BY USER_ID DESC