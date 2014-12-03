package GUIs;

import configs.Config;
import javax.swing.JOptionPane;

public class f_dangnhap extends javax.swing.JFrame {

    private static f_dangnhap _instance; //Kiểm tra sự tồn tại của 2 instance trong cùng 1 form
    
    private Config conn;
    public f_dangnhap(Config conn) {
        this.conn = conn;
        initComponents();
    }

    public static f_dangnhap getInstance(Config conn) {
        if (_instance == null) {
            _instance = new f_dangnhap(conn);
        }
        return _instance;
    }

    public void createAndShowUI() {
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnchinh = new javax.swing.JPanel();
        lbtaikhoan = new javax.swing.JLabel();
        lbmatkhau = new javax.swing.JLabel();
        tftaikhoan = new javax.swing.JTextField();
        tfmatkhau = new javax.swing.JPasswordField();
        btndangnhap = new javax.swing.JButton();
        btnthoat = new javax.swing.JButton();
        lbquyen = new javax.swing.JLabel();
        cbbquyen = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        setMaximumSize(new java.awt.Dimension(400, 250));
        setMinimumSize(new java.awt.Dimension(400, 250));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 250));
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lbtaikhoan.setText("Tài khoản:");

        lbmatkhau.setText("Mật khẩu:");

        btndangnhap.setText("Đăng nhập");
        btndangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangnhapActionPerformed(evt);
            }
        });

        btnthoat.setText("Thoát");
        btnthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoatActionPerformed(evt);
            }
        });

        lbquyen.setText("Nhóm quyền:");

        cbbquyen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chọn nhóm quyền", "Quản lý", "Nhân viên" }));

        javax.swing.GroupLayout pnchinhLayout = new javax.swing.GroupLayout(pnchinh);
        pnchinh.setLayout(pnchinhLayout);
        pnchinhLayout.setHorizontalGroup(
            pnchinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnchinhLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnchinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnchinhLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btndangnhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnthoat, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                        .addGap(39, 39, 39))
                    .addGroup(pnchinhLayout.createSequentialGroup()
                        .addGroup(pnchinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnchinhLayout.createSequentialGroup()
                                .addComponent(lbmatkhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(19, 19, 19))
                            .addGroup(pnchinhLayout.createSequentialGroup()
                                .addComponent(lbtaikhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(15, 15, 15))
                            .addComponent(lbquyen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(69, 69, 69)
                        .addGroup(pnchinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tftaikhoan)
                            .addComponent(cbbquyen, 0, 187, Short.MAX_VALUE)
                            .addComponent(tfmatkhau))))
                .addGap(32, 32, 32))
        );
        pnchinhLayout.setVerticalGroup(
            pnchinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnchinhLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pnchinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnchinhLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbtaikhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tftaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnchinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnchinhLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbmatkhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tfmatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnchinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnchinhLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbquyen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cbbquyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnchinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndangnhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnchinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnchinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btndangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangnhapActionPerformed
        String quyen = cbbquyen.getSelectedItem().toString();
        if ("Quản lý".equals(quyen)) {
            f_quanly quanly = new f_quanly(this.conn);
            quanly.setVisible(true);
            this.setVisible(false);
        } else if ("Nhân viên".equals(quyen)) {
            f_nhanvien nhanvien = new f_nhanvien(this.conn);
            nhanvien.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một nhóm quyền cụ thể!");
            cbbquyen.requestFocus();
        }
    }//GEN-LAST:event_btndangnhapActionPerformed

    private void btnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoatActionPerformed
       this.conn.closeConn();
        this.dispose();
    }//GEN-LAST:event_btnthoatActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.conn.closeConn();
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndangnhap;
    private javax.swing.JButton btnthoat;
    private javax.swing.JComboBox cbbquyen;
    private javax.swing.JLabel lbmatkhau;
    private javax.swing.JLabel lbquyen;
    private javax.swing.JLabel lbtaikhoan;
    private javax.swing.JPanel pnchinh;
    private javax.swing.JPasswordField tfmatkhau;
    private javax.swing.JTextField tftaikhoan;
    // End of variables declaration//GEN-END:variables
}
