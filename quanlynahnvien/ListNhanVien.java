package Kiemtra;

import java.util.ArrayList;
import java.util.Scanner;

public class ListNhanVien {

	ArrayList<NhanVien>listNhanvien = new ArrayList<>();
	Scanner sc = new  Scanner(System.in);
	public void Excution() {
		boolean flag = true;
		int Luachon;
		while(flag) {
			Menu();
			System.out.println("Nhap vao lua chon cua ban: ");
			Luachon = Integer.parseInt(sc.nextLine());
			switch (Luachon) {
			case 1:
				Nhap(Luachon);
				break;
			case 2:
				Nhap(Luachon);
				break;
			case 3:
				Xuat(Luachon);
				break;
			case 4:
				DevLuong(Luachon);
				break;
			case 5:
				TestTingLuong();
				break;
			case 6:
				Luongthapnhat();
				break;
			case 0:
				System.out.println("Goodbye");
				flag = false;
				break;
			default:
				System.out.println("nhap sai!");
				break;
			}
		}
		
	}
	private double LuongTrungBinh() {
		int total = 0;
		for (NhanVien nhanVien : listNhanvien) {
			total += nhanVien.TinhLuong();
		}
		return total/ listNhanvien.size();
	}
	public void Luongthapnhat() {
		double luongthap = LuongTrungBinh();
		for (NhanVien nhanVien : listNhanvien) {
			double luong = nhanVien.TinhLuong();
			if(luong < LuongTrungBinh()) {
				System.out.println("Luong Thap Nhat La: "+luongthap);
				nhanVien.xuat();
			}
		}
	}
	private void DevLuong(int luachon) {
		// TODO Auto-generated method stub
		double luong = Double.MAX_VALUE;
		for (NhanVien nhanVien : listNhanvien) {
			if(nhanVien instanceof NhanVienDev) {
				double TinhLuong = nhanVien.TinhLuong();
				if(TinhLuong < luong) {
					luong = TinhLuong;
					
			}
		}
	}
		System.out.println("Luong Nhan Vien Dev Thap Nhat: " + luong);
	    for (NhanVien nhanVien : listNhanvien) {
	        if (nhanVien instanceof NhanVienDev && nhanVien.TinhLuong() == luong) {
	            nhanVien.xuat();
	            break;
	        
	}
	    }
	}
	private void TestTingLuong() {
		// TODO Auto-generated method stub
		double luongg = 0.0;
		for (NhanVien nhanVien : listNhanvien) {
			if(nhanVien instanceof NhanVienbTestTing) {
				double TinhLuong = nhanVien.TinhLuong();
				if(TinhLuong > luongg) {
					luongg = TinhLuong;
			}
		}
	}
		System.out.println("Luong Nhan Vien Testing Cao Nhat: " + luongg);
	    for (NhanVien nhanVien : listNhanvien) {
	        if (nhanVien instanceof NhanVienbTestTing && nhanVien.TinhLuong() == luongg) {
	            nhanVien.xuat();
	            break;	
	}
	    }
	}
	
	private void Nhap(int luachon) {
		// TODO Auto-generated method stub
		NhanVien nv = null;
		if(luachon == 1) {
			nv = new NhanVienDev();
		}
		else {
			nv = new NhanVienbTestTing();
	}
		nv.Nhap();
		listNhanvien.add(nv);
	}
	public void Xuat(int luachon) {
		for (NhanVien nhanVien : listNhanvien) {
			nhanVien.xuat();
		}
	}
	private void Menu() {
		// TODO Auto-generated method stub
		
			System.out.println("\t-----Nhap thong tin nhan vien-----");
			System.out.println("\t 1.\t Nhap thong tin nhan vien dev: ");
			System.out.println("\t 2.\t Nhap thong tin nhan vien testing: ");
			System.out.println("\t 3.\t Xuat toan bo thong tin nhan vien: ");
			System.out.println("\t 4.\t Nhan vien Dev co luong thap nhat");
			System.out.println("\t 5.\t Nhan vien Testing co luong cao nhat");
			System.out.println("\t 6.\t Nhan vien co luong thap hon luong trung binh ");
			System.out.println("\t 0.\t Ket thuc chuong trinh");
		}
	}


