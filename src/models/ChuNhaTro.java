package models;

import java.util.*;

public class ChuNhaTro extends Nguoi {

    private DiaChi diachi;
    
    private Set<NhaTro> dsnhatro;

    public ChuNhaTro() {
    }

    public ChuNhaTro(DiaChi diachi, Set<NhaTro> dsnhatro) {
        this.diachi = diachi;
        this.dsnhatro = dsnhatro;
    }

    @Override
    public boolean isIsDel() {
        return isDel;
    }

    public DiaChi getDiachi() {
        return this.diachi;
    }

    public void setDiachi(DiaChi diachi) {
        this.diachi = diachi;
    }

    public Set<NhaTro> getDsnhatro() {
        return dsnhatro;
    }

    public void setDsnhatro(Set<NhaTro> dsnhatro) {
        this.dsnhatro = dsnhatro;
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
