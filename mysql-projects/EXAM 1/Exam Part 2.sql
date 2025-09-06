-- Part two
-- 1. Microsoft SQL server databases use T-SQL, UPS uses PL/SQL, and MariaDB uses standard SQL.

-- 2
select distinct make,model
from vehicles
;

select make
from vehicles
group by model
;
-- The difference is that distinct gives a more specific column. Where as group by takes that specific column and organizes it by grouping.


-- 3 
use flight2;
select 
IF( sex = f, m, null ) from passenger;

-- 4 The window function would be used if a ranking function would be needed for the data.

-- 5 
use jsea;
select *
from vehicles join clients;

-- 6 
SELECT *
FROM vehicles JOIN clients
  ON vehicles.model = clients.email;
  
  SELECT *
FROM purchase_order JOIN clients
  ON purchase_order.city = clients.email;
  

  
  

-- 7 

use cape_codd;
With
cte1 AS (Select quantity, extendedprice FROM order_item a),
cte2 as (select department, sku from sku_data d)
select extendedprice, sku
from cte1 join cte2 on cte1.a = cte2.c ;

-- 8
use cape_codd;
select sku_description, department, buyer
from sku_data
order by 
(case
when buyer is null then department
else department
end) ;

use flight2;
select origin, destination,carrier
from times
order by 
(case
when origin is null then carrier
else destination
end) ;