-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: gamble
-- ------------------------------------------------------
-- Server version	5.7.17-log

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
-- Table structure for table `source_login`
--

DROP TABLE IF EXISTS `source_login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `source_login` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `account` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `water` varchar(255) DEFAULT NULL,
  `source` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `source_login`
--

LOCK TABLES `source_login` WRITE;
/*!40000 ALTER TABLE `source_login` DISABLE KEYS */;
INSERT INTO `source_login` VALUES (17,'DD51126','2017-02-09 16:04:14','','aaa666','http://ag.td111.net','96','TX_A'),(18,'DD51170','2017-02-09 16:04:14','','aa88','http://ag.td111.net','96','TX_A'),(19,'KB67295','2017-02-09 16:04:14','','qaz123','','96','TX_M'),(20,'DD51167','2017-02-09 16:04:14','','aaa666','http://ag.td111.net','96','TX_A'),(21,'9DH575','2017-02-09 16:04:14','','aa1111','http://ag.td111.net','96','TX_A'),(22,'9DH511','2017-02-09 16:04:14','','aaa888','http://ag.td111.net','96','TX_A'),(23,'DD51706','2017-02-09 16:04:14','','aa88','http://ag.td111.net','96','TX_A'),(24,'DD51707','2017-02-09 16:04:14','','aa88','http://ag.td111.net','96','TX_A'),(25,'DD51159','2017-02-09 16:04:14','','aaa666','http://ag.td111.net','96','TX_A'),(26,'DD51759','2017-02-09 16:04:14','','aa88','http://ag.td111.net','96','TX_A'),(27,'DD51761','2017-02-09 16:04:14','','aa88','http://ag.td111.net','96','TX_A'),(28,'DD51762','2017-02-09 16:04:14','','aa88','http://ag.td111.net','96','TX_A'),(29,'DD51763','2017-02-09 16:04:14','','aa88','http://ag.td111.net','96','TX_A'),(30,'DD51765','2017-02-09 16:04:14','','aa88','http://ag.td111.net','96','TX_A'),(31,'avanet360','2017-02-09 16:04:14','','4321qaz','http://www.iwin168.us','null','PHA'),(32,'avanet720','2017-02-09 16:04:14','','4321qaz','http://www.iwin168.us','null','PHA');
/*!40000 ALTER TABLE `source_login` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-04-13 11:47:36
