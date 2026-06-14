(select name as results
from Users
inner join MovieRating USING (user_id)
group by user_id
order by count(rating) desc, name
limit 1)

union all

(select title as results
from Movies
inner join MovieRating USING (movie_id)
where MONTH(created_at) = '02' and YEAR(created_at) = '2020'
group by title
order by avg(rating) desc , title
limit 1)
