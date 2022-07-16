# Write your MySQL query statement below
# create table output{
# id int not null auto_increment, 
# bonus int,
# employee_id int,
# foreign key(employee_id) refernces Employees(employee_id),
# primary key(id)
# }

select employee_id ,
if (
  name not like 'm%'
    and
    employee_id%2=1,
    salary,0
)as bonus
from Employees order by employee_id

