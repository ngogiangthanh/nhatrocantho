
import GUIs.f_dangnhap;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.Db4oIOException;
import models.KetNoi;
import models.NhanVien;
import models.TaiKhoan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dinh Nhan
 */
public class NewClass {
    /* public static void main(String[] args) {
         try {
             
      ObjectContainer db = Db4oEmbedded.openFile("E:\\thac_si\\hk1_2014\\CSDL_HDT\\nhatrocantho\\src\\database\\containers.dbo");
        TaiKhoan tk = new TaiKhoan("nhan2", "nhan2", (byte) 0.0);
        NhanVien nv = new NhanVien("M25", tk, null);
        ObjectSet<NhanVien> All_nhanvien = db.queryByExample(nv);
             System.out.print(All_nhanvien.get(0).getMSNV());
        db.close();
        } catch (Db4oIOException | DatabaseClosedException e) {
            System.out.println("loi");
        }
        
    }*/
    
}
