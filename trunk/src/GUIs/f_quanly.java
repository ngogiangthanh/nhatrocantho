package GUIs;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class f_quanly extends javax.swing.JFrame {

    public f_quanly() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupmenu = new javax.swing.JPopupMenu();
        itemsua = new javax.swing.JMenuItem();
        itemxoa = new javax.swing.JMenuItem();
        pnchinh = new javax.swing.JPanel();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        tftim = new javax.swing.JTextField();
        btntim = new javax.swing.JButton();
        spdsnv = new javax.swing.JScrollPane();
        tbdsnv = new javax.swing.JTable();
        btnrefresh = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        menuhethong = new javax.swing.JMenu();
        itemthongtin = new javax.swing.JMenuItem();
        itemdangxuat = new javax.swing.JMenuItem();
        itemthoat = new javax.swing.JMenuItem();

        itemsua.setText("Sửa");
        itemsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsuaActionPerformed(evt);
            }
        });
        popupmenu.add(itemsua);

        itemxoa.setText("Xóa");
        itemxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemxoaActionPerformed(evt);
            }
        });
        popupmenu.add(itemxoa);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));

        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        tftim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tftimKeyPressed(evt);
            }
        });

        btntim.setText("Tìm");
        btntim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimActionPerformed(evt);
            }
        });

        tbdsnv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "MSNV", "CMND", "Ho Tên", "Giới Tính", "Ngày Sinh", "SĐT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbdsnv.setComponentPopupMenu(popupmenu);
        tbdsnv.getTableHeader().setReorderingAllowed(false);
        spdsnv.setViewportView(tbdsnv);
        if (tbdsnv.getColumnModel().getColumnCount() > 0) {
            tbdsnv.getColumnModel().getColumn(0).setResizable(false);
            tbdsnv.getColumnModel().getColumn(1).setResizable(false);
            tbdsnv.getColumnModel().getColumn(2).setResizable(false);
            tbdsnv.getColumnModel().getColumn(3).setResizable(false);
            tbdsnv.getColumnModel().getColumn(4).setResizable(false);
            tbdsnv.getColumnModel().getColumn(5).setResizable(false);
            tbdsnv.getColumnModel().getColumn(6).setResizable(false);
        }
        tbdsnv.getAccessibleContext().setAccessibleName("");
        tbdsnv.getAccessibleContext().setAccessibleDescription("");

        btnrefresh.setText("Làm mới");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnchinhLayout = new javax.swing.GroupLayout(pnchinh);
        pnchinh.setLayout(pnchinhLayout);
        pnchinhLayout.setHorizontalGroup(
            pnchinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnchinhLayout.createSequentialGroup()
                .addComponent(tftim, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btntim)
                .addGap(6, 6, 6)
                .addComponent(btnthem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsua)
                .addGap(13, 13, 13)
                .addComponent(btnxoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnrefresh)
                .addContainerGap(360, Short.MAX_VALUE))
            .addComponent(spdsnv)
        );
        pnchinhLayout.setVerticalGroup(
            pnchinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnchinhLayout.createSequentialGroup()
                .addGroup(pnchinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnchinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnchinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tftim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btntim)
                        .addComponent(btnthem)
                        .addComponent(btnsua)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spdsnv, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE))
        );

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnchinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnchinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btntimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimActionPerformed
        this.search();
    }//GEN-LAST:event_btntimActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        f_nhanvien_them themnv = f_nhanvien_them.getInstance();
        themnv.createAndShowUI();
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        this.edit();

    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        this.delete();
    }//GEN-LAST:event_btnxoaActionPerformed

    private void itemthongtinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemthongtinActionPerformed
        JOptionPane.showMessageDialog(this, "Nhóm phát triển Chuột.\nPhiên bản 0.1.", "Thông tin phần mềm", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_itemthongtinActionPerformed

    private void itemdangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemdangxuatActionPerformed
        f_dangnhap dangnhap = f_dangnhap.getInstance();
        dangnhap.createAndShowUI();
        this.dispose();
    }//GEN-LAST:event_itemdangxuatActionPerformed

    private void itemthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemthoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_itemthoatActionPerformed

    private void tftimKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tftimKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.search();
        }
    }//GEN-LAST:event_tftimKeyPressed

    private void itemsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsuaActionPerformed
        this.edit();
    }//GEN-LAST:event_itemsuaActionPerformed

    private void itemxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemxoaActionPerformed
        this.delete();
    }//GEN-LAST:event_itemxoaActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void search() {
        JOptionPane.showMessageDialog(this, "Gọi hàm tìm kiếm.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }

    private void edit() {
        int row = tbdsnv.getSelectedRow();
        if (row != -1) {
            f_nhanvien_sua suanv = f_nhanvien_sua.getInstance();
            suanv.createAndShowUI();
        } else {
            JOptionPane.showMessageDialog(this, "Xin chọn một nhân viên sửa!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            btnsua.requestFocus();
        }
    }

    private void delete() {
        int row = tbdsnv.getSelectedRow();
        if (row != -1) {
            if (JOptionPane.showConfirmDialog(this, "Xác nhận xóa nhân viên này?", "Xác nhận", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "Gọi hàm xóa nhân viên", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Xin chọn một nhân viên xóa!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            btnxoa.requestFocus();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btntim;
    private javax.swing.JButton btnxoa;
    private javax.swing.JMenuItem itemdangxuat;
    private javax.swing.JMenuItem itemsua;
    private javax.swing.JMenuItem itemthoat;
    private javax.swing.JMenuItem itemthongtin;
    private javax.swing.JMenuItem itemxoa;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuhethong;
    private javax.swing.JPanel pnchinh;
    private javax.swing.JPopupMenu popupmenu;
    private javax.swing.JScrollPane spdsnv;
    private javax.swing.JTable tbdsnv;
    private javax.swing.JTextField tftim;
    // End of variables declaration//GEN-END:variables
}
