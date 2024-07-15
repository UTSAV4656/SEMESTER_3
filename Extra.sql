--Part – A: Math Functions
--1.Display the result of 5 multiply by 30.
SELECT 5 * 30 AS Result;

--2.Find out the absolute value of -25, 25, -50 and 50.
SELECT ABS(-25) AS Abs_Neg_25, 
       ABS(25) AS Abs_25, 
       ABS(-50) AS Abs_Neg_50, 
       ABS(50) AS Abs_50;

--3.Find the smallest integer value that is greater than or equal to 25.2, 25.7, and -25.2.
SELECT CEIL(25.2) AS Ceil_25_2, 
       CEIL(25.7) AS Ceil_25_7, 
       CEIL(-25.2) AS Ceil_Neg_25_2;
--4.Find the largest integer value that is smaller than or equal to 25.2, 25.7, and -25.2.
SELECT FLOOR(25.2) AS Floor_25_2, 
       FLOOR(25.7) AS Floor_25_7, 
       FLOOR(-25.2) AS Floor_Neg_25_2;

--5.Find out the remainder of 5 divided by 2 and 5 divided by 3.
SELECT 5 % 2 AS Remainder_5_2, 
       5 % 3 AS Remainder_5_3;

--6.Find out the value of 3 raised to the 2nd power and 4 raised to the 3rd power.
SELECT POWER(3, 2) AS Power_3_2, 
       POWER(4, 3) AS Power_4_3;

--7.Find out the square root of 25, 30, and 50.
SELECT SQRT(25) AS Sqrt_25, 
       SQRT(30) AS Sqrt_30, 
       SQRT(50) AS Sqrt_50;

--8.Find out the square of 5, 15, and 25.
SELECT POWER(5, 2) AS Square_5, 
       POWER(15, 2) AS Square_15, 
       POWER(25, 2) AS Square_25;

--9.Find out the value of PI.
SELECT PI() AS Pi_Value;
--10.Find out the round value of 157.732 for 2, 0, and -2 decimal points.
SELECT ROUND(157.732, 2) AS Round_2, 
       ROUND(157.732, 0) AS Round_0, 
       ROUND(157.732, -2) AS Round_Neg_2;

--11.Find out the exponential value of 2 and 3.
SELECT EXP(2) AS Exp_2, 
       EXP(3) AS Exp_3;

--12.Find out the logarithm having base e of 10 and 2.
SELECT LOG(10) AS Log_e_10, 
       LOG(2) AS Log_e_2;

--13.Find out the logarithm having base 10 of 5 and 100.
SELECT LOG10(5) AS Log10_5, 
       LOG10(100) AS Log10_100;

--14.Find sine, cosine, and tangent of 3.1415.
SELECT SIN(3.1415) AS Sine_3_1415, 
       COS(3.1415) AS Cosine_3_1415, 
       TAN(3.1415) AS Tangent_3_1415;

--15.Find the sign of -25, 0, and 25.
SELECT SIGN(-25) AS Sign_Neg_25, 
       SIGN(0) AS Sign_0, 
       SIGN(25) AS Sign_25;

--16.Generate a random number using a function.
SELECT RAND() AS Random_Number;
