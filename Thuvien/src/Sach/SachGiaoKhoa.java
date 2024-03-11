package Sach;

public class SachGiaoKhoa extends MainSach {
	private String Tinhtrang;
	public SachGiaoKhoa() {
		super();
	}
	public SachGiaoKhoa(String masach,String date,Double dongia,int soluong,String nhaxuatban,String tinhtrang) {
		super();
		this.Tinhtrang = tinhtrang;
	}
	public String getTinhtrang() {
		return Tinhtrang;
	}
	public void setTinhtrang(String tinhtrang) {
		this.Tinhtrang = tinhtrang;
	}
	public void Nhap() {
		System.out.println("\nNHAP THONG TIN SACH GIAO KHOA");
		super.Nhap();
		System.out.println("\nNhap Tinh Trang Cua Sach: ");
		this.Tinhtrang = sc.nextLine();
	}
	public void Xuat() {
		System.out.println("\nXUAT THONG TIN SACH GIAO KHOA");
		super.Xuat();
		System.out.println("\nTinh Trang Cua Sach: "+Tinhtrang);
		System.out.println("Thanh tien: "+ThanhTien());
	}
	
	@Override
	public double ThanhTien() {
		if(this.Tinhtrang.equalsIgnoreCase("Cu")) {
			return this.getSoluong()*this.Dongia()*0.5;
		}
		else {
			return this.getSoluong()*this.Dongia();
		}
		// TODO Auto-generated method stub
	}
}
