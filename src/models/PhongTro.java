package models;

import java.util.*;

public class PhongTro {

    private String maphong;
    private boolean tinhtrang;
    private Set<HopDong> dshopdong;
    private NhaTro nhatro;
    private LoaiPhong loaiphong;
    private boolean isDel;

    public PhongTro() {
    }

    public PhongTro(String maphong, boolean tinhtrang, Set<HopDong> dshopdong, NhaTro nhatro, LoaiPhong loaiphong, boolean isDel) {
        this.maphong = maphong;
        this.tinhtrang = tinhtrang;
        this.dshopdong = dshopdong;
        this.nhatro = nhatro;
        this.loaiphong = loaiphong;
        this.isDel = isDel;
    }

    public Set<HopDong> getDshopdong() {
        return dshopdong;
    }

    public LoaiPhong getLoaiphong() {
        return loaiphong;
    }

    public NhaTro getNhatro() {
        return nhatro;
    }

    public boolean isIsDel() {
        return isDel;
    }

    public boolean isTinhtrang() {
        return tinhtrang;
    }

    public void setDshopdong(Set<HopDong> dshopdong) {
        this.dshopdong = dshopdong;
    }

    public void setLoaiphong(LoaiPhong loaiphong) {
        this.loaiphong = loaiphong;
    }

    public void setNhatro(NhaTro nhatro) {
        this.nhatro = nhatro;
    }

    public String getMaphong() {
        return this.maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public boolean getTinhtrang() {
        return this.tinhtrang;
    }

    public void setTinhtrang(boolean tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public boolean getIsDel() {
        return this.isDel;
    }

    public void setIsDel(boolean isDel) {
        this.isDel = isDel;
    }

}
