# Write your MySQL query statement below
select e.name AS Employee
from Employee e join Employee emp On e.managerId=emp.id
where e.salary>emp.salary;