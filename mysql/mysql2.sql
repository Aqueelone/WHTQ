DROP FUNCTION IF EXISTS initcap; 
DELIMITER // 
CREATE FUNCTION initcap( 
oldName VARCHAR(255)
) 
RETURNS VARCHAR(255) 
BEGIN 
SET @oldString := oldName; 
SET @newString := "";
SET @splitPoint := 0;
tokenLoop: LOOP 
SET @oldString := TRIM(BOTH " " FROM @oldString);
IF @oldString = "" THEN
LEAVE tokenLoop; 
END IF;
SET @splitPoint := LOCATE(" ", @oldString);
IF @splitPoint = 0 THEN 
SET @newString := CONCAT(@newString, UCASE(LEFT(@oldString, 1)), LCASE(SUBSTRING(@oldString, 2))); 
LEAVE tokenLoop; 
END IF; 
SET @newString := CONCAT(@newString, UCASE(LEFT(@oldString, 1)), LCASE(SUBSTRING(@oldString, 2, @splitPoint-1))); 
SET @oldString := SUBSTRING(@oldString, @splitPoint+1);
END LOOP tokenLoop; 
RETURN @newString;
END// 
DELIMITER ;