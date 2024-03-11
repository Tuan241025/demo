package Sach;

import java.util.Scanner;

public abstract class MainSach {
	private String Masach;
	private String Date;
	private Double Dongia;
	private int Soluong;
	private String Nhaxuatban;
	Scanner sc = new Scanner(System.in);
	public MainSach() {
		
	}
	public MainSach(String masach,String date,Double dongia,int soluong,String nhaxuatban) {
		this.Masach = masach;
		this.Date = date;
		this.Dongia = dongia;
		this.Soluong = soluong;
		this.Nhaxuatban = nhaxuatban;
	}
	public String getMasach() {
		return Masach;
	}
	public void setMasach(String masach) {
		this.Masach = masach;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		this.Date = date;
	}
	public double Dongia() {
		return Dongia;
	}
	public void setDongia(double dongia) {
		this.Dongia = dongia;
	}
	public int getSoluong() {
		return Soluong;
	}
	public void setSoluong(int soluong) {
		this.Soluong = soluong;
	}
	public String getNhaxuatban() {
		return Nhaxuatban;
	}
	public void setNhaxuatban(String nhaxuatban) {
		this.Nhaxuatban= nhaxuatban;
	}
	public void Nhap() {
		System.out.println("\t====NHAP THONG TIN CUA SACH====");
		System.out.println("\nNhap Ma Sach: ");
		this.Masach = sc.nextLine();
		System.out.println("\nNhap Ngay San Xuat: ");
		this.Date = sc.nextLine();
		System.out.println("\nNhap Don Gia: ");
		this.Dongia = Double.parseDouble(sc.nextLine());
		System.out.println("\nNhap So Luong: ");
		this.Soluong = Integer.parseInt(sc.nextLine());
		System.out.println("\nNhap Ten Nha San Xuat");
		this.Nhaxuatban = sc.nextLine();
	}
	public void Xuat() {
		System.out.println("\nMa Sach: "+Masach);
		System.out.println("\nNgay San Xuat: "+Date);
		System.out.println("\nDon Gia: "+Dongia);
		System.out.println("\nSo Luong: "+Soluong);
		System.out.println("\nTen Nha San Xuat: "+Nhaxuatban);
	}
	public abstract double ThanhTien();
	
		// TODO Auto-generated method stub
	}

