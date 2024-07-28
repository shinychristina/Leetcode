# Write your MySQL query statement below
select  W1.id
from Weather W1 
join Weather W2 
on W1.recordDate= DATE_ADD(W2.recordDate, INTERVAL 1 DAY) 
WHERE W1.TEMPERATURE>W2.TEMPERATURE