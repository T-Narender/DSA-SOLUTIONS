# Write your MySQL query statement below
select employee_id , department_id
from Employee
WHERE primary_flag = 'Y'

union

select employee_id , department_id
from Employee
GROUP BY employee_id
HAVING COUNT(department_id) = 1
