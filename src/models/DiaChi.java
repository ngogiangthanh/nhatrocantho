package models;

public class DiaChi {

    private String sonha;
    private String hem;
    private String duong;
    private String quanhuyen;
    private String tinhtp;

    public DiaChi() {
    }

    public DiaChi(String sonha, String hem, String duong, String quanhuyen, String tinhtp) {
        this.sonha = sonha;
        this.hem = hem;
        this.duong = duong;
        this.quanhuyen = quanhuyen;
        this.tinhtp = tinhtp;
    }

    public String getSonha() {
        return this.sonha;
    }

    public void setSonha(String sonha) {
        this.sonha = sonha;
    }

    public String getHem() {
        return this.hem;
    }

    public void setHem(String hem) {
        this.hem = hem;
    }

    public String getDuong() {
        return this.duong;
    }

    public void setDuong(String duong) {
        this.duong = duong;
    }

    public String getQuanhuyen() {
        return this.quanhuyen;
    }

    public void setQuanhuyen(String quanhuyen) {
        this.quanhuyen = quanhuyen;
    }

    public String getTinhtp() {
        return this.tinhtp;
    }

    public void setTinhtp(String tinhtp) {
        this.tinhtp = tinhtp;
    }

}
