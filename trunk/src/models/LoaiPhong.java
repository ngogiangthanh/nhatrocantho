package models;

import java.util.*;

public class LoaiPhong {

    private int idloaiphong;
    private int motaloai;
    private byte succhua;
    private Set<PhongTro> dsphong;
    private Set<ChiTietGia> dschitietgia;
    private boolean isDel;

    public LoaiPhong() {
    }

    public LoaiPhong(int idloaiphong, int motaloai, byte succhua, Set<PhongTro> dsphong, Set<ChiTietGia> dschitietgia, boolean isDel) {
        this.idloaiphong = idloaiphong;
        this.motaloai = motaloai;
        this.succhua = succhua;
        this.dsphong = dsphong;
        this.dschitietgia = dschitietgia;
        this.isDel = isDel;
    }

    public Set<ChiTietGia> getDschitietgia() {
        return dschitietgia;
    }

    public Set<PhongTro> getDsphong() {
        return dsphong;
    }

    public int getMotaloai() {
        return motaloai;
    }

    public boolean isIsDel() {
        return isDel;
    }

    public void setDschitietgia(Set<ChiTietGia> dschitietgia) {
        this.dschitietgia = dschitietgia;
    }

    public void setDsphong(Set<PhongTro> dsphong) {
        this.dsphong = dsphong;
    }

    public void setMotaloai(int motaloai) {
        this.motaloai = motaloai;
    }

    public int getIdloaiphong() {
        return this.idloaiphong;
    }

    public void setIdloaiphong(int idloaiphong) {
        this.idloaiphong = idloaiphong;
    }

    public byte getSucchua() {
        return this.succhua;
    }

    public void setSucchua(byte succhua) {
        this.succhua = succhua;
    }

    public boolean getIsDel() {
        return this.isDel;
    }

    public void setIsDel(boolean isDel) {
        this.isDel = isDel;
    }

}
