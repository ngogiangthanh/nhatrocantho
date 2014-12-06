
 
package controllers;

import GUIs.f_nhanvien;
import GUIs.f_quanly;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import configs.Config;
import models.TaiKhoan;
/**
 *
 * @author Dinh Nhan
 */
public class c_DangNhap {
    private  Config conn ;
    public  Config getConfig(){
        return this.conn;
    }
    public void setConfig(Config conn){
        this.conn = conn;
    }
    public boolean Check(String user, String pass, Config conn){
        this.setConfig(conn);
        String md5 = c_MD5.encryptMD5(pass);
        boolean rs = false;
        byte    quyen;
        Query query = this.getConfig().getConn().query();
        query.constrain(TaiKhoan.class);
        query.descend("taikhoan").constrain(user).equal();
        query.descend("matkhau").constrain(md5).equal();
        ObjectSet<TaiKhoan> tks = query.execute();
        if(!tks.isEmpty()){
            quyen   =   tks.get(0).getQuyen();
            rs      =   true;
            if(quyen ==0){
                f_quanly quanly = new f_quanly(this.getConfig());
                quanly.setVisible(true);
            }
            else if(quyen == 1){
                f_nhanvien nhanvien = f_nhanvien.getInstance(conn);
                nhanvien.setVisible(true);
            }
        }
        else{
            //this.getConfig().closeConn();
        }
        return rs;
    }
}
