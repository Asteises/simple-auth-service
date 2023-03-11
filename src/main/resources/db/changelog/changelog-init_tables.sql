CREATE TABLE users
(
    id         VARCHAR(100) PRIMARY KEY NOT NULL UNIQUE,
    first_name VARCHAR(100),
    last_name  VARCHAR(100),
    login      VARCHAR(100)             NOT NULL UNIQUE,
    password   VARCHAR(255)             NOT NULL
);