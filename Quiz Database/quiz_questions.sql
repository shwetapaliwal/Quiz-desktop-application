CREATE DATABASE  IF NOT EXISTS `quiz` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `quiz`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: quiz
-- ------------------------------------------------------
-- Server version	5.5.25a

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `questions`
--

DROP TABLE IF EXISTS `questions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `questions` (
  `Qcode` int(11) NOT NULL,
  `Ques` varchar(500) NOT NULL DEFAULT '',
  `op1` varchar(100) DEFAULT NULL,
  `op2` varchar(100) DEFAULT NULL,
  `op3` varchar(100) DEFAULT NULL,
  `op4` varchar(100) DEFAULT NULL,
  `answer` varchar(100) DEFAULT NULL,
  `sub` varchar(30) DEFAULT NULL,
  `lev` varchar(20) DEFAULT NULL,
  `marks` int(11) NOT NULL,
  PRIMARY KEY (`Qcode`,`Ques`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questions`
--

LOCK TABLES `questions` WRITE;
/*!40000 ALTER TABLE `questions` DISABLE KEYS */;
INSERT INTO `questions` VALUES (1,'What are the types of linkages?','Internal and External','External, Internal and None','External and None','Internal','B','C Programming','Medium',2),(1,'What is the prototype of the default constructor?','Test()','Test(void)','Public Test()','Public Test(Void)','C','Java SE','Easy',1),(1,'Where does the Object is created?','class','constructor','destructor','attributes','A','CPP','Easy',1),(2,'How to access the object in the class?','scope resolution operator','ternary operator','direct member acess operator','none of above','C','CPP','Easy',1),(2,'What is the output of the program given below ?\n\n#include<stdio.h>\nint main()\n{\n    enum status { pass, fail, atkt};\n    enum status stud1, stud2, stud3;\n    stud1 = pass;\n    stud2 = atkt;\n    stud3 = fail;\n    printf(\"%d, %d, %d\n\", stud1, stud2, stud3);\n    return 0;\n}','0,1,2','1,2,3','0,2,1','3,2,1','C','C Programming','Hard',3),(2,'What is the size of char variable?	','8 bit','16 bit','32 bit','64 bit','B','Java SE','Easy',1),(3,'What is the default value of short variable?','0.0','0','null','not defined','B','Java SE','Easy',1),(3,'What is the output of the program\n\n#include<stdio.h>\nint main()\n{\n    struct emp\n    {\n        char name[20];\n        int age;\n        float sal;\n    };\n    struct emp e = {\"Tiger\"};\n    printf(\"%d, %f\n\", e.age, e.sal);\n    return 0;\n}','0, 0.000000','Garbage values','Error','None of the above','A','C Programming','Medium',2),(3,'Which of these following members are not accessed by using direct member access operator?','public','private','protected','both B and C','D','CPP','Easy',1),(4,'How many objects can present in a single class?','1','2','3','as many as possible','D','CPP','Easy',1),(4,'Inheritance represents','HAS-A Relationship','IS-A Relationship','Both of above','none of above','B','Java SE','Easy',1),(4,'What is the output of the program\n\n#include<stdio.h>\nint main()\n{\n    int x = 10, y = 20, z = 5, i;\n    i = x < y < z;\n    printf(\"%d\n\", i);\n    return 0;\n}','0','1','error','none of the above','B','C Programming','Medium',2),(5,'What happens when threads yield() method is called?','Thread returns to the ready state.','Thread returns to the waiting state.','Thread starts running.','None of the above','A','Java SE','Easy',1),(5,'Which of the following is not logical operator?','&','&&','||','!','A','C Programming','Easy',1),(5,'Which special character is used to mark the end of class?',';',':','#','@','A','CPP','Easy',1),(6,'Which of the following cannot be checked in a switch-case statement?','Character','Integer','Float','enum','C','C Programming','Easy',1),(7,'Which of the following is the correct order of evaluation for the below expression?\nz = x + y * z / 4 % 2 - 1','* / % + - =','= * / % + -','/ * % - + =','* % / - + =','A','C Programming','Medium',2),(8,'Which of the following correctly shows the hierarchy of arithmetic operations in C?','/ + * -','+-*/','*/+-','/*+-','D','C Programming','Easy',1),(9,'Which of the following is the correct usage of conditional operators used in C?','a>b ? c=30 : c=40;','a>b ? c=30;','max = a>b ? a>c?a:c:b>c?b:c','return (a>b)?(a:b)','C','C Programming','Hard',3),(10,'Which of the following are unary operators in C?\n1.	!\n2.	sizeof\n3.	~\n4.	&&','1,2','1,3','2,4','1,2,3','D','C Programming','Easy',1),(11,'In which order do the following gets evaluated\n1.	Relational\n2.	Arithmetic\n3.	Logical\n4.	Assignment\n\n','2134','1234','3214','2431','A','C Programming','Easy',1),(12,'What will be the output of the program?\n\n#include<stdio.h>\nint main()\n{\n    int i=-3, j=2, k=0, m;\n    m = ++i || ++j && ++k;\n    printf(\"%d, %d, %d, %d\n\", i, j, k, m);\n    return 0;\n}','2, 2, 0, 1','1, 2, 1, 0','-2, 2, 0, 0','-2, 2, 0, 1','D','C Programming','Medium',2),(13,'void *ptr;\nmyStruct myArray[10];\nptr = myArray;\n\nWhich of the following is the correct way to increment the variable \"ptr\"?','ptr = ptr + sizeof(myStruct);','++(int*)ptr;','ptr = ptr + sizeof(myArray);','increment(ptr); ','A','C Programming','Hard',3),(14,'Which one of the following functions is the correct choice for moving blocks of binary data that are of arbitrary size and position in memory? ','memcpy()','memset()','strncpy()','memmove()','D','C Programming','Hard',3),(15,'time_t t; \n\nWhich one of the following statements will properly initialize the variable t with the current time from the sample above? ','t = clock();','time( &t );','t = ctime(); ','t = localtime();','A','C Programming','Hard',3);
/*!40000 ALTER TABLE `questions` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-05-23  9:08:37
