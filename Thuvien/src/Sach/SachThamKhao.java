package Sach;

public class SachThamKhao extends MainSach {
	private double Thue;
	public SachThamKhao() {
		super();
	}
	public SachThamKhao(String masach,String date,Double dongia,int soluong,String nhaxuatban,double thue) {
		super();
		this.Thue = thue;
	}
	public double getThue() {
		return Thue;
	}
	public void setThue(double thue) {
		Thue = thue;
	}
	public void Nhap() {
		System.out.println("\nNHAP THONG TIN SACH THAM KHAO");
		super.Nhap();
		System.out.println("\nNhap Gia Tri Thue Cua Sach: ");
		this.Thue = Double.parseDouble(sc.nextLine());
	}
	public void Xuat() {
		System.out.println("\nXUAT THONG TIN SACH THAM KHAO");
		super.Xuat();
		System.out.println("\nGia Tri Thue Cua Sach:");
		System.out.println("Thanh tien: "+ThanhTien());
	}
	@Override
	
	public double ThanhTien() {
		
		// TODO Auto-generated method stub
		return this.getSoluong()*this.Dongia() * this.getThue();
	}
}
