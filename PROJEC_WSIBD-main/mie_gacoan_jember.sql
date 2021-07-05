-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 22, 2021 at 09:55 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mie_gacoan_jember`
--

-- --------------------------------------------------------

--
-- Table structure for table `beverage`
--

CREATE TABLE `beverage` (
  `id_beverage` varchar(10) NOT NULL DEFAULT '',
  `nama_beverage` varchar(20) NOT NULL,
  `detail_beverage` varchar(100) NOT NULL,
  `gambar_beverage` text NOT NULL,
  `harga_beverage` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `dimsum`
--

CREATE TABLE `dimsum` (
  `id_dimsum` varchar(10) NOT NULL DEFAULT '',
  `nama_dimsum` varchar(20) NOT NULL,
  `detail_dimsum` varchar(100) NOT NULL,
  `gambar_dimsum` text NOT NULL,
  `harga_dimsum` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

CREATE TABLE `menu` (
  `id_menu` varchar(10) NOT NULL DEFAULT '',
  `id_makanan` varchar(10) NOT NULL,
  `id_minuman` varchar(10) NOT NULL,
  `id_dessert` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `noodle`
--

CREATE TABLE `noodle` (
  `id_noodle` varchar(10) NOT NULL DEFAULT '',
  `nama_noodle` varchar(20) NOT NULL,
  `detail_noodle` varchar(100) NOT NULL,
  `gambar_noodle` text NOT NULL,
  `harga_noodle` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE `pegawai` (
  `id_pegawai` varchar(10) NOT NULL DEFAULT '',
  `nama_pegawai` varchar(35) NOT NULL,
  `tempat_lahir` varchar(30) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `jenis_kelamin` varchar(12) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `password` varchar(8) NOT NULL,
  `jabatan` varchar(10) NOT NULL,
  `no_telepon` int(15) NOT NULL,
  `foto` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `pembayaran`
--

CREATE TABLE `pembayaran` (
  `id_pembayaran` varchar(10) NOT NULL DEFAULT '',
  `media` varchar(15) NOT NULL,
  `tanggal_pembayaran` date NOT NULL,
  `waktu_pembayaran` time(6) NOT NULL,
  `status` varchar(10) NOT NULL,
  `id_pemesanan` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `pembeli`
--

CREATE TABLE `pembeli` (
  `id_pembeli` varchar(10) NOT NULL DEFAULT '',
  `nama_pembeli` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `pemesanan`
--

CREATE TABLE `pemesanan` (
  `id_pemesanan` varchar(10) NOT NULL,
  `no_meja` varchar(3) NOT NULL,
  `tanggal_pemesanan` date NOT NULL,
  `waktu_pemesanan` time(6) NOT NULL,
  `qty` int(3) NOT NULL,
  `jumlah` int(10) NOT NULL,
  `total_bayar` int(10) NOT NULL,
  `id_pegawai` varchar(10) NOT NULL,
  `id_pembeli` varchar(10) NOT NULL,
  `id_menu` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `beverage`
--
ALTER TABLE `beverage`
  ADD PRIMARY KEY (`id_beverage`);

--
-- Indexes for table `dimsum`
--
ALTER TABLE `dimsum`
  ADD PRIMARY KEY (`id_dimsum`);

--
-- Indexes for table `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`id_menu`),
  ADD UNIQUE KEY `id_makanan` (`id_makanan`),
  ADD UNIQUE KEY `id_minuman` (`id_minuman`),
  ADD UNIQUE KEY `id_dessert` (`id_dessert`);

--
-- Indexes for table `noodle`
--
ALTER TABLE `noodle`
  ADD PRIMARY KEY (`id_noodle`);

--
-- Indexes for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`id_pegawai`);

--
-- Indexes for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD PRIMARY KEY (`id_pembayaran`),
  ADD UNIQUE KEY `id_pemesanan` (`id_pemesanan`);

--
-- Indexes for table `pembeli`
--
ALTER TABLE `pembeli`
  ADD PRIMARY KEY (`id_pembeli`);

--
-- Indexes for table `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD PRIMARY KEY (`id_pemesanan`),
  ADD UNIQUE KEY `id_pegawai` (`id_pegawai`),
  ADD UNIQUE KEY `id_pembeli` (`id_pembeli`),
  ADD UNIQUE KEY `id_menu` (`id_menu`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `beverage`
--
ALTER TABLE `beverage`
  ADD CONSTRAINT `beverage_ibfk_1` FOREIGN KEY (`id_beverage`) REFERENCES `menu` (`id_minuman`);

--
-- Constraints for table `dimsum`
--
ALTER TABLE `dimsum`
  ADD CONSTRAINT `dimsum_ibfk_1` FOREIGN KEY (`id_dimsum`) REFERENCES `menu` (`id_dessert`);

--
-- Constraints for table `menu`
--
ALTER TABLE `menu`
  ADD CONSTRAINT `menu_ibfk_1` FOREIGN KEY (`id_menu`) REFERENCES `pemesanan` (`id_menu`);

--
-- Constraints for table `noodle`
--
ALTER TABLE `noodle`
  ADD CONSTRAINT `noodle_ibfk_1` FOREIGN KEY (`id_noodle`) REFERENCES `menu` (`id_makanan`);

--
-- Constraints for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD CONSTRAINT `pegawai_ibfk_1` FOREIGN KEY (`id_pegawai`) REFERENCES `pemesanan` (`id_pegawai`);

--
-- Constraints for table `pembeli`
--
ALTER TABLE `pembeli`
  ADD CONSTRAINT `pembeli_ibfk_1` FOREIGN KEY (`id_pembeli`) REFERENCES `pemesanan` (`id_pembeli`);

--
-- Constraints for table `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD CONSTRAINT `pemesanan_ibfk_1` FOREIGN KEY (`id_pemesanan`) REFERENCES `pembayaran` (`id_pemesanan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
