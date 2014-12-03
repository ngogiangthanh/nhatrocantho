package models;

import java.util.*;

public class NguoiThue extends Nguoi {

    private Set<HopDong> dshopdong;

    private String congviec;

    public NguoiThue() {
    }

    public NguoiThue(Set<HopDong> dshopdong, String congviec) {
        this.dshopdong = dshopdong;
        this.congviec = congviec;
    }

    public String getCongviec() {
        return this.congviec;
    }

    public void setCongviec(String congviec) {
        this.congviec = congviec;
    }

    public Set<HopDong> getDshopdong() {
        return dshopdong;
    }

    public void setDshopdong(Set<HopDong> dshopdong) {
        this.dshopdong = dshopdong;
    }

    @Override
    public boolean isIsDel() {
        return isDel;
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

    @Override
    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    @Override
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    @Override
    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    @Override
    public void setGioitinh(GioiTinh gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Override
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public void setIsDel(boolean isDel) {
        this.isDel = isDel;
    }

}
