# Write your MySQL query statement below
select DISTINCT num as ConsecutiveNums 
from (
    select
    num,
    lead(num,1) over (order by id) as prev,
    lead(num,2) over (order by id) as next
    from logs
)as subquery
where num = prev and num = next

