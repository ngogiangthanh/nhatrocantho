package GUIs;

import configs.Config;
import controllers.NguoiThueController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.GioiTinh;

public class f_nguoithue_them extends javax.swing.JFrame {

    private static f_nguoithue_them _instance;
    private final Config conn;
    private NguoiThueController nguoithue;

    public f_nguoithue_them(Config conn) {
        this.conn = conn;
        initComponents();
    }

    public static f_nguoithue_them getInstance(Config conn) {
        if (_instance == null) {
            _instance = new f_nguoithue_them(conn);
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
        btnluu = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnthoat = new javax.swing.JButton();
        lbcmnd = new javax.swing.JLabel();
        lbhoten = new javax.swing.JLabel();
        lbgioitinh = new javax.swing.JLabel();
        lbngaysinh = new javax.swing.JLabel();
        lbsdt = new javax.swing.JLabel();
        lbcongviec = new javax.swing.JLabel();
        tfcmnd = new javax.swing.JTextField();
        tfhoten = new javax.swing.JTextField();
        cbbgioitinh = new javax.swing.JComboBox();
        tfngaysinh = new org.jdesktop.swingx.JXDatePicker();
        tfsdt = new javax.swing.JTextField();
        tfcongviec = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnluu.setText("Lưu");
        btnluu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnluuActionPerformed(evt);
            }
        });

        btnreset.setText("Làm lại");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btnthoat.setText("Đóng");
        btnthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoatActionPerformed(evt);
            }
        });

        lbcmnd.setText("CMND:");

        lbhoten.setText("Họ tên:");

        lbgioitinh.setText("Giới tính");

        lbngaysinh.setText("Ngày sinh");

        lbsdt.setText("Số điện thoại:");

        lbcongviec.setText("Công việc hiện tại:");

        cbbgioitinh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chọn", "Nam", "Nữ" }));

        javax.swing.GroupLayout pnchinhLayout = new javax.swing.GroupLayout(pnchinh);
        pnchinh.setLayout(pnchinhLayout);
        pnchinhLayout.setHorizontalGroup(
            pnchinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnchinhLayout.createSequentialGroup()
                .addGroup(pnchinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnchinhLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btnluu)
                        .addGap(18, 18, 18)
                        .addComponent(btnreset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnthoat))
                    .addGroup(pnchinhLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(pnchinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnchinhLayout.createSequentialGroup()
                                .addComponent(lbhoten)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfhoten, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnchinhLayout.createSequentialGroup()
                                .addComponent(lbcmnd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfcmnd, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnchinhLayout.createSequentialGroup()
                                .addComponent(lbgioitinh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbgioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnchinhLayout.createSequentialGroup()
                                .addGroup(pnchinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbngaysinh)
                                    .addComponent(lbsdt)
                                    .addComponent(lbcongviec))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnchinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfngaysinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfcongviec))))))
                .addContainerGap(380, Short.MAX_VALUE))
        );
        pnchinhLayout.setVerticalGroup(
            pnchinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnchinhLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pnchinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbcmnd)
                    .addComponent(tfcmnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnchinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbhoten)
                    .addComponent(tfhoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnchinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbgioitinh)
                    .addComponent(cbbgioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnchinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnchinhLayout.createSequentialGroup()
                        .addComponent(lbngaysinh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbsdt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbcongviec))
                    .addGroup(pnchinhLayout.createSequentialGroup()
                        .addComponent(tfngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfcongviec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                .addGroup(pnchinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnluu)
                    .addComponent(btnreset)
                    .addComponent(btnthoat))
                .addContainerGap())
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnluuActionPerformed
        String txtcmnd = this.tfcmnd.getText();
        String txthoten = this.tfhoten.getText();
        String txtsdt = this.tfsdt.getText();
        String txtcongviec = this.tfcongviec.getText();
        // String txtgioitinh = this.cbbgioitinh.getSelectedItem().toString();
        Date ngaysinh = tfngaysinh.getDate();
        this.nguoithue = new NguoiThueController(this.conn);
        GioiTinh gt = (this.cbbgioitinh.getSelectedItem().toString().equals(GioiTinh.Nam)) ? GioiTinh.Nam : GioiTinh.Nữ;
        try {
            this.nguoithue.add(txtcmnd, txthoten, gt, txtsdt, ngaysinh, txtcongviec);
        } catch (ParseException ex) {
            Logger.getLogger(f_nguoithue_them.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnluuActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        this.tfcmnd.setText(null);
        this.tfhoten.setText(null);
        this.tfsdt.setText(null);
        this.tfcongviec.setText(null);
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnthoatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnluu;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnthoat;
    private javax.swing.JComboBox cbbgioitinh;
    private javax.swing.JLabel lbcmnd;
    private javax.swing.JLabel lbcongviec;
    private javax.swing.JLabel lbgioitinh;
    private javax.swing.JLabel lbhoten;
    private javax.swing.JLabel lbngaysinh;
    private javax.swing.JLabel lbsdt;
    private javax.swing.JPanel pnchinh;
    private javax.swing.JTextField tfcmnd;
    private javax.swing.JTextField tfcongviec;
    private javax.swing.JTextField tfhoten;
    private org.jdesktop.swingx.JXDatePicker tfngaysinh;
    private javax.swing.JTextField tfsdt;
    // End of variables declaration//GEN-END:variables
}
