package mogioinhatro;

import GUIs.f_dangnhap;
import configs.Config;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Mogioinhatro {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            JOptionPane.showMessageDialog(null, "Cài đặt thư viện look and feel thất bại!","Thông báo",JOptionPane.ERROR_MESSAGE);
        }

        Config conn = new Config();
        f_dangnhap dangnhap = f_dangnhap.getInstance(conn);
        dangnhap.createAndShowUI();
    }

}
