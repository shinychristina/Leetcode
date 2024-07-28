# Write your MySQL query statement below
SELECT A1.machine_id,ROUND(AVG(A2.timestamp-A1.timestamp),3) AS processing_time 
FROM ACTIVITY A1
JOIN  ACTIVITY A2
ON A1.machine_id=A2.machine_id 
AND A1.activity_type='start' AND A2.activity_type='end'
GROUP BY A1.machine_id