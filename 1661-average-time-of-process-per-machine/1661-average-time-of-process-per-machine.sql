# Write your MySQL query statement below
select t1.machine_id machine_id, round(avg(diff),3) as processing_time
from(
    select a.machine_id, a.process_id, abs(a.timestamp-b.timestamp) as diff
    from Activity a
    inner join Activity b
    on a.machine_id=b.machine_id
    and a.process_id=b.process_id
    and a.activity_type='start' and b.activity_type='end')t1
group by t1.machine_id