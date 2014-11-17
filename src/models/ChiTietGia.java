package models;

import java.util.Date;

public class ChiTietGia {

	private Date thoidiemapdung;
	private GiaPhong giaphong;
	private LoaiPhong loaiphong;
	private NhaTro nhatro;

	public Date getThoidiemapdung() {
		return this.thoidiemapdung;
	}

	public void setThoidiemapdung(Date thoidiemapdung) {
		this.thoidiemapdung = thoidiemapdung;
	}
}