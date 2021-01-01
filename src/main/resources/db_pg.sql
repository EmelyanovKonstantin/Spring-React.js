DROP TABLE IF EXISTS employee CASCADE;

CREATE TABLE employee
(   first_name      TEXT,
    last_name      TEXT,
    description      TEXT,
    id         SERIAL PRIMARY KEY
);