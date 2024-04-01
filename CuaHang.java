package onthi;

import java.util.ArrayList;
import java.util.Scanner;

public class CuaHang {
	ArrayList<Xe> lst = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	public void Excution() {
		boolean flag = true;
		int Luachon;
		while(flag) {
			Menu();
			System.out.println("\t\t---------MENU----------");
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
				Tinhtong(Luachon);
				break;
			default:
				break;
			}
		}
	}
	private void Tinhtong(int luachon) {
		// TODO Auto-generated method stub
	        double tong = 0;
	        for (Xe xe : lst) {
	            tong += xe.Tinhtienthuexe();
	        }
	        System.out.println("Tong tien xe la: " + tong);
	    }
	
	private void Xuat(int luachon) {
		// TODO Auto-generated method stub
		for (Xe xe : lst) {
			xe.Xuat();
		}
	}
	private void Nhap(int luachon) {
		// TODO Auto-generated method stub
		Xe x = null;
		if(luachon == 1) {
			x = new XeDap();
		}
		else if(luachon == 2){
			x = new Xemay();
	}
		x.Nhap();
		lst.add(x);
	}
	private void Menu() {
		// TODO Auto-generated method stub
		System.out.println("\t\t----------CUA HANG XE MAY----------");
		System.out.println("\t1. Nhap Thong Tin Xe Dap");
		System.out.println("\t2. Nhap Thong Tin Xe May");
		System.out.println("\t3. Xuat Danh Sach Cac Loai Xe");
		System.out.println("\t4. Tinh Tong Tien Thue Xe Cua Cac Loai Xe");
		System.out.println("\t0. GoodBye");
	}
}
