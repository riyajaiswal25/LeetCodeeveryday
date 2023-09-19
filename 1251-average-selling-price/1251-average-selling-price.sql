# Write your MySQL query statement below
/*select Prices.product_id, round(SUM(UnitsSold.units*Prices.price)/sum(UnitsSold.units),2) as average_price
from Prices
inner join UnitsSold
on Prices.product_id=UnitsSold.product_id and
UnitsSold.purchase_date BETWEEN Prices.Start_date and Prices.end_date
group by Prices.product_id;
*/


SELECT Prices.product_id, IF(SUM(UnitsSold.units) IS NOT NULL, ROUND(SUM(UnitsSold.units * Prices.price) / SUM(UnitsSold.units), 2), 0) AS average_price
FROM Prices LEFT JOIN UnitsSold
ON Prices.product_id = UnitsSold.product_id AND 
UnitsSold.purchase_date BETWEEN Prices.start_date AND Prices.end_date
GROUP BY Prices.product_id