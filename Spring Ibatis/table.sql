Student table
-----------------
DROP TABLE IF EXISTS `spring`.`student`;
CREATE TABLE  `spring`.`student` (
  `stuid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `stuname` varchar(45) NOT NULL,
  `stugender` varchar(45) NOT NULL,
  `stuage` int(10) unsigned NOT NULL,
  PRIMARY KEY (`stuid`)
) 

StudentMark table
-----------------------

DROP TABLE IF EXISTS `spring`.`studentmark`;
CREATE TABLE  `spring`.`studentmark` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `mark1` int(10) unsigned NOT NULL,
  `mark2` int(10) unsigned NOT NULL,
  `mark3` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) 


Getstudent procedure
----------------------------

DELIMITER $$

DROP PROCEDURE IF EXISTS `spring`.`getStudent`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE  `spring`.`getStudent`(IN studentid INT)
BEGIN
select * from student where stuid=studentid;
END $$

DELIMITER ;


Showdetails procedure
------------------------------

DELIMITER $$

DROP PROCEDURE IF EXISTS `spring`.`showDetailsJoin`$$
CREATE DEFINER=`root`@`localhost` PROCEDURE  `spring`.`showDetailsJoin`()
BEGIN
select * from student s,studentmark m where s.stuid=m.id;
END $$

DELIMITER ;

