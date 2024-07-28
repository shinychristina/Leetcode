# Write your MySQL query statement below
select  Visits.customer_id, count(Visits.visit_id) as count_no_trans from Visits 
left join Transactions on Visits.visit_id=Transactions.visit_id
wHERE Transactions.transaction_id IS NULL 
group by Visits.customer_id