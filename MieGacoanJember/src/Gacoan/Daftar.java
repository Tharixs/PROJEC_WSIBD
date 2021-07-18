/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gacoan;

import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import sun.java2d.pipe.SpanShapeRenderer;

/**
 *
 * @author Nabiyla Hamestuti
 */
public class Daftar extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    Connection conn;
    PreparedStatement pst;
    DefaultTableModel tbmPegawai;
    ResultSet rs;
    Statement st;
    Image image;
    String path;
    byte[] byteArr;
    ImageIcon icon;
    private byte[] foto;

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public Daftar() {
        initComponents();
        conn = Connections.Koneksi.cekKoneksi();
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
        Countainer = new javax.swing.JPanel();
        fieldUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JLabel();
        fieldPassword = new javax.swing.JPasswordField();
        btnDaftar = new javax.swing.JButton();
        btnMasuk = new javax.swing.JButton();
        txtPsw = new javax.swing.JLabel();
        txtUsername = new javax.swing.JLabel();
        Notice = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        info = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtID_Pegawai = new javax.swing.JTextField();
        txtAlamat_Kota = new javax.swing.JTextField();
        txtFoto = new javax.swing.JTextField();
        txtNo_Telepon = new javax.swing.JTextField();
        btnAttach = new javax.swing.JButton();
        RbtnPerempuan = new javax.swing.JRadioButton();
        RbtnLaki_Laki = new javax.swing.JRadioButton();
        JLabel = new javax.swing.JLabel();
        jdcTanggal_Lahir = new com.toedter.calendar.JDateChooser();
        txtTempat_Lahir = new javax.swing.JTextField();
        fieldPassword1 = new javax.swing.JPasswordField();
        txtNama_Pegawai = new javax.swing.JTextField();
        cmbJabatan = new javax.swing.JComboBox<>();
        fillback = new javax.swing.JPanel();
        Bacground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1680, 1050));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Countainer.setBackground(new java.awt.Color(255, 255, 255,177));
        Countainer.setMinimumSize(new java.awt.Dimension(1567, 944));
        Countainer.setPreferredSize(new java.awt.Dimension(1567, 944));
        Countainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fieldUsername.setFont(new java.awt.Font("Garamond", 1, 30)); // NOI18N
        fieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUsernameActionPerformed(evt);
            }
        });
        Countainer.add(fieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 165, 318, 44));

        txtPassword.setFont(new java.awt.Font("Garamond", 1, 30)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(204, 204, 204));
        txtPassword.setText("Passwoard");
        Countainer.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 855, 44));

        fieldPassword.setFont(new java.awt.Font("Garamond", 1, 30)); // NOI18N
        fieldPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fieldPasswordMouseClicked(evt);
            }
        });
        fieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPasswordActionPerformed(evt);
            }
        });
        Countainer.add(fieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 855, 44));

        btnDaftar.setBackground(new java.awt.Color(255, 0, 152));
        btnDaftar.setFont(new java.awt.Font("Garamond", 1, 30)); // NOI18N
        btnDaftar.setForeground(new java.awt.Color(255, 255, 255));
        btnDaftar.setText("Daftarkan");
        btnDaftar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 153)));
        btnDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarActionPerformed(evt);
            }
        });
        Countainer.add(btnDaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 860, 376, 62));

        btnMasuk.setBackground(new java.awt.Color(255, 0, 152));
        btnMasuk.setFont(new java.awt.Font("Garamond", 1, 30)); // NOI18N
        btnMasuk.setForeground(new java.awt.Color(255, 255, 255));
        btnMasuk.setText("Masuk");
        btnMasuk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 204)));
        btnMasuk.setPreferredSize(new java.awt.Dimension(169, 44));
        btnMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasukActionPerformed(evt);
            }
        });
        Countainer.add(btnMasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(1328, 165, -1, -1));

        txtPsw.setFont(new java.awt.Font("Garamond", 1, 30)); // NOI18N
        txtPsw.setText("Password ");
        Countainer.add(txtPsw, new org.netbeans.lib.awtextra.AbsoluteConstraints(985, 125, -1, -1));

        txtUsername.setFont(new java.awt.Font("Garamond", 1, 30)); // NOI18N
        txtUsername.setText("Nama / Username ");
        Countainer.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 125, -1, -1));

        Notice.setBackground(new java.awt.Color(6, 181, 217,58));
        Notice.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoGacoan.png"))); // NOI18N
        Notice.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        info.setBackground(new java.awt.Color(255, 255, 255,0));

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 30)); // NOI18N
        jLabel1.setText("NOTICE !!!");

        jLabel2.setFont(new java.awt.Font("Garamond", 1, 30)); // NOI18N
        jLabel2.setText("Halaman ini hanya ");

        jLabel3.setFont(new java.awt.Font("Garamond", 1, 30)); // NOI18N
        jLabel3.setText("untuk admin atau pelayan dari");

        jLabel4.setFont(new java.awt.Font("Garamond", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 255));
        jLabel4.setText("Mie");

        jLabel5.setFont(new java.awt.Font("Garamond", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("Gacoan");

        jLabel6.setFont(new java.awt.Font("Garamond", 1, 30)); // NOI18N
        jLabel6.setText("Terimakasih. :)");

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info);
        info.setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(95, 95, 95))))
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        Notice.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 404, 311));

        Countainer.add(Notice, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 142, 502, 780));

        jLabel7.setFont(new java.awt.Font("Garamond", 1, 55)); // NOI18N
        jLabel7.setText("Buat akun admin Anda!");
        Countainer.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, -1, -1));

        txtID_Pegawai.setFont(new java.awt.Font("Garamond", 1, 30)); // NOI18N
        txtID_Pegawai.setForeground(new java.awt.Color(204, 204, 204));
        txtID_Pegawai.setText("Kode Pegawai");
        txtID_Pegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtID_PegawaiMouseClicked(evt);
            }
        });
        txtID_Pegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID_PegawaiActionPerformed(evt);
            }
        });
        Countainer.add(txtID_Pegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 855, 44));

        txtAlamat_Kota.setFont(new java.awt.Font("Garamond", 1, 30)); // NOI18N
        txtAlamat_Kota.setForeground(new java.awt.Color(204, 204, 204));
        txtAlamat_Kota.setText("Alamat lengkap");
        txtAlamat_Kota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAlamat_KotaMouseClicked(evt);
            }
        });
        Countainer.add(txtAlamat_Kota, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 612, 855, 44));

        txtFoto.setFont(new java.awt.Font("Garamond", 1, 30)); // NOI18N
        txtFoto.setForeground(new java.awt.Color(204, 204, 204));
        txtFoto.setText("Masukkan foto Anda");
        Countainer.add(txtFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 744, 599, 44));

        txtNo_Telepon.setFont(new java.awt.Font("Garamond", 1, 30)); // NOI18N
        txtNo_Telepon.setForeground(new java.awt.Color(204, 204, 204));
        txtNo_Telepon.setText("No. HP / WhatsApp");
        txtNo_Telepon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNo_TeleponMouseClicked(evt);
            }
        });
        Countainer.add(txtNo_Telepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 678, 855, 44));

        btnAttach.setFont(new java.awt.Font("Garamond", 1, 30)); // NOI18N
        btnAttach.setForeground(new java.awt.Color(112, 112, 112));
        btnAttach.setText("Pilih file");
        btnAttach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAttachMouseClicked(evt);
            }
        });
        btnAttach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttachActionPerformed(evt);
            }
        });
        Countainer.add(btnAttach, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 744, 237, 44));

        RbtnPerempuan.setBackground(new java.awt.Color(255, 255, 255));
        RbtnJenis_Kelamin.add(RbtnPerempuan);
        RbtnPerempuan.setFont(new java.awt.Font("Garamond", 1, 30)); // NOI18N
        RbtnPerempuan.setForeground(new java.awt.Color(102, 102, 102));
        RbtnPerempuan.setText("Perempuan");
        RbtnPerempuan.setBorder(null);
        RbtnPerempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbtnPerempuanActionPerformed(evt);
            }
        });
        Countainer.add(RbtnPerempuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(853, 809, 190, 30));

        RbtnLaki_Laki.setBackground(new java.awt.Color(255, 255, 255));
        RbtnJenis_Kelamin.add(RbtnLaki_Laki);
        RbtnLaki_Laki.setFont(new java.awt.Font("Garamond", 1, 30)); // NOI18N
        RbtnLaki_Laki.setForeground(new java.awt.Color(102, 102, 102));
        RbtnLaki_Laki.setText("Laki - Laki");
        RbtnLaki_Laki.setBorder(null);
        RbtnLaki_Laki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbtnLaki_LakiActionPerformed(evt);
            }
        });
        Countainer.add(RbtnLaki_Laki, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 809, 190, 30));

        JLabel.setFont(new java.awt.Font("Garamond", 1, 30)); // NOI18N
        JLabel.setForeground(new java.awt.Color(204, 204, 204));
        JLabel.setText("Tanggal Lahir");
        JLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabelMouseClicked(evt);
            }
        });
        Countainer.add(JLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(945, 550, 520, 44));

        jdcTanggal_Lahir.setForeground(new java.awt.Color(204, 204, 204));
        jdcTanggal_Lahir.setToolTipText("");
        jdcTanggal_Lahir.setFont(new java.awt.Font("Garamond", 1, 30)); // NOI18N
        jdcTanggal_Lahir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdcTanggal_LahirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jdcTanggal_LahirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jdcTanggal_LahirMouseExited(evt);
            }
        });
        Countainer.add(jdcTanggal_Lahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(945, 550, 550, 44));

        txtTempat_Lahir.setFont(new java.awt.Font("Garamond", 1, 30)); // NOI18N
        txtTempat_Lahir.setForeground(new java.awt.Color(204, 204, 204));
        txtTempat_Lahir.setText("Tempat ");
        txtTempat_Lahir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTempat_LahirMouseClicked(evt);
            }
        });
        Countainer.add(txtTempat_Lahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, 290, 44));

        fieldPassword1.setFont(new java.awt.Font("Garamond", 1, 30)); // NOI18N
        fieldPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPassword1ActionPerformed(evt);
            }
        });
        Countainer.add(fieldPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(985, 165, 318, 44));

        txtNama_Pegawai.setFont(new java.awt.Font("Garamond", 1, 30)); // NOI18N
        txtNama_Pegawai.setForeground(new java.awt.Color(204, 204, 204));
        txtNama_Pegawai.setText("Nama / Username");
        txtNama_Pegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNama_PegawaiMouseClicked(evt);
            }
        });
        txtNama_Pegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNama_PegawaiActionPerformed(evt);
            }
        });
        Countainer.add(txtNama_Pegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 357, 855, 44));

        cmbJabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---PILIH---", "Manager", "Kasir", "Crew" }));
        Countainer.add(cmbJabatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, 850, 50));

        getContentPane().add(Countainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 53, 1567, 944));

        fillback.setBackground(new java.awt.Color(0, 179, 216,70));

        javax.swing.GroupLayout fillbackLayout = new javax.swing.GroupLayout(fillback);
        fillback.setLayout(fillbackLayout);
        fillbackLayout.setHorizontalGroup(
            fillbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1680, Short.MAX_VALUE)
        );
        fillbackLayout.setVerticalGroup(
            fillbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );

        getContentPane().add(fillback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 1050));

        Bacground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BacgroundAdmin.jpg"))); // NOI18N
        Bacground.setMaximumSize(new java.awt.Dimension(1680, 1050));
        Bacground.setMinimumSize(new java.awt.Dimension(1680, 1050));
        Bacground.setPreferredSize(new java.awt.Dimension(1680, 1050));
        getContentPane().add(Bacground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 1050));

        setSize(new java.awt.Dimension(1702, 1106));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasukActionPerformed
        // TODO add your handling code here:
