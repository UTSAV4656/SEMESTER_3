CREATE DATABASE CSE_B1_302

CREATE TABLE DEPOSITE
(
	ACTNO INT,
	CNAME VARCHAR(50),
	BNAME VARCHAR(50),
	AMOUNT DECIMAL(8,2),
	ADATE DATETIME
)

INSERT INTO DEPOSITE(ACTNO,CNAME,BNAME,AMOUNT,ADATE)
VALUES
(101,'ANIL','VRCE',1000.00,'1-3-95')

INSERT INTO DEPOSITE(ACTNO,CNAME,BNAME,AMOUNT,ADATE)
VALUES
(102,'SUNIL','AJNI',5000.00,'4-1-96')

INSERT INTO DEPOSITE(ACTNO,CNAME,BNAME,AMOUNT,ADATE)
VALUES
(103,'MEHUL','KAROLBAGH',3500.00,'17-NOV-1995')

INSERT INTO DEPOSITE(ACTNO,CNAME,BNAME,AMOUNT,ADATE)
VALUES
(104,'MADHURI','CHANDI',1200.00,'17-DEC-95')

INSERT INTO DEPOSITE(ACTNO,CNAME,BNAME,AMOUNT,ADATE)
VALUES
(105,'PRAMOD','M.G.ROAD',3000.00,'27-MARCH-96')

INSERT INTO DEPOSITE(ACTNO,CNAME,BNAME,AMOUNT,ADATE)
VALUES
(106,'SANDIP','ANDHERI',2000.00,'31-MARCH-96')

INSERT INTO DEPOSITE(ACTNO,CNAME,BNAME,AMOUNT,ADATE)
VALUES
(107,'SHIVANI','VIRAR',1000.00,'5-SEP-95')

INSERT INTO DEPOSITE(ACTNO,CNAME,BNAME,AMOUNT,ADATE)
VALUES
(108,'KRANTI','NEHRU PLACE',5000.00,'2-JULY-95')

INSERT INTO DEPOSITE(ACTNO,CNAME,BNAME,AMOUNT,ADATE)
VALUES
(105,'MINU','POWAI',7000.00,'10-AUG-95')


CREATE TABLE BRANCH
(
	BNAME VARCHAR(50),
	CITY VARCHAR(50)
)

INSERT INTO BRANCH (BNAME,CITY)
VALUES
('VRCE','NAGPUR'),
('AJNI','NAGPUR'),
('KAROLBAGH','DELHI'),
('CHANDI','DELHI'),
('DHARAMPETH','NAGPUR'),
('M.G. ROAD','BANGLORE'),
('ANDHERI','BOMBAY'),
('VIRAR','BOMBAY'),
('NEHRU PLACE','DELHI'),
('POWAI','BOMBAY')

CREATE TABLE CUSTOMERS
(
	CNAME VARCHAR(50),
	CITY VARCHAR(50)
)

INSERT INTO CUSTOMERS(CNAME,CITY)
VALUES
('ANIL','CALCUTTA'),
('SUNIL','DELHI'),
('MEHUL','BARODA'),
('MANDAR','PATNA'),
('MADHURI','NAGPUR'),
('PRAMOD','NAGPUR'),
('SANDIP','SURAT'),
('SHIVANI','BOMBAY'),
('KRANTI','BOMBAY'),
('NAREN','BOMBAY')

CREATE TABLE BORROW
(
	LOANNO INT,
	CNAME VARCHAR(50),
	BNAME VARCHAR(50),
	AMOUNT DECIMAL(8,2),
)

INSERT INTO BORROW(LOANNO,CNAME,BNAME,AMOUNT)
VALUES
(201,'ANIL','VRCE',1000.00),
(206,'MEHUL','AJNI',5000.00),
(311,'SUNIL','DHARAMPETH',3000.00),
(321,'MADHURI','ANDHERI',2000.00),
(375,'PRAMOD','VIRAR',8000.00),
(481,'KRANTI','NEHRU PLACE',3000.00)

--Retrieve all data from table DEPOSIT. 
SELECT * FROM DEPOSITE

--Retrieve all data from table BORROW. 
SELECT * FROM BORROW

--. Retrieve all data from table CUSTOMERS
SELECT * FROM CUSTOMERS

--Display Account No, Customer Name & Amount from DEPOSIT.
SELECT ACTNO,CNAME,AMOUNT FROM DEPOSITE

--Display Loan No, Amount from BORROW.
SELECT LOANNO,AMOUNT FROM BORROW

--Display loan details of all customers who belongs to ‘ANDHERI’ branch from borrow table
SELECT * FROM BORROW WHERE BNAME='ANDHERI'

--Give account no and amount of depositor, whose account no is equals to 106 from deposit table. 
SELECT ACTNO,AMOUNT FROM DEPOSITE WHERE ACTNO=106

--Give name of borrowers having amount greater than 5000 from borrow table. 
SELECT CNAME FROM BORROW WHERE AMOUNT > 5000.00

--Give name of customers who opened account after date '1-12-96' from deposit table.
SELECT CNAME FROM DEPOSITE WHERE ADATE > 1-12-96

--Display name of customers whose account no is less than 105 from deposit table.
SELECT CNAME FROM DEPOSITE WHERE ACTNO<105

--. Display name of customer who belongs to either ‘NAGPUR’ or ‘DELHI’ from customer table. (OR & IN)
SELECT CNAME FROM CUSTOMERS WHERE CITY = 'NAGPUR' OR CITY = 'DELHI'

SELECT CNAME FROM CUSTOMERS WHERE CITY IN ('NAGPUR','DELHI')

