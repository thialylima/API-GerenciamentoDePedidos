CREATE DATABASE  IF NOT EXISTS `desafio1` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `desafio1`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: desafio1
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `customer_order`
--

DROP TABLE IF EXISTS `customer_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer_order` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `codigo_cliente` int DEFAULT NULL,
  `data_cadastro` datetime(6) DEFAULT NULL,
  `nome_produto` varchar(255) DEFAULT NULL,
  `numero_controle` varchar(255) DEFAULT NULL,
  `quantidade` int DEFAULT NULL,
  `valor_un` double DEFAULT NULL,
  `valor_total` double DEFAULT NULL,
  `valor_desconto` double DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKhwak452ck92r6ag9yd18iw46f` (`numero_controle`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_order`
--

LOCK TABLES `customer_order` WRITE;
/*!40000 ALTER TABLE `customer_order` DISABLE KEYS */;
INSERT INTO `customer_order` VALUES (1,1,'2024-08-07 14:32:39.419000','Pipo\'s Cachorro Quente','001',25,2.77,69.25,62.33),(2,2,'2024-08-06 14:31:46.169000','Desinfetante','002',7,18.3,128.1,121.69),(3,3,'2024-08-07 14:31:05.810000','Amaciante','003',13,36,468,421.2),(4,4,'2024-08-07 14:33:32.324000','Molho de tomate','004',30,7.84,235.2,211.68),(5,3,'2024-08-07 14:39:40.956000','Vodka','005',6,78.5,471,447.45),(6,4,'2024-08-07 16:25:04.511000','Monster Energético','006',2,10,20,20),(7,1,'2024-08-07 16:25:59.134000','Feijão Carioca','007',6,12.85,77.1,73.24),(8,2,'2024-08-07 16:27:54.305000','Desodorante Rexona','008',2,23,46,46),(9,1,'2024-08-07 16:29:06.130000','Sabonete Líquido Dove','009',6,15,90,85.5),(10,3,'2024-08-07 16:29:59.722000','Cerveja Heineken','010',15,8.56,128.4,115.56);
/*!40000 ALTER TABLE `customer_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'desafio1'
--

--
-- Dumping routines for database 'desafio1'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-08-07 16:40:13
