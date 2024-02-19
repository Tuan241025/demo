package info;

import java.util.Scanner;

public class NVQL extends NhanVien {
	public float Luongcoban;
	public float Hesoluong;
	public NVQL() {
		super();
	}
	public NVQL(float luongcoban, float hesouong) {
		super();
		Luongcoban = luongcoban;
		Hesoluong = hesouong;
	}
	public float getLuongcoban() {
		return Luongcoban;
	}
	public void setLuongcoban(float luongcoban) {
		Luongcoban = luongcoban;
	}
	public float getHesouong() {
		return Hesoluong;
	}
	public void setHesouong(float hesouong) {
		Hesoluong = hesouong;
	}
	public void Nhap() {
		super.Nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap He So Luong: "+Hesoluong);
		Hesoluong = Float.parseFloat(sc.nextLine());
		System.out.println("Nhap uong co ban: "+Luongcoban);
		Luongcoban = Float.parseFloat(sc.nextLine());
	}
	public void Xuat() {
		super.Xuat();
		System.out.println("He so luong la: "+ Hesoluong);
		System.out.println("Luong co ban la: "+Luongcoban);
		System.out.println("Tong luong la: "+TinhLuong());
	}
	@Override
	public double TinhLuong() {
		// TODO Auto-generated method stub
		return this.Luongcoban* 50000;
	}
}
