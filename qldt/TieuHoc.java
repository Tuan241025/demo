package qldt;

public class TieuHoc extends HocSinh {
	public float Toan;
	public float TienViet;
	public float NgheThuat;
	public TieuHoc() {
		super();
	}
	public TieuHoc(float toan, float tienViet, float ngheThuat) {
		super();
		Toan = toan;
		TienViet = tienViet;
		NgheThuat = ngheThuat;
	}
	public float getToan() {
		return Toan;
	}
	public void setToan(float toan) {
		Toan = toan;
	}
	public float getTienViet() {
		return TienViet;
	}
	public void setTienViet(float tienviet) {
		TienViet = tienviet;
	}
	public float NgheThuat() {
		return NgheThuat;
	}
	public void setNgheThuat(float nghethuat) {
		NgheThuat = nghethuat;
	}
	public void Nhap() {
		System.out.println("\n\t====Nhap Thong Tin Hoc Sinh Tieu Hoc====");
		super.Nhap();
		System.out.println("Nhap Diem Toan: ");
		this.Toan = Float.parseFloat(sc.nextLine());
		System.out.println("Nhap Diem Tieng Viet: ");
		this.TienViet = Float.parseFloat(sc.nextLine());
		System.out.println("Nhap Diem Nghe Thuat: ");
		this.NgheThuat= Float.parseFloat(sc.nextLine());
	}
	public void Xuat() {
		System.out.println("\n\t====Thong Tin Hoc Sinh Tieu Hoc====");
		super.Xuat();
		System.out.println("Diem Toan: "+Toan);
		System.out.println("Diem Tieng Viet: "+TienViet);
		System.out.println("Diem Nghe Thuat: "+NgheThuat);
		Xeploai();
	}
	@Override
	public double DiemTB() {
		return (this.Toan + this.TienViet+this.NgheThuat)/ 3;}
		// TODO Auto-generated method stub
	@Override
	public String Xeploai() {
		
		if(DiemTB() >= 9  ) {
			return "Hoan thanh tot";}
		else if(DiemTB() >=5) {
			return "Dat yeu cau";}
		else  {
			return "khong Dat";
		// TODO Auto-generated method stub
	}

}
}

	

