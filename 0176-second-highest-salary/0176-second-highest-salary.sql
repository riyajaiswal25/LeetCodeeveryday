# Write your MySQL query statement below
select max(salary) AS SecondHighestSalary
from Employee
where salary NOT IN (select max(salary) from Employee);