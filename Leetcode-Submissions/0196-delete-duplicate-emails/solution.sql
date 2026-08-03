# Write your MySQL query statement below
Delete from Person
where id not in (
    select min_Id from (
        select MIN(id) as min_id
        from Person
        group by email
    ) as temp
);
