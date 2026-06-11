# Write your MySQL query statement below
select q1.person_name
from Queue q1 inner join Queue q2
on q1.turn>=q2.turn
GROUP BY q1.turn
HAVING SUM(q2.weight) <=1000
ORDER BY SUM(q2.weight) DESC
LIMIT 1
