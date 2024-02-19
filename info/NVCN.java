package info;

import java.util.Scanner;

public class NVCN extends NhanVien {
	public int SOngaycong;

	public NVCN() {
		super();
	}

	public NVCN(int sOngaycong) {
		super();
		SOngaycong = sOngaycong;
	}

	public int getSOngaycong() {
		return SOngaycong;
	}

	public void setSOngaycong(int sOngaycong) {
		SOngaycong = sOngaycong;
	}
	public void Nhap() {
		super.Nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ngay cong");
		SOngaycong = Integer.parseInt(sc.nextLine());
	}
	public void Xuat() {
		super.Xuat();
		System.out.println("So ngay cong la: "+SOngaycong);
		System.out.println("Tong luong la: "+TinhLuong());
	}

	@Override
	public double TinhLuong() {
		// TODO Auto-generated method stub
		return this.SOngaycong * 120000;
	}
}
