create database plsql;
use plsql;
CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    balance DECIMAL(10,2),
    IsVIP BOOLEAN DEFAULT FALSE
);

CREATE TABLE loans (
    loan_id INT PRIMARY KEY,
    customer_id INT,
    interest_rate DECIMAL(5,2),
    due_date DATE,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

INSERT INTO customers VALUES
(1, 'John Doe', 65, 15000, FALSE),
(2, 'Jane Smith', 45, 8000, FALSE),
(3, 'Michael Brown', 70, 12000, FALSE),
(4, 'Lisa White', 30, 5000, FALSE),
(5, 'Robert Black', 61, 11000, FALSE);

INSERT INTO loans VALUES
(101, 1, 7.5, CURDATE() + INTERVAL 10 DAY),
(102, 2, 6.0, CURDATE() + INTERVAL 40 DAY),
(103, 3, 8.0, CURDATE() + INTERVAL 5 DAY),
(104, 4, 9.0, CURDATE() + INTERVAL 25 DAY),
(105, 5, 7.0, CURDATE() + INTERVAL 15 DAY);

select * from loans;
select * from customers;