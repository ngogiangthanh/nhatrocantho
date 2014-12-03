
package mogioinhatro;

import GUIs.f_dangnhap;
import GUIs.f_nhanvien;
import configs.Config;

public class Mogioinhatro {

    public static void main(String[] args) {
        Config conn=new Config();
        f_dangnhap dangnhap = f_dangnhap.getInstance(conn);
        dangnhap.createAndShowUI();
//        f_nhanvien trangquanly = new f_nhanvien();
//        trangquanly.setVisible(true);
    }
    
}
