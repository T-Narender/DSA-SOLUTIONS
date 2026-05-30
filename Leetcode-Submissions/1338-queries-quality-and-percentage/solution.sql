# Write your MySQL query statement below
select query_name , Round(AVG(rating/position),2) as quality ,
Round(AVG(if( rating < 3, 1,0))*100,2) as poor_query_percentage 
from Queries
WHERE query_name IS NOT NULL
Group by query_name
