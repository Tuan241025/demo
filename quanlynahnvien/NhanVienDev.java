package Kiemtra;

public class NhanVienDev extends NhanVien {
	public int SoGio;

	public NhanVienDev() {
		super();
	}

	public NhanVienDev(int soGio) {
		super();
		SoGio = soGio;
	}

	public int getSoGio() {
		return SoGio;
	}

	public void setSoGio(int soGio) {
		SoGio = soGio;
	}
	public void Nhap() {
		System.out.println("\n\t-----NHAP THONG TIN NHAN VIEN DEV");
		super.Nhap();
		System.out.println("Nhap So Gio Tang Ca: ");
		this.SoGio = Integer.parseInt(sc.nextLine());
	}
	public void xuat() {
		System.out.println("\n\t-----XUAT THONG TIN NHAN VIEN DEV");
		super.xuat();
		System.out.println("So Gio Tang Ca: "+SoGio);
		System.out.println("Luong Nhan Vien Dev La: "+TinhLuong());
		System.out.println();
	}
	public double TinhLuong() {
		
		return this.LuongCB + (this.SoGio*200000);
	}
	
}
