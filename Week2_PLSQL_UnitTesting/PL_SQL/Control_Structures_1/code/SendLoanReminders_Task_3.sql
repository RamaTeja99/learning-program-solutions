DELIMITER //

CREATE PROCEDURE SendLoanReminders()
BEGIN
  DECLARE done INT DEFAULT FALSE;
  DECLARE cname VARCHAR(100);
  DECLARE loan_id INT;
  DECLARE due DATE;

  DECLARE cur CURSOR FOR
    SELECT c.name, l.loan_id, l.due_date
    FROM loans l
    JOIN customers c ON l.customer_id = c.customer_id
    WHERE l.due_date BETWEEN CURDATE() AND CURDATE() + INTERVAL 30 DAY;

  DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

  OPEN cur;

  reminder_loop: LOOP
    FETCH cur INTO cname, loan_id, due;
    IF done THEN 
      LEAVE reminder_loop;
    END IF;

    SELECT CONCAT('Reminder: Loan ID ', loan_id, ' for ', cname, ' is due on ', due) AS message;

  END LOOP;

  CLOSE cur;
END;
//

DELIMITER ;

CALL SendLoanReminders();
