/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gacoan;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
 * @author ACER
 */
public class Laporan extends javax.swing.JFrame {

    /**
     * Creates new form Laporan
     */
    public Laporan() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnCtkPegawai = new javax.swing.JButton();
        BtnCtkMenu = new javax.swing.JButton();
        BtnctkJMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnCtkPembayaran = new javax.swing.JButton();
        BtnCtkPemesanan = new javax.swing.JButton();
        BtnCtkDPemesanan = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnPegawai = new javax.swing.JButton();
        btbMenu = new javax.swing.JButton();
        btnJenisMenu = new javax.swing.JButton();
        btnPembayaran = new javax.swing.JButton();
        btnLaporan = new javax.swing.JButton();
        btnctkmenu = new javax.swing.JButton();
        btnctkpemesanan = new javax.swing.JButton();
        btnctkpegawai = new javax.swing.JButton();
        btnctkjenismenu = new javax.swing.JButton();
        btnctkdetailpemesanan = new javax.swing.JButton();
        btnctkpembayaran = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnCtkPegawai.setBackground(new java.awt.Color(153, 153, 153));
        BtnCtkPegawai.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Downloads\\icon\\lap denda.png")); // NOI18N
        BtnCtkPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCtkPegawaiActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCtkPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 100, 90));

        BtnCtkMenu.setBackground(new java.awt.Color(153, 153, 153));
        BtnCtkMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Downloads\\icon\\lap data master.png")); // NOI18N
        BtnCtkMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCtkMenuActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCtkMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 110, 90));

        BtnctkJMenu.setBackground(new java.awt.Color(153, 153, 153));
        BtnctkJMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Downloads\\icon\\lap denda-1.png")); // NOI18N
        BtnctkJMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnctkJMenuActionPerformed(evt);
            }
        });
        getContentPane().add(BtnctkJMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 110, 90));

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 80)); // NOI18N
        jLabel1.setText("Laporan");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 290, 100));

        jLabel2.setFont(new java.awt.Font("Garamond", 1, 65)); // NOI18N
        jLabel2.setText("Mie Gacoan Jember");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        jLabel3.setText("Jl. Sumatra No.82, Tegal Boto Lor, Sumbersari, Kec. Sumbersari, Kabupaten Jember, Jawa Timur 68121");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        BtnCtkPembayaran.setBackground(new java.awt.Color(153, 153, 153));
        BtnCtkPembayaran.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Downloads\\icon\\lap peminjaman-1.png")); // NOI18N
        BtnCtkPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCtkPembayaranActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCtkPembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 390, 100, -1));

        BtnCtkPemesanan.setBackground(new java.awt.Color(153, 153, 153));
        BtnCtkPemesanan.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Downloads\\icon\\lap data master-1.png")); // NOI18N
        BtnCtkPemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCtkPemesananActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCtkPemesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 110, 90));

        BtnCtkDPemesanan.setBackground(new java.awt.Color(153, 153, 153));
        BtnCtkDPemesanan.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Downloads\\icon\\lap peminjaman.png")); // NOI18N
        BtnCtkDPemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCtkDPemesananActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCtkDPemesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoGacoan.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 140, 160));

        btnPegawai.setBackground(new java.awt.Color(153, 153, 153));
        btnPegawai.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        btnPegawai.setText("Pegawai");
        btnPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPegawaiActionPerformed(evt);
            }
        });
        getContentPane().add(btnPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 260, 30));

        btbMenu.setBackground(new java.awt.Color(153, 153, 153));
        btbMenu.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        btbMenu.setText("Menu");
        getContentPane().add(btbMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 260, 30));

        btnJenisMenu.setBackground(new java.awt.Color(153, 153, 153));
        btnJenisMenu.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        btnJenisMenu.setText("Jenis Menu");
        getContentPane().add(btnJenisMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 260, 30));

        btnPembayaran.setBackground(new java.awt.Color(153, 153, 153));
        btnPembayaran.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        btnPembayaran.setText("Pembayaran");
        getContentPane().add(btnPembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 260, 30));

        btnLaporan.setBackground(new java.awt.Color(153, 153, 153));
        btnLaporan.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        btnLaporan.setText("Laporan");
        getContentPane().add(btnLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 260, 30));

        btnctkmenu.setBackground(new java.awt.Color(153, 153, 153));
        btnctkmenu.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnctkmenu.setText("Menu");
        btnctkmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnctkmenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnctkmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, -1, -1));

        btnctkpemesanan.setBackground(new java.awt.Color(153, 153, 153));
        btnctkpemesanan.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnctkpemesanan.setText("Pemesanan");
        btnctkpemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnctkpemesananActionPerformed(evt);
            }
        });
        getContentPane().add(btnctkpemesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 110, -1));

        btnctkpegawai.setBackground(new java.awt.Color(153, 153, 153));
        btnctkpegawai.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnctkpegawai.setText("Pegawai");
        btnctkpegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnctkpegawaiActionPerformed(evt);
            }
        });
        getContentPane().add(btnctkpegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 330, -1, -1));

        btnctkjenismenu.setBackground(new java.awt.Color(153, 153, 153));
        btnctkjenismenu.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnctkjenismenu.setText("Jenis Menu");
        btnctkjenismenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnctkjenismenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnctkjenismenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, -1, -1));

        btnctkdetailpemesanan.setBackground(new java.awt.Color(153, 153, 153));
        btnctkdetailpemesanan.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnctkdetailpemesanan.setText("Detail Pemesanan");
        btnctkdetailpemesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnctkdetailpemesananActionPerformed(evt);
            }
        });
        getContentPane().add(btnctkdetailpemesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, -1, -1));

        btnctkpembayaran.setBackground(new java.awt.Color(153, 153, 153));
        btnctkpembayaran.setFont(new java.awt.Font("Garamond", 1, 14)); // NOI18N
        btnctkpembayaran.setText("Pembayaran");
        btnctkpembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnctkpembayaranActionPerformed(evt);
            }
        });
        getContentPane().add(btnctkpembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 490, -1, -1));

        btnLogOut.setBackground(new java.awt.Color(236, 0, 141));
        btnLogOut.setFont(new java.awt.Font("Garamond", 3, 15)); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 110, 30));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 260, 290));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Bacground.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1080, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCtkPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCtkPegawaiActionPerformed
        // TODO add your handling code here:
           Connection conn = Connections.Koneksi.cekKoneksi();
           try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mie_gacoan_jember", "root", "");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
            }catch (SQLException ex) {
            Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           //Sesuai kan dengan tempat laptop anda
           String file = "C:\\Users\\ACER\\Desktop\\PROJEC_WSIBD\\MieGacoanJember\\src\\Report\\ReportPegawai.jrxml"; 
           
        try {
            JasperReport jr = JasperCompileManager.compileReport(file);
            JasperPrint jp = JasperFillManager.fillReport(jr,null,conn);
            JasperViewer.viewReport(jp);

        } catch (JRException ex) {
            Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnCtkPegawaiActionPerformed

    private void BtnCtkMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCtkMenuActionPerformed
        // TODO add your handling code here:
        Connection conn = Connections.Koneksi.cekKoneksi();
           try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mie_gacoan_jember", "root", "");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
            }catch (SQLException ex) {
            Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           //Sesuai kan dengan tempat laptop anda
           String file = "C:\\Users\\ACER\\Desktop\\PROJEC_WSIBD\\MieGacoanJember\\src\\Report\\ReportMenu.jrxml";
           
        try {
            JasperReport jr = JasperCompileManager.compileReport(file);
            JasperPrint jp = JasperFillManager.fillReport(jr,null,conn);
            JasperViewer.viewReport(jp);

        } catch (JRException ex) {
            Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnCtkMenuActionPerformed

    private void BtnctkJMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnctkJMenuActionPerformed
        // TODO add your handling code here:
        Connection conn = Connections.Koneksi.cekKoneksi();
           try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mie_gacoan_jember", "root", "");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
            }catch (SQLException ex) {
            Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           //Sesuai kan dengan tempat laptop anda
           String file = "C:\\Users\\ACER\\Desktop\\PROJEC_WSIBD\\MieGacoanJember\\src\\Report\\ReportJenisMenu.jrxml";
           
        try {
            JasperReport jr = JasperCompileManager.compileReport(file);
            JasperPrint jp = JasperFillManager.fillReport(jr,null,conn);
            JasperViewer.viewReport(jp);

        } catch (JRException ex) {
            Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnctkJMenuActionPerformed

    private void BtnCtkPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCtkPembayaranActionPerformed
        // TODO add your handling code here:
        
        Connection conn = Connections.Koneksi.cekKoneksi();
           try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mie_gacoan_jember", "root", "");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
            }catch (SQLException ex) {
            Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           //Sesuai kan dengan tempat laptop anda
           String file = "C:\\Users\\ACER\\Desktop\\PROJEC_WSIBD\\MieGacoanJember\\src\\Report\\RepotPembayaran.jrxml";
           
        try {
            JasperReport jr = JasperCompileManager.compileReport(file);
            JasperPrint jp = JasperFillManager.fillReport(jr,null,conn);
            JasperViewer.viewReport(jp);

        } catch (JRException ex) {
            Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnCtkPembayaranActionPerformed

    private void BtnCtkPemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCtkPemesananActionPerformed
        // TODO add your handling code here:
        Connection conn = Connections.Koneksi.cekKoneksi();
           try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mie_gacoan_jember", "root", "");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
            }catch (SQLException ex) {
            Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           //Sesuai kan dengan tempat laptop anda
           String file = "C:\\Users\\ACER\\Desktop\\PROJEC_WSIBD\\MieGacoanJember\\src\\Report\\ReportPemesanan.jrxml";
           
        try {
            JasperReport jr = JasperCompileManager.compileReport(file);
            JasperPrint jp = JasperFillManager.fillReport(jr,null,conn);
            JasperViewer.viewReport(jp);

        } catch (JRException ex) {
            Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnCtkPemesananActionPerformed

    private void BtnCtkDPemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCtkDPemesananActionPerformed
        // TODO add your handling code here:
        Connection conn = Connections.Koneksi.cekKoneksi();
           try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mie_gacoan_jember", "root", "");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
            }catch (SQLException ex) {
            Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           //Sesuai kan dengan tempat laptop anda
           String file = "C:\\Users\\ACER\\Desktop\\PROJEC_WSIBD\\MieGacoanJember\\src\\Report\\ReportDetailPemesanan.jrxml";
           
        try {
            JasperReport jr = JasperCompileManager.compileReport(file);
            JasperPrint jp = JasperFillManager.fillReport(jr,null,conn);
            JasperViewer.viewReport(jp);

        } catch (JRException ex) {
            Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnCtkDPemesananActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegawaiActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnPegawaiActionPerformed

    private void btnctkmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnctkmenuActionPerformed
        // TODO add your handling code here:
        Connection conn = Connections.Koneksi.cekKoneksi();
           try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mie_gacoan_jember", "root", "");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
            }catch (SQLException ex) {
            Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           //Sesuai kan dengan tempat laptop anda
           String file = "C:\\Users\\ACER\\Desktop\\PROJEC_WSIBD\\MieGacoanJember\\src\\Report\\ReportMenu.jrxml";
           
        try {
            JasperReport jr = JasperCompileManager.compileReport(file);
            JasperPrint jp = JasperFillManager.fillReport(jr,null,conn);
            JasperViewer.viewReport(jp);

        } catch (JRException ex) {
            Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnctkmenuActionPerformed

    private void btnctkpemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnctkpemesananActionPerformed
        // TODO add your handling code here:
        Connection conn = Connections.Koneksi.cekKoneksi();
           try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mie_gacoan_jember", "root", "");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
            }catch (SQLException ex) {
            Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           //Sesuai kan dengan tempat laptop anda
           String file = "C:\\Users\\ACER\\Desktop\\PROJEC_WSIBD\\MieGacoanJember\\src\\Report\\ReportPemesanan.jrxml";
           
        try {
            JasperReport jr = JasperCompileManager.compileReport(file);
            JasperPrint jp = JasperFillManager.fillReport(jr,null,conn);
            JasperViewer.viewReport(jp);

        } catch (JRException ex) {
            Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnctkpemesananActionPerformed

    private void btnctkpegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnctkpegawaiActionPerformed
        // TODO add your handling code here:
        Connection conn = Connections.Koneksi.cekKoneksi();
           try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mie_gacoan_jember", "root", "");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
            }catch (SQLException ex) {
            Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           //Sesuai kan dengan tempat laptop anda
           String file = "C:\\Users\\ACER\\Desktop\\PROJEC_WSIBD\\MieGacoanJember\\src\\Report\\ReportPegawai.jrxml";
           
        try {
            JasperReport jr = JasperCompileManager.compileReport(file);
            JasperPrint jp = JasperFillManager.fillReport(jr,null,conn);
            JasperViewer.viewReport(jp);

        } catch (JRException ex) {
            Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnctkpegawaiActionPerformed

    private void btnctkjenismenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnctkjenismenuActionPerformed
        // TODO add your handling code here:
        Connection conn = Connections.Koneksi.cekKoneksi();
           try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mie_gacoan_jember", "root", "");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
            }catch (SQLException ex) {
            Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           //Sesuai kan dengan tempat laptop anda
           String file = "C:\\Users\\ACER\\Desktop\\PROJEC_WSIBD\\MieGacoanJember\\src\\Report\\ReportJenisMenu.jrxml";
           
        try {
            JasperReport jr = JasperCompileManager.compileReport(file);
            JasperPrint jp = JasperFillManager.fillReport(jr,null,conn);
            JasperViewer.viewReport(jp);

        } catch (JRException ex) {
            Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnctkjenismenuActionPerformed

    private void btnctkdetailpemesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnctkdetailpemesananActionPerformed
        // TODO add your handling code here:
        Connection conn = Connections.Koneksi.cekKoneksi();
           try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mie_gacoan_jember", "root", "");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
            }catch (SQLException ex) {
            Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           //Sesuai kan dengan tempat laptop anda
           String file = "C:\\Users\\ACER\\Desktop\\PROJEC_WSIBD\\MieGacoanJember\\src\\Report\\ReportDetailPemesanan.jrxml";
           
        try {
            JasperReport jr = JasperCompileManager.compileReport(file);
            JasperPrint jp = JasperFillManager.fillReport(jr,null,conn);
            JasperViewer.viewReport(jp);

        } catch (JRException ex) {
            Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnctkdetailpemesananActionPerformed

    private void btnctkpembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnctkpembayaranActionPerformed
        // TODO add your handling code here:
        Connection conn = Connections.Koneksi.cekKoneksi();
           try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mie_gacoan_jember", "root", "");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
            }catch (SQLException ex) {
            Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           //Sesuai kan dengan tempat laptop anda
           String file = "C:\\Users\\ACER\\Desktop\\PROJEC_WSIBD\\MieGacoanJember\\src\\Report\\RepotPembayaran.jrxml";
           
        try {
            JasperReport jr = JasperCompileManager.compileReport(file);
            JasperPrint jp = JasperFillManager.fillReport(jr,null,conn);
            JasperViewer.viewReport(jp);

        } catch (JRException ex) {
            Logger.getLogger(Laporan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnctkpembayaranActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Laporan().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCtkDPemesanan;
    private javax.swing.JButton BtnCtkMenu;
    private javax.swing.JButton BtnCtkPegawai;
    private javax.swing.JButton BtnCtkPembayaran;
    private javax.swing.JButton BtnCtkPemesanan;
    private javax.swing.JButton BtnctkJMenu;
    private javax.swing.JButton btbMenu;
    private javax.swing.JButton btnJenisMenu;
    private javax.swing.JButton btnLaporan;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnPegawai;
    private javax.swing.JButton btnPembayaran;
    private javax.swing.JButton btnctkdetailpemesanan;
    private javax.swing.JButton btnctkjenismenu;
    private javax.swing.JButton btnctkmenu;
    private javax.swing.JButton btnctkpegawai;
    private javax.swing.JButton btnctkpembayaran;
    private javax.swing.JButton btnctkpemesanan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
