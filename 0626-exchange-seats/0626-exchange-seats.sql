# Write your MySQL query statement below
with cte as 
(select *, LEAD(id) OVER(order by id) AS next, LAG(id) OVER(order by id) AS prev from Seat)

select case when ((id%2=1) and next is not null)
then next
when (id%2=0) then prev
else id end as id, student
from cte
order by id