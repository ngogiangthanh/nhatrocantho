package models;

public class TaiKhoan {

    private String taikhoan;
    private String matkhau;
    private byte quyen;

    public TaiKhoan() {
    }

    public TaiKhoan(String taikhoan, String matkhau, byte quyen) {
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.quyen = quyen;
    }

    public TaiKhoan(String taikhoan, String matkhau) {
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
    }
    public String getTaikhoan() {
        return this.taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getMatkhau() {
        return this.matkhau;
    }
    
  
    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public byte getQuyen() {
        return this.quyen;
    }

    public void setQuyen(byte quyen) {
        this.quyen = quyen;
    }
}
