package info;

import java.util.Scanner;

public class NVSX extends NhanVien {
	public int Sosanpham;

	public NVSX() {
		super();
	}

	public NVSX(int sosanpham) {
		super();
		Sosanpham = sosanpham;
	}

	public int getSosanpham() {
		return Sosanpham;
	}

	public void setSosanpham(int sosanpham) {
		Sosanpham = sosanpham;
	}
	public void Nhap() {
		super.Nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so san pham hoan thien: ");
		Sosanpham = Integer.parseInt(sc.nextLine());
	}
	public void Xuat() {
		super.Xuat();
		System.out.println("So San Pham La: "+Sosanpham);
		System.out.println("Tong luong la: "+TinhLuong());
	}

	@Override
	public double TinhLuong() {
		// TODO Auto-generated method stub
		return this.Sosanpham * 50000;
	}
	
}
