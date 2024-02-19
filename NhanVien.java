package info;

import java.util.Scanner;
// tinh truu tuong abstract
public abstract class NhanVien {
	public String name;
	public int age;
	public String Ngaysinh;
	public String Diachi;
	public NhanVien() {
		
	}
	public NhanVien(String name, int age, String ngaysinh) {
		this.name = name;
		this.age = age;
		this.Ngaysinh = ngaysinh;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNgaysinh() {
		return Ngaysinh;
	}
	public void setNgaysinh(String ngaysinh) {
		Ngaysinh = ngaysinh;
	}
	public String Diachi() {
		return Diachi;
	}
	public void setDiachi(String Diachi) {
		this.Diachi = Diachi;
	}
	public void Nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\t-------------Nhap thong tin nhan vien-----------");
		System.out.println("\n Nhap ho ten: ");
		name = sc.nextLine();
		System.out.println("Nhap tuoi: ");
		age = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap ngay sinh: ");
		Ngaysinh = sc.nextLine();
		System.out.println("Nhap dia chi: ");
		Diachi = sc.nextLine();
	}
	public void Xuat() {
		System.out.println("\n\t-------------Thong tin cua nhan vien--------");
		System.out.println("Ho va ten: "+name);
		System.out.println("Tuoi: "+age);
		System.out.println("Dia chi: "+Diachi);
		System.out.println("Ngay sinh: "+Ngaysinh);
	}
	
	//phuong thuc truu tung
	public abstract double TinhLuong();
	
}
