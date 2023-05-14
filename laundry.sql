-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 14, 2023 at 11:09 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `laundry`
--

-- --------------------------------------------------------

--
-- Table structure for table `detail_transaksi`
--

CREATE TABLE `detail_transaksi` (
  `id_detail` int(11) NOT NULL,
  `id_transaksi` int(11) DEFAULT NULL,
  `id_paket` int(11) DEFAULT NULL,
  `qty` double DEFAULT NULL,
  `keterangan` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `detail_transaksi`
--

INSERT INTO `detail_transaksi` (`id_detail`, `id_transaksi`, `id_paket`, `qty`, `keterangan`) VALUES
(11, 1, 1001, 2, 'sudah dibayar'),
(22, 2, 1001, 3, 'sudah diproses');

--
-- Triggers `detail_transaksi`
--
DELIMITER $$
CREATE TRIGGER `update_dibayar_transaksi` BEFORE INSERT ON `detail_transaksi` FOR EACH ROW update transaksi set dibayar='dibayar' where id_transaksi=new.id_transaksi
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `update_status_transaksi` AFTER INSERT ON `detail_transaksi` FOR EACH ROW update transaksi set status='selesai' where id_transaksi=new.id_transaksi
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `id_member` int(11) NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `alamat` text DEFAULT NULL,
  `JK` varchar(15) DEFAULT NULL,
  `tlp` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`id_member`, `nama`, `alamat`, `JK`, `tlp`) VALUES
(111, 'Mia', 'Cijoho', 'Perempuan', '012345678998'),
(112, 'Rena', 'Jalaksana', 'Perempuan', '012345678997'),
(113, 'Nurima', 'kuningan', 'Perempuan', '091237124212');

-- --------------------------------------------------------

--
-- Table structure for table `outlet`
--

CREATE TABLE `outlet` (
  `id_outlet` int(11) NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `alamat` text DEFAULT NULL,
  `tlp` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `outlet`
--

INSERT INTO `outlet` (`id_outlet`, `nama`, `alamat`, `tlp`) VALUES
(1, 'Nadiyatul Huda', 'Jalaksana', '098764321123'),
(2, 'Astia Hasna', 'Kramatmulya', '098765432234'),
(3, 'Ai Rini', 'Kadugede', '098765433456'),
(4, 'Malik', 'Kuningan', '089765432156');

-- --------------------------------------------------------

--
-- Table structure for table `paket`
--

CREATE TABLE `paket` (
  `id_paket` int(11) NOT NULL,
  `id_outlet` int(11) NOT NULL,
  `jenis` varchar(100) NOT NULL,
  `nama_paket` varchar(100) NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `paket`
--

INSERT INTO `paket` (`id_paket`, `id_outlet`, `jenis`, `nama_paket`, `harga`) VALUES
(1001, 1, 'bed_cover', 'Bed Cover', 50);

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` int(11) NOT NULL,
  `id_outlet` int(11) NOT NULL,
  `kode_invoice` varchar(100) NOT NULL,
  `id_member` int(11) NOT NULL,
  `tgl` datetime NOT NULL,
  `batas_waktu` datetime NOT NULL,
  `tgl_bayar` datetime NOT NULL,
  `status` enum('baru','proses','selesai','diambil') NOT NULL,
  `dibayar` enum('dibayar','belum_dibayar') NOT NULL,
  `id_user` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `id_outlet`, `kode_invoice`, `id_member`, `tgl`, `batas_waktu`, `tgl_bayar`, `status`, `dibayar`, `id_user`) VALUES
(1, 1, 'n111', 111, '2023-03-11 00:00:00', '2023-03-13 00:00:00', '2023-03-12 00:00:00', 'selesai', 'dibayar', 1211),
(2, 2, 'dua', 112, '2023-03-14 00:00:00', '2023-03-16 00:00:00', '2023-03-15 00:00:00', 'selesai', 'dibayar', 1212);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `password` text DEFAULT NULL,
  `id_outlet` int(11) DEFAULT NULL,
  `role` enum('admin','kasir','owner','') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `nama`, `username`, `password`, `id_outlet`, `role`) VALUES
(1211, 'Nadiyatul H', 'nadia', '123', 1, 'kasir'),
(1212, 'Astia Hasna', 'astia', '123', 2, 'admin'),
(1213, 'Ai Rini', 'ai', '123', 3, 'owner');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `detail_transaksi`
--
ALTER TABLE `detail_transaksi`
  ADD PRIMARY KEY (`id_detail`),
  ADD KEY `id_transaksi` (`id_transaksi`),
  ADD KEY `id_paket` (`id_paket`);

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`id_member`);

--
-- Indexes for table `outlet`
--
ALTER TABLE `outlet`
  ADD PRIMARY KEY (`id_outlet`);

--
-- Indexes for table `paket`
--
ALTER TABLE `paket`
  ADD PRIMARY KEY (`id_paket`),
  ADD KEY `id_outlet` (`id_outlet`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`),
  ADD KEY `id_outlet` (`id_outlet`),
  ADD KEY `id_member` (`id_member`),
  ADD KEY `id_user` (`id_user`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`),
  ADD KEY `id_outlet` (`id_outlet`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `detail_transaksi`
--
ALTER TABLE `detail_transaksi`
  ADD CONSTRAINT `detail_transaksi_ibfk_1` FOREIGN KEY (`id_transaksi`) REFERENCES `transaksi` (`id_transaksi`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `detail_transaksi_ibfk_2` FOREIGN KEY (`id_paket`) REFERENCES `paket` (`id_paket`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `paket`
--
ALTER TABLE `paket`
  ADD CONSTRAINT `paket_ibfk_1` FOREIGN KEY (`id_outlet`) REFERENCES `outlet` (`id_outlet`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`id_outlet`) REFERENCES `outlet` (`id_outlet`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `transaksi_ibfk_2` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `transaksi_ibfk_3` FOREIGN KEY (`id_member`) REFERENCES `member` (`id_member`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `user_ibfk_1` FOREIGN KEY (`id_outlet`) REFERENCES `outlet` (`id_outlet`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
