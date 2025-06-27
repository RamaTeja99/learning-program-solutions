use plsql;

CREATE TABLE accounts (
    account_id INT PRIMARY KEY,
    account_type VARCHAR(20),
    balance DECIMAL(10,2)
);

CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    name VARCHAR(100),
    department_id INT,
    salary DECIMAL(10,2)
);

INSERT INTO accounts (account_id, account_type, balance) VALUES
(101, 'savings', 1000.00),
(102, 'savings', 2000.00),
(103, 'current', 1500.00),
(104, 'savings', 3000.00);

INSERT INTO employees (employee_id, name, department_id, salary) VALUES
(1, 'Alice', 10, 50000.00),
(2, 'Bob', 10, 55000.00),
(3, 'Charlie', 20, 60000.00),
(4, 'David', 20, 62000.00);