-- 코드를 입력하세요
select distinct m.cart_id 
from 
    (select cart_id
    from cart_products
    where name = 'Milk') m 
inner join 
    (select cart_id
    from cart_products
    where name = 'Yogurt') y 
on m.cart_id = y.cart_id
order by 1 asc