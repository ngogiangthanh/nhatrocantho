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

}
