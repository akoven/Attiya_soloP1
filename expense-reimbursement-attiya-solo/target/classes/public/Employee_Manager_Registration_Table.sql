create table employee_login(employee_id serial primary key,firstname_emp varchar(20),lastname_emp varchar(30),address_emp varchar(50),city_emp varchar(20),state_emp varchar(2),zip_emp int, username_emp varchar(20), password_emp varchar(30));
create table manager_login(manager_id serial primary key, firstname_mgr varchar (20), lastname_mgr varchar(30), address_emp varchar(50),city_emp varchar(20),state_emp varchar(2),zip_emp int, username_mgr varchar(20), password_mgr varchar(30));

select *from employee_login;
select *from manager_login;