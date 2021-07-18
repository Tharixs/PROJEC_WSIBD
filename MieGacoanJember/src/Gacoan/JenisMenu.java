/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gacoan;

import Connections.Koneksi;
import com.mysql.jdbc.Connection;
import com.toedter.calendar.JDateChooser;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import sun.rmi.server.Activation;
import sun.security.pkcs11.Secmod;

/**
 *
 * @author khoirul
 */
public class JenisMenu extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pst;
    DefaultTableModel tbmJenisMenu;
    ResultSet rs;
    Statement st;

    public JenisMenu() {
        conn = Connections.Koneksi.cekKoneksi();
        initComponents();
        showTable();
        btnCari.setEnabled(true);
        btnSimpan.setEnabled(false);
        btnHapus.setEnabled(false);
        btnRubah.setEnabled(false);
        btnBaru.setEnabled(false);
        btnPrint.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RbtnJenis_Kelamin = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        btnJenis_Menu = new javax.swing.JButton();
        btnPemesanan = new javax.swing.JButton();
        btnPembayaran = new javax.swing.JButton();
        btnLaporan = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtID_Jenis = new javax.swing.JTextField();
        txtJenis = new javax.swing.JTextField();
        txtDetail_Jenis = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJenisMenu = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnRubah = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnBaru = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        txtjenis = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnPegawai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnMenu.setText("Menu");

        btnJenis_Menu.setText("Jenis Menu");

        btnPemesanan.setText("Pemesanan");

        btnPembayaran.setText("Pembayaran");

        btnLaporan.setText("Laporan");

        btnLogOut.setText("LogOut");

        jLabel1.setText("ID Jenis *");

        jLabel2.setText("Jenis *");

        jLabel4.setText("Detail Jenis *");

        txtID_Jenis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtID_JenisMouseClicked(evt);
            }
        });

        tblJenisMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblJenisMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblJenisMenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblJenisMenu);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMouseClicked(evt);
            }
        });
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnRubah.setText("Rubah");
        btnRubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRubahActionPerformed(evt);
            }
        });

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnBaru.setText("Baru");
        btnBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaruActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        txtjenis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtjenisMouseClicked(evt);
            }
        });
        txtjenis.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtjenisInputMethodTextChanged(evt);
            }
        });
        txtjenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjenisActionPerformed(evt);
            }
        });

        jLabel11.setText("Masukkan Jenis");

        btnPegawai.setText("Pegawai");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnJenis_Menu))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPemesanan)
                            .addComponent(btnPembayaran)
                            .addComponent(btnLaporan)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnLogOut))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPegawai)
                            .addComponent(btnMenu))))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel4))
                                    .addGap(114, 114, 114)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDetail_Jenis, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtID_Jenis, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtjenis, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(btnCari)))
                            .addComponent(jLabel2))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSimpan)
                            .addComponent(btnBaru))
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPrint)
                            .addComponent(btnRubah)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(657, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel11)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCari))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtID_Jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(txtDetail_Jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBaru)
                            .addComponent(btnPrint)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(btnPegawai)
                        .addGap(18, 18, 18)
                        .addComponent(btnMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnJenis_Menu)
                        .addGap(79, 79, 79)
                        .addComponent(btnPemesanan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnRubah)
                                .addComponent(btnSimpan)
                                .addComponent(btnHapus))
                            .addComponent(btnPembayaran))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLaporan)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogOut)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtjenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjenisActionPerformed

    private void txtjenisInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtjenisInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjenisInputMethodTextChanged

    private void txtjenisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtjenisMouseClicked
        // TODO add your handling code here:
        btnCari.setEnabled(true);
        btnSimpan.setEnabled(false);
        clear();
    }//GEN-LAST:event_txtjenisMouseClicked

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        String Jenis = txtjenis.getText();
        try {
            com.mysql.jdbc.Statement statement = (com.mysql.jdbc.Statement) conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM jenis_menu where jenis ='" + Jenis + "'");
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("ID Jenis");
            tbl.addColumn("Jenis");
            tbl.addColumn("Detail Jenis");

            tblJenisMenu.setModel(tbl);

            while (rs.next()) {
                tbl.addRow(new Object[]{
                    rs.getString("id_jenis"),
                    rs.getString("jenis"),
                    rs.getString("detail_jenis")});
                tblJenisMenu.setModel(tbl);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Data Yang Anda Cari Tidak Sesuai");
        }
        txtjenis.setText("");

    }//GEN-LAST:event_btnCariActionPerformed

    private void btnBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaruActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnBaruActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
