# Write your MySQL query statement below
select Eu.unique_id , E.name
from Employees as E
left outer join EmployeeUNI as Eu
on E.id = Eu.id

