-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: workshop_db
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Table structure for table `workshop`
--

DROP TABLE IF EXISTS `workshop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `workshop` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `workshop_date` date DEFAULT NULL,
  `description` varchar(50) DEFAULT NULL,
  `category_id` int DEFAULT NULL,
  `created_by_id` int DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `created_by_id` (`created_by_id`),
  KEY `category_id` (`category_id`),
  CONSTRAINT `workshop_ibfk_1` FOREIGN KEY (`created_by_id`) REFERENCES `employee` (`id`),
  CONSTRAINT `workshop_ibfk_2` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `workshop`
--

LOCK TABLES `workshop` WRITE;
/*!40000 ALTER TABLE `workshop` DISABLE KEYS */;
INSERT INTO `workshop` VALUES (1,'solo song','2024-05-01','individuals sing a song',2,1,'2024-04-30'),(2,'duet dance','2024-05-02','two dancers to participate',2,1,'2024-04-30'),(3,'coding','2024-05-02','to improve coding skill',3,1,'2024-04-30'),(4,'web dev','2024-05-01','skill up web devolep',3,2,'2024-05-01'),(5,'lemon and spoon','2024-05-03','walk with lemon and spoon',1,2,'2024-05-01'),(6,'bitter gourd eating','2024-05-03','to eat maximum bitter gourd',1,3,'2024-05-01'),(11,'solo dance','2024-05-06','individual participation',2,2,'2024-05-03'),(12,'standup comedy','2024-05-06','to deliver humerous',2,2,'2024-05-03');
/*!40000 ALTER TABLE `workshop` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-07 15:12:58
