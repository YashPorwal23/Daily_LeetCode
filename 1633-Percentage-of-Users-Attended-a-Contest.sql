# Write your MySQL query statement below
select contest_id,Round(Count(*)*100/(Select Count(*) from Users),2) As percentage
from Register r 
Group by contest_id
Order by percentage desc, contest_id;