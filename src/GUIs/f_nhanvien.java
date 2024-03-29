package GUIs;

import configs.Config;
import controllers.ChuNhaTroController;
import controllers.NguoiThueController;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class f_nhanvien extends javax.swing.JFrame {
    private static f_nhanvien _instance;
    private final Config conn;
    private final ChuNhaTroController chus;
    private final NguoiThueController nguoithue;
    private String txttim;

    public f_nhanvien(Config conn) {
        this.conn = conn;
        this.chus = new ChuNhaTroController(this.conn);
        this.nguoithue = new NguoiThueController(this.conn);
        initComponents();
    }
    public static f_nhanvien getInstance(Config conn) {
        if (_instance == null) {
            _instance = new f_nhanvien(conn);
        } else {
            _instance.refresh(_instance.tbchunhatro, null);
        }
        return _instance;
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnthemchunhatro.setText("Thêm");
        btnthemchunhatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemchunhatroActionPerformed(evt);
            }
        });

        btnsuachunhatro.setText("Sửa");
        btnsuachunhatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuachunhatroActionPerformed(evt);
            }
        });

        btnxoaxoachunhatro.setText("Xóa");
        btnxoaxoachunhatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaxoachunhatroActionPerformed(evt);
            }
        });

        btntimchunhatro.setText("Tìm");

        tbchunhatro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên chủ nhà trọ", "CMND", "Địa chỉ"
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

        btnrefreshchunhatro.setText("Làm mới");
        btnrefreshchunhatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshchunhatroActionPerformed(evt);
            }
        });

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
                .addComponent(btnrefreshchunhatro))
            .addComponent(sptbchunhatro, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
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
        JOptionPane.showMessageDialog(this, "Nhóm phát triển Chuột.\nPhiên bản 0.1.", "Thông tin phần mềm", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_itemthongtinActionPerformed

    private void itemdangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemdangxuatActionPerformed
        f_dangnhap dangnhap = f_dangnhap.getInstance(this.conn);
        dangnhap.createAndShowUI();
        this.dispose();
    }//GEN-LAST:event_itemdangxuatActionPerformed

    private void itemthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemthoatActionPerformed
       this.conn.closeConn();
       this.dispose();
    }//GEN-LAST:event_itemthoatActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        chus.show(tbchunhatro,txttim);

        this.nguoithue.show(this.tbnguoithue);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.conn.closeConn();
    }//GEN-LAST:event_formWindowClosing


    private void btnthemchunhatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemchunhatroActionPerformed
        f_chunhatro_them add = f_chunhatro_them.getInstance(this.chus);
        add.createAndShowUI();
    }//GEN-LAST:event_btnthemchunhatroActionPerformed

    private void btnrefreshchunhatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshchunhatroActionPerformed
         this.refresh(tbchunhatro,null);
    }//GEN-LAST:event_btnrefreshchunhatroActionPerformed

    private void btnxoaxoachunhatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaxoachunhatroActionPerformed
         int row = tbchunhatro.getSelectedRow();
         if(row != -1){
             if(JOptionPane.showConfirmDialog(this,"Xác nhận xóa thông tin này","Xác nhận",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                 String txthoten = tbchunhatro.getValueAt(row,1).toString();
                 chus.delete(txthoten);
                 this.refresh(tbchunhatro,null);
             }
         } else {
                JOptionPane.showMessageDialog(this,"Bạn chưa chọn đối tượng để xóa");
                btnxoaxoachunhatro.requestFocus();
         }
    }//GEN-LAST:event_btnxoaxoachunhatroActionPerformed

    private void btnsuachunhatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuachunhatroActionPerformed
        int row = tbchunhatro.getSelectedRow();
        if(row != -1){
             
        } else {
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn đối tượng để sửa!");
            btnsuachunhatro.requestFocus();
        }
        
    }//GEN-LAST:event_btnsuachunhatroActionPerformed
    public void refresh(JTable table, String txttim){
        clearTable(table);
        chus.show(table,txttim);
    }
    private void clearTable(JTable tbchunhatro) {
        tbchunhatro.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "STT", "Tên chủ nhà trọ", "CMND", "Địa chỉ"
                }));
    }

    private void btnthemnguoithueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemnguoithueActionPerformed
       f_nguoithue_them nguoithue = f_nguoithue_them.getInstance(this.conn);
       nguoithue.createAndShowUI();
    }//GEN-LAST:event_btnthemnguoithueActionPerformed


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
