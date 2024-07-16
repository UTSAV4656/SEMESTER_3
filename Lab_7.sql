USE CSE_B1_302

CREATE TABLE EMP
(
	EID INT,
	ENAME VARCHAR(25),
	Dpartment VARCHAR(10),
	Salary INT,
	JoiningDate DATETIME,
	City VARCHAR(15)
)

INSERT INTO EMP(EID,ENAME,Dpartment,Salary,JoiningDate,City)
VALUES
(101,'Rahul','Admin',56000,'1-Jan-90','Rajkot'),
(102,'Hardik','IT',18000,'25-Sep-90','Ahmedabad'),
(103,'Bhavin','HR',25000,'14-May-91','Baroda'),
(104,'Bhoomi','Admin',39000,'8-Feb-91','Rajkot'),
(105,'Rohit','IT',17000,'23-Jul-90','Jamnagar'),
(106,'Priya','IT',9000,'18-Oct-90','Ahmedabad'),
(107,'Bhoomi','HR',34000,'25-Dec-91','Rajkot')

SELECT * FROM EMP

--1. Display the Highest, Lowest, Label the columns Maximum, Minimum respectively.
SELECT MAX(Salary) AS MAXIMUM,
MIN(Salary) AS MINIMUM FROM EMP

--2. Display Total, and Average salary of all employees. Label the columns Total_Sal and Average_Sal,
--respectively.
SELECT SUM(Salary) AS TOTAL_SAL,
AVG(Salary) AS AVERAGE_SAL FROM EMP

--3. Find total number of employees of EMPLOYEE table.
SELECT COUNT(*) FROM EMP

--4. Find highest salary from Rajkot city.
SELECT MAX(Salary) AS MAXIMUM FROM EMP
WHERE City = 'RAJKOT'

--5. Give maximum salary from IT department.
SELECT MAX(Salary) AS MAX_IT FROM EMP
WHERE Dpartment = 'IT'

--6. Count employee whose joining date is after 8-feb-91.
SELECT COUNT(EID) AS COUNT FROM EMP
WHERE JoiningDate>'1991-02-08'

--7. Display average salary of Admin department.
SELECT AVG(Salary) AS AVG_ADMIN FROM EMP
WHERE Dpartment = 'ADMIN'

--8. Display total salary of HR department.
SELECT SUM(Salary) AS TOTAL_HR FROM EMP
WHERE Dpartment = 'HR'

--9. Count total number of cities of employee without duplication.
SELECT COUNT(DISTINCT City) AS COUNT_CITY FROM EMP

--10. Count unique departments.
SELECT COUNT(DISTINCT Dpartment) AS COUNT_DEPARTMENT FROM EMP

--11. Give minimum salary of employee who belongs to Ahmedabad.
SELECT MIN(Salary) AS MIN_SAL FROM EMP
WHERE CITY='Ahmedabad'

--12. Find city wise highest salary.
SELECT City,MAX(Salary) AS MAX_SAL FROM EMP
GROUP BY City 

--13. Find department wise lowest salary.
SELECT Dpartment,MIN(Salary) AS MIN_SAL FROM EMP
GROUP BY Dpartment 

--14. Display city with the total number of employees belonging to each city.
SELECT City,COUNT(EID) AS COUNT_EMPLOYEE FROM EMP
GROUP BY City 

--15. Give total salary of each department of EMP table.
SELECT Dpartment,SUM(Salary) AS TOTAL_SAL FROM EMP
GROUP BY Dpartment 

--16. Give average salary of each department of EMP table without displaying the respective department
--name.
SELECT AVG(Salary) AS AVG_SAL FROM EMP
GROUP BY Dpartment

----------------------PART-B------------------

-- 1. Count the number of employees living in Rajkot.
SELECT COUNT(EID) AS COUNT_RAJKOT FROM EMP 
WHERE City='RAJKOT';

-- 2. Display the difference between the highest and lowest salaries. Label the column DIFFERENCE.
SELECT (MAX(Salary)-MIN(Salary)) AS DIFFERENCE FROM EMP;

-- 3. Display the total number of employees hired before 1st January, 1991.
SELECT COUNT(EID) AS COUNT_EMPLOYEE FROM EMP 
WHERE JoiningDate >'1991-01-01';

----------------------PART-C------------------

-- 1. Count the number of employees living in Rajkot or Baroda.
SELECT COUNT(EID) AS COUNT_EMPLOYEE FROM EMP 
WHERE City IN ('RAJKOT','BARODA');

-- 2. Display the total number of employees hired before 1st January, 1991 in IT department.
SELECT COUNT(EID) AS COUNT_EMPLOYEE FROM EMP 
WHERE JoiningDate > '1991-01-01' AND Dpartment='IT';

-- 3. Find the Joining Date wise Total Salaries.
SELECT JoiningDate,SUM(SALARY) AS TOTAL_SAL FROM EMP 
GROUP BY JoiningDate;

-- 4. Find the Maximum salary department & city wise in which city name starts with ‘R’.
SELECT Dpartment,City,MAX(Salary) AS MAX_SAL FROM EMP 
WHERE City LIKE 'R%' 
GROUP BY Dpartment,City;