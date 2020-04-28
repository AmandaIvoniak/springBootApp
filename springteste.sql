-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 28-Abr-2020 às 18:15
-- Versão do servidor: 10.1.36-MariaDB
-- versão do PHP: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `springteste`
--
CREATE DATABASE IF NOT EXISTS `springteste` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `springteste`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `class_table`
--

CREATE TABLE `class_table` (
  `id` int(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `teacher` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `class_table`
--

INSERT INTO `class_table` (`id`, `name`, `teacher`) VALUES
(15, 'Inglês', 'Jhon'),
(16, 'Português', 'Amanda'),
(17, 'Testes', 'Thomas');

-- --------------------------------------------------------

--
-- Estrutura da tabela `student_table`
--

CREATE TABLE `student_table` (
  `id` bigint(20) NOT NULL,
  `class_name` int(11) DEFAULT NULL,
  `student` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `student_table`
--

INSERT INTO `student_table` (`id`, `class_name`, `student`) VALUES
(17, 16, 'Jaqueline'),
(18, 15, 'Kleber'),
(19, 17, 'Ana'),
(20, 15, 'Vincent'),
(21, 15, 'Gustavo'),
(22, 15, 'Bruno'),
(23, 15, 'Júlia');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `class_table`
--
ALTER TABLE `class_table`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `student_table`
--
ALTER TABLE `student_table`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_Class_Student` (`class_name`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `class_table`
--
ALTER TABLE `class_table`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `student_table`
--
ALTER TABLE `student_table`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `student_table`
--
ALTER TABLE `student_table`
  ADD CONSTRAINT `id_Class_Student` FOREIGN KEY (`class_name`) REFERENCES `class_table` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
