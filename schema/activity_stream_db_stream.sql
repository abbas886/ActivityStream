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
-- Table structure for table `stream`
--

DROP TABLE IF EXISTS `stream`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stream` (
  `id` int(11) NOT NULL,
  `parent_id` varchar(20) DEFAULT NULL,
  `sender_id` varchar(20) DEFAULT NULL,
  `posted_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `stream_type` varchar(20) NOT NULL,
  `tag` varchar(20) NOT NULL,
  `message` varchar(200) DEFAULT NULL,
  `receiver_id` varchar(20) DEFAULT NULL,
  `circle_id` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stream`
--

LOCK TABLES `stream` WRITE;
/*!40000 ALTER TABLE `stream` DISABLE KEYS */;
INSERT INTO `stream` VALUES (0,NULL,'Dinesh','2017-05-26 12:14:58','','','',NULL,''),(370,NULL,'swamy','2017-05-20 13:55:03','String','Message','Copying to user home from all circles?-1','Dinesh',NULL),(2783,NULL,'Dinesh','2017-05-19 15:27:08','String','Message','Hello From Stackrout','Dinesh',NULL),(3121,NULL,'Dinesh','2017-05-19 16:05:19','String','Message','Hello From Stackrout','Dinesh',NULL),(3410,NULL,'swamy','2017-05-20 11:49:41','String','Message','Copying to user home from all circles?-1','Dinesh',NULL),(4935,NULL,'Dinesh','2017-05-20 00:00:00','String','Message','Copying to user home from single circle?-1','Farooq',NULL),(5554,NULL,'Dinesh','2017-05-20 11:49:43','String','Message','Copying to user home from individual-1','Dinesh',NULL),(5706,NULL,'Dinesh','2017-05-20 11:14:37','String','Message','Copying to user home from single circle?','Farooq',NULL),(6382,NULL,'Dinesh','2017-05-20 11:47:52','String','Message','Copying to user home from individual','Dinesh',NULL),(7271,NULL,'swamy','2017-05-20 13:42:38','String','Message','Copying to user home from all circles?-1','Dinesh',NULL),(11414,NULL,'Dinesh','2017-05-19 15:29:59','String','Message','Hello From Stackrout','Dinesh',NULL),(11818,NULL,'Dinesh','2017-05-19 15:52:19','String','Message','Hello From Stackrout','Dinesh',NULL),(13909,NULL,'Dinesh','2017-05-19 15:28:44','String','Message','Hello From Stackrout','Farooq',NULL),(14175,NULL,'Dinesh','2017-05-20 13:50:13','String','Message','Copying to user home from single circle?-1','Farooq',NULL),(15201,NULL,'swamy','2017-05-20 13:57:44','String','Message','Copying to user home from all circles?-1','Dinesh',NULL),(16301,NULL,'Dinesh','2017-05-20 00:00:00','String','Message','Copying to user home from individual-1','Dinesh',NULL),(16832,NULL,'swamy','2017-05-20 13:50:12','String','Message','Copying to user home from all circles?-1','Dinesh',NULL),(16877,NULL,'swamy','2017-05-20 14:50:30','String','Message','Copying to user home from all circles?-1','Dinesh',NULL),(19093,NULL,'Dinesh','2017-05-19 15:35:30','String','Message','Hello From Stackrout','Dinesh',NULL),(19375,NULL,'Dinesh','2017-05-20 11:34:32','String','Message','Copying to user home from single circle?','Farooq',NULL),(34212,NULL,'Dinesh','2017-05-20 13:55:05','String','Message','Copying to user home from individual-1','Dinesh',NULL),(34574,NULL,'swamy','2017-05-22 15:26:44','String','Message','Copying to user home from all circles?-1','Dinesh',NULL),(34937,NULL,'Dinesh','2017-05-20 00:00:00','String','Message','Copying to user home from individual-1','Dinesh',NULL),(43224,NULL,'Dinesh','2017-05-20 13:41:08','String','Message','Copying to user home from individual-1','Dinesh',NULL),(43329,NULL,'Dinesh','2017-05-22 15:26:45','String','Message','Copying to user home from individual-1','Dinesh',NULL),(44286,NULL,'Dinesh','2017-05-19 15:56:48','String','Message','Hello From Stackrout','Dinesh',NULL),(44558,NULL,'Dinesh','2017-05-19 15:27:06','String','Message','Hello From Stackrout','Farooq',NULL),(45058,NULL,'Dinesh','2017-05-20 13:55:05','String','Message','Copying to user home from single circle?-1','Farooq',NULL),(46420,NULL,'Dinesh','2017-05-20 14:50:32','String','Message','Copying to user home from individual-1','Dinesh',NULL),(47494,NULL,'Dinesh','2017-05-19 15:24:58','String','Message','Hello From Stackrout','Dinesh',NULL),(47940,NULL,'Dinesh','2017-05-19 15:24:58','String','Message','Hello From Stackrout','Farooq',NULL),(48025,NULL,'Dinesh','2017-05-20 13:41:08','String','Message','Copying to user home from single circle?-1','Farooq',NULL),(49135,NULL,'Dinesh','2017-05-20 11:47:51','String','Message','Copying to user home from single circle?','Farooq',NULL),(49282,NULL,'Dinesh','2017-05-20 11:11:22','String','Message','Hello From Stackrout','Dinesh',NULL),(50030,NULL,'Dinesh',NULL,'String','Message','Copying to user home from individual-1','Dinesh',NULL),(50600,NULL,'Dinesh','2017-05-22 15:26:45','String','Message','Copying to user home from single circle?-1','Farooq',NULL),(52520,NULL,'Dinesh','2017-05-20 11:14:37','String','Message','Copying to user home from individual','Dinesh',NULL),(53538,NULL,'Dinesh','2017-05-20 11:49:43','String','Message','Copying to user home from single circle?-1','Farooq',NULL),(53546,NULL,'swamy','2017-05-20 13:40:09','String','Message','Copying to user home from all circles?-1','Dinesh',NULL),(54641,NULL,'Dinesh',NULL,'String','Message','Copying to user home from single circle?-1','Farooq',NULL),(58742,NULL,'Dinesh','2017-05-20 13:58:29','String','Message','Copying to user home from individual-1','Dinesh',NULL),(60137,NULL,'Dinesh','2017-05-20 13:55:55','String','Message','Copying to user home from single circle?-1','Farooq',NULL),(60915,NULL,'swamy',NULL,'String','Message','Copying to user home from all circles?-1','Dinesh',NULL),(63051,NULL,'Dinesh','2017-05-20 11:34:33','String','Message','Copying to user home from individual','Dinesh',NULL),(63383,NULL,'swamy','2017-05-20 11:14:36','String','Message','Copying to user home from all circles?','Dinesh',NULL),(66053,NULL,'swamy','2017-05-20 11:34:32','String','Message','Copying to user home from all circles?','Dinesh',NULL),(67220,NULL,'Dinesh','2017-05-20 14:50:32','String','Message','Copying to user home from single circle?-1','Farooq',NULL),(67995,NULL,'swamy','2017-05-20 13:55:55','String','Message','Copying to user home from all circles?-1','Dinesh',NULL),(70036,NULL,'Dinesh','2017-05-20 11:27:46','String','Message','Copying to user home from individual','Dinesh',NULL),(72909,NULL,'swamy','2017-05-20 00:00:00','String','Message','Copying to user home from all circles?-1','Dinesh',NULL),(73146,NULL,'Dinesh','2017-05-19 15:28:44','String','Message','Hello From Stackrout','Farooq',NULL),(73713,NULL,'swamy','2017-05-20 00:00:00','String','Message','Copying to user home from all circles?-1','Dinesh',NULL),(75587,NULL,'Dinesh','2017-05-20 00:00:00','String','Message','Copying to user home from single circle?-1','Farooq',NULL),(78277,NULL,'Dinesh','2017-05-26 11:04:06','String','Message','Copying to user home from single circle?-1','Farooq',NULL),(78905,NULL,'Dinesh','2017-05-20 13:43:59','String','Message','Copying to user home from single circle?-1','Farooq',NULL),(81007,NULL,'Dinesh','2017-05-19 15:29:58','String','Message','Hello From Stackrout','Farooq',NULL),(81873,NULL,'swamy','2017-05-20 11:27:46','String','Message','Copying to user home from all circles?','Dinesh',NULL),(84705,NULL,'Dinesh','2017-05-19 15:48:19','String','Message','Hello From Stackrout','Dinesh',NULL),(85366,NULL,'Dinesh','2017-05-19 15:28:44','String','Message','Hello From Stackrout','Dinesh',NULL),(87207,NULL,'swamy','2017-05-20 11:47:51','String','Message','Copying to user home from all circles?','Dinesh',NULL),(88544,NULL,'swamy','2017-05-26 11:04:05','String','Message','Copying to user home from all circles?-1','Dinesh',NULL),(90004,NULL,'Dinesh','2017-05-20 13:43:59','String','Message','Copying to user home from individual-1','Dinesh',NULL),(90698,NULL,'Dinesh','2017-05-20 13:55:55','String','Message','Copying to user home from individual-1','Dinesh',NULL),(91580,NULL,'Dinesh','2017-05-20 11:27:46','String','Message','Copying to user home from single circle?','Farooq',NULL),(91823,NULL,'Dinesh','2017-05-26 11:04:06','String','Message','Copying to user home from individual-1','Dinesh',NULL),(92820,NULL,'Dinesh','2017-05-20 13:50:13','String','Message','Copying to user home from individual-1','Dinesh',NULL),(94340,NULL,'Dinesh','2017-05-19 15:24:57','String','Message','Hello From Stackrout','Farooq',NULL),(94406,NULL,'Dinesh','2017-05-19 15:50:45','String','Message','Hello From Stackrout','Dinesh',NULL),(98622,NULL,'Dinesh','2017-05-19 15:27:07','String','Message','Hello From Stackrout','Farooq',NULL),(98836,NULL,'Dinesh','2017-05-20 13:58:29','String','Message','Copying to user home from single circle?-1','Farooq',NULL),(161327,NULL,'Dinesh','2017-05-26 16:00:04','String','Message','Hello From Dinesh 123',NULL,''),(248052,NULL,'Abbas','2017-05-26 16:31:08','String','Message','Hello to Gitlab Circle From Abbas',NULL,''),(498439,NULL,'Abbas','2017-05-26 16:32:01','String','Message','gitlab',NULL,''),(931236,NULL,'Dinesh','2017-05-26 12:36:12','String','Message','Hello From Dinesh2',NULL,''),(987630,NULL,'Abbas','2017-05-26 16:33:12','String','Message','Hello To Gitlab circle from Abbas -2',NULL,'gitlab');
/*!40000 ALTER TABLE `stream` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-30 16:35:50
