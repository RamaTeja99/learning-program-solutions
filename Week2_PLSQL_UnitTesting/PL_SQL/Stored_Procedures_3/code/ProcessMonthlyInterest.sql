DELIMITER $$

CREATE PROCEDURE ProcessMonthlyInterest()
BEGIN
    UPDATE accounts
    SET balance = balance * 1.01
    WHERE account_type = 'savings';
END$$

DELIMITER ;

SET SQL_SAFE_UPDATES = 0;
CALL ProcessMonthlyInterest();
SELECT * FROM accounts;