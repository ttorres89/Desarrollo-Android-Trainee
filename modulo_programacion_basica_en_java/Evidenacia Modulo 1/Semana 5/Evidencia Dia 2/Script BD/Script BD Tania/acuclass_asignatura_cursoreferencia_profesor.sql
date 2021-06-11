-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: acuclass
-- ------------------------------------------------------
-- Server version	8.0.25

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
-- Table structure for table `asignatura_cursoreferencia_profesor`
--

DROP TABLE IF EXISTS `asignatura_cursoreferencia_profesor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asignatura_cursoreferencia_profesor` (
  `refLetraCurso` varchar(1) NOT NULL,
  `refAñoCurso` int NOT NULL,
  `refAsignatura` varchar(100) NOT NULL,
  `refCursoAsignatura` varchar(30) NOT NULL,
  `refProfesor` varchar(50) NOT NULL,
  KEY `refAsignatura` (`refAsignatura`,`refCursoAsignatura`),
  KEY `refLetraCurso` (`refLetraCurso`,`refAñoCurso`),
  KEY `refProfesor` (`refProfesor`),
  CONSTRAINT `asignatura_cursoreferencia_profesor_ibfk_1` FOREIGN KEY (`refAsignatura`, `refCursoAsignatura`) REFERENCES `asignatura` (`nombre`, `refCurso`),
  CONSTRAINT `asignatura_cursoreferencia_profesor_ibfk_2` FOREIGN KEY (`refLetraCurso`, `refAñoCurso`) REFERENCES `cursoreferencia` (`letra`, `año`),
  CONSTRAINT `asignatura_cursoreferencia_profesor_ibfk_3` FOREIGN KEY (`refProfesor`) REFERENCES `usuario` (`run`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-25 20:48:18
