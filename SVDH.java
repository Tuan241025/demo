package truonghocvanlang;

import java.util.Scanner;

public class SVDH extends Sinhvien {
	public String TenLuanVan;
	public double DiemLV;
	public SVDH() {
		super();
	}
	public SVDH(String tenLuanVan, double diemLV) {
		super();
		TenLuanVan = tenLuanVan;
		DiemLV = diemLV;
	}
	public String getTenLuanVan() {
		return TenLuanVan;
	}
	public void setTenLuanVan(String tenLuanVan) {
		TenLuanVan = tenLuanVan;
	}
	public double getDiemLV() {
		return DiemLV;
	}
	public void setDiemLV(double diemLV) {
		DiemLV = diemLV;
	}
	public void Nhap() {
		super.Nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten luan van: ");
		TenLuanVan = sc.nextLine();
		System.out.println("Nhap diem luan van: ");
		DiemLV = Double.parseDouble(sc.nextLine());
	}
	public void Xuat() {
		super.Xuat();
		System.out.println("Ten luan van la: "+TenLuanVan);
		System.out.println("Dem luan van la: "+DiemLV);
		
	}
	@Override
	public boolean XetTotNghiep() {
//		if(Sumtinchi>=170&DiemTB >= 5 || DiemLV >= 5) {
//			return "Dau";
//		}
//		else
//			return "Rot";
		return this.Sumtinchi >= 145 && this.DiemTB >= 5 && this.DiemLV >= 5;
	}
	public void CheckTotnghiep() {
		if(XetTotNghiep())  {
			System.out.println("Dau tot nghiep"); 
		}
		else
			System.out.println("Rot tot nghiep");
		// TODO Auto-generated method stub
		
	}
	
}
