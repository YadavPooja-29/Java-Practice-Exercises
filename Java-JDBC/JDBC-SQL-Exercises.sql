//Exercise 8: Write a query to find those customers with their name and those salesmen with their name and city who lives in the same city.
SELECT customer.cust_name,
salesman.name, salesman.city
FROM salesman, customer
WHERE salesman.city = customer.city;

//Exercise 9:  Write a SQL statement to find the names of all customers along with the salesmen who works for them
SELECT * FROM customer a, orders b 
WHERE a.customer_id=b.customer_id 
AND b.ord_date='2012-10-05';

//Exercise 10: Write a SQL statement that finds out each order number followed by the name of the customers who made the order.
SELECT orders.ord_no, customer.cust_name
FROM orders, customer
WHERE orders.customer_id = customer.customer_id; 

//Exercise 11 : Write a SQL statement that sorts out the customer and their grade who made an order. Each of the customers must have a grade and served by at least a salesman, who belongs to a city.
SELECT customer.cust_name AS "Customer",
customer.grade AS "Grade",orders.ord_no AS "Order No."
FROM orders, salesman, customer
WHERE orders.customer_id = customer.customer_id
AND orders.salesman_id = salesman.salesman_id
AND salesman.city IS NOT NULL
AND customer.grade IS NOT NULL;

//Exercise 12 : Write a query that produces all customers with their name, city, salesman and commission, who served by a salesman and the salesman works at a rate of the commission within 12% to 14%
SELECT customer.cust_name AS "Customer",
customer.city AS "City",
salesman.name AS "Salesman",
salesman.commission
FROM customer,salesman
WHERE customer.salesman_id = salesman.salesman_id
AND salesman.commission
BETWEEN .12 AND .14;

//Exercise 13 : Write a query to list the department ID and name of all the departments where no employee is working.
SELECT * FROM departments 
WHERE department_id 
NOT IN (select department_id FROM employees);

//Exercise 14 : Write a query to get 3 maximum salaries from Employees table.
SELECT first_name, last_name, salary FROM employees 
WHERE salary > (SELECT AVG(salary) FROM employees);

//Exercise 15 : Write a query to get 3 minimum salaries from Employees table.
SELECT first_name, last_name, salary FROM employees 
WHERE employees.salary = (SELECT min_salary FROM jobs
WHERE employees.job_id = jobs.job_id);

//Exercise 16 : Write a query to find the 4th minimum salary in the employees table
SELECT DISTINCT salary  FROM employees e1 
WHERE 4 = (SELECT COUNT(DISTINCT salary) 
FROM employees  e2 
WHERE e2.salary <= e1.salary);

//Exercise 17 : Write a query to display the employee ID, first name, last name, salary of all employees whose salary is above average for their departments.
SELECT employee_id, first_name 
FROM employees AS A 
WHERE salary >  (SELECT AVG(salary) FROM employees 
WHERE department_id = A.department_id);

//Exercise 18 : Write a query to list the number of jobs available in the employees table.
SELECT COUNT(DISTINCT job_id) 
FROM employees;

//Exercise 19 : Write a query to get the minimum salary from employees table..
SELECT MIN(salary) 
FROM employees;

//Exercise 20 : Write a query to get the total salaries payable to employees .
SELECT SUM(salary) 
FROM employees;