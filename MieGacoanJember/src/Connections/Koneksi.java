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
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

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

    public static void print() {
        try {
            String file = "C:\\Users\\kelvin\\Documents\\GitHub Desktop\\project\\PROJEC_WSIBD\\MieGacoanJember\\src\\Gacoan\\DataPegawai.jrxml";
            JasperReport jr;
            
            jr = JasperCompileManager.compileReport(file);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
            JasperViewer.viewReport(jp);
        } catch (JRException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        cekKoneksi();
    }
}
