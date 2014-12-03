/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.ChuNhaTro;
import models.DiaChi;
import configs.Config;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Phan
 */
public class ChuNhaTroController {

    private final ObjectContainer db;
    private final Config conn;
    private ObjectSet<Object> chus;

    public ChuNhaTroController(Config conn) {
        this.conn = conn;
        this.db = conn.getConn();
    }

    public void show(JTable tbchunhatro) {
        DefaultTableModel model = (DefaultTableModel) tbchunhatro.getModel();
        ObjectSet<ChuNhaTro> chus = this.db.queryByExample(ChuNhaTro.class);
        int stt = 0;
        for (ChuNhaTro chu : chus) {
            DiaChi dc = chu.getDiachi();
            String diachi = "số nhà:" + dc.getSonha() + " hẻm:" + dc.getHem() + " đường:" + dc.getDuong() + " quận huyện:" + dc.getQuanhuyen() + " tỉnh TP:" + dc.getTinhtp();
            Object[] row = {++stt, chu.getCMND(), chu.getHoten(),diachi};
            model.addRow(row);
        }
    }

    public void add() {
     //   DiaChi dc = new DiaChi("195/1B", "hẻm 195", "đường 3/2", "quận Ninh Kiều", "TP Cần Thơ");
      //  ChuNhaTro chus = new ChuNhaTro("CMND", "Phan Lâm Mỹ Ngà", dc);
       // this.db.store(chus);
    }

    public void close() {
        if (this.db.close()) {
            System.out.println("Da dong ket noi CSDL!");
        }
    }
}
