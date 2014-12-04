/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import configs.Config;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.ChuNhaTro;
import models.DiaChi;
import models.NhaTro;

/**
 *
 * @author Phan
 */
public class ChuNhaTroController {

    private final ObjectContainer db;
    private final Config conn;
    private ObjectSet<Object> chus;
    private Object nhatro;

    public ChuNhaTroController(Config conn) {
        this.conn = conn;
        this.db = conn.getConn();
    }

    public void show(JTable tbchunhatro, String txttim) {
        DefaultTableModel model = (DefaultTableModel) tbchunhatro.getModel();
        ObjectSet<ChuNhaTro> chus = this.db.queryByExample(ChuNhaTro.class);
        int stt = 0;
        for (ChuNhaTro chu : chus) {
            DiaChi dc = chu.getDiachi();
            String diachi = "Số nhà:" + dc.getSonha() + ", hẻm:" + dc.getHem() + ", đường:" + dc.getDuong() + ", quận huyện:" + dc.getQuanhuyen() + ", tỉnh TP:" + dc.getTinhtp();
            Object[] row = {++stt, chu.getHoten(), chu.getCMND(), diachi};
            model.addRow(row);
        }
    }
     public void shownhatro(JTable tbdsnhatro) {
        DefaultTableModel model = (DefaultTableModel) tbdsnhatro.getModel();
        ObjectSet<NhaTro> nhatros = this.db.queryByExample(NhaTro.class);
        int stt = 0;
        for (NhaTro nhatro : nhatros) {
            DiaChi dc = nhatro.getDiachi();
            String diachi = "Số nhà:" + dc.getSonha() + ", hẻm:" + dc.getHem() + ", đường:" + dc.getDuong() + ", quận huyện:" + dc.getQuanhuyen() + ", tỉnh TP:" + dc.getTinhtp();
            Object[] row = {++stt, nhatro.getTennhatro(),nhatro.getGPKD(),nhatro.getMotanhatro(),nhatro.getSdt(), diachi};
            model.addRow(row);
        }
    }
    public void add(String hoten, String cmnd, DiaChi diachi, Object[][] dsnhatro) throws ParseException {
//        DiaChi dc = new DiaChi("195/1B", "hẻm 195", "đường 3/2", "quận Ninh Kiều", "TP Cần Thơ");
//        ChuNhaTro chus = new ChuNhaTro("CMND", "Phan Lâm Mỹ Ngà", dc);
//        this.db.store(chus);
//        ChuNhaTro chus = new ChuNhaTro(hoten, cmnd, diachi);
//        this.db.store(chus);
        ChuNhaTro chus = new ChuNhaTro(hoten, cmnd, diachi);
//        int Rows = dsnhatro.length;
//        for (int i = 0; i < Rows; i++) {
//            NhaTro nhatro = new NhaTro(dsnhatro[i][1].toString());
//            nhatro.setTennhatro(hoten);
//            chus.addNhaTro(nhatro);
//
//        }
        this.db.store(chus);
    }

    
 public void store(ChuNhaTro chu, String hoten, String CMND, DiaChi diachi, Object[][] dsnhatro) throws ParseException
    {
        chu.setHoten(hoten);
        chu.setCMND(CMND);
        chu.setDiachi(diachi);
        NhaTro newdsnhatro = new NhaTro();
        int numRow = dsnhatro.length;
        for(int i = 0; i < numRow; i++)
        {
            NhaTro nhatro = new NhaTro(dsnhatro[i][1].toString());
            nhatro.setTennhatro(hoten);
            chu.addNhaTro(nhatro);
           // newdsnhatro.add(nhatro);
        }
            chu.setDsnhatro((Set<NhaTro>) newdsnhatro);
            this.db.store(chu);
    }
    public void delete(String hoten){
        ChuNhaTro chudel = (ChuNhaTro) this.db.queryByExample(new ChuNhaTro(hoten)).next();
        this.db.delete(chudel);
             }
    public void close() {
        if (this.db.close()) {
            System.out.println("Da dong ket noi CSDL!");
        }
    }
}
