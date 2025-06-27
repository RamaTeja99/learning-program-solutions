DELIMITER $$

CREATE PROCEDURE TransferFunds(
    IN fromAccountId INT,
    IN toAccountId INT,
    IN transferAmount DECIMAL(10,2)
)
BEGIN
    DECLARE fromBalance DECIMAL(10,2);
    SELECT balance INTO fromBalance
    FROM accounts
    WHERE account_id = fromAccountId;
    IF fromBalance >= transferAmount THEN
        UPDATE accounts
        SET balance = balance - transferAmount
        WHERE account_id = fromAccountId;
        UPDATE accounts
        SET balance = balance + transferAmount
        WHERE account_id = toAccountId;
    ELSE
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Insufficient balance for transfer.';
    END IF;
END$$

DELIMITER ;

CALL TransferFunds(101, 102, 500.00);

SELECT * FROM accounts;

