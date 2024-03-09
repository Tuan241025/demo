package qldt;

import java.util.Scanner;

public abstract  class HocSinh {
	public int MaHS;
	public String TenHS;
	public boolean GioiTinh;
	Scanner sc = new Scanner(System.in);
	public HocSinh() {
	}
	public HocSinh(int maHS, String tenHS, boolean gioiTinh) {
		MaHS = maHS;
		TenHS = tenHS;
		GioiTinh = gioiTinh;
	}
	public int getMaHS() {
		return MaHS;
	}
	public void setMaHS(int maHS) {
		MaHS = maHS;
	}
	public String getTenHS() {
		return TenHS;
	}
	public void setTenHS(String tenHS) {
		TenHS = tenHS;
	}
	public boolean getGioiTinh()
	{
		return GioiTinh;
		
	}
	public void setGioiTinh(boolean gioiTinh) {
		GioiTinh = gioiTinh;
	}
	public void Nhap() {
		System.out.println("Nhap Ma Hoc Sinh: ");
		this.MaHS = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap Ho Ten: ");
		this.TenHS = sc.nextLine();
		System.out.println("Nhap Gioi Tinh Cua Ban: ");
		this.GioiTinh= Boolean.parseBoolean(sc.nextLine());
	}
	public void Hiengioitinh() {
		if(GioiTinh)
			System.out.println("Nam");
		else
			System.out.println("Nu");
	}
	public void Xuat() {
		System.out.println("Ma Hoc Sinh: "+MaHS);
		System.out.println("Ho Ten: "+TenHS);
		System.out.println("Gioi Tinh Cua Ban: ");
		Hiengioitinh();
		
	}
	public abstract double DiemTB();
	public abstract String Xeploai() ;
	
	}

