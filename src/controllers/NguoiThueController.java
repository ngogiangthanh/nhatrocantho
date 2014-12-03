package controllers;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import configs.Config;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.ChuNhaTro;
import models.DiaChi;
import models.GioiTinh;
import models.NguoiThue;

public class NguoiThueController {

    private final ObjectContainer db;
    private final Config conn;

    public NguoiThueController(Config conn) {
        this.conn = conn;
        this.db = this.conn.getConn();
    }

    public void show(JTable tbchunhatro) {
        DefaultTableModel model = (DefaultTableModel) tbchunhatro.getModel();
        ObjectSet<NguoiThue> dsNguoiThue = this.db.queryByExample(NguoiThue.class);
        int stt = 0;
        for (NguoiThue nguoiThue : dsNguoiThue) {
            Object[] row = {++stt, nguoiThue.getCMND(), nguoiThue.getHoten(), nguoiThue.getGioitinh(), nguoiThue.getCongviec()};
            model.addRow(row);
        }
    }

    public void add() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
        NguoiThue nguoithue = new NguoiThue("381647292", "Ngô Giang Thanh", GioiTinh.Nam, "0946344233", sdf.parse("25-08-1992"));
        this.db.store(nguoithue);
    }

}
