# Write your MySQL query statement below
SELECT name AS customers 
FROM Customers
LEFT JOIN Orders
ON Customers.id = Orders.customerId
WHERE Orders.customerId IS NULL;