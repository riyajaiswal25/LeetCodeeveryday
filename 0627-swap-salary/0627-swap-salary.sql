# Write your MySQL query statement below
update Salary
set sex=
(case
   when sex='m' Then 'f'
       else 'm'
end);