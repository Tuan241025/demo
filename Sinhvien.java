package truonghocvanlang;

import java.util.Scanner;

public abstract  class Sinhvien { //abstract cho phep hoi tạo nhung khong cho phep new mot cai moi
	public String MSv;
	public String name;
	public String Address;
	public int Sumtinchi;
	public double DiemTB;
	
	//khai bao constructor mac dinh(hong c datatype,ko co return)
	public Sinhvien() {
	
	}
	public Sinhvien(String mSv, String name, String address, int sumtinchi, double dTB) {
		this.MSv = mSv;
		this.name = name;
		this.Address = address;
		this.Sumtinchi = sumtinchi;
		this.DiemTB= DiemTB;
	}
	
	
	
	public String getMSv() {
		return MSv;
	}
	public void setMSv(String mSv) {
		MSv = mSv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getSumtinchi() {
		return Sumtinchi;
	}
	public void setSumtinchi(int sumtinchi) {
		Sumtinchi = sumtinchi;
	}
	public double getDiemTB() {
		return DiemTB;
	}
	public void setDiemTB(double diemTB) {
		DiemTB = diemTB;
	}
	public void Nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma sinh vien: ");
		MSv = sc.nextLine();
		System.out.println("Nhap ho ten: ");
		name = sc.nextLine();
		System.out.println("Nhap dia chi: ");
		Address = sc.nextLine();
		System.out.println("Nhap tong so tin chi: ");
		Sumtinchi = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap diem trung binh: ");
		DiemTB = Double.parseDouble(sc.nextLine());
	}
	public void Xuat() {
		System.out.println(" Ma sinh vien la: "+MSv);
		System.out.println("Ho ten la:"+name);
		System.out.println("Dia chi la:"+Address);
		System.out.println("Tong so tin chi:"+Sumtinchi);
		System.out.println("Diem Trung Binh la: "+DiemTB);
	}
	
	public abstract boolean XetTotNghiep();
}
