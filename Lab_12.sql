USE CSE_B1_302

--Part – A:
--1. Find all persons with their department name & code.
SELECT PERSON.PersonName,DEPT.DepartmentName,DEPT.DepartmentCode
FROM PERSON JOIN DEPT
ON PERSON.DepartmentID = DEPT.DepartmentID

--2. Find the person's name whose department is in C-Block.
SELECT PERSON.PersonName,DEPT.Location
FROM PERSON JOIN DEPT
ON PERSON.DepartmentID = DEPT.DepartmentID
WHERE DEPT.Location = 'C-BLOCK'

--3. Retrieve person name, salary & department name who belongs to Jamnagar city.
SELECT PERSON.PersonName,DEPT.DepartmentName,PERSON.City,PERSON.Salary
FROM PERSON JOIN DEPT
ON PERSON.DepartmentID = DEPT.DepartmentID
WHERE PERSON.City = 'Jamnagar'

--4. Retrieve person name, salary & department name who does not belong to Rajkot city.
SELECT PERSON.PersonName,DEPT.DepartmentName,PERSON.City,PERSON.Salary
FROM PERSON JOIN DEPT
ON PERSON.DepartmentID = DEPT.DepartmentID
WHERE PERSON.City != 'RAJKOT'

--5. Retrieve person’s name of the person who joined the Civil department after 1-Aug-2001.
SELECT PERSON.PersonName,DEPT.DepartmentName,PERSON.JoiningDate
FROM PERSON JOIN DEPT
ON PERSON.DepartmentID = DEPT.DepartmentID
WHERE DEPT.DepartmentName = 'CIVIL' AND JoiningDate > '1-AUG-2001'

--6. Find details of all persons who belong to the computer department.
SELECT *
FROM PERSON JOIN DEPT
ON PERSON.DepartmentID = DEPT.DepartmentID
WHERE DEPT.DepartmentName = 'COMPUTER'

--7. Display all the person's name with the department whose joining date difference with the current date
--is more than 365 days.
SELECT PERSON.PersonName,DEPT.DepartmentName,PERSON.JoiningDate
FROM PERSON JOIN DEPT
ON PERSON.DepartmentID = DEPT.DepartmentID
WHERE DATEDIFF(DAY,PERSON.JoiningDate,GETDATE()) > 365

--8. Find department wise person counts.
SELECT DEPT.DepartmentName,COUNT(PERSON.PERSONID)
FROM PERSON JOIN DEPT
ON PERSON.DepartmentID = DEPT.DepartmentID
GROUP BY DepartmentName

--9. Give department wise maximum & minimum salary with department name.
SELECT DEPT.DepartmentName,MAX(PERSON.Salary) AS MAX_Sal,MIN(PERSON.Salary) AS MIN_Sal 
FROM PERSON JOIN DEPT
ON PERSON.DepartmentID = DEPT.DepartmentID
GROUP BY DepartmentName

--10. Find city wise total, average, maximum and minimum salary.
SELECT CITY , MAX(Salary) AS MAX_Sal ,MIN(Salary) AS MIN_Sal,AVG(Salary) AS AVG_Sal,SUM(Salary) AS TOTAL_Sal
FROM PERSON 
GROUP BY CITY


--11. Find the average salary of a person who belongs to Ahmedabad city.
SELECT AVG(SALARY) AS AVG_Sal
FROM PERSON
WHERE CITY = 'Ahmedabad'

--12. Produce Output Like: <PersonName> lives in <City> and works in <DepartmentName> Department. (In
--single column)
SELECT PERSON.PERSONNAME + ' lives in ' + PERSON.CITY + ' and works in ' + DEPT.DEPARTMENTNAME + ' Department.' AS Description
FROM PERSON JOIN DEPT
ON PERSON.DEPARTMENTID=DEPT.DEPARTMENTID;

-----------------------------------------PART B--------------------------------------------------------
--1 Produce Output Like: <PersonName> earns <Salary> from <DepartmentName> department monthly. (In single column)
SELECT PERSON.PERSONNAME + ' EARNS ' + CAST(PERSON.SALARY AS VARCHAR) + ' FROM ' + DEPT.DEPARTMENTNAME + ' DEPARTMENT MONTHLY.' AS Description
FROM PERSON JOIN DEPT
ON PERSON.DEPARTMENTID=DEPT.DEPARTMENTID;

--2 Find city & department wise total, average & maximum salaries.
SELECT PERSON.CITY,DEPT.DEPARTMENTNAME,AVG(PERSON.SALARY) AS AVG_SALARY,SUM(PERSON.SALARY) AS SUM_SALARY,MAX(PERSON.SALARY) AS MAX_SALARY
FROM PERSON JOIN DEPT
ON PERSON.DEPARTMENTID=DEPT.DEPARTMENTID
GROUP BY CITY,DEPARTMENTNAME;

--3 Find all persons who do not belong to any department.
SELECT PERSONID,DEPARTMENTID
FROM PERSON
WHERE DEPARTMENTID IS NULL;

--4 Find all departments whose total salary is exceeding 100000.
SELECT DEPT.DEPARTMENTNAME,SUM(PERSON.SALARY)
FROM PERSON JOIN DEPT
ON PERSON.DEPARTMENTID=DEPT.DEPARTMENTID
GROUP BY DEPT.DEPARTMENTNAME
HAVING SUM(PERSON.SALARY)>100000;

-----------------------------------------PART C--------------------------------------------------------
--1 List all departments who have no person.
SELECT DEPT.DEPARTMENTNAME,COUNT(PERSON.PERSONID) AS COUNT_PERSON
FROM PERSON JOIN DEPT
ON PERSON.DEPARTMENTID=DEPT.DEPARTMENTID
GROUP BY DEPT.DEPARTMENTNAME
HAVING COUNT(PERSON.PERSONID) IS NULL;

--2 List out department names in which more than two persons are working.
SELECT DEPT.DEPARTMENTNAME,COUNT(PERSON.PERSONID) AS COUNT_PERSON
FROM PERSON JOIN DEPT
ON PERSON.DEPARTMENTID=DEPT.DEPARTMENTID
GROUP BY DEPT.DEPARTMENTNAME
HAVING COUNT(PERSON.PERSONID)>2;

--3 Give a 10% increment in the computer department employee’s salary. (Use Update)
UPDATE PERSON
SET PERSON.SALARY=SALARY+SALARY*0.1
FROM PERSON JOIN DEPT
ON PERSON.DEPARTMENTID=DEPT.DEPARTMENTID
WHERE DEPT.DEPARTMENTNAME='COMPUTER';

SELECT * FROM PERSON;
