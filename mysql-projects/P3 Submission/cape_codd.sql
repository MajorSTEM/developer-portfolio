-- use cape_codd;
-- submission part

-- 1. count individual instances in a collection
select count(*) from sku_data;

-- 2. < variable1>_count_per<variable2/column>

select varaible2>, count(<cntvariable>) as
variable1_cnt_per_groupingvar
from <table_name>
group by <variable2/column_name>
having <condition>;

-- sku_count_per_department
select
department,
count(sku) as sku_count_per_department
from sku_data -- base data
group by department
-- having <condition>
;

-- sku_count_per_buyer
select buyer, count(sku) sku_cnt_per_buyer
from sku_data
group by buyer
;

-- base data:sku_data
-- sku_count_per_order

select ordernumber, count(sku) as new_name
from order_item -- base data
group by ordernumber
;
select * from order_item;

-- sku_count_per_warehouse

select warehouseid,
count(sku) as cntvariable_cnt_per_groupingvar
from inventory
group by warehouseid
-- having <conditions>
;