SELECT p.id, p.name, COUNT(s.sale) AS sale_count,
RANK() OVER (ORDER BY COUNT(s.sale) DESC) AS sale_rank
FROM people p
JOIN sales s ON p.id = s.people_id
GROUP BY p.id