-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: uptodate
-- ------------------------------------------------------
-- Server version	5.5.53

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
-- Table structure for table `appointment`
--

DROP TABLE IF EXISTS `appointment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `appointment` (
  `appointment_id` int(11) NOT NULL AUTO_INCREMENT,
  `doc_id` int(11) NOT NULL,
  `pat_id` varchar(45) NOT NULL,
  `appointment_time` varchar(45) NOT NULL,
  `appointment_date` varchar(45) NOT NULL,
  `doc_full_name` varchar(45) NOT NULL,
  `patient_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`appointment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appointment`
--

LOCK TABLES `appointment` WRITE;
/*!40000 ALTER TABLE `appointment` DISABLE KEYS */;
/*!40000 ALTER TABLE `appointment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `doctor` (
  `doc_id` int(11) NOT NULL,
  `doc_first_name` varchar(20) NOT NULL,
  `doc_last_name` varchar(20) NOT NULL,
  `doc_email_id` varchar(50) NOT NULL,
  `doc_password` varchar(20) NOT NULL,
  PRIMARY KEY (`doc_email_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor`
--

LOCK TABLES `doctor` WRITE;
/*!40000 ALTER TABLE `doctor` DISABLE KEYS */;
INSERT INTO `doctor` VALUES (1,'Nilam','Teli','dr.nilam@rediff.com','nilaM11@'),(2,'Sudhir','Mishra','sudhir.sudhir@gmail.com','#Sirduh2000'),(3,'Hiloni','Premani','hiloni_dr@yahoo.co.in','cardIAC@1'),(4,'Amit','Vyas','123amit@rediff.com','mIt!0123'),(5,'Rishab','Vekaria','ri_shab@yahoo.co.in','riSHab@99'),(6,'Sima','Modi','dr.sima@gmail.com','mAci##12'),(7,'Ananya','Patel','ananya_patel@gmail.com','ananY7@@'),(8,'Nikita','Parmar','nikita_par1@rediff.com','kiTTy00%'),(9,'Vedant','Shukla','vedant@gmail.com','VEDant%321'),(10,'Gokul','Pandey','gokul@yahoo.com','kOOl%4OO'),(11,'Neha','Mishra','neeeha_789@gmail.com','Eneh@!567'),(12,'Ajeet','Singh','ajeetsingh@rediff.com','jEEtE!987'),(13,'Sunil','Shukla','shukla_dr@rediff.com','niiL%7654@'),(14,'Lily','Shah','shah_lily@yahoo.co.in','liliY!123'),(15,'Kavya','Fernandeez','kavya_audio@yahoo.com','Fernan123%#'),(16,'Avinash','Gupta','avi@gmail.com','Avi%aVI2'),(17,'Niharika','Singh','niharika_singh@yahoo.com','Nihari@ka00'),(18,'Ayushi','Tarpara','ayu_shi_55@gmail.com','Ayu%%#123'),(19,'Jatin','Makhiwala','makhiwala_6@rediff.com','!!inJAt23'),(20,'Tanu','Tank','tank@gmail.com','tanKy@123'),(21,'Raghav','Doshi','raghu_9@gmail.com','Raghu@123'),(22,'Suhani','Patel','suhani@yahoo.com','niHaSu%456'),(23,'Ahista','Mehtar','ahista_mehtar@rediff.com','Ahista@987'),(24,'Karan','Dhilon','karan_dhilon@gmail.com','Karan!!@23'),(25,'Aditya','Rao','adi_123@yahoo.com','Aadi%%987');
/*!40000 ALTER TABLE `doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient`
--

DROP TABLE IF EXISTS `patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `patient` (
  `pat_id` int(11) NOT NULL AUTO_INCREMENT,
  `unique_id` varchar(555) NOT NULL,
  `pat_first_name` varchar(20) NOT NULL,
  `pat_last_name` varchar(20) NOT NULL,
  `pat_mobile_number` varchar(10) NOT NULL,
  `pat_email_id` varchar(50) NOT NULL,
  `pat_password` varchar(20) NOT NULL,
  PRIMARY KEY (`pat_id`)
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient`
--

LOCK TABLES `patient` WRITE;
/*!40000 ALTER TABLE `patient` DISABLE KEYS */;
INSERT INTO `patient` VALUES (2,'20160518092926','Shivangi','Khandelwal','9824569874','shivu@gmail.com','!Shiv!143'),(3,'20160518093713','Mayank','Mehta','8899654125','mehtasons@gmail.com','sunsMyank10#'),(4,'20160518094052','Nitin','Kapoor','9975489656','nitink@yahoo.com','24niNin%'),(5,'20160518094548','Anirudh','Thakkar','7876599977','kr.anirudh@gmail.com','!!2Ao%#%'),(6,'20160518095011','Mahima','Chatterjee','9854785698','mahima1204@yahoo.com','04CchC@12'),(7,'20160518095432','Nisha','Ukani','8866548974','ukaniholders@rediff.com','INAKu55!'),(8,'20160518095732','Siddharath','Shah','9984578210','sid10@yahoo.co.in','10SsIiDd@@'),(9,'20160518100222','Sachin','Mehra','8798100025','sachin_mehra@rediff.com','mehRa5@1'),(10,'20160518101324','Siya','Dobriyal','7848586899','siya99@yahoo.com','5neMis!%');
/*!40000 ALTER TABLE `patient` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-06 17:27:29
