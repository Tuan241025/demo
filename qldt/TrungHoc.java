package qldt;

public class TrungHoc extends HocSinh {
	public double Daiso;
	public double Anhvan;
	public double Nguvan;
	public TrungHoc() {
		
	}
	public TrungHoc(double daiso,double anhvan,double nguvan) {
		super();
		Daiso=daiso;
		Anhvan = anhvan;
		Nguvan = nguvan;
	}
	public double getDaiso() {
		return Daiso;
	}
	public void setDaiso(double daiso) {
		Daiso = daiso;
	}
	public double getAnhvan() {
		return Anhvan;
	}
	public void setAnhvan(double anhvan) {
		Anhvan = anhvan;
	}
	public double getNguvan() {
		return Nguvan;
	}
	public void setNguvan(double nguvan) {
		Nguvan = nguvan;
	}
	public void Nhap() {
		System.out.println("\n\t====Nhap Thong Tin Hoc Sinh Trung Hoc====");
		super.Nhap();
		System.out.println("Nhap Diem Dai So: ");
		this.Daiso = Double.parseDouble(sc.nextLine());
		System.out.println("Nhap Diem Anh Van: ");
		this.Anhvan = Double.parseDouble(sc.nextLine());
		System.out.println("Nhap Diem Ngu Van: ");
		this.Nguvan = Double.parseDouble(sc.nextLine());
	}
	public void Xuat() {
		System.out.println("\n\t====Thong Tin Hoc Sinh Trung Hoc====");
		super.Xuat();
		System.out.println("Diem Toan: "+Daiso);
		System.out.println("Diem Anh Van: "+Anhvan);
		System.out.println("Diem Ngu Van: "+Nguvan);
		Xeploai();
	}
	@Override
	public double DiemTB() {
		// TODO Auto-generated method stub
		return (getDaiso() * 2) +(getAnhvan()* 2) + getNguvan();
	}
	@Override
	public String Xeploai() {
		if(DiemTB() >= 8)
			return "Gioi";
		else if(DiemTB()< 8)
			return "Kha";
		else if(DiemTB() <= 5)
			return "Trung Binh";
		else
			return "Yeu";
		// TODO Auto-generated method stub
		
	}
}
