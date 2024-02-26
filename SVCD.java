package truonghocvanlang;

import java.util.Scanner;

public class SVCD extends Sinhvien {
	public double Diemthitotnghiep;

	public SVCD() {
		super();
	}

	public SVCD(double diemthitotnghiep) {
		super();
		Diemthitotnghiep = diemthitotnghiep;
	}

	public double getDiemthitotnghiep() {
		return Diemthitotnghiep;
	}

	public void setDiemthitotnghiep(double diemthitotnghiep) {
		Diemthitotnghiep = diemthitotnghiep;
	}
	public void Nhap() {
		super.Nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap diem thi tot nghiep ");
		Diemthitotnghiep = Double.parseDouble(sc.nextLine());
	}
	public void Xuat() {
		super.Xuat();
		System.out.println("Diem thi tot nghiep la: "+Diemthitotnghiep);
		System.out.println("Ket qua: "+XetTotNghiep());
	}

	@Override
	public boolean XetTotNghiep() {
		return this.Sumtinchi >= 120 && this.DiemTB >= 5 && this.Diemthitotnghiep >= 5;
	}
	public void CheckTotnghiep() {
		if(this.XetTotNghiep()) {
			System.out.println("Dau tot nghiep");
		}
		else
			System.out.println("Rot tot nghiep");
//		if(Sumtinchi >=120&DiemTB >= 5 & Diemthitotnghiep >= 5) {
//			return "Dau";
//		}
//		else
//			return "Rot";
		// TODO Auto-generated method stub
		
	}
}
