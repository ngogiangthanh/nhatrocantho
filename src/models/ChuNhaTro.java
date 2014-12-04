package models;

import java.util.*;

public class ChuNhaTro extends Nguoi {

    private DiaChi diachi;

    private Set<NhaTro> dsnhatro;

    public ChuNhaTro(String CMND, String hoten, GioiTinh gioitinh, String sdt, Date ngaysinh) {
        super(CMND, hoten, gioitinh, sdt, ngaysinh);
    }
    
    public ChuNhaTro(String hoten){
        this.hoten = hoten;
        this.dsnhatro = new HashSet<NhaTro>();
    }
    public ChuNhaTro(DiaChi diachi, Set<NhaTro> dsnhatro) {
        this.diachi = diachi;
        this.dsnhatro = dsnhatro;
    }
    public ChuNhaTro(String hoten,String CMND,DiaChi diachi) {
        this.CMND = CMND;
        this.hoten = hoten;
        this.diachi = diachi;
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
public boolean addNhaTro(NhaTro nhatro) {
        return this.dsnhatro.add(nhatro);
    }
}
