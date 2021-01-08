DROP TABLE IF EXISTS employee CASCADE;

CREATE TABLE employee
(   first_name      TEXT,
    last_name      TEXT,
    description      TEXT,
    id         BIGSERIAL PRIMARY KEY,
    "version" BIGINT DEFAULT 0,
    manager_id BIGINT
);

ALTER TABLE employee ADD COLUMN version BIGINT NOT NULL DEFAULT 0

ALTER TABLE employee ADD COLUMN manager_id BIGINT DEFAULT 0

CREATE TABLE manager
(   name      TEXT,
    password      TEXT,
    roles      TEXT,
    id         BIGSERIAL PRIMARY KEY
);