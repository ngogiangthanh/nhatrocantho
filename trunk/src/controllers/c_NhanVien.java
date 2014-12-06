/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import com.db4o.ObjectSet;
import com.db4o.query.Query;
import configs.Config;
import models.GioiTinh;
import models.NhanVien;
import models.TaiKhoan;

/**
 *
 * @author Dinh Nhan
 */
public class c_NhanVien {
    public ObjectSet<NhanVien> getAllNhanVien(Config conn){
        ObjectSet<NhanVien> nvs = conn.getConn().queryByExample(NhanVien.class);
        return nvs;
    }
    
    public NhanVien getNhanVien(Config conn,String MSNV){
        try {
            Query query = conn.getConn().query();
            query.constrain(TaiKhoan.class);
            query.descend("MSNV").constrain(MSNV).equal();
            ObjectSet<NhanVien> nvs = query.execute();
            return  nvs.get(0);
            
        } catch (Exception e) {
            return  null;
        }
        
    }
    public void updateNhanVien(Config conn, NhanVien nv){
        conn.getConn().store(nv);  
    }
}
