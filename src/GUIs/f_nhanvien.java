/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

/**
 *
 * @author lenovo
 */
public class f_nhanvien extends javax.swing.JFrame {

    /**
     * Creates new form f_nhanvien
     */
    public f_nhanvien() {
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

        tpchinh = new javax.swing.JTabbedPane();
        pnchunhatro = new javax.swing.JPanel();
        btnthemchunhatro = new javax.swing.JButton();
        btnsuachunhatro = new javax.swing.JButton();
        btnxoaxoachunhatro = new javax.swing.JButton();
        tftimchunhatro = new javax.swing.JTextField();
        btntimchunhatro = new javax.swing.JButton();
        sptablechunhatro = new javax.swing.JScrollPane();
        tbchunhatro = new javax.swing.JTable();
        pnnguoithue = new javax.swing.JPanel();
        btnthemnguoithue = new javax.swing.JButton();
        btnsuanguoithue = new javax.swing.JButton();
        btnxoanguoithue = new javax.swing.JButton();
        tftimnguoithue = new javax.swing.JTextField();
        btntimnguoithue = new javax.swing.JButton();
        sptablenguoithue = new javax.swing.JScrollPane();
        tbnguoithue = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnthemchunhatro.setText("Thêm");

        btnsuachunhatro.setText("Sửa");

        btnxoaxoachunhatro.setText("Xóa");

        btntimchunhatro.setText("Tìm");

        tbchunhatro.setModel(new javax.swing.table.DefaultTableModel(
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
        sptablechunhatro.setViewportView(tbchunhatro);

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
                .addContainerGap(488, Short.MAX_VALUE))
            .addComponent(sptablechunhatro)
        );
        pnchunhatroLayout.setVerticalGroup(
            pnchunhatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnchunhatroLayout.createSequentialGroup()
                .addGroup(pnchunhatroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tftimchunhatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntimchunhatro)
                    .addComponent(btnthemchunhatro)
                    .addComponent(btnsuachunhatro)
                    .addComponent(btnxoaxoachunhatro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sptablechunhatro, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE))
        );

        tpchinh.addTab("Chủ nhà trọ", pnchunhatro);

        btnthemnguoithue.setText("Thêm");

        btnsuanguoithue.setText("Sửa");

        btnxoanguoithue.setText("Xóa");

        btntimnguoithue.setText("Tìm");

        tbnguoithue.setModel(new javax.swing.table.DefaultTableModel(
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
        sptablenguoithue.setViewportView(tbnguoithue);

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
                .addContainerGap(488, Short.MAX_VALUE))
            .addComponent(sptablenguoithue)
        );
        pnnguoithueLayout.setVerticalGroup(
            pnnguoithueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnnguoithueLayout.createSequentialGroup()
                .addGroup(pnnguoithueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tftimnguoithue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntimnguoithue)
                    .addComponent(btnthemnguoithue)
                    .addComponent(btnsuanguoithue)
                    .addComponent(btnxoanguoithue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sptablenguoithue, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE))
        );

        tpchinh.addTab("Người thuê", pnnguoithue);

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
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(f_nhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(f_nhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(f_nhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(f_nhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new f_nhanvien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsuachunhatro;
    private javax.swing.JButton btnsuanguoithue;
    private javax.swing.JButton btnthemchunhatro;
    private javax.swing.JButton btnthemnguoithue;
    private javax.swing.JButton btntimchunhatro;
    private javax.swing.JButton btntimnguoithue;
    private javax.swing.JButton btnxoanguoithue;
    private javax.swing.JButton btnxoaxoachunhatro;
    private javax.swing.JPanel pnchunhatro;
    private javax.swing.JPanel pnnguoithue;
    private javax.swing.JScrollPane sptablechunhatro;
    private javax.swing.JScrollPane sptablenguoithue;
    private javax.swing.JTable tbchunhatro;
    private javax.swing.JTable tbnguoithue;
    private javax.swing.JTextField tftimchunhatro;
    private javax.swing.JTextField tftimnguoithue;
    private javax.swing.JTabbedPane tpchinh;
    // End of variables declaration//GEN-END:variables
}