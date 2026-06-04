# Write your MySQL query statement below
select MAX(num) AS num
from (
    select num
    from MyNumbers
    group by num
    having COUNT(num) = 1
) as unique_num
