# Write your MySQL query statement below
WITH cte AS(
  SELECT mr.*, m.title, u.name
  FROM MovieRating mr
  LEFT JOIN Movies m
  ON mr.movie_id=m.movie_id
  LEFT JOIN Users u
  ON mr.user_id=u.user_id
),

cte2 AS(
  SELECT name,
  count(*) as no_of_ratings
  FROM cte 
  GROUP BY user_id
  ORDER BY no_of_ratings DESC, name ASC
  LIMIT 1
),

cte3 AS(
  SELECT title, AVG(rating) AS avg_rating
  FROM cte
  WHERE created_at BETWEEN '2020-02-01' AND '2020-02-29'
  GROUP BY movie_id
  ORDER BY avg_rating DESC, title ASC
  LIMIT 1
)

SELECT (SELECT name FROM cte2) AS results
UNION ALL
SELECT (SELECT title FROM cte3) AS results