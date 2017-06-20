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
-- Table structure for table `stream_circle`
--

DROP TABLE IF EXISTS `stream_circle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stream_circle` (
  `id` int(11) NOT NULL,
  `stream_id` varchar(20) DEFAULT NULL,
  `circle_id` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stream_circle`
--

LOCK TABLES `stream_circle` WRITE;
/*!40000 ALTER TABLE `stream_circle` DISABLE KEYS */;
INSERT INTO `stream_circle` VALUES (0,'81007','hobes'),(14850,'16832','hobes'),(27152,'67995','hobes'),(36610,'53546','hobes'),(40522,'73713','hobes'),(43981,'87207','hobes'),(46111,'81873','hobes'),(56753,'45058','gitlab'),(81341,'54641','gitlab'),(109345,'91580','gitlab'),(111375,'66053','hobes'),(131386,'60137','gitlab'),(141983,'7271','hobes'),(156396,'3410','hobes'),(173529,'53538','gitlab'),(193968,'5706','gitlab'),(200971,'370','hobes'),(217370,'98836','gitlab'),(244185,'48025','gitlab'),(246189,'60915','hobes'),(249117,'4935','gitlab'),(306915,'50600','gitlab'),(409802,'72909','hobes'),(531144,'15201','hobes'),(531302,'14175','gitlab'),(568079,'88544','hobes'),(649992,'34574','hobes'),(679698,'16877','hobes'),(749935,'19375','gitlab'),(802683,'49135','gitlab'),(839628,'78905','gitlab'),(941083,'75587','gitlab'),(945717,'78277','gitlab'),(954921,'67220','gitlab'),(987355,'63383','hobes');
/*!40000 ALTER TABLE `stream_circle` ENABLE KEYS */;
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
