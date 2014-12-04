
 
package controllers;

import GUIs.f_quanly;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import configs.Config;
import models.TaiKhoan;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 *
 * @author Dinh Nhan
 */
public class c_DangNhap {
    private Config conn  =  new Config();
    public  Config getConfig(){
        return this.conn;
    }
    public boolean Check(String user, String pass){
        String md5 = c_MD5.encryptMD5(pass);
        boolean rs = false;
        byte    quyen;
        Query query = this.conn.getConn().query();
        query.constrain(TaiKhoan.class);
        query.descend("taikhoan").constrain(user).equal();
        query.descend("matkhau").constrain(md5).equal();
        ObjectSet<TaiKhoan> tks = query.execute();
        if(!tks.isEmpty()){
            quyen   =   tks.get(0).getQuyen();
            rs      =   true;
            f_quanly quanly = new f_quanly(this.getConfig());
            quanly.setVisible(true);
        }
        return rs;
    }
}
