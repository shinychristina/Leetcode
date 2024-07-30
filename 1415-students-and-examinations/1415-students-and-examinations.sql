select * ,(select count(*) from Examinations e 
where e.student_id =s.student_id  and e.subject_name=  s.subject_name )AS attended_exams
 from (select * from students cross join subjects)  as s
order by   student_id,subject_name 