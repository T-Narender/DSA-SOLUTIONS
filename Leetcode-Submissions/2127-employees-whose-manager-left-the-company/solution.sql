# Write your MySQL query statement below
select e1.employee_id
from Employees e1
where e1.salary < 30000
 AND e1.manager_id IS NOT NULL
 AND  NOT Exists (
    select 1
    from Employees e2
    where e2.employee_id = e1.manager_id
)
ORDER BY e1.employee_id ASC;