//        Connections.Koneksi.print();
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnRubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRubahActionPerformed
        // TODO add your handling code here:
        String id_jenis, jenis, detail_jenis;

        id_jenis = txtID_Jenis.getText();
        jenis = txtJenis.getText();
        detail_jenis = txtDetail_Jenis.getText();

        try {
            if (txtID_Jenis.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "ID Jenis Tidak Boleh Kosong");
            } else if (txtJenis.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Jenis Tidak Boleh Kosong");
            } else if (txtDetail_Jenis.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Detail Jenis Tidak Boleh Kosong");
            } else {
                int opsi = JOptionPane.showConfirmDialog(null, "Apakah anda ingin merubah data ini ?", "Rubah Data", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                switch (opsi) {
                    case JOptionPane.YES_OPTION:
                        updateJenisMenu(id_jenis, jenis, detail_jenis);
                        JOptionPane.showMessageDialog(null, "Data berhasil dirubah");
                        break;
                    case JOptionPane.NO_OPTION:
                        JOptionPane.showMessageDialog(null, "Data tidak dirubah");
                        break;
                }
            }
        } catch (Exception t) {
            JOptionPane.showMessageDialog(null, "Data Gagal Dirubah!");
        }
        showTable();
        clear();
    }//GEN-LAST:event_btnRubahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        String idJenisMenu;
        idJenisMenu = txtID_Jenis.getText();
        int opsi = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menghapus data ini ?", "Hapus Data", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        switch (opsi) {
            case JOptionPane.YES_OPTION:
                deleteJenisMenu(idJenisMenu);
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null, "Data tidak dihapus");
                break;
        }
        showTable();
        clear();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusMouseClicked

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        String id_jenis, jenis, detail_jenis;
        id_jenis = txtID_Jenis.getText();
        jenis = txtJenis.getText();
        detail_jenis = txtDetail_Jenis.getText();
        
        try {
            if (txtID_Jenis.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "ID Jenis Tidak Boleh Kosong");
            } else if (txtJenis.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Jenis Tidak Boleh Kosong");
            } else if (txtDetail_Jenis.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Detail Jenis Tidak Boleh Kosong");
            } else {
                int opsi = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menyimpan data ini ?", "Simpan Data", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                switch (opsi) {
                    case JOptionPane.YES_OPTION:
                        insertJenisMenu(id_jenis, jenis, detail_jenis);
                        JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
                        break;
                    case JOptionPane.NO_OPTION:
                        JOptionPane.showMessageDialog(null, "Data tidak disimpan");
                        break;
                }
            }
        } catch (Exception t) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan!");
        }
        showTable();
        clear();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void tblJenisMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblJenisMenuMouseClicked
        // TODO add your handling code here:
        int row = tblJenisMenu.getSelectedRow();
        txtID_Jenis.setText(tblJenisMenu.getValueAt(row, 0).toString());
        txtJenis.setText(tblJenisMenu.getValueAt(row, 1).toString());
        txtDetail_Jenis.setText(tblJenisMenu.getValueAt(row, 2).toString());
        btnRubah.setEnabled(true);
        btnHapus.setEnabled(true);
        btnSimpan.setEnabled(false);
        btnBaru.setEnabled(true);
        btnCari.setEnabled(false);
        showTable();
    }//GEN-LAST:event_tblJenisMenuMouseClicked

    private void txtID_JenisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtID_JenisMouseClicked
        // TODO add your handling code here:
        btnSimpan.setEnabled(true);
        btnBaru.setEnabled(true);
        btnCari.setEnabled(false);
    }//GEN-LAST:event_txtID_JenisMouseClicked

    private void btnJenisMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJenisMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJenisMenuActionPerformed

    public void deleteJenisMenu(String idJenisMenu) {
        try {
            String sql = "DELETE FROM jenis_menu WHERE id_jenis =?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, idJenisMenu);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(JenisMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertJenisMenu(String id_jenis, String jenis, String detail_jenis) {
        try {
            String sql = "INSERT INTO jenis_menu (id_jenis, jenis, detail_jenis) VALUES (?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, id_jenis);
            pst.setString(2, jenis);
            pst.setString(3, detail_jenis);
            pst.execute();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public ResultSet selectJenisMenu() {
        try {
            String sql = "SELECT * FROM jenis_menu";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public void updateJenisMenu(String id_jenis, String jenis, String detail_jenis) {
        try {
            String sql = "UPDATE jenis_menu SET jenis=?, detail_jenis=? WHERE id_jenis=?";
            pst = conn.prepareStatement(sql);
            pst.setString(3, id_jenis);
            pst.setString(1, jenis);
            pst.setString(2, detail_jenis);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public void clear() {
        txtID_Jenis.setText("");
        txtJenis.setText("");
        txtDetail_Jenis.setText("");
        btnRubah.setEnabled(false);
        btnHapus.setEnabled(false);
        btnSimpan.setEnabled(true);
    }

    public void showTable() {
        try {
            tbmJenisMenu = new DefaultTableModel(new String[]{"ID Jenis", "Jenis", "Detail Jenis"}, 0);
            ResultSet rs;
            rs = selectJenisMenu();
            while (rs.next()) {
                tbmJenisMenu.addRow(new Object[]{
                    rs.getString("id_jenis"),
                    rs.getString("jenis"),
                    rs.getString("detail_jenis")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(JenisMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        tblJenisMenu.setModel(tbmJenisMenu);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JenisMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JenisMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JenisMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JenisMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JenisMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup RbtnJenis_Kelamin;
    private javax.swing.JButton btnBaru;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnJenis_Menu;
    private javax.swing.JButton btnLaporan;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnPegawai;
    private javax.swing.JButton btnPembayaran;
    private javax.swing.JButton btnPemesanan;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRubah;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblJenisMenu;
    private javax.swing.JTextField txtDetail_Jenis;
    private javax.swing.JTextField txtID_Jenis;
    private javax.swing.JTextField txtJenis;
    private javax.swing.JTextField txtjenis;
    // End of variables declaration//GEN-END:variables
}
