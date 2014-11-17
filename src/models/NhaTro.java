package models;

import java.util.*;

public class NhaTro {

    private String GPKD;
    private String tennhatro;
    private String motanhatro;
    private String sdt;
    private DiaChi diachi;
    private ChuNhaTro chunhatro;
    private Set<PhongTro> dsphongtro;
    private Set<ChiTietGia> dschitietgia;
    private boolean isDel;

    public NhaTro() {
    }

    public NhaTro(String GPKD, String tennhatro, String motanhatro, String sdt, DiaChi diachi, ChuNhaTro chunhatro, Set<PhongTro> dsphongtro, Set<ChiTietGia> dschitietgia, boolean isDel) {
        this.GPKD = GPKD;
        this.tennhatro = tennhatro;
        this.motanhatro = motanhatro;
        this.sdt = sdt;
        this.diachi = diachi;
        this.chunhatro = chunhatro;
        this.dsphongtro = dsphongtro;
        this.dschitietgia = dschitietgia;
        this.isDel = isDel;
    }  

    public ChuNhaTro getChunhatro() {
        return chunhatro;
    }

    public Set<ChiTietGia> getDschitietgia() {
        return dschitietgia;
    }

    public Set<PhongTro> getDsphongtro() {
        return dsphongtro;
    }

    public String getGPKD() {
        return GPKD;
    }

    public boolean isIsDel() {
        return isDel;
    }

    public void setChunhatro(ChuNhaTro chunhatro) {
        this.chunhatro = chunhatro;
    }

    public void setDschitietgia(Set<ChiTietGia> dschitietgia) {
        this.dschitietgia = dschitietgia;
    }

    public void setDsphongtro(Set<PhongTro> dsphongtro) {
        this.dsphongtro = dsphongtro;
    }

    public void setGPKD(String GPKD) {
        this.GPKD = GPKD;
    }

    public String getTennhatro() {
        return this.tennhatro;
    }

    public void setTennhatro(String tennhatro) {
        this.tennhatro = tennhatro;
    }

    public String getMotanhatro() {
        return this.motanhatro;
    }

    public void setMotanhatro(String motanhatro) {
        this.motanhatro = motanhatro;
    }

    public String getSdt() {
        return this.sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public DiaChi getDiachi() {
        return this.diachi;
    }

    public void setDiachi(DiaChi diachi) {
        this.diachi = diachi;
    }

    public boolean getIsDel() {
        return this.isDel;
    }

    public void setIsDel(boolean isDel) {
        this.isDel = isDel;
    }

}
