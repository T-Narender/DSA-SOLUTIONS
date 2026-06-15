# Write your MySQL query statement below
select visited_on,
(
    select sum(amount)
    from Customer
    where visited_on BETWEEN DATE_SUB(c.visited_on,INTERVAL 6 day) AND c.visited_on
) as amount,

ROUND((
    select sum(amount)/7
    from Customer
    where visited_on BETWEEN DATE_SUB(c.visited_on,INTERVAL 6 day) AND c.visited_on
),2) AS average_amount

FROM Customer c
where visited_on>=(
    select DATE_ADD(MIN(visited_on), INTERVAL 6 DAY)
    FROM Customer
)

GROUP BY visited_on
ORDER BY visited_on

