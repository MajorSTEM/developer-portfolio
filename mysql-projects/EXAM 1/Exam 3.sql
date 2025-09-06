-- 2 for exam

SELECT   ordertable, COUNT(DISTINCT QuantityOrdered, QuotePrice) AS orderNum
FROM     ordertable
GROUP BY PartNum
-- HAVING distinct_cnt > 1 ;


-- 3 for exam
SELECT * FROM retail_order ro 
JOIN order_item oi 
ON ro.OrderNumber = oi.OrderNumber 
JOIN sku_data sd 
ON oi.SKU = sd.SKU;


    

