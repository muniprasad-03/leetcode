-- Last updated: 04/04/2026, 23:36:10
# Write your MySQL query statement below
SELECT firstName,lastName,city,state 
FROM Person P 
LEFT JOIN Address A 
ON P.personId = A.personId;