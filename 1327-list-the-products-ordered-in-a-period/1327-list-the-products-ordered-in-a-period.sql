# Write your MySQL query statement below
With CTE AS
(Select product_id, SUM(unit) AS unit_feb
From Orders
where YEAR(order_date) = 2020
and MONTH(order_date) = 2
group by product_id)

select p.product_name, c.unit_feb as unit
from CTE c
left join Products p
on c.product_id=p.product_id
where c.unit_feb>=100;