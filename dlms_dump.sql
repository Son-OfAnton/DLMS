CREATE DATABASE  IF NOT EXISTS `dlms` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `dlms`;
-- MySQL dump 10.13  Distrib 8.0.30, for Linux (x86_64)
--
-- Host: localhost    Database: dlms
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Course`
--

DROP TABLE IF EXISTS `Course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Course` (
  `Cid` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(30) NOT NULL,
  PRIMARY KEY (`Cid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Course`
--

LOCK TABLES `Course` WRITE;
/*!40000 ALTER TABLE `Course` DISABLE KEYS */;
INSERT INTO `Course` VALUES (1,'Traffic Signs'),(2,'First Aid and Safety'),(3,'General Vehicle Parts'),(4,'Behavior'),(5,'Motor Bicycle Parts'),(6,'Public Transport Rules'),(7,'Bus and Minibus Parts'),(8,'Handling of Chemical Loads'),(9,'Trans Border Rules');
/*!40000 ALTER TABLE `Course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Driver`
--

DROP TABLE IF EXISTS `Driver`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Driver` (
  `Did` int NOT NULL AUTO_INCREMENT,
  `FName` varchar(50) NOT NULL,
  `LName` varchar(50) NOT NULL,
  `DOB` date NOT NULL,
  `Sex` varchar(1) NOT NULL,
  `Phone` varchar(15) NOT NULL,
  `Email` varchar(40) DEFAULT NULL,
  `Address` varchar(20) NOT NULL,
  `Pass` varchar(30) NOT NULL,
  `Active` int DEFAULT '0',
  `promotion_status` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`Did`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Driver`
--

LOCK TABLES `Driver` WRITE;
/*!40000 ALTER TABLE `Driver` DISABLE KEYS */;
INSERT INTO `Driver` VALUES (1,'Admas','Terefe','2001-10-04','M','0900026618','aadmasterefe00@gmail.com','Addis Ababa','4321',0,0),(2,'Wende','Dufe','2001-05-23','M','0923435464','wende@gmail.com','selale','121921',0,0),(3,'Lionel','messi','1980-01-01','F','0977777777','leo@gmail.com','barcelona','5736',0,0),(4,'abc','def','1990-04-04','M','0912345678','abc@gmail.com','abc town','7651',0,0),(5,'abc','def','1990-04-04','M','0912345678','abc@gmail.com','abc town','7651',0,0),(6,'hunegnaw','tadese','1999-05-05','M','0998765432','hune@gmail.com','hawasa','4600',1,1),(7,'hana','tasew','1999-05-05','F','0998765432','hana@gmail.com','bishoftu','4600',1,1),(8,'kasahun','abebe','1999-05-05','F','0998765432','kasa@gmail.com','addis ababa','4600',0,0),(9,'kasahun','abebe','1999-05-05','F','0998765432','kasa@gmail.com','addis ababa','4600',0,0),(10,'chala','ayalew','1987-06-06','M','0955555555','chala@gmail.com','chala town','3297',1,0),(11,'kebede','alemu','1985-01-01','M','0988888888','kebede@gmail.com','ambo','7753',0,0),(12,'netsanet','tsega','1975-04-04','F','0977777777','netsi@gmail.com','ambo','9817',0,0),(13,'haymi','getaneh','1980-05-03','F','0939893560','haymi@gmail.com','welenchiti','5169',0,0),(14,'senay','hunegnaw','1985-03-04','M','0911111111','senay@gmail.com','arbaminch','0656',0,0),(15,'mintesnot','ertibu','1990-04-05','M','0988997678','mente@gmail.com','addis ababa','3530',0,0),(16,'tadese','kebede','1980-01-01','M','0912345678','tadese@gmail.com','addis ababa','6866',0,0),(17,'meseret','abate','1970-01-01','F','0914785236','mesi@gmail.com','addis ababa','4568',1,0);
/*!40000 ALTER TABLE `Driver` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Driver_Program`
--

DROP TABLE IF EXISTS `Driver_Program`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Driver_Program` (
  `Did` int NOT NULL,
  `Pid` int NOT NULL,
  PRIMARY KEY (`Did`),
  KEY `Pid` (`Pid`),
  CONSTRAINT `Driver_Program_ibfk_1` FOREIGN KEY (`Did`) REFERENCES `Driver` (`Did`),
  CONSTRAINT `Driver_Program_ibfk_2` FOREIGN KEY (`Pid`) REFERENCES `Program` (`Pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Driver_Program`
--

LOCK TABLES `Driver_Program` WRITE;
/*!40000 ALTER TABLE `Driver_Program` DISABLE KEYS */;
INSERT INTO `Driver_Program` VALUES (6,1),(10,1),(11,1),(7,2),(8,3),(12,3),(14,3),(15,3),(16,3),(17,3),(9,4),(13,4);
/*!40000 ALTER TABLE `Driver_Program` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Hospital`
--

DROP TABLE IF EXISTS `Hospital`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Hospital` (
  `Hid` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(30) NOT NULL,
  `Phone` varchar(15) NOT NULL,
  `Email` varchar(40) DEFAULT NULL,
  `Address` varchar(20) NOT NULL,
  `Pass` varchar(30) NOT NULL,
  PRIMARY KEY (`Hid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Hospital`
--

LOCK TABLES `Hospital` WRITE;
/*!40000 ALTER TABLE `Hospital` DISABLE KEYS */;
INSERT INTO `Hospital` VALUES (2,'beijing','0900026618','beijing@gmail.com','addis ababa','1234');
/*!40000 ALTER TABLE `Hospital` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Hospital_Driver_2`
--

DROP TABLE IF EXISTS `Hospital_Driver_2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Hospital_Driver_2` (
  `Hid` int NOT NULL,
  `Did` int NOT NULL,
  `Exam_Date` date NOT NULL,
  `General_Status` char(1) NOT NULL,
  `Blood_Type` varchar(5) NOT NULL,
  PRIMARY KEY (`Did`),
  KEY `Hid` (`Hid`),
  CONSTRAINT `Hospital_Driver_2_ibfk_1` FOREIGN KEY (`Hid`) REFERENCES `Hospital` (`Hid`),
  CONSTRAINT `Hospital_Driver_2_ibfk_2` FOREIGN KEY (`Did`) REFERENCES `Driver` (`Did`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Hospital_Driver_2`
--

LOCK TABLES `Hospital_Driver_2` WRITE;
/*!40000 ALTER TABLE `Hospital_Driver_2` DISABLE KEYS */;
INSERT INTO `Hospital_Driver_2` VALUES (2,6,'0006-07-15','P','A+'),(2,7,'0007-08-15','P','B-'),(2,8,'2022-01-01','F','B-'),(2,10,'2022-01-01','P','O-'),(2,17,'0006-07-15','P','A+');
/*!40000 ALTER TABLE `Hospital_Driver_2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Program`
--

DROP TABLE IF EXISTS `Program`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Program` (
  `Pid` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(30) NOT NULL,
  PRIMARY KEY (`Pid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Program`
--

LOCK TABLES `Program` WRITE;
/*!40000 ALTER TABLE `Program` DISABLE KEYS */;
INSERT INTO `Program` VALUES (1,'Motor'),(2,'Public'),(3,'Liquid Load'),(4,'Dry Load');
/*!40000 ALTER TABLE `Program` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Program_Course`
--

DROP TABLE IF EXISTS `Program_Course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Program_Course` (
  `Pid` int NOT NULL,
  `Cid` int NOT NULL,
  KEY `Pid` (`Pid`),
  KEY `Cid` (`Cid`),
  CONSTRAINT `Program_Course_ibfk_1` FOREIGN KEY (`Pid`) REFERENCES `Program` (`Pid`),
  CONSTRAINT `Program_Course_ibfk_2` FOREIGN KEY (`Cid`) REFERENCES `Course` (`Cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Program_Course`
--

LOCK TABLES `Program_Course` WRITE;
/*!40000 ALTER TABLE `Program_Course` DISABLE KEYS */;
INSERT INTO `Program_Course` VALUES (1,1),(1,2),(1,3),(1,4),(1,5),(1,6),(2,1),(2,2),(2,3),(2,4),(2,6),(2,7),(2,9),(3,1),(3,2),(3,3),(3,4),(3,8),(3,9),(4,1),(4,2),(4,3),(4,4),(4,9);
/*!40000 ALTER TABLE `Program_Course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `School`
--

DROP TABLE IF EXISTS `School`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `School` (
  `Sid` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(30) NOT NULL,
  `Phone` varchar(15) NOT NULL,
  `Email` varchar(40) DEFAULT NULL,
  `Address` varchar(20) NOT NULL,
  `Pass` varchar(30) NOT NULL,
  PRIMARY KEY (`Sid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `School`
--

LOCK TABLES `School` WRITE;
/*!40000 ALTER TABLE `School` DISABLE KEYS */;
INSERT INTO `School` VALUES (1,'Meri','0939893560','meri@gmail.com','Addis Ababa','4321');
/*!40000 ALTER TABLE `School` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `School_Driver`
--

DROP TABLE IF EXISTS `School_Driver`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `School_Driver` (
  `Sid` int NOT NULL,
  `Did` int NOT NULL,
  `Start_Date` date NOT NULL,
  `End_Date` date DEFAULT NULL,
  KEY `Sid` (`Sid`),
  KEY `Did` (`Did`),
  CONSTRAINT `School_Driver_ibfk_1` FOREIGN KEY (`Sid`) REFERENCES `School` (`Sid`),
  CONSTRAINT `School_Driver_ibfk_2` FOREIGN KEY (`Did`) REFERENCES `Driver` (`Did`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `School_Driver`
--

LOCK TABLES `School_Driver` WRITE;
/*!40000 ALTER TABLE `School_Driver` DISABLE KEYS */;
INSERT INTO `School_Driver` VALUES (1,4,'2022-10-28',NULL),(1,5,'2022-10-28',NULL),(1,6,'2022-10-28','2022-04-04'),(1,7,'2022-10-28','2022-04-04'),(1,8,'2022-10-28','2021-06-30'),(1,9,'2022-10-28','2022-06-30'),(1,10,'2022-10-31',NULL),(1,11,'2022-10-31',NULL),(1,12,'2022-10-31',NULL),(1,13,'2022-10-31',NULL),(1,14,'2022-10-31',NULL),(1,15,'2022-10-31',NULL),(1,16,'2022-11-02',NULL),(1,17,'2022-11-20','2022-03-03');
/*!40000 ALTER TABLE `School_Driver` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Trainer`
--

DROP TABLE IF EXISTS `Trainer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Trainer` (
  `Tid` int NOT NULL AUTO_INCREMENT,
  `FName` varchar(50) NOT NULL,
  `LName` varchar(50) NOT NULL,
  `DOB` date NOT NULL,
  `Sex` char(1) NOT NULL,
  `Phone` varchar(15) NOT NULL,
  `Email` varchar(40) DEFAULT NULL,
  `Address` varchar(20) NOT NULL,
  `Pass` varchar(30) NOT NULL,
  PRIMARY KEY (`Tid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Trainer`
--

LOCK TABLES `Trainer` WRITE;
/*!40000 ALTER TABLE `Trainer` DISABLE KEYS */;
INSERT INTO `Trainer` VALUES (1,'Imran','Mohammed','2001-05-15','M','0939893560','imran@gmail.com','Addis Ababa','1234'),(2,'Feysel','Mohammed','2000-01-01','M','0912345678','feysel@gmail.com','Jimma','4321'),(3,'Emnetsion','Aynalem','2000-05-04','F','0960453423','tsi@gmail.com','Debre Birhan','121921'),(4,'chris','tantu','2000-05-04','F','0960453423','chris@gmail.com','hawasa','121921'),(5,'hawi','tulu','2000-05-04','F','0960453423','hawi@gmail.com','adama','121921'),(6,'chris','tantu','2000-05-04','F','0960453423','chris@gmail.com','hawasa','121921'),(7,'hawi','tulu','2000-05-04','F','0960453423','hawi@gmail.com','adama','121921');
/*!40000 ALTER TABLE `Trainer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Trainer_Course`
--

DROP TABLE IF EXISTS `Trainer_Course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Trainer_Course` (
  `Tid` int NOT NULL,
  `Cid` int NOT NULL,
  KEY `Tid` (`Tid`),
  KEY `Cid` (`Cid`),
  CONSTRAINT `Trainer_Course_ibfk_1` FOREIGN KEY (`Tid`) REFERENCES `Trainer` (`Tid`),
  CONSTRAINT `Trainer_Course_ibfk_2` FOREIGN KEY (`Cid`) REFERENCES `Course` (`Cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Trainer_Course`
--

LOCK TABLES `Trainer_Course` WRITE;
/*!40000 ALTER TABLE `Trainer_Course` DISABLE KEYS */;
INSERT INTO `Trainer_Course` VALUES (1,1),(1,2),(1,3),(1,4),(1,5),(1,6),(1,7),(1,8),(1,9);
/*!40000 ALTER TABLE `Trainer_Course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Trainer_Driver_2`
--

DROP TABLE IF EXISTS `Trainer_Driver_2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Trainer_Driver_2` (
  `Tid` int DEFAULT NULL,
  `Did` int NOT NULL,
  `Cid` int NOT NULL,
  `Grade` float DEFAULT '0',
  `Training_Date` date DEFAULT NULL,
  PRIMARY KEY (`Did`,`Cid`),
  KEY `Tid` (`Tid`),
  KEY `Cid` (`Cid`),
  CONSTRAINT `Trainer_Driver_2_ibfk_1` FOREIGN KEY (`Tid`) REFERENCES `Trainer` (`Tid`),
  CONSTRAINT `Trainer_Driver_2_ibfk_2` FOREIGN KEY (`Did`) REFERENCES `Driver` (`Did`),
  CONSTRAINT `Trainer_Driver_2_ibfk_3` FOREIGN KEY (`Cid`) REFERENCES `Course` (`Cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Trainer_Driver_2`
--

LOCK TABLES `Trainer_Driver_2` WRITE;
/*!40000 ALTER TABLE `Trainer_Driver_2` DISABLE KEYS */;
INSERT INTO `Trainer_Driver_2` VALUES (1,6,1,60,'2022-01-01'),(1,6,2,75,'2022-01-01'),(1,6,3,70,'2022-01-01'),(1,6,4,80,'2022-01-01'),(1,6,5,75,'2022-01-01'),(1,6,6,80.5,'2022-01-01'),(1,7,1,75,'2022-01-01'),(1,7,2,75,'2022-01-01'),(1,7,3,75,'2022-01-01'),(1,7,4,75,'2022-01-01'),(1,7,6,75,'2022-01-01'),(1,7,7,75,'2022-01-01'),(1,7,9,75,'2022-01-01'),(1,10,1,NULL,NULL),(1,10,2,NULL,NULL),(1,10,3,NULL,NULL),(1,10,4,NULL,NULL),(1,10,5,NULL,NULL),(1,10,6,NULL,NULL),(1,17,1,60,'2022-01-01'),(1,17,2,60,'2022-01-01'),(1,17,3,80,'2022-01-01'),(1,17,4,85,'2022-01-01'),(1,17,8,85,'2022-01-01'),(1,17,9,90,'2022-01-01');
/*!40000 ALTER TABLE `Trainer_Driver_2` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-21 22:50:51
