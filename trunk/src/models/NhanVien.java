package models;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.*;

public class NhanVien extends Nguoi {

    private String MSNV;

    private TaiKhoan nguoidung;

    private Set<HopDong> dshopdong;

    public NhanVien() {
    }

    public NhanVien(String MSNV, TaiKhoan nguoidung, Set<HopDong> dshopdong) {
        this.MSNV = MSNV;
        this.nguoidung = nguoidung;
        this.dshopdong = dshopdong;
    }

    public Set<HopDong> getDshopdong() {
        return dshopdong;
    }

    @Override
    public boolean isIsDel() {
        return isDel;
    }
    
    public String getMSNV() {
        return this.MSNV;
    }

    public TaiKhoan getNguoidung() {
        return this.nguoidung;
    }


    @Override
    protected String getCMND() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String getHoten() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected Date getNgaysinh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected GioiTinh getGioitinh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String getSdt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected boolean getIsDel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setMSNV(String MSNV) {
        this.MSNV = MSNV;
    }

    public void setNguoidung(TaiKhoan nguoidung) {
        this.nguoidung = nguoidung;
    }

    public void setDshopdong(Set<HopDong> dshopdong) {
        this.dshopdong = dshopdong;
    }

    @Override
    protected void setCMND(String CMND) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void setHoten(String hoten) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void setNgaysinh(Date ngaysinh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void setGioitinh(GioiTinh gioitinh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void setSdt(String sdt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void setIsDel(boolean isDel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
//ham tim kim tat ca nhan vien
    public List<NhanVien> GetAll(){
        List<NhanVien> rs = new ArrayList<NhanVien>();
        KetNoi cn = new KetNoi();
        ObjectContainer db = cn.GetDb();
        ObjectSet<NhanVien> All_nhanvien = db.queryByExample(NhanVien.class);
        cn.CloseDb();
        return All_nhanvien;      
    }

    byte getQuyen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
