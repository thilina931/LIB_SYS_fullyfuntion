-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Oct 20, 2017 at 02:15 AM
-- Server version: 5.7.19
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
CREATE TABLE IF NOT EXISTS `book` (
  `BookID` int(11) NOT NULL,
  `BookName` varchar(80) DEFAULT NULL,
  `Author` varchar(30) DEFAULT NULL,
  `Publisher` varchar(30) DEFAULT NULL,
  `PublishedYear` varchar(15) DEFAULT NULL,
  `Edition` varchar(30) DEFAULT NULL,
  `Category` varchar(35) DEFAULT NULL,
  `RegisteredDate` varchar(15) DEFAULT NULL,
  `Price` float DEFAULT NULL,
  PRIMARY KEY (`BookID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`BookID`, `BookName`, `Author`, `Publisher`, `PublishedYear`, `Edition`, `Category`, `RegisteredDate`, `Price`) VALUES
(15219, 'Head First Design Patterns', 'Eric Freeman', 'Elisabeth Robson', '1994', '3rd edition', 'Computer Programming', '2017-10-19', 2500),
(14794, 'The C++ Programming Language', 'STROUSTRUP', 'Bjarne. Addison-Wesley', '2014', '4th edition', 'Computer Programming', '2017-10-19', 5000),
(11836, 'A Practica', 'Steve McConnell', 'Nathan Jakubiak', '1990', '2nd edition', 'Computer Programming', '2017-10-19', 5700),
(15165, 'Development Using Scrum', 'Mike Cohn', 'homes', '1990', '2nd edition', 'Computer Programming', '2017-10-19', 8500),
(20245, 'Design of Existing Code', 'Martin Fowler', 'Jeehong Min', '1995', '2nd edition', 'Computer Programming', '2017-10-19', 7854),
(10902, 'Patterns,and Practices', 'Robert C. Martin ', 'Jeehong Min', '1994', '7th edition', 'Computer Programming', '2017-10-19', 7841),
(15935, 'Rework', 'Jason Fried', 'Jeehong Min', '1992', '3rd edition', 'Computer Programming', '2017-10-19', 87421),
(19373, 'Concurrency in Practice ', 'Brian Goetz ', 'Tim Peierls', '1993', '5th edition', 'Computer Programming', '2017-10-19', 78456),
(11040, 'Test Driven Development', 'Kent Beck', 'Michael Siegel,', '1993', '5th edition', 'Computer Programming', '2017-10-19', 6541),
(20179, 'Gate Guide Civil Engg. 2017', 'G. K. Publications', 'GKP', '1993', '5th edition', 'Computer Programming', '2017-10-19', 7845),
(20406, 'IES Civil Engineering Guide', 'homes', 'G. K. Publications', '1993', '5th edition', 'Civil Engineering', '2017-10-19', 7845),
(15090, 'Civil Engineering Conventional', 'Arihant ', ' Easy Publications', '1995', '5th edition', 'Civil Engineering', '2017-10-19', 3212),
(10530, 'Advanced Soil Mechanics ', 'Braja M. Das', 'Hardcover', '1995', '5th edition', 'Civil Engineering', '2017-10-19', 4444),
(18505, 'Calculus: A Complete Course', 'Hardcover', 'Robert A. Adams', '1991', '5th edition', 'Civil Engineering', '2017-10-19', 2321),
(29412, 'Engineering Fluid Mechanics', 'Clayton T. Crowe', 'Paperback', '1998', '5th edition', 'Civil Engineering', '2017-10-19', 7844),
(28852, 'Database Management System', 'G. K. Gupta', 'Tata McGraw Hill', '1994', '5th edition', 'Database management', '2017-10-19', 3321),
(26212, 'Data Mining with Case Studies', 'G. K. Gupta', 'Prentice-Hall Of India Pv,', '1994', '3rd edition', 'Database management', '2017-10-19', 8574),
(10807, 'Data Mining', 'Jiawei Han', 'Morgan Kaufmann ', '1994', '7th edition', 'Database management', '2017-10-19', 6894),
(15073, 'Mieko and the Fifth Treasure', 'Eleanor Coerr', 'sticky traps ', '1995', '2nd edition', 'English Language', '2017-10-19', 4447),
(22120, 'The Outsiders', 'S.E. Hinton', ' EFL ', '1995', '6th edition', 'English Language', '2017-10-19', 7845),
(26101, 'ON BECOMING A LEADER', 'Warren G. Bennis', 'MDS', '1990', '6th edition', 'Buisness Management', '2017-10-19', 4785),
(19669, ' FINANCIAL INTELLIGENCE', 'Karen Berman', 'Joe Knight ', '1992', '6th edition', 'Buisness Management', '2017-10-19', 6580),
(24078, 'GROWING A BUSINESS', 'Paul Hawken', 'Simon and Shuster', '1992', '6th edition', 'Buisness Management', '2017-10-19', 3251),
(22593, 'The Man Who Knew Infinity', 'Robert Kanigel', 'Cambridge', '1992', '3rd edition', 'Mathamatics', '2017-10-19', 5000),
(16524, 'Gödel, Escher, Bach', 'Douglas Hofstadter', 'genius ', '1992', '4th edition', 'Mathamatics', '2017-10-19', 7840),
(11850, 'Tales of Mathematical Wond', 'Rudy Rucker', ' fiction short', '1993', '4th edition', 'Mathamatics', '2017-10-19', 7822),
(27900, 'Games of Life ', 'Karl Sigmund', 'vital features', '1995', '9th edition', 'Mathamatics', '2017-10-19', 6623),
(29400, 'Magical Mathematics ', 'Persi Diaconis', 'Ron Graham', '1992', '9th edition', 'Mathamatics', '2017-10-19', 4781);

-- --------------------------------------------------------

--
-- Table structure for table `borrowbooks`
--

DROP TABLE IF EXISTS `borrowbooks`;
CREATE TABLE IF NOT EXISTS `borrowbooks` (
  `MemberID` varchar(10) NOT NULL,
  `MemberName` varchar(50) NOT NULL,
  `BookID` int(11) NOT NULL,
  `BookName` varchar(80) NOT NULL,
  `Author` varchar(30) NOT NULL,
  `IssueDate` varchar(15) NOT NULL,
  `DueDate` varchar(15) NOT NULL,
  PRIMARY KEY (`MemberID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `borrowbooks`
--

INSERT INTO `borrowbooks` (`MemberID`, `MemberName`, `BookID`, `BookName`, `Author`, `IssueDate`, `DueDate`) VALUES
('mem000002', 'Thilina bogahawatta', 15219, 'Head First Design Patterns', 'Eric Freeman', '2017-10-20', '2017-10-30');

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
CREATE TABLE IF NOT EXISTS `staff` (
  `EmployeeID` int(11) NOT NULL,
  `EmployeeName` varchar(50) DEFAULT NULL,
  `Position` varchar(50) DEFAULT NULL,
  `NIC` varchar(50) DEFAULT NULL,
  `Gender` varchar(10) DEFAULT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `ContactNumber` varchar(50) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Username` varchar(50) DEFAULT NULL,
  `ConfirmPassword` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`EmployeeID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`EmployeeID`, `EmployeeName`, `Position`, `NIC`, `Gender`, `Address`, `ContactNumber`, `Email`, `Username`, `ConfirmPassword`) VALUES
(122999, 'Hasini punsara', 'Admin', '789456123V', 'Female', 'Haputale', '0714587512', 'hk1@gmail.com', 'Has123', '1qaz2wsx'),
(20005, 'Uthpala', 'Librarian', '131313131v', 'Female', 'Matara', '0131313131', 'uthpala@gmail.com', 'uthpala123', 'uth123'),
(20010, 'Isuri', 'Librarian', '141414141v', 'Female', 'Malabe', '0141414141', 'isuri@gmail.com', 'isuri123', 'isu123'),
(20015, 'Thanuji', 'Admin', '151515151v', 'Female', 'Galle', '0151515151', 'thanuji@gmail.com', 'thanuji123', 'tha123'),
(20020, 'Oshadi', 'Librarian', '161616161v', 'Male', 'Kandy', '0161616161', 'oshadi@gmail.com', 'oshadi123', 'osh123'),
(20025, 'Sahan', 'Librarian', '171717171v', 'Male', 'Waligama', '0171717171', 'sahan@gmail.com', 'sahan123', 'sah123'),
(284058, 'Malithi sadaruwani', 'Librarian', '971819915v', 'Female', 'Galle', '0719119578', 'Mal@gmail.com', 'mal123', '1qaz2wsx'),
(20035, 'Thisari', 'Librarian', '191919191v', 'Female', 'Wakwalla', '0191919191', 'thisari@gmail.com', 'thisari123', 'this123'),
(289599, 'Hoshan kalana', 'Admin', '932020033v', 'Male', 'malabe', '0711336125', 'hk@gmai.com', 'hk123', '1qaz2wsx'),
(20050, 'Janaki', 'Admin', '212121212v', 'Female', 'Malabe', '0212121212', 'janaki@gmail.com', 'janaki123', 'jan123'),
(132749, 'kalani sathpla', 'Librarian', '123456789V', 'Female', 'colombo', '0719119598', 'kal@gmail.com', 'kal123', 'abc123'),
(231371, 'Mashi promodaya', 'Admin', '123456987V', 'Female', 'Dematagoda', '0718119578', 'Mas@gmail.com', 'Mas1234', '1qaz2wsx'),
(129380, 'gagaga', 'Librarian', '932020033v', 'Male', 'jgjgjgjgjgX', '0711336125', 'hoshan@gmail.com', 'h123', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE IF NOT EXISTS `student` (
  `MemberID` varchar(10) NOT NULL,
  `MemberType` varchar(30) DEFAULT NULL,
  `MemberName` varchar(50) DEFAULT NULL,
  `NIC` varchar(20) DEFAULT NULL,
  `Address` varchar(10) DEFAULT NULL,
  `ContactNumber` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`MemberID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`MemberID`, `MemberType`, `MemberName`, `NIC`, `Address`, `ContactNumber`) VALUES
('mem000002', 'Student', 'Thilina bogahawatta', '222222222v', 'Rathnapura', '0719119592'),
('mem000003', 'Student', 'Kamal sumanapala', '333333333v', 'Matara', '0718734456'),
('mem000004', 'Student', 'Janani', '444444444v', 'Kandy', '0444444444'),
('mem000005', 'Academic', 'Roshan', '555555555v', 'Colombo', '0555555555'),
('mem000006', 'Academic', 'Saduni', '666666666v', 'Colombo', '0666666666'),
('mem000007', 'Student', 'Lakmal desapriya', '957821546v', 'Galle', '0779119587'),
('mem000008', 'Student', 'Dinithi', '888888888v', 'Galle', '0779154875'),
('mem000009', 'Academic', 'Malinda jashon', '914578278V', 'kandy', '0779886532');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
