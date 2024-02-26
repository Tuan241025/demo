package truonghocvanlang;

import java.util.ArrayList;
import java.util.Scanner;

public class ListSinhvien{
	ArrayList<Sinhvien> listStudent = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	public void excution() {
		boolean flag = true;
		int Luachon;
		while(flag) {
			Menu();
			System.out.println("Nhap vao lua chn cua ban: ");
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
				Thongke(Luachon);
				break;
			case 5:
				Timmasosv();
				break;
			case 6:
				TimDTB();
				break;
			case 7:
				System.out.println("Goodbye");
				flag = false;
				break;
			default:
				System.out.println("Nhap sai");
				break;
			}
		}
	}
	
	
	private void Xuat(int Luachon) {
		// TODO Auto-generated method stub
		for (Sinhvien sinhvien : listStudent) {
			sinhvien.Xuat();
		}
	}

	private void Nhap(int luachon) {
		// TODO Auto-generated method stub
		Sinhvien x = null;
		if(luachon == 1) {
			x = new SVDH();
			x.Nhap();
		}
		else {
			x = new SVCD();
			x.Nhap();
		}
		listStudent.add(x);
	}
	


	public void Menu() {
		System.out.println("\t-----Nhap thong tin sinh vien-----");
		System.out.println("\t 1.\t Nhap thong tin sinh ven dai hoc: ");
		System.out.println("\t 2.\t Nhap thong tin sinh vien cao dang: ");
		System.out.println("\t 3.\t Xuat toan bo thong tin sinh vien: ");
		System.out.println("\t 4.\t Thong Ke so luong sinh vien dau va rot");
		System.out.println("\t 5.\t Tim thi sinh theo ma so");
		System.out.println("\t 6.\t Tim thi sinh co DTB cao nhat: ");
		System.out.println("\t 7.\t Ket thuc chuong trinh");
	}
	public void Thongke(int luachon) {
//		int dau = 0;
//		int rot = 0;
//		for (Sinhvien sinhvien : listStudent) {
//			if (sinhvien.XetTotNghiep() == true) {
//				dau++;
//			}
//			else
//				rot++;
//		}
//		System.out.println("So sinh vien dau la: "+dau);
//		System.out.println("So sinh vien rot la: "+rot);
		System.out.println("\t ----Thng tin sinh vien dai hoc----");
		int coutD = 0;
		int coutR = 0;
		for (Sinhvien sinhvien : listStudent) {
			if(sinhvien instanceof SVDH ) {
//				sinhvien.Xuat();
				if(sinhvien.XetTotNghiep()== true) {
					coutD++;
		}
				else {
					coutR++;
				}
	}
		}
		System.out.println("Sinh vien dh dau tot nghiep la: "+coutD);
		System.out.println("Sinh vien dai hoc rot tot nghiep la: "+coutR);
		}
	
	public void Timmasosv() {
		System.out.println("Nhap ma so sinh vien can tim: ");
		String maSoCanTim =sc.nextLine();
		boolean found = false;
		for (Sinhvien sinhvien : listStudent) {
			if (sinhvien.getMSv().equals(maSoCanTim)) {
				System.out.println("Ket qua: " + sinhvien.XetTotNghiep());
				sinhvien.Xuat();
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Khong tim thay sinh vien co ma so " + maSoCanTim);
		}
	}
	public void TimDTB() {
		Double tmp = 0.0;
		Double DiemTB =Double.parseDouble(sc.nextLine());
		boolean foundd = false;
		for (Sinhvien sinhvien : listStudent) {
			DiemTB = sinhvien.DiemTB;
			if (DiemTB > tmp ){
				System.out.println("Ket qua: " + sinhvien.DiemTB);
				sinhvien.Xuat();
				foundd = true;
				break;
			}
		}
	}
	}


	
	
