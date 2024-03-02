import java.util.Scanner;

public class DienThoai extends SanPham {
	public String Camera;
	public int Dungluong;
	public String HangSX;
	public DienThoai() {
		super();
	}
	public DienThoai(String camera, int dungluong, String hangSX) {
		super();
		Camera = camera;
		Dungluong = dungluong;
		HangSX = hangSX;
	}
	public String getCamera() {
		return Camera;
	}
	public void setCamera(String camera) {
		Camera = camera;
	}
	public int getDungluong() {
		return Dungluong;
	}
	public void setDungluong(int dungluong) {
		Dungluong = dungluong;
	}
	public String getHanSX() {
		return HangSX;
	}
	public void setHanSX(String hangSX) {
		HangSX = hangSX;
	}
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Ma San Pham: ");
		this.MaSp = sc.nextLine();
		System.out.println("Nhap Ten San Pham: ");
		this.TenSP= sc.nextLine();
		System.out.println("Nhap Gia San Pham: ");
		this.GiaSP= Double.parseDouble(sc.nextLine());
		System.out.println("Nhap Chi So Camera ");
		this.Camera= sc.nextLine();
		System.out.println("Nhap Dung Luong Cua Dien Thoai: ");
		this.Dungluong = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap Hang San Xuat: ");
		this.HangSX = sc.nextLine();		
	}
	public void Xuat() {
		System.out.println("Ma San Pham La: "+MaSp);
		System.out.println("Ten San Pham La: "+TenSP);
		System.out.println("Gia San Pham La: "+GiaSP);
		System.out.println("Camera Co Chi So: "+Camera);
		System.out.println("May Co Dung Luong: "+ Dungluong);
		System.out.println("Hang San Xuat: "+ HangSX);
	}
	
}
