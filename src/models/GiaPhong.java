package models;

import java.util.*;

public class GiaPhong {

    private String magia;
    private Currency gia;
    private Set<ChiTietGia> dschitietgia;
    private boolean isDel;

    public GiaPhong() {
    }

    public GiaPhong(String magia, Currency gia, Set<ChiTietGia> dschitietgia, boolean isDel) {
        this.magia = magia;
        this.gia = gia;
        this.dschitietgia = dschitietgia;
        this.isDel = isDel;
    }

    public boolean isIsDel() {
        return isDel;
    }

    public void setDschitietgia(Set<ChiTietGia> dschitietgia) {
        this.dschitietgia = dschitietgia;
    }

    public Set<ChiTietGia> getDschitietgia() {
        return dschitietgia;
    }

    public Currency getGia() {
        return this.gia;
    }

    public void setGia(Currency gia) {
        this.gia = gia;
    }

    public String getMagia() {
        return this.magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }

    public boolean getIsDel() {
        return this.isDel;
    }

    public void setIsDel(boolean isDel) {
        this.isDel = isDel;
    }

}
