-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: activity_stream_db
-- ------------------------------------------------------
-- Server version	5.7.13-log

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
-- Table structure for table `user_home`
--

DROP TABLE IF EXISTS `user_home`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_home` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) DEFAULT NULL,
  `sender_id` varchar(20) DEFAULT NULL,
  `circle_id` varchar(20) DEFAULT NULL,
  `posted_date` datetime DEFAULT NULL,
  `stream_type` varchar(20) DEFAULT NULL,
  `tag` varchar(20) DEFAULT NULL,
  `message` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_home`
--

LOCK TABLES `user_home` WRITE;
/*!40000 ALTER TABLE `user_home` DISABLE KEYS */;
INSERT INTO `user_home` VALUES (1,'Dinesh','swamy',NULL,'2017-05-22 15:26:44','String','Message','Copying to user home from all circles?-1'),(2,'Farooq','Dinesh',NULL,'2017-05-22 15:26:45','String','Message','Copying to user home from single circle?-1'),(3,'Dinesh','Dinesh',NULL,'2017-05-22 15:26:45','String','Message','Copying to user home from individual-1'),(4,'Dinesh','swamy',NULL,'2017-05-26 11:04:05','String','Message','Copying to user home from all circles?-1'),(5,'Farooq','Dinesh',NULL,'2017-05-26 11:04:06','String','Message','Copying to user home from single circle?-1'),(6,'Dinesh','Dinesh',NULL,'2017-05-26 11:04:06','String','Message','Copying to user home from individual-1'),(7,NULL,'Dinesh','','2017-05-26 12:14:58','','',''),(8,NULL,'Dinesh','','2017-05-26 12:36:12','String','Message','Hello From Dinesh2'),(9,NULL,'Dinesh','','2017-05-26 16:00:04','String','Message','Hello From Dinesh 123'),(10,NULL,'Abbas','','2017-05-26 16:31:08','String','Message','Hello to Gitlab Circle From Abbas'),(11,NULL,'Abbas','','2017-05-26 16:32:01','String','Message','gitlab'),(12,NULL,'Abbas','gitlab','2017-05-26 16:33:12','String','Message','Hello To Gitlab circle from Abbas -2');
/*!40000 ALTER TABLE `user_home` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-30 16:35:51
