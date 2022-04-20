package tubes_hotel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Driver extends javax.swing.JFrame {
    Koneksi conn;
    String status;
    DefaultListModel<String> listKaryawan = new DefaultListModel<>();
    LoginPage lp = new LoginPage();

    public Driver() {
        initComponents();
        conn = new Koneksi();
        tampilData();
    }
    
    private void tampilData(){
        listKaryawan.clear();
        try{
            String sql = "SELECT * FROM karyawan";
            ResultSet rs = conn.getData(sql);
            while(rs.next()){
                String nama = rs.getString(2);
                listKaryawan.addElement(nama);
            }
            JListKaryawan.setModel(listKaryawan);
        } catch (SQLException ex) {
            System.err.print(ex);
        }
    }
    
    public void TampilText(){
        try{
            String sql = "SELECT * FROM karyawan WHERE nama = '"+ 
                    (JListKaryawan.getSelectedValue()) +"'";
            ResultSet rs = conn.getData(sql);
            while(rs.next()){
                String nama = rs.getString(2);
                String posisi = rs.getString(3);
                String gender = rs.getString(4);
                Date tglLahir = rs.getDate(5);
                labelNama.setText(nama);
                labelPosisi.setText(posisi);
                labelPosisi2.setText(gender);
                labelTanggalLahir.setText(tglLahir.toString());
            }
        } catch (SQLException ex) {
            System.err.print(ex);
        }
    }
    
    public String getTxtName(){
        return txtNama.getText();
    }
    
    public String getRadioPosisi(){
        if(radioStaff.isSelected()) {
            return "Staf";
        }else return "Manajer";
    }
    
     public String getRadioPosisi2(){
        if(radioPria.isSelected()) {
            return "Pria";
        }else return "Wanita";
    }
    
    public LocalDate getBornDate(){
        LocalDate born = LocalDate.of(
            Integer.parseInt(comboYear.getSelectedItem().toString()), 
            comboMonth.getSelectedIndex()+1, 
            Integer.parseInt(comboDay.getSelectedItem().toString())
        );
        return born;
    }
    
    public void clearText(){
        txtNama.setText(null);
        btnGroupPosisi.clearSelection();
    }
    
    // Automata
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogForm = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        radioStaff = new javax.swing.JRadioButton();
        radioManajer = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        comboDay = new javax.swing.JComboBox<>();
        comboMonth = new javax.swing.JComboBox<>();
        comboYear = new javax.swing.JComboBox<>();
        btnSimpan = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        radioPria = new javax.swing.JRadioButton();
        radioWanita = new javax.swing.JRadioButton();
        btnGroupPosisi = new javax.swing.ButtonGroup();
        buttonGroupPosisi2 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelTanggalLahir = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        labelPosisi2 = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelPosisi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JListKaryawan = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();

        dialogForm.setMinimumSize(new java.awt.Dimension(333, 330));
        dialogForm.setResizable(false);

        jLabel5.setText("Nama");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Aksi karyawan");

        jLabel9.setText("Posisi");

        btnGroupPosisi.add(radioStaff);
        radioStaff.setText("Staf");

        btnGroupPosisi.add(radioManajer);
        radioManajer.setText("Manajer");
        radioManajer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioManajerActionPerformed(evt);
            }
        });

        jLabel10.setText("Tanggal Lahir");

        comboDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        comboMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "Mei", "Jun", "Jul", "Agu", "Sep", "Okt", "Nov", "Des" }));

        comboYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021" }));

        btnSimpan.setBackground(new java.awt.Color(153, 153, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        jLabel11.setText("Gender");

        buttonGroupPosisi2.add(radioPria);
        radioPria.setText("Pria");
        radioPria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPriaActionPerformed(evt);
            }
        });

        buttonGroupPosisi2.add(radioWanita);
        radioWanita.setText("Wanita");
        radioWanita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioWanitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogFormLayout = new javax.swing.GroupLayout(dialogForm.getContentPane());
        dialogForm.getContentPane().setLayout(dialogFormLayout);
        dialogFormLayout.setHorizontalGroup(
            dialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogFormLayout.createSequentialGroup()
                .addGroup(dialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogFormLayout.createSequentialGroup()
                        .addGroup(dialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dialogFormLayout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dialogFormLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogFormLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(dialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(dialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(dialogFormLayout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addGroup(dialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(dialogFormLayout.createSequentialGroup()
                                                    .addComponent(radioStaff)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(radioManajer))
                                                .addGroup(dialogFormLayout.createSequentialGroup()
                                                    .addComponent(radioPria)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(radioWanita))))
                                        .addGroup(dialogFormLayout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addComponent(comboDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(comboMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(comboYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(dialogFormLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(dialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogFormLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogFormLayout.createSequentialGroup()
                                .addGroup(dialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5))
                                .addGap(235, 235, 235)))))
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dialogFormLayout.setVerticalGroup(
            dialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogFormLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(dialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dialogFormLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(31, 31, 31))
                    .addGroup(dialogFormLayout.createSequentialGroup()
                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(dialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioStaff)
                            .addComponent(radioManajer))
                        .addGap(8, 8, 8)
                        .addGroup(dialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioPria)
                            .addComponent(radioWanita))
                        .addGap(18, 18, 18)
                        .addGroup(dialogFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addComponent(btnSimpan)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(185, 2, 2));

        jPanel1.setBackground(new java.awt.Color(185, 2, 2));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("List Karyawan");

        btnTambah.setBackground(new java.awt.Color(153, 153, 255));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUbah.setBackground(new java.awt.Color(153, 153, 255));
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama :");

        labelTanggalLahir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelTanggalLahir.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tanggal Lahir :");

        labelNama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelNama.setForeground(new java.awt.Color(255, 255, 255));

        labelPosisi2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPosisi2.setForeground(new java.awt.Color(255, 255, 255));

        btnHapus.setBackground(new java.awt.Color(153, 153, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Posisi :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender :");

        labelPosisi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPosisi.setForeground(new java.awt.Color(255, 255, 255));

        JListKaryawan.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        JListKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JListKaryawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JListKaryawan);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(120, 120, 120)
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPosisi, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel7)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelPosisi2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(318, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(68, 68, 68)
                .addComponent(labelPosisi, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(btnTambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(labelNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(7, 7, 7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jLabel4))
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(labelPosisi2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(310, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JListKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JListKaryawanMouseClicked
        if(evt.getClickCount()==1){
            TampilText();
        }
    }//GEN-LAST:event_JListKaryawanMouseClicked

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        dialogForm.show();
        dialogForm.setLocationRelativeTo(null);
        status = "Tambah Data";
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        dialogForm.show();
        dialogForm.setLocationRelativeTo(null);
        try{
            String sql = "SELECT * FROM karyawan WHERE nama = '"+ 
                    (JListKaryawan.getSelectedValue()) +"'";
            ResultSet rs = conn.getData(sql);
            while(rs.next()){
                String id = rs.getString(1);
                String nama = rs.getString(2);
                String posisi = rs.getString(3);
                String gender = rs.getString(4);
                Date tglLahir = rs.getDate(5);
                
                txtId.setText(id);
                txtNama.setText(nama);
                if("Staf".equals(posisi))radioStaff.setSelected(true);
                if("Manajer".equals(posisi))radioManajer.setSelected(true);
                if("Pria".equals(gender))radioPria.setSelected(true);
                if("Wanita".equals(gender))radioWanita.setSelected(true);
                comboYear.setSelectedItem(tglLahir.toString().substring(0, 4));
                comboMonth.setSelectedIndex(Integer.parseInt(tglLahir.toString().substring(5, 7))-1);
                comboDay.setSelectedItem(tglLahir.toString().substring(8, 10));
            }
            status = "Perbarui Data";
        } catch (SQLException ex) {
            System.err.print(ex);
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int app;
        if ((app = JOptionPane.showConfirmDialog(null, "Anda yakin akan menghapus data ? "
                + JListKaryawan.getSelectedValue()+ " ?", "Perhatian", JOptionPane.YES_NO_OPTION)) == 0){
            try {
                String sql = "DELETE FROM karyawan WHERE"
                + " nama = '" + JListKaryawan.getSelectedValue()+ "'";
                conn.query(sql);
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                tampilData();
            }catch (Exception ex) {
                System.err.print(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void radioWanitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioWanitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioWanitaActionPerformed

    private void radioPriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioPriaActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        if("Perbarui Data".equals(status)){
            try {
                String sql = "UPDATE karyawan SET "
                + "nama = '" + txtNama.getText() + "',"
                + "posisi = '" + getRadioPosisi() + "',"
                + "gender = '" + getRadioPosisi2() +"',"
                + "tgl_lahir = '" + getBornDate() + "' WHERE "
                + "id = '" + txtId.getText() + "'";
                conn.query(sql);
                JOptionPane.showMessageDialog(null, txtNama.getText() + " Berhasil Diperbarui");
                clearText();
                tampilData();
                dialogForm.hide();
            }catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }else{
            if (txtNama.getText().isEmpty() || !btnGroupPosisi.getSelection().isSelected()) {
                JOptionPane.showMessageDialog(null, "data tidak boleh kosong, " + "silahkan dilengkapi");
                txtNama.requestFocus();
            } else {
                try {
                    String sql = "INSERT INTO karyawan (nama, posisi, gender, tgl_lahir)"
                    + "VALUES ("
                    + "'" + getTxtName() + "',"
                    + "'" + getRadioPosisi() + "',"
                    + "'" + getRadioPosisi2() + "',"
                    + "'" + getBornDate() + "'"
                    + ");";
                    conn.query(sql);
                    JOptionPane.showMessageDialog(null, getTxtName() + " Berhasil Disimpan");
                    clearText();
                    tampilData();
                    dialogForm.hide();
                } catch (Exception ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void radioManajerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioManajerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioManajerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        lp.state = lp.state.AdminPanel;
        System.out.println("Admin Panel");
        new AdminPanel().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                System.out.println("List Karyawan");
                new Driver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JListKaryawan;
    private javax.swing.ButtonGroup btnGroupPosisi;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.ButtonGroup buttonGroupPosisi2;
    private javax.swing.JComboBox<String> comboDay;
    private javax.swing.JComboBox<String> comboMonth;
    private javax.swing.JComboBox<String> comboYear;
    private javax.swing.JDialog dialogForm;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelPosisi;
    private javax.swing.JLabel labelPosisi2;
    private javax.swing.JLabel labelTanggalLahir;
    private javax.swing.JRadioButton radioManajer;
    private javax.swing.JRadioButton radioPria;
    private javax.swing.JRadioButton radioStaff;
    private javax.swing.JRadioButton radioWanita;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables

}