//        String Username1 = "admin";
//        String Password1 = "123";
//        String Username2 = "admin";
//        String Password2 = "456";
//        if (Username1.equalsIgnoreCase(fieldUsername.getText()) && Password1.equalsIgnoreCase(fieldPassword.getText())) {
//            new Pemesanan().setVisible(true);
//            javax.swing.JOptionPane.showMessageDialog(null, "Login Berhasil!");
//            this.setVisible(false);
//        } else if (Username2.equalsIgnoreCase(fieldUsername.getText()) && Password2.equalsIgnoreCase(fieldPassword.getText())) {
//            new Pemesanan().setVisible(true);
//            javax.swing.JOptionPane.showMessageDialog(null, "Login Berhasil!");
//            this.setVisible(false);
//        } else {
//            javax.swing.JOptionPane.showMessageDialog(null, "Username/Password tidak Valid");
//            fieldUsername.setText("");
//            fieldPassword.setText("");
//            fieldUsername.requestFocus();

        try {
            String sql = "SELECT * FROM pegawai WHERE nama_pegawai='" + fieldUsername.getText() + "' AND password='" + fieldPassword1.getText() + "'";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                if (fieldUsername.getText().equals(rs.getString("nama_pegawai")) && fieldPassword1.getText().equals(rs.getString("password"))) {
                    JOptionPane.showMessageDialog(null, "berhasil login");
                    new Pegawai().setVisible(true);
                    this.setVisible(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "username atau password salah");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            System.out.println(e);
        }
    }//GEN-LAST:event_btnMasukActionPerformed

    private void btnDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarActionPerformed

        String id_pegawai, nama_pegawai, jenis_kelamin, tempat_lahir, alamat_kota, password, jabatan, no_telepon;
        Date tanggal_lahir = null;
        try {
            id_pegawai = txtID_Pegawai.getText();
            nama_pegawai = txtNama_Pegawai.getText();
            jenis_kelamin = RbtnJenis_Kelamin.getSelection().getActionCommand();
            RbtnLaki_Laki.setActionCommand("Laki - Laki");
            RbtnPerempuan.setActionCommand("Perempuan");
            if (RbtnLaki_Laki.isSelected()) {
                jenis_kelamin = "Laki - Laki";
            } else if (RbtnPerempuan.isSelected()) {
                jenis_kelamin = "Perempuan";
            }
            tempat_lahir = txtTempat_Lahir.getText();
            alamat_kota = txtTempat_Lahir.getText();
            password = txtPassword.getText();
            jabatan = (String) cmbJabatan.getSelectedItem();
            no_telepon = txtNo_Telepon.getText();
            if (!txtFoto.getText().equals("")) {
                ObjectOutputStream objectOutputStream = null;
                ByteArrayOutputStream output = new ByteArrayOutputStream();
                File img = new File(path);
                FileInputStream input = new FileInputStream(img);
                try {
                    byte[] buf = new byte[1024];
                    for (int readbyte; (readbyte = input.read(buf)) != -1;) {
                        output.write(buf, 0, readbyte);
                    }
                    byteArr = output.toByteArray();
                    setFoto(byteArr);
                } catch (IOException ex) {
                    Logger.getLogger(Pegawai.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try {
                if (txtID_Pegawai.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "ID Tidak Boleh Kosong");
                } else if (txtNama_Pegawai.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Nama Tidak Boleh Kosong");
                } else if (txtTempat_Lahir.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Tempat Lahir Tidak Boleh Kosong");
                } //            else if (jdcTanggal_Lahir.getDate().equals("")) {
                //                JOptionPane.showMessageDialog(null, "Tanggal Lahir Tidak Boleh Kosong");
                //            } 
                else if (txtTempat_Lahir.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Alamat Tidak Boleh Kosong");
                } else if (cmbJabatan.getSelectedItem().equals("")) {
                    JOptionPane.showMessageDialog(null, "Jabatan Tidak Boleh Kosong");
                } else if (txtNo_Telepon.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "No Telepon Tidak Boleh Kosong");
                } else if (txtPassword.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Password Tidak Boleh Kosong");
                } else {
                    int opsi = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menyimpan data ini ?", "Simpan Data", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    switch (opsi) {
                        case JOptionPane.YES_OPTION:
                            insertPegawai(id_pegawai, nama_pegawai, jenis_kelamin, tempat_lahir, tanggal_lahir, alamat_kota, password, jabatan, no_telepon, foto);
                            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
                            clear();
                            break;
                        case JOptionPane.NO_OPTION:
                            JOptionPane.showMessageDialog(null, "Data tidak disimpan");
                            break;
                    }
                }
            } catch (Exception t) {
                JOptionPane.showMessageDialog(null, "Data Gagal Disimpan!");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDaftarActionPerformed

    public void insertPegawai(String id_pegawai, String nama_pegawai, String jenis_kelamin, String tempat_lahir, Date tanggal_lahir, String alamat_kota, String password, String jabatan, String no_telepon, byte[] foto) {
        try {
            String sql = "INSERT INTO pegawai (id_pegawai, nama_pegawai, jenis_kelamin, tempat_lahir, tanggal_lahir, alamat_kota, password, jabatan, no_telepon, foto) VALUES (?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, id_pegawai);
            pst.setString(2, nama_pegawai);
            pst.setString(3, jenis_kelamin);
            pst.setString(4, tempat_lahir);
            pst.setString(5, ((JTextField) jdcTanggal_Lahir.getDateEditor().getUiComponent()).getText());
            pst.setString(6, alamat_kota);
            pst.setString(7, password);
            pst.setString(8, jabatan);
            pst.setString(9, no_telepon);
            pst.setBytes(10, foto);
            pst.execute();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
    
    public void clear() {
        txtID_Pegawai.setText("");
        txtNama_Pegawai.setText("");
        RbtnJenis_Kelamin.clearSelection();
        txtTempat_Lahir.setText("");
        jdcTanggal_Lahir.setCalendar(null);
        txtAlamat_Kota.setText("");
        cmbJabatan.setSelectedItem("");
        txtNo_Telepon.setText("");
        txtPassword.setText("");
        txtFoto.setText("");
    }
    private void fieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldUsernameActionPerformed

    private void RbtnLaki_LakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbtnLaki_LakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbtnLaki_LakiActionPerformed

    private void RbtnPerempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbtnPerempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RbtnPerempuanActionPerformed

    private void btnAttachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttachActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser(System.getProperty("user.home"));
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setFileFilter(new FileNameExtensionFilter("jpg|png|bmp", "jpg", "png", "bmp"));
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            try {
                if (file.length() == 10000) {
                    JOptionPane.showMessageDialog(rootPane, "Gambar terlalu besar", "Max 500kb", JOptionPane.WARNING_MESSAGE);
                }
                image = ImageIO.read(file);
                icon = new ImageIcon(image);
//                lblFoto.setIcon(icon);
                path = file.getAbsolutePath();
//                lblFoto.setVisible(true);
            } catch (IOException ex) {
                System.out.println("Gambar tidak berhasil dimuat " + ex);
            }
            txtFoto.setText(file.getAbsolutePath());
        }
    }//GEN-LAST:event_btnAttachActionPerformed

    private void fieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPasswordActionPerformed

    private void fieldPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPassword1ActionPerformed

    private void txtID_PegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID_PegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID_PegawaiActionPerformed

    private void txtNama_PegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNama_PegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNama_PegawaiActionPerformed

    private void txtID_PegawaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtID_PegawaiMouseClicked
        // TODO add your handling code here:
        txtID_Pegawai.setText("");
        txtID_Pegawai.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtID_PegawaiMouseClicked

    private void txtNama_PegawaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNama_PegawaiMouseClicked
        // TODO add your handling code here:
        txtNama_Pegawai.setText("");
        txtNama_Pegawai.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtNama_PegawaiMouseClicked

    private void fieldPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldPasswordMouseClicked
        // TODO add your handling code here:
        txtPassword.setText("");
        fieldPassword.setForeground(Color.BLACK);
    }//GEN-LAST:event_fieldPasswordMouseClicked

    private void txtTempat_LahirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTempat_LahirMouseClicked
        // TODO add your handling code here:
        txtTempat_Lahir.setText("");
        txtTempat_Lahir.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtTempat_LahirMouseClicked

    private void txtAlamat_KotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAlamat_KotaMouseClicked
        // TODO add your handling code here:
        txtAlamat_Kota.setText("");
        txtAlamat_Kota.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtAlamat_KotaMouseClicked

    private void txtNo_TeleponMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNo_TeleponMouseClicked
        // TODO add your handling code here:
        txtNo_Telepon.setText("");
        txtNo_Telepon.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtNo_TeleponMouseClicked

    private void btnAttachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAttachMouseClicked
        // TODO add your handling code here:
//        Lfoto.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnAttachMouseClicked

    private void JLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabelMouseClicked
        // TODO add your handling code here:
        JLabel.setText("");
    }//GEN-LAST:event_JLabelMouseClicked

    private void jdcTanggal_LahirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdcTanggal_LahirMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jdcTanggal_LahirMouseExited

    private void jdcTanggal_LahirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdcTanggal_LahirMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jdcTanggal_LahirMouseEntered

    private void jdcTanggal_LahirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdcTanggal_LahirMouseClicked
        // TODO add your handling code here:
        //        LTanggalLahir.setVisible(false);
    }//GEN-LAST:event_jdcTanggal_LahirMouseClicked

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
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Daftar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Daftar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bacground;
    private javax.swing.JPanel Countainer;
    private javax.swing.JLabel JLabel;
    private javax.swing.JPanel Notice;
    private javax.swing.ButtonGroup RbtnJenis_Kelamin;
    private javax.swing.JRadioButton RbtnLaki_Laki;
    private javax.swing.JRadioButton RbtnPerempuan;
    private javax.swing.JButton btnAttach;
    private javax.swing.JButton btnDaftar;
    private javax.swing.JButton btnMasuk;
    private javax.swing.JComboBox<String> cmbJabatan;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JPasswordField fieldPassword1;
    private javax.swing.JTextField fieldUsername;
    private javax.swing.JPanel fillback;
    private javax.swing.JPanel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private com.toedter.calendar.JDateChooser jdcTanggal_Lahir;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField txtAlamat_Kota;
    private javax.swing.JTextField txtFoto;
    private javax.swing.JTextField txtID_Pegawai;
    private javax.swing.JTextField txtNama_Pegawai;
    private javax.swing.JTextField txtNo_Telepon;
    private javax.swing.JLabel txtPassword;
    private javax.swing.JLabel txtPsw;
    private javax.swing.JTextField txtTempat_Lahir;
    private javax.swing.JLabel txtUsername;
    // End of variables declaration//GEN-END:variables
}
