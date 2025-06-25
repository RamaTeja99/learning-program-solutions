DELIMITER //
CREATE PROCEDURE ApplySeniorCitizenDiscount()
BEGIN
  DECLARE done INT DEFAULT FALSE;
  DECLARE cid INT;
  DECLARE cur CURSOR FOR
    SELECT customer_id FROM customers WHERE age > 60;

  DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

  OPEN cur;

  read_loop: LOOP
    FETCH cur INTO cid;
    IF done THEN 
      LEAVE read_loop;
    END IF;

    UPDATE loans
    SET interest_rate = interest_rate - 1
    WHERE customer_id = cid;

  END LOOP;

  CLOSE cur;
END;
//
DELIMITER ;

call ApplySeniorCitizenDiscount();