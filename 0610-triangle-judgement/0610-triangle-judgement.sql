# Write your MySQL query statement below
select x, y, z, case when (x+y>z && y+z>x && x+z>y) then 'Yes' else 'No' end as triangle
from Triangle;