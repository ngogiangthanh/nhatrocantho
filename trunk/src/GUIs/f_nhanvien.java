package GUIs;

import javax.swing.JOptionPane;

public class f_nhanvien extends javax.swing.JFrame {

    public f_nhanvien() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpchinh = new javax.swing.JTabbedPane();
        pnchunhatro = new javax.swing.JPanel();
        btnthemchunhatro = new javax.swing.JButton();
        btnsuachunhatro = new javax.swing.JButton();
        btnxoaxoachunhatro = new javax.swing.JButton();
        tftimchunhatro = new javax.swing.JTextField();
        btntimchunhatro = new javax.swing.JButton();
        sptbchunhatro = new javax.swing.JScrollPane();
        tbchunhatro = new javax.swing.JTable();
        btnrefreshchunhatro = new javax.swing.JButton();
        pnnguoithue = new javax.swing.JPanel();
        btnthemnguoithue = new javax.swing.JButton();
        btnsuanguoithue = new javax.swing.JButton();
        btnxoanguoithue = new javax.swing.JButton();
        tftimnguoithue = new javax.swing.JTextField();
        btntimnguoithue = new javax.swing.JButton();
        sptbnguoithue = new javax.swing.JScrollPane();
        tbnguoithue = new javax.swing.JTable();
        btnrefreshnguoithue = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        menuhethong = new javax.swing.JMenu();
        itemthongtin = new javax.swing.JMenuItem();
        itemdangxuat = new javax.swing.JMenuItem();
        itemthoat = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));

        btnthemchunhatro.setText("Thêm");

        btnsuachunhatro.setText("Sửa");

        btnxoaxoachunhatro.setText("Xóa");

        btntimchunhatro.setText("Tìm");

        tbchunhatro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "STT", "CMND", "Tên chủ nhà trọ", "Địa chỉ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbchunhatro.getTableHeader().setReorderingAllowed(false);
        sptbchunhatro.setViewportView(tbchunhatro);
        if (tbchunhatro.getColumnModel().getColumnCount() > 0) {
            tbchunhatro.getColumnModel().getColumn(0).setResizable(false);
            tbchunhatro.getColumnModel().getColumn(1).setResizable(false);
            tbchunhatro.getColumnModel().getColumn(2).setResizable(false);
            tbchunhatro.getColumnModel().getColumn(3).setResizable(false);
        }

        btnrefreshchunhatro.setText("Làm mới");

        javax.swing.GroupLayout pnchunhatroLayout = new javax.swing.GroupLayout(pnchunhatro);
        pnchunhatro.setLayout(pnchunhatroLayout);
        pnchunhatroLayout.setHorizontalGroup(
            pnchunhatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnchunhatroLayout.createSequentialGroup()
                .addComponent(tftimchunhatro, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btntimchunhatro)
                .addGap(6, 6, 6)
                .addComponent(btnthemchunhatro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsuachunhatro)
                .addGap(13, 13, 13)
                .addComponent(btnxoaxoachunhatro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnrefreshchunhatro)
                .addContainerGap(355, Short.MAX_VALUE))
            .addComponent(sptbchunhatro)
        );
        pnchunhatroLayout.setVerticalGroup(
            pnchunhatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnchunhatroLayout.createSequentialGroup()
                .addGroup(pnchunhatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tftimchunhatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntimchunhatro)
                    .addComponent(btnthemchunhatro)
                    .addComponent(btnsuachunhatro)
                    .addComponent(btnxoaxoachunhatro)
                    .addComponent(btnrefreshchunhatro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sptbchunhatro, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE))
        );

        tpchinh.addTab("Chủ nhà trọ", pnchunhatro);

        btnthemnguoithue.setText("Thêm");

        btnsuanguoithue.setText("Sửa");

        btnxoanguoithue.setText("Xóa");

        btntimnguoithue.setText("Tìm");

        tbnguoithue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "CMND", "Họ tên", "Giới tính", "Công việc"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbnguoithue.getTableHeader().setReorderingAllowed(false);
        sptbnguoithue.setViewportView(tbnguoithue);
        if (tbnguoithue.getColumnModel().getColumnCount() > 0) {
            tbnguoithue.getColumnModel().getColumn(0).setResizable(false);
            tbnguoithue.getColumnModel().getColumn(1).setResizable(false);
            tbnguoithue.getColumnModel().getColumn(2).setResizable(false);
            tbnguoithue.getColumnModel().getColumn(3).setResizable(false);
            tbnguoithue.getColumnModel().getColumn(4).setResizable(false);
        }

        btnrefreshnguoithue.setText("Làm mới");

        javax.swing.GroupLayout pnnguoithueLayout = new javax.swing.GroupLayout(pnnguoithue);
        pnnguoithue.setLayout(pnnguoithueLayout);
        pnnguoithueLayout.setHorizontalGroup(
            pnnguoithueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnnguoithueLayout.createSequentialGroup()
                .addComponent(tftimnguoithue, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btntimnguoithue)
                .addGap(6, 6, 6)
                .addComponent(btnthemnguoithue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsuanguoithue)
                .addGap(13, 13, 13)
                .addComponent(btnxoanguoithue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnrefreshnguoithue)
                .addContainerGap(355, Short.MAX_VALUE))
            .addComponent(sptbnguoithue)
        );
        pnnguoithueLayout.setVerticalGroup(
            pnnguoithueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnnguoithueLayout.createSequentialGroup()
                .addGroup(pnnguoithueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tftimnguoithue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntimnguoithue)
                    .addComponent(btnthemnguoithue)
                    .addComponent(btnsuanguoithue)
                    .addComponent(btnxoanguoithue)
                    .addComponent(btnrefreshnguoithue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sptbnguoithue, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE))
        );

        tpchinh.addTab("Người thuê", pnnguoithue);

        menuhethong.setText("Hệ thống");

        itemthongtin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        itemthongtin.setText("Thông tin phần mềm");
        itemthongtin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemthongtinActionPerformed(evt);
            }
        });
        menuhethong.add(itemthongtin);

        itemdangxuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        itemdangxuat.setText("Đăng xuất");
        itemdangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemdangxuatActionPerformed(evt);
            }
        });
        menuhethong.add(itemdangxuat);

        itemthoat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        itemthoat.setText("Thoát chương trình");
        itemthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemthoatActionPerformed(evt);
            }
        });
        menuhethong.add(itemthoat);

        menu.add(menuhethong);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpchinh)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpchinh)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemthongtinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemthongtinActionPerformed
        JOptionPane.showMessageDialog(this, "Nhóm phát triển Chuột.\nPhiên bản 0.1.","Thông tin phần mềm",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_itemthongtinActionPerformed

    private void itemdangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemdangxuatActionPerformed
        f_dangnhap dangnhap = f_dangnhap.getInstance();
        dangnhap.createAndShowUI();
        this.dispose();
    }//GEN-LAST:event_itemdangxuatActionPerformed

    private void itemthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemthoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_itemthoatActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnrefreshchunhatro;
    private javax.swing.JButton btnrefreshnguoithue;
    private javax.swing.JButton btnsuachunhatro;
    private javax.swing.JButton btnsuanguoithue;
    private javax.swing.JButton btnthemchunhatro;
    private javax.swing.JButton btnthemnguoithue;
    private javax.swing.JButton btntimchunhatro;
    private javax.swing.JButton btntimnguoithue;
    private javax.swing.JButton btnxoanguoithue;
    private javax.swing.JButton btnxoaxoachunhatro;
    private javax.swing.JMenuItem itemdangxuat;
    private javax.swing.JMenuItem itemthoat;
    private javax.swing.JMenuItem itemthongtin;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuhethong;
    private javax.swing.JPanel pnchunhatro;
    private javax.swing.JPanel pnnguoithue;
    private javax.swing.JScrollPane sptbchunhatro;
    private javax.swing.JScrollPane sptbnguoithue;
    private javax.swing.JTable tbchunhatro;
    private javax.swing.JTable tbnguoithue;
    private javax.swing.JTextField tftimchunhatro;
    private javax.swing.JTextField tftimnguoithue;
    private javax.swing.JTabbedPane tpchinh;
    // End of variables declaration//GEN-END:variables
}
