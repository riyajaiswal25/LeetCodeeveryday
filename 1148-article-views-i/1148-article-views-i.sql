# Write your MySQL query statement below
select distinct viewer_id AS id
from Views
where author_id=viewer_id
order by id asc;