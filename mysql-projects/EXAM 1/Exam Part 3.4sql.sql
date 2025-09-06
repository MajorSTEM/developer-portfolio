-- Part 3
-- 1 
use cape_codd;
select   department, count(department) as sku_cnt
from     sku_data
group by department
order by sku_cnt desc
;

-- 2 

use cape_codd;
select warehouseid, warehousecity, manager
from warehouse, inventory
and warehousecity except('Chicago');

-- 3
use cape_codd;
select  distinct warehouseid, count(warehouseid) as sku_count
from     inventory
;

-- 4 
use cape_codd;
SELECT 
    sku_data.sku, buyer, department from sku_data 
    inner join inventory on sku_data.sku = inventory.sku
    where warehouseid=100
order by sku_data.sku asc;
-- 5

-- 6

-- 7

-- 8

use cape_codd;
select warehouse.warehouseid,
concat (warehousecity , " ", warehousestate) as "place",
inventory.sku as "sku_stock_lt_5",
quantityonhand as "stock",
buyer, department
from warehouse, inventory, sku_data
where warehouse.warehouseid = inventory.warehouseid
and inventory.sku = sku_data.sku
and quantityonhand < 5;

-- part 4 