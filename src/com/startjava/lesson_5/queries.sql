-- запросы к таблице jaegers в БД jaegers

\echo `date`
\echo  выведите всю таблицу
SELECT * 
FROM jaegers;


\echo отобразите только не уничтоженных роботов
SELECT * 
FROM jaegers
WHERE status <> 'Destroyed';


\echo отобразите роботов нескольких серий: Mark-1 и Mark-4
SELECT * 
FROM jaegers
WHERE mark IN ('Mark-1', 'Mark-4');


\echo отобразите всех роботов, кроме Mark-1 и Mark-4
SELECT * 
FROM jaegers
WHERE mark NOT IN ('Mark-1', 'Mark-4');


\echo отсортируйте таблицу по убыванию по столбцу mark
SELECT * 
FROM jaegers
ORDER BY mark;


\echo отобразите информацию о самом старом роботе
SELECT * 
FROM jaegers
WHERE launch = (SELECT MIN(launch) FROM jaegers);


\echo отобразите роботов, которые уничтожили больше всех kaiju
SELECT * 
FROM jaegers
WHERE kaijuKill > (SELECT AVG(kaijuKill) FROM jaegers);


\echo отобразите средний вес роботов
SELECT AVG(weight)
FROM jaegers;


\echo увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
UPDATE jaegers
SET kaijuKill = kaijuKill + 1
WHERE status <> 'Destroyed';


\echo удалите уничтоженных роботов
DELETE FROM jaegers
WHERE status = 'Destroyed';
