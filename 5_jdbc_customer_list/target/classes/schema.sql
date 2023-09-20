CREATE TABLE IF NOT EXISTS customer (
    customer_id int(5) NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(50) DEFAULT NULL,
    last_name VARCHAR(50) DEFAULT NULL,
    email VARCHAR(100) DEFAULT NULL,
    PRIMARY KEY(customer_id)
);

