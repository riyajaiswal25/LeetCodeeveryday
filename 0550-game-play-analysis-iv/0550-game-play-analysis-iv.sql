# Write your MySQL query statement below
WITH Min_Date AS (
    SELECT player_id, MIN(event_date) AS min_date
    FROM Activity
    GROUP BY player_id
), 
Consec as (
    SELECT Activity.player_id
    FROM Activity
    JOIN Min_Date
    ON Activity.player_id = Min_Date.player_id
    WHERE event_date = DATE_ADD(min_date, INTERVAL 1 DAY)
)
SELECT ROUND((SELECT COUNT(DISTINCT player_id) FROM Consec) 
             / (SELECT COUNT(DISTINCT player_id) FROM Min_Date), 2) AS fraction