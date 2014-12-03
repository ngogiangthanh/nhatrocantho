package models;

import java.util.*;

public class NhanVien extends Nguoi {

    private String MSNV;

    private Set<TaiKhoan> nguoidung;

    private Set<HopDong> dshopdong;

    public NhanVien() {
    }

    public NhanVien(String MSNV, Set<TaiKhoan> nguoidung, Set<HopDong> dshopdong) {
        this.MSNV = MSNV;
        this.nguoidung = nguoidung;
        this.dshopdong = dshopdong;
    }
    
     public NhanVien( Set<TaiKhoan> nguoidung) {
        this.nguoidung = nguoidung;
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

    public Set<TaiKhoan> getNguoidung() {
        return this.nguoidung;
    }


    @Override
    public String getCMND() {
        return this.CMND;
    }

    @Override
    public String getHoten() {
       return this.hoten;
    }

    @Override
    public Date getNgaysinh() {
        return this.ngaysinh;
    }

    @Override
    public GioiTinh getGioitinh() {
        return this.gioitinh;
    }

    @Override
    public String getSdt() {
        return this.sdt;
    }

    @Override
    public boolean getIsDel() {
       return this.isDel;
    }

    public void setMSNV(String MSNV) {
        this.MSNV = MSNV;
    }

    public void setNguoidung(Set<TaiKhoan> nguoidung) {
        this.nguoidung = nguoidung;
    }

    public void setDshopdong(Set<HopDong> dshopdong) {
        this.dshopdong = dshopdong;
    }

    @Override
    public void setCMND(String CMND) {
        this.CMND=CMND;
    }

    @Override
    public void setHoten(String hoten) {
        this.hoten=hoten;
    }

    @Override
    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh=ngaysinh;
    }

    @Override
    public void setGioitinh(GioiTinh gioitinh) {
       this.gioitinh=gioitinh;
    }

    @Override
    public void setSdt(String sdt) {
        this.sdt=sdt;
    }

    @Override
    public void setIsDel(boolean isDel) {
        this.isDel=isDel;
    }
   
    byte getQuyen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
