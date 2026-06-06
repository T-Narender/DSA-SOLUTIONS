# Write your MySQL query statement below
select m.employee_id , m.name , count(r.employee_id ) as reports_count , ROUND(AVG(r.age)) as average_age
from Employees m
inner join Employees r
ON m.employee_id = r.reports_to
GROUP BY m.employee_id , m.name
ORDER BY m.employee_id
