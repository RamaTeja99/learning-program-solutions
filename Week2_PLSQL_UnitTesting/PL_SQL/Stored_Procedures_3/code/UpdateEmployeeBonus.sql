DELIMITER $$

CREATE PROCEDURE UpdateEmployeeBonus(
    IN deptId INT,
    IN bonusPercent DECIMAL(5,2)
)
BEGIN
    UPDATE employees
    SET salary = salary + (salary * bonusPercent / 100)
    WHERE department_id = deptId;
END$$

DELIMITER ;

CALL UpdateEmployeeBonus(10, 10.0);

SELECT * FROM employees;
