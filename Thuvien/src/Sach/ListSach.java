package Sach;

import java.util.ArrayList;
import java.util.Scanner;


public class ListSach {
	ArrayList<MainSach>listMainsach = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	public void System() {
		boolean flag = true;
		int Luachon;
		while(flag) {
			Menu();
			System.out.println("\n\t====NHAP LUA CHON CUA BAN====");
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
				Tong();
				break;
			case 5:
				TrungBinhCong();
				break;
			case 6:
				Xuatdanhsach();
				break;
			case 0:
				System.out.println("\nGOODBYE");
				flag = false;
				break;
			default:
				break;
			}
		}
		
	}
	private void Xuatdanhsach() {
		// TODO Auto-generated method stub
		for (MainSach mainSach : listMainsach) {
			if(mainSach instanceof MainSach) {
				String nhaxuatban = mainSach.getNhaxuatban();
					if(nhaxuatban.equalsIgnoreCase("X")) {
						mainSach.Xuat();
			}
		
	}
		}
	}
	private void TrungBinhCong() {
		// TODO Auto-generated method stub
		double total = 0.0;
		for (MainSach mainSach : listMainsach) {
			total+= mainSach.Dongia();
		}
		System.out.println("Trung Bnh Cong Don Gia"+total/ listMainsach.size());
	}
	
	private void Tong() {
		double tong = 0;
		for (MainSach mainSach : listMainsach) {
			tong += mainSach.ThanhTien();
		}
		System.out.println("Tong Thanh Tien La: "+tong);
		// TODO Auto-generated method stub

	}
	private void Nhap(int luachon) {
		// TODO Auto-generated method stub
		MainSach ms = null;
		if(luachon == 1) {
			ms = new SachGiaoKhoa();
		}
		else {
			ms = new SachThamKhao();
		}
		ms.Nhap();
		listMainsach.add(ms);
	}
	public void Xuat(int Luachon) {
		for (MainSach mainSach : listMainsach) {
			mainSach.Xuat();
		}
	}
	private void Menu() {
		// TODO Auto-generated method stub
		System.out.println("\n\t====NHAP LUA CHON CUA BAN====");
		System.out.println("\n1. Nhap Thong Tin Sach Giao Khoa");
		System.out.println("\n2. Nhap Thong Tin Sach Tham Khao");
		System.out.println("\n3. Xuat Thong Tin Cua Sach");
		System.out.println("\n4. Tinh Tong Thanh Tien Cua Sach");
		System.out.println("\n5. Tinh Trung Binh Cong Don Gia");
		System.out.println("\n6. Xuat Danh Sach Nha Xuat Ban Ten X");
		System.out.println("\n0. ----Ket Thuc Chuong Trinh----\tGoodBye");
	}
}
