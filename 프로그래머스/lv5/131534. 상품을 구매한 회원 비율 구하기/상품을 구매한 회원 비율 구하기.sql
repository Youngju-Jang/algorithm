-- 코드를 입력하세요
-- 2021년에 가입한 전체 회원들 중 
-- 상품을 구매한 회원수와 
-- 상품을 구매한 회원의 비율(=2021년에 가입한 회원 중 상품을 구매한 회원수 / 2021년에 가입한 전체 회원 수)을 
-- 년, 월 별로 출력


SELECT 
YEAR
,TO_NUMBER(MONTH) MONTH
,COUNT(USER_ID) PUCHASED_USERS
    , ROUND(COUNT(USER_ID) /  
            (SELECT COUNT(USER_ID)
            FROM USER_INFO 
            WHERE TO_CHAR(JOINED,'YYYY') = 2021)
        ,1) PUCHASED_RATIO
FROM
(
    SELECT 
    TO_CHAR(OS.SALES_DATE,'YYYY') YEAR
    ,TO_CHAR(OS.SALES_DATE,'MM') MONTH
        ,OS.USER_ID	
    FROM USER_INFO UI JOIN ONLINE_SALE OS
    ON TO_CHAR(UI.JOINED,'YYYY') = 2021
        AND UI.USER_ID = OS.USER_ID
    GROUP BY 
    TO_CHAR(OS.SALES_DATE,'YYYY')
    ,TO_CHAR(OS.SALES_DATE,'MM')
        ,OS.USER_ID
)
GROUP BY YEAR, MONTH
ORDER BY YEAR, MONTH
