package Kiemtra;

public class NhanVienbTestTing extends NhanVien {
	public int SoloiTest;

	public NhanVienbTestTing() {
		super();
	}

	public NhanVienbTestTing(int soloiTest) {
		super();
		SoloiTest = soloiTest;
	}

	public int getSoloiTest() {
		return SoloiTest;
	}

	public void setSoloiTest(int soloiTest) {
		SoloiTest = soloiTest;
	}
	public void Nhap() {
		System.out.println("\n\t-----NHAP THONG TIN NHAN VIEN TESTING");
		super.Nhap();
		System.out.println("Nhap So Loi Da Test: ");
		this.SoloiTest = Integer.parseInt(sc.nextLine());
	}
	public void xuat() {
		System.out.println("\n\t-----XUAT THONG TIN NHAN VIEN TESTING");
		super.xuat();
		System.out.println("So Loi Da Test La: "+ SoloiTest);
		System.out.println("Luong Cua TestTing La: "+TinhLuong());
		System.out.println();
	}

	@Override
	public double TinhLuong() {
		// TODO Auto-generated method stub
		return this.LuongCB + (this.SoloiTest*50000);
	}
	
}
