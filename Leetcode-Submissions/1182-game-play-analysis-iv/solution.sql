# Write your MySQL query statement below
select ROUND(COUNT(DISTINCT player_id) / (select COUNT(DISTINCT player_id) from Activity),2) as fraction
from Activity
WHERE (player_id, DATE_SUB(event_date , INTERVAL 1 DAY)) IN(
    select player_id,MIN(event_date) as first_login
    from Activity
    GROUP BY player_id
)
