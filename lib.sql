CREATE DATABASE  IF NOT EXISTS `librarysarvelet` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `librarysarvelet`;
-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: librarysarvelet
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bookclassification`
--

DROP TABLE IF EXISTS `bookclassification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `bookclassification` (
  `bookClassificationId` int(11) NOT NULL,
  `subClassificationId` varchar(45) DEFAULT NULL,
  `bookId` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`bookClassificationId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bookclassification`
--

LOCK TABLES `bookclassification` WRITE;
/*!40000 ALTER TABLE `bookclassification` DISABLE KEYS */;
/*!40000 ALTER TABLE `bookclassification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bookdetails`
--

DROP TABLE IF EXISTS `bookdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `bookdetails` (
  `bookId` varchar(20) NOT NULL,
  `title` varchar(45) NOT NULL,
  `author` varchar(45) NOT NULL,
  `mainClassification` varchar(45) NOT NULL,
  `subClassification` varchar(45) NOT NULL,
  `yearOfPublishing` varchar(45) NOT NULL,
  `lastPrintedYear` varchar(45) NOT NULL,
  `isbnNo` varchar(45) NOT NULL,
  `noOfPages` varchar(45) NOT NULL,
  PRIMARY KEY (`bookId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bookdetails`
--

LOCK TABLES `bookdetails` WRITE;
/*!40000 ALTER TABLE `bookdetails` DISABLE KEYS */;
INSERT INTO `bookdetails` VALUES ('','','','','','','','',''),('1a','sgh','sdd','null','null','2001','2009','s23','12'),('hdw','dwedwed','sis','null','null','2001','2009','121213','3'),('hdwghjw','dwedwed','dwedwedw','null','null','2001','2009','s25','3');
/*!40000 ALTER TABLE `bookdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mainclassification`
--

DROP TABLE IF EXISTS `mainclassification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `mainclassification` (
  `mainClassificationId` varchar(11) NOT NULL,
  `mainClassification` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`mainClassificationId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mainclassification`
--

LOCK TABLES `mainclassification` WRITE;
/*!40000 ALTER TABLE `mainclassification` DISABLE KEYS */;
INSERT INTO `mainclassification` VALUES ('',''),('1','science'),('2','arts'),('3','commerce'),('4','low');
/*!40000 ALTER TABLE `mainclassification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subclassification`
--

DROP TABLE IF EXISTS `subclassification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `subclassification` (
  `subClassificationId` varchar(45) NOT NULL,
  `subClassification` varchar(45) NOT NULL,
  `mainClassificationId` varchar(45) NOT NULL,
  PRIMARY KEY (`subClassificationId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subclassification`
--

LOCK TABLES `subclassification` WRITE;
/*!40000 ALTER TABLE `subclassification` DISABLE KEYS */;
INSERT INTO `subclassification` VALUES ('','',''),('1','csc','1'),('2','bio','1'),('3','dance','2'),('4','music','2'),('5','busniess','3'),('6','accounts','3'),('7','civil','4'),('8','crime','4');
/*!40000 ALTER TABLE `subclassification` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-21 18:13:16
