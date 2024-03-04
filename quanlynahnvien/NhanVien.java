package Kiemtra;

import java.util.Scanner;

public abstract class NhanVien {
	public String MaNV;
	public String Name;
	public int Age;
	public String SoDienThoai;
	public String Email;
	public double LuongCB;
	public NhanVien() {
		super();
	}
	Scanner sc = new Scanner(System.in);
	public NhanVien(String maNV, String name, int age, String soDienThoai, String email, double luongCB) {
		super();
		MaNV = maNV;
		Name = name;
		Age = age;
		SoDienThoai = soDienThoai;
		Email = email;
		LuongCB = luongCB;
	}
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getSoDienThoai() {
		return SoDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		SoDienThoai = soDienThoai;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public double getLuongCB() {
		return LuongCB;
	}
	public void setLuongCB(double luongCB) {
		LuongCB = luongCB;
	}
	
	public void Nhap() {
		System.out.println("Nhap Ma Nhan Vien: ");
		this.MaNV = sc.nextLine();
		System.out.println("Nhap Ho va Ten: ");
		this.Name = sc.nextLine();
		System.out.println("Nhap Tuoi: ");
		this.Age = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap So Dien Thoai: ");
		this.SoDienThoai = sc.nextLine();
		System.out.println("Nhap Email: ");
		this.Email = sc.nextLine();
		System.out.println("Nhap Luong CB: ");
		this.LuongCB= Double.parseDouble(sc.nextLine());
	}
	public void xuat() {
		System.out.println("Ma Nhan Vien: "+MaNV);
		System.out.println("Ho va Ten: "+Name);
		System.out.println("Tuoi: "+Age);
		System.out.println("So Dien Thoai: "+SoDienThoai);
		System.out.println("Email: "+Email);
		System.out.println("Luong CB: "+LuongCB);
	}
	public abstract double TinhLuong();
}
