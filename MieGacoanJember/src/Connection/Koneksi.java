/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Tharixs Akbar Ibnu A
 */
public class Koneksi {

    static Connection conn;

    public static Connection cekKoneksi() {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/wsibdgacoan","root", "");
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
            System.out.println("Koneksi Gagal"+e);
        }

        return conn;

    }
    public static void main(String[] args) {
        cekKoneksi();
    }
}
