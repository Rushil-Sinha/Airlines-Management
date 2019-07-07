-- MySQL dump 10.13  Distrib 5.1.73, for Win32 (ia32)
--
-- Host: localhost    Database: airport
-- ------------------------------------------------------
-- Server version	5.1.73-community

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
-- Table structure for table `bookings`
--

DROP TABLE IF EXISTS `bookings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bookings` (
  `b_id` char(5) NOT NULL DEFAULT '',
  `p_name` varchar(20) DEFAULT NULL,
  `category` varchar(10) DEFAULT NULL,
  `f_name` varchar(20) DEFAULT NULL,
  `source` varchar(20) DEFAULT NULL,
  `destination` varchar(20) DEFAULT NULL,
  `f_no` char(4) DEFAULT NULL,
  `cabin` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`b_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bookings`
--

LOCK TABLES `bookings` WRITE;
/*!40000 ALTER TABLE `bookings` DISABLE KEYS */;
INSERT INTO `bookings` VALUES ('10000','ravi','Adult','Sahara','Kolkata','Mumbai','1001','Economy'),('10001','Rushil','Children','JetAirways','PATNA','DELHI','6554','First Class'),('10002','Seema','Adult','Sahara','BANGALORE','PONDICHERRY','1001','Premium Economy'),('10004','Avneesha','Youth','Kingfisher','DELHI','JAIPUR','3452','First Class'),('10005','Avneesha','Youth','Kingfisher','MUMBAI','GOA','3467','First Class'),('10006','Aneesh','Youth','JetAirways','PATNA','DELHI','6554','Economy'),('10007','Aneesh','Youth','AirIndia','DELHI','MUMBAI','7763','Economy');
/*!40000 ALTER TABLE `bookings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `check_flights`
--

DROP TABLE IF EXISTS `check_flights`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `check_flights` (
  `F_no` char(4) NOT NULL,
  `F_name` varchar(20) DEFAULT NULL,
  `Source` varchar(20) DEFAULT NULL,
  `Destination` varchar(20) DEFAULT NULL,
  `Arrival` decimal(8,2) DEFAULT NULL,
  `Departure` decimal(8,2) DEFAULT NULL,
  `Fare` decimal(8,2) DEFAULT NULL,
  PRIMARY KEY (`F_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `check_flights`
--

LOCK TABLES `check_flights` WRITE;
/*!40000 ALTER TABLE `check_flights` DISABLE KEYS */;
INSERT INTO `check_flights` VALUES ('1001','SAHARA','BANGALORE','PONDICHERRY','1.00','4.40','11300.00'),('3452','KINGFISHER','DELHI','JAIPUR','10.10','12.10','5670.00'),('3467','KINGFISHER','MUMBAI','GOA','11.00','13.10','3900.00'),('4598','GOAIR','BANGALORE','MUMBAI','13.25','15.50','4600.00'),('5687','AIRINDIA','CHENNAI','GOA','7.55','9.10','6700.00'),('6554','JETAIRWAYS','PATNA','DELHI','11.35','14.50','7000.00'),('6887','INDIGO','CHENNAI','BANGALORE','10.05','12.10','4550.00'),('7444','SPICEJET','KOLKATA','DELHI','2.15','4.50','4500.00'),('7763','AIRINDIA','DELHI','MUMBAI','21.45','23.50','3500.00'),('8292','EITHAD_AIRWAYS','KOLKATA','MUMBAI','12.35','14.50','9800.00'),('8892','INDIGO','CHENNAI','DELHI','6.15','10.50','7700.00'),('9765','SPICEJET','GOA','DELHI','14.00','16.20','5900.00'),('9898','AIRINDIA','MUMBAI','CHENNAI','20.20','23.10','7400.00');
/*!40000 ALTER TABLE `check_flights` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `user_id` varchar(10) NOT NULL,
  `password` varchar(15) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `email_id` varchar(50) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `phone_number` char(10) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('aneesh','aneesh','Aneesh','aneeshcr@gmail.com','2001-10-06','8893658232'),('appy','apurva','Apurva ','apurvaprakash03@gmail.com','2001-05-21','9897789126'),('Fahad','dutta','Fahad','fahaddutta345@gmaiil.com','1995-02-13','9926479212'),('kravi','kravi','Ravindra','call2kravindra@gmail.com','1982-09-12','9827184881'),('rush','rushil','Rushil ','rushilsinha35@gmail.com','2000-11-14','9693294927');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-07 18:33:18
