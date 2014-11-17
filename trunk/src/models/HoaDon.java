package models;

import java.util.*;

public class HoaDon {

    private String mahoadon;
    private Date thoidiemdong;
    private String ghichu;
    private byte tuthang;
    private byte denthang;
    private HopDong hopdong;
    private boolean isDel;

    public HoaDon() {
    }

    public HoaDon(String mahoadon, Date thoidiemdong, String ghichu, byte tuthang, byte denthang, HopDong hopdong, boolean isDel) {
        this.mahoadon = mahoadon;
        this.thoidiemdong = thoidiemdong;
        this.ghichu = ghichu;
        this.tuthang = tuthang;
        this.denthang = denthang;
        this.hopdong = hopdong;
        this.isDel = isDel;
    }

    public HopDong getHopdong() {
        return hopdong;
    }

    public boolean isIsDel() {
        return isDel;
    }

    public void setHopdong(HopDong hopdong) {
        this.hopdong = hopdong;
    }

    public String getMahoadon() {
        return this.mahoadon;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    public Date getThoidiemdong() {
        return this.thoidiemdong;

    }

    public String getGhichu() {
        return this.ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public byte getTuthang() {
        return this.tuthang;
    }

    public void setTuthang(byte tuthang) {
        this.tuthang = tuthang;
    }

    public byte getDenthang() {
        return this.denthang;
    }

    public void setDenthang(byte denthang) {
        this.denthang = denthang;
    }

    public void setThoidiemdong(Date thoidiemdong) {
        this.thoidiemdong = thoidiemdong;
    }

    public void setIsDel(boolean isDel) {
        this.isDel = isDel;
    }

    public boolean getIsDel() {
        return this.isDel;
    }

}
