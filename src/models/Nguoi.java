package models;

import java.util.*;

public abstract class Nguoi {

    protected String CMND;
    
    protected String hoten;
    
    protected GioiTinh gioitinh;
    
    protected String sdt;
    
    protected Date ngaysinh;
    
    protected boolean isDel = false;

    public Nguoi(String CMND, String hoten, GioiTinh gioitinh, String sdt, Date ngaysinh) {
        this.CMND = CMND;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.sdt = sdt;
        this.ngaysinh = ngaysinh;
    }
    
    abstract public boolean isIsDel();

    abstract protected String getCMND();

    abstract protected String getHoten();

    abstract protected Date getNgaysinh();

    abstract protected GioiTinh getGioitinh();

    abstract protected String getSdt();

    abstract protected boolean getIsDel();

    abstract protected void setCMND(String CMND);

    abstract protected void setHoten(String hoten);

    abstract protected void setNgaysinh(Date ngaysinh);

    abstract protected void setGioitinh(GioiTinh gioitinh);
    
    abstract protected void setSdt(String sdt);

    abstract protected void setIsDel(boolean isDel);

}
