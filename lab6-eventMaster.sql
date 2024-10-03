-- este script tiene 3 segmentos, para utilizarlo deben crear un schema de base de datos
-- ejecutar cada segmento por separado.
-- eventmaster.eventos definition

CREATE TABLE `eventos` (
  `eventoId` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `asistentesEsperados` int DEFAULT NULL,
  PRIMARY KEY (`eventoId`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- eventmaster.artistas definition

CREATE TABLE `artistas` (
  `artistaId` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  `genero` varchar(50) DEFAULT NULL,
  `telefono` varchar(9) DEFAULT NULL,
  PRIMARY KEY (`artistaId`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- eventmaster.eventos_artistas definition (relaciona eventos con artistas)

CREATE TABLE `eventos_artistas` (
  `eventoId` int NOT NULL,
  `artistaId` int NOT NULL,
  PRIMARY KEY (`eventoId`, `artistaId`),
  KEY `eventos_artistas_evento_FK` (`eventoId`),
  KEY `eventos_artistas_artista_FK` (`artistaId`),
  CONSTRAINT `eventos_artistas_evento_FK` FOREIGN KEY (`eventoId`) REFERENCES `eventos` (`eventoId`),
  CONSTRAINT `eventos_artistas_artista_FK` FOREIGN KEY (`artistaId`) REFERENCES `artistas` (`artistaId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
