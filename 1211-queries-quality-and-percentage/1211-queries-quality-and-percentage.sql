# Write your MySQL query statement below
WITH cte as
(select query_name, rating/position AS ratio, CASE WHEN rating<3 THEN 1 ELSE 0 END as quality_binary
 from Queries
)

select query_name, ROUND(AVG(ratio),2) AS quality, ROUND((SUM(quality_binary)/count(*))*100, 2) AS poor_query_percentage
FROM cte
GROUP BY query_name;