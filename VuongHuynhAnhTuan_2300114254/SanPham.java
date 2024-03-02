import java.util.Scanner;

public class SanPham {
	public String MaSp;
	public String TenSP;
	public double GiaSP;
	public SanPham() {
		
	}
	public SanPham(String maSp, String tenSP, double giaSP) {
		super();
		MaSp = maSp;
		TenSP = tenSP;
		GiaSP = giaSP;
	}
	public String getMaSp() {
		return MaSp;
	}
	public void setMaSp(String maSp) {
		MaSp = maSp;
	}
	public String getTenSP() {
		return TenSP;
	}
	public void setTenSP(String tenSP) {
		TenSP = tenSP;
	}
	public double getGiaSP() {
		return GiaSP;
	}
	public void setGiaSP(double giaSP) {
		GiaSP = giaSP;
	}
	
	}

