package models;

import java.util.*;

public class HopDong {

    private NguoiThue nguoithue;
    private String MSHD;
    private Date thoidiemlap;
    private String ghichu;
    private Date ngaybatdau;
    private boolean isDel;
    private NhanVien nhanvien;
    private PhongTro phongtro;
    private List<HoaDon> dshoadon;

    public HopDong() {
    }

    public HopDong(NguoiThue nguoithue, String MSHD, Date thoidiemlap, String ghichu, Date ngaybatdau, boolean isDel, NhanVien nhanvien, PhongTro phongtro, List<HoaDon> dshoadon) {
        this.nguoithue = nguoithue;
        this.MSHD = MSHD;
        this.thoidiemlap = thoidiemlap;
        this.ghichu = ghichu;
        this.ngaybatdau = ngaybatdau;
        this.isDel = isDel;
        this.nhanvien = nhanvien;
        this.phongtro = phongtro;
        this.dshoadon = dshoadon;
    }

    public NguoiThue getNguoithue() {
        return nguoithue;
    }

    public void setNguoithue(NguoiThue nguoithue) {
        this.nguoithue = nguoithue;
    }

    public String getMSHD() {
        return MSHD;
    }

    public void setMSHD(String MSHD) {
        this.MSHD = MSHD;
    }

    public Date getThoidiemlap() {
        return this.thoidiemlap;
    }

    public void setThoidiemlap(Date thoidiemlap) {
        this.thoidiemlap = thoidiemlap;
    }

    public String getGhichu() {
        return this.ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public Date getNgaybatdau() {
        return this.ngaybatdau;
    }

    public void setNgaybatdau(Date ngaybatdau) {
        this.ngaybatdau = ngaybatdau;
    }

    public boolean getIsDel() {
        return this.isDel;
    }

    public void setIsDel(boolean isDel) {
        this.isDel = isDel;
    }

    public List<HoaDon> getDshoadon() {
        return dshoadon;
    }

    public NhanVien getNhanvien() {
        return nhanvien;
    }

    public PhongTro getPhongtro() {
        return phongtro;
    }

    public boolean isIsDel() {
        return isDel;
    }

    public void setDshoadon(List<HoaDon> dshoadon) {
        this.dshoadon = dshoadon;
    }

    public void setNhanvien(NhanVien nhanvien) {
        this.nhanvien = nhanvien;
    }

    public void setPhongtro(PhongTro phongtro) {
        this.phongtro = phongtro;
    }

}
