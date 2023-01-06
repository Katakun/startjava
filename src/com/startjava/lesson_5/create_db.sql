-- удаление таблицы
DROP TABLE IF EXISTS jaegers;

-- создание базы данных
CREATE DATABASE jaegers;

-- подключение к созданной БД
\c jaegers;

-- создание таблицы
CREATE TABLE jaegers (
     id SERIAL PRIMARY KEY,
     modelName TEXT,
     mark TEXT,
     height DECIMAL,
     weight DECIMAL,
     status TEXT,
     origin TEXT,
     launch DATE,
     kaijuKill SMALLINT);

-- запуск init_db.sql
\ir init_db.sql;

-- запуск queries.sql
\ir queries.sql;