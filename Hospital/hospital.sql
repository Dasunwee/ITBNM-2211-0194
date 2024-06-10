-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 30, 2022 at 01:24 PM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital`
--

-- --------------------------------------------------------

--
-- Table structure for table `channelling`
--

CREATE TABLE `channelling` (
  `Name` varchar(15) NOT NULL,
  `NIC` varchar(15) NOT NULL,
  `Clinic` varchar(45) NOT NULL,
  `Date` varchar(15) NOT NULL,
  `Time` varchar(10) NOT NULL,
  `Amount` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `channelling`
--

INSERT INTO `channelling` (`Name`, `NIC`, `Clinic`, `Date`, `Time`, `Amount`) VALUES
('balla', '321321', 'Eye Clinic', '25/12/2022', '1.00pm', 'Rs.1500');

-- --------------------------------------------------------

--
-- Table structure for table `doctordetails`
--

CREATE TABLE `doctordetails` (
  `Name` varchar(15) NOT NULL,
  `NIC` varchar(15) NOT NULL,
  `RegNo` varchar(15) NOT NULL,
  `Eligibility` varchar(40) NOT NULL,
  `Special` varchar(20) NOT NULL,
  `Contact` int(10) NOT NULL,
  `UserName` varchar(15) NOT NULL,
  `Password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctordetails`
--

INSERT INTO `doctordetails` (`Name`, `NIC`, `RegNo`, `Eligibility`, `Special`, `Contact`, `UserName`, `Password`) VALUES
('yasitha', '25852585', 'Doc0125', 'MBBS,BDSM,DFCC', 'Dental', 7158525, 'YasiDoc10', '69636'),
('mathiya', '515848498494v', 'mk124', 'mbbs', 'Dermatology ', 4015425, 'mathiya', '123456'),
('yasitha', '654654', 'vf231', 'MBBS', 'Eyes', 715555, 'Y012', '41474');

-- --------------------------------------------------------

--
-- Table structure for table `patientdetails`
--

CREATE TABLE `patientdetails` (
  `FirstName` varchar(15) NOT NULL,
  `LastName` varchar(15) NOT NULL,
  `NIC` varchar(15) NOT NULL,
  `BirthDay` varchar(10) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Address` varchar(40) NOT NULL,
  `Contact` int(12) NOT NULL,
  `BloodType` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patientdetails`
--

INSERT INTO `patientdetails` (`FirstName`, `LastName`, `NIC`, `BirthDay`, `Gender`, `Address`, `Contact`, `BloodType`) VALUES
('nishan', 'fernando', '123', '10/08/1993', 'Male', 'athuru', 7165465, 'A+'),
('upeka', 'sandaruwan', '1999654654', '12/05/1999', 'Male', '69/C,kotte', 716546545, 'AB-'),
('roshana', 'begum', '19996565', '16/10/1999', 'Female', 'haputale', 7165465, 'A-'),
('mano', 'jasi', '2000656165', '12/12/1222', 'Male', 'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa', 71546, 'A+'),
('balla', 'ballii', '321321', '12/12/2000', 'Male', 'angoda', 71231, 'B-');

-- --------------------------------------------------------

--
-- Table structure for table `receptiondetails`
--

CREATE TABLE `receptiondetails` (
  `Name` varchar(20) NOT NULL,
  `NIC` varchar(15) NOT NULL,
  `Contact` int(12) NOT NULL,
  `UserName` varchar(15) NOT NULL,
  `Password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `receptiondetails`
--

INSERT INTO `receptiondetails` (`Name`, `NIC`, `Contact`, `UserName`, `Password`) VALUES
('ghj', '14546', 645, 'kk44', '452'),
('jhdhh', '312414', 1334222, 'mathiya2', '123456'),
('asdd', '452', 254, 'm45', '456'),
('buybubb', '511', 165165, 'mmm', '1234'),
('asdasd', '654', 654, 'a1', 'a11'),
('jhjhj', '654654', 321321, 'a111', '145145'),
('lakmal', '6546544', 716545, 'L012', '52585');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `channelling`
--
ALTER TABLE `channelling`
  ADD PRIMARY KEY (`NIC`,`Date`);

--
-- Indexes for table `doctordetails`
--
ALTER TABLE `doctordetails`
  ADD PRIMARY KEY (`NIC`);

--
-- Indexes for table `patientdetails`
--
ALTER TABLE `patientdetails`
  ADD PRIMARY KEY (`NIC`);

--
-- Indexes for table `receptiondetails`
--
ALTER TABLE `receptiondetails`
  ADD PRIMARY KEY (`NIC`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
