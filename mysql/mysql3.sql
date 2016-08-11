DELIMITER $$

DROP PROCEDURE IF EXISTS explode_table $$
CREATE PROCEDURE explode_table()

BEGIN
		
    DECLARE bound VARCHAR(255) DEFAULT "|";
    DECLARE id INT DEFAULT 0;
    DECLARE name VARCHAR(50) DEFAULT " ";
    DECLARE occurance INT DEFAULT 0;
    DECLARE i INT DEFAULT 0;
    DECLARE splitted_value VARCHAR(50) DEFAULT " ";
    DECLARE done INT DEFAULT 0;
    DECLARE cur1 CURSOR FOR SELECT * FROM sometbl;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;

    DROP TABLE IF EXISTS temptbl;
    CREATE TABLE temptbl(
    `id` INT NOT NULL,
    `name` VARCHAR(255) NOT NULL
    );

    OPEN cur1;
      read_loop: LOOP
        FETCH cur1 INTO id, name;
        IF done THEN
          LEAVE read_loop;
        END IF;

        SET occurance = (SELECT LENGTH(name)
                                 - LENGTH(REPLACE(name, bound, ''))
                                 +1);
        SET i=1;
        WHILE i <= occurance DO
          SET splitted_value = 
          (SELECT REPLACE(SUBSTRING(SUBSTRING_INDEX(name, bound, i),
          LENGTH(SUBSTRING_INDEX(name, bound, i - 1)) + 1), bound, ''));

          INSERT INTO temptbl VALUES (id, splitted_value);
          SET i = i + 1;

        END WHILE;
      END LOOP;

      SELECT * FROM temptbl;
    CLOSE cur1;
END; $$