# Write your MySQL query statement below
select Visits.customer_id, count(Visits.visit_id) AS count_no_trans
from Visits
left join Transactions
on Visits.visit_id=Transactions.visit_id
where transaction_id IS NULL
group by Visits.customer_id;