package qldt;

import java.util.ArrayList;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		
//		TieuHoc[] tharray = new TieuHoc[2];
//		for (int i = 0; i < tharray.length; i++) {
//			tharray[i] = new TieuHoc();
//			tharray[i].Nhap();
//		}
//		for (TieuHoc tieuHoc : tharray) {
//			tieuHoc.Xuat();
//			System.out.println("Xep loai: "+tieuHoc.Xeploai());
//		}
//		TrungHoc[]trharray = new TrungHoc[3];
//		for (int i = 0; i < trharray.length; i++) {
//			trharray[i] = new TrungHoc();
//			trharray[i].Nhap();
//			trharray[i].Xuat();
//			System.out.println("Xep Loai: "+trharray[i].Xeploai());
//		}
//		
//	}
//
//}
		ArrayList ds = new ArrayList<HocSinh>();
		Scanner sc = new Scanner(System.in);
		HocSinh hs;
		TieuHoc  tieuhoc;
		TrungHoc trunghoc;
		
		//Nhap 2 tieu hoc
		for(int i = 0; i < 2;i++) {
			tieuhoc= new TieuHoc();
			tieuhoc.Nhap();
			ds.add(tieuhoc);
		}
		//Nhap 3 trung hoc
		for(int i = 0;i <3;i++){
			trunghoc = new TrungHoc();
			trunghoc.Nhap();
			ds.add(trunghoc);
		}
		//in danh sach
		for(int i = 0;i <5 ; i++) {
			hs = (HocSinh)ds.get(i);
			hs.Xuat();
			
		}
	}
	}