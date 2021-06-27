/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connections;

import Gacoan.Pegawai;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tharixs Akbar Ibnu A
 */
public class Koneksi {

    static Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;

    public static Connection cekKoneksi() {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/mie_gacoan_jember", "root", "");
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
            System.out.println("Koneksi Gagal" + e);
        }

        return conn;

    }

    public static void main(String[] args) {
        cekKoneksi();
    }

    public void insertPegawai(String id_pegawai, String nama_pegawai, String jenis_kelamin, String tempat_lahir, String alamat, String password, String jabatan, String no_telepon) {
        try {
            String sql = "INSERT INTO pegawai (id_pegawai, nama_pegawai, jenis_kelamin, tempat_lahir, alamat, password, jabatan, no_telepon) VALUES (?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, id_pegawai);
            pst.setString(2, nama_pegawai);
            pst.setString(3, jenis_kelamin);
            pst.setString(4, tempat_lahir);
            pst.setString(5, alamat);
            pst.setString(6, password);
            pst.setString(7, jabatan);
            pst.setString(8, no_telepon);
            pst.execute();
            System.out.println("Data berhasil ditambahkan");
        } catch (SQLException ex) {
            System.err.println(ex);
            System.out.println("gagal");
        }
    }
    
    public ResultSet selectPegawai() {
        try {
            String sql = "SELECT * FROM pegawai";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Data dipilih");
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public void deletePegawai(String idPegawai) {
        try {
            String sql = "DELETE FROM pegawai WHERE id_pegawai =?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, idPegawai);
            pst.executeUpdate();
            System.out.println("Data berhasil dihapus");
        } catch (SQLException ex) {
            Logger.getLogger(Pegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updatePegawai(String id_pegawai, String nama_pegawai, String jenis_kelamin, String tempat_lahir, String alamat, String password, String jabatan, String no_telepon) {
        try {
            String sql = "UPDATE pegawai SET nama_pegawai=?, jenis_kelamin=?, tempat_lahir=?, alamat=?, password=?, jabatan=?, no_telepon=? WHERE id_pegawai=?";
            pst = conn.prepareStatement(sql);
            pst.setString(8, id_pegawai);
            pst.setString(1, nama_pegawai);
            pst.setString(2, jenis_kelamin);
            pst.setString(3, tempat_lahir);
            pst.setString(4, alamat);
            pst.setString(5, password);
            pst.setString(6, jabatan);
            pst.setString(7, no_telepon);
            pst.executeUpdate();
            System.out.println("Data berhasil dirubah");
        } catch (SQLException ex) {
            System.err.println(ex);
            System.out.println("gagal");
        }
    }
    public void insertNoodle(String id_noodle, String nama_noodle, String detail_noodle, String harga_noodle) {
        try {
            String sql = "INSERT INTO noodle (id_noodle, nama_noodle, detail_noodle, harga_noodle) VALUES (?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, id_noodle);
            pst.setString(2, nama_noodle);
            pst.setString(3, detail_noodle);
            pst.setString(4, harga_noodle);
            pst.execute();
            System.out.println("Data berhasil ditambahkan");
        } catch (SQLException ex) {
            System.err.println(ex);
            System.out.println("gagal");
        }
    }
    
    public ResultSet selectNoodle() {
        try {
            String sql = "SELECT * FROM noodle";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Data dipilih");
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public void deleteNoodle(String idNoodle) {
        try {
            String sql = "DELETE FROM noodle WHERE id_noodle =?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, idNoodle);
            pst.executeUpdate();
            System.out.println("Data berhasil dihapus");
        } catch (SQLException ex) {
            Logger.getLogger(Pegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateNoodle(String id_noodle, String nama_noodle, String detail_noodle, String harga_noodle) {
        try {
            String sql = "UPDATE noodle SET nama_noodle=?, detail_noodle=?, harga_noodle=? WHERE id_noodle=?";
            pst = conn.prepareStatement(sql);
            pst.setString(4, id_noodle);
            pst.setString(1, nama_noodle);
            pst.setString(2, detail_noodle);
            pst.setString(3, harga_noodle);
            pst.executeUpdate();
            System.out.println("Data berhasil dirubah");
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
    
    public void insertBeverage(String id_beverage, String nama_beverage, String detail_beverage, String harga_beverage) {
        try {
            String sql = "INSERT INTO beverage (id_beverage, nama_beverage, detail_beverage, harga_beverage) VALUES (?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, id_beverage);
            pst.setString(2, nama_beverage);
            pst.setString(3, detail_beverage);
            pst.setString(4, harga_beverage);
            pst.execute();
            System.out.println("Data berhasil ditambahkan");
        } catch (SQLException ex) {
            System.err.println(ex);
            System.out.println("gagal");
        }
    }
    
    public ResultSet selectBeverage() {
        try {
            String sql = "SELECT * FROM beverage";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Data dipilih");
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public void deleteBeverage(String idBeverage) {
        try {
            String sql = "DELETE FROM beverage WHERE id_beverage =?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, idBeverage);
            pst.executeUpdate();
            System.out.println("Data berhasil dihapus");
        } catch (SQLException ex) {
            Logger.getLogger(Pegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateBeverage(String id_beverage, String nama_beverage, String detail_beverage, String harga_beverage) {
        try {
            String sql = "UPDATE beverage SET nama_beverage=?, detail_beverage=?, harga_beverage=? WHERE id_beverage=?";
            pst = conn.prepareStatement(sql);
            pst.setString(4, id_beverage);
            pst.setString(1, nama_beverage);
            pst.setString(2, detail_beverage);
            pst.setString(3, harga_beverage);
            pst.executeUpdate();
            System.out.println("Data berhasil dirubah");
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
    
    public void insertDimsum(String id_dimsum, String nama_dimsum, String detail_dimsum, String harga_dimsum) {
        try {
            String sql = "INSERT INTO dimsum (id_dimsum, nama_dimsum, detail_dimsum, harga_dimsum) VALUES (?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, id_dimsum);
            pst.setString(2, nama_dimsum);
            pst.setString(3, detail_dimsum);
            pst.setString(4, harga_dimsum);
            pst.execute();
            System.out.println("Data berhasil ditambahkan");
        } catch (SQLException ex) {
            System.err.println(ex);
            System.out.println("gagal");
        }
    }
    
    public ResultSet selectDimsum() {
        try {
            String sql = "SELECT * FROM dimsum";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            System.out.println("Data dipilih");
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public void deleteDimsum(String idDimsum) {
        try {
            String sql = "DELETE FROM dimsum WHERE id_dimsum =?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, idDimsum);
            pst.executeUpdate();
            System.out.println("Data berhasil dihapus");
        } catch (SQLException ex) {
            Logger.getLogger(Pegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateDimsum(String id_dimsum, String nama_dimsum, String detail_dimsum, String harga_dimsum) {
        try {
            String sql = "UPDATE dimsum SET nama_dimsum=?, detail_dimsum=?, harga_dimsum=? WHERE id_dimsum=?";
            pst = conn.prepareStatement(sql);
            pst.setString(4, id_dimsum);
            pst.setString(1, nama_dimsum);
            pst.setString(2, detail_dimsum);
            pst.setString(3, harga_dimsum);
            pst.executeUpdate();
            System.out.println("Data berhasil dirubah");
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
}
