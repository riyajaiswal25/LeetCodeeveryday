# Write your MySQL query statement below
WITH cte AS
(
    select *, RANK() OVER(PARTITION BY customer_id ORDER BY order_date) AS order_number, CASE WHEN order_date=customer_pref_delivery_date THEN 'immediate' ELSE 'scheduled' END AS order_type 
    from Delivery
)
SELECT ROUND(SUM(CASE when order_type='immediate' THEN 1 ELSE 0 END)/count(*)*100,2) AS immediate_percentage
FROM cte
where order_number=1;