--Display name of customers with branch whose amount is greater than 4000 and account no is less than
--105 from deposit table.
SELECT CNAME,BNAME FROM DEPOSITE WHERE AMOUNT>4000.00 AND ACTNO<105

--Find all borrowers whose amount is greater than equals to 3000 & less than equals to 8000 from borrow
--table. (AND & BETWEEN)
SELECT * FROM BORROW WHERE AMOUNT>=3000.00 AND AMOUNT<=8000.00

SELECT * FROM BORROW WHERE AMOUNT BETWEEN 3000.00 AND 8000.00

--Find all depositors who do not belongs to ‘ANDHERI’ branch from deposit table
SELECT * FROM DEPOSITE WHERE BNAME <> 'ANDHERI'

--Display Account No, Customer Name & Amount of such customers who belongs to ‘AJNI’, ‘KAROLBAGH’
-- Or ‘M.G.ROAD’ and Account No is less than 104 from deposit table.
SELECT ACTNO,CNAME,AMOUNT FROM DEPOSITE WHERE BNAME IN ('AJNI','KAROLBAGH','M.G.ROAD') AND ACTNO < 104

--LAB_3--

 CREATE TABLE CRICKET
 (
	NAME VARCHAR(25),
	CITY VARCHAR(25),
	AGE INT
 )

 INSERT INTO CRICKET(NAME,CITY,AGE)
 VALUES
 ('Sachin Tendulkar','Mumbai',30),
 ('Rahul Dravid','Bombay',35),
 ('M. S. Dhoni','Jharkhand',31),
 ('Suresh Raina','Gujarat',30)

 --Create table Worldcup from cricket with all the columns and data.
SELECT * INTO WORLDCUP FROM CRICKET

--Create table T20 from cricket with first two columns with no data.
SELECT NAME,CITY INTO T20 FROM CRICKET

--Create table IPL From Cricket with No DataSELECT * INTO IPL FROM CRICKET WHERE 1=0--PART_B--CREATE TABLE EMPLOYEE	
 (
	NAME VARCHAR(25),
	CITY VARCHAR(25),
	AGE INT
 )

 INSERT INTO EMPLOYEE(NAME,CITY,AGE)
 VALUES
 ('Jay Patel','Rajkot',30),
 ('Rahul Dave','Baroda',35),
 ('Jeet Patel','Surat',31),
 ('Vijay Raval','Rajkot',30)

--Create table Employee_detail from Employee with all the columns and data.
SELECT * INTO Employee_detail FROM EMPLOYEE

--Create table Employee_data from Employee with first two columns with no data.
SELECT  NAME,CITY Employee_data FROM EMPLOYEE

--Create table Employee_info from Employee with no Data
SELECT * INTO Employee_info FROM EMPLOYEE WHERE 1=2

--PART_C--
--Insert the Data into Employee_info from Employee whose CITY is Rajkot
INSERT INTO Employee_info SELECT * FROM EMPLOYEE WHERE CITY = 'RAJKOT'

--Insert the Data into Employee_info from Employee whose age is more than 32.INSERT INTO Employee_info SELECT * FROM EMPLOYEE WHERE AGE>32--UPDATE PART_A----Update deposit amount of all customers from 3000 to 5000. (Use Deposit Table)
UPDATE DEPOSITE
SET AMOUNT=5000
WHERE AMOUNT=3000

--Change branch name of ANIL from VRCE to C.G. ROAD. (Use Borrow Table)
UPDATE BORROW
SET BNAME = 'C.G.ROAD'
WHERE CNAME = 'ANIL'

--Update Account No of SANDIP to 111 & Amount to 5000. (Use Deposit Table)
UPDATE DEPOSITE
SET ACTNO = 111,AMOUNT=7000
WHERE CNAME ='SANDIP'

--Update amount of KRANTI to 7000. (Use Deposit Table)
UPDATE DEPOSITE 
SET AMOUNT=7000
WHERE CNAME = 'KRANTI'

--Update branch name from ANDHERI to ANDHERI WEST. (Use Branch Table)
UPDATE BRANCH 
SET BNAME = 'ANDHERI WEST'
WHERE BNAME = 'ANDHERI'

--Update branch name of MEHUL to NEHRU PALACE. (Use Deposit Table)
UPDATE DEPOSITE
SET BNAME = 'NEHRU PLACE' 
WHERE CNAME= 'MEHUL'

--Update deposit amount of all depositors to 5000 whose account no between 103 & 107. (Use Deposit
--Table)
UPDATE DEPOSITE
SET AMOUNT = 5000
WHERE ACTNO BETWEEN 103 AND 107

--Update ADATE of ANIL to 1-4-95. (Use Deposit Table)
UPDATE DEPOSITE
SET ADATE='1-APRIL-1995'
WHERE CNAME='ANIL'

--Update the amount of MINU to 10000. (Use Deposit Table)
UPDATE DEPOSITE
SET AMOUNT = 10000
WHERE CNAME='MINU'

--Update deposit amount of PRAMOD to 5000 and ADATE to 1-4-96 (Use Deposit Table)
UPDATE DEPOSITE
SET AMOUNT = 5000,ADATE='1-APRIL-1995'
WHERE CNAME='PRAMOD'

--Give 10% Increment in Loan Amount. (Use Borrow Table)UPDATE BORROWSET AMOUNT = (AMOUNT+(AMOUNT*0.1)) WHERE 1=1--Customer deposits additional 20% amount to their account, update the same. (Use Deposit Table)UPDATE DEPOSITESET AMOUNT = (AMOUNT+(AMOUNT*0.2)) WHERE 1=1