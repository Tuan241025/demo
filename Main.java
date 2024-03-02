import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
//	public void Giacaonhat() {
//		Double giacaonhat = 0.0;
//		Double GiaSP = Double.parseDouble(sc.nextLine());
//		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DienThoai[] DienthoaiArray = new DienThoai[5];
		for (int i = 0; i < DienthoaiArray.length; i++) {
			System.out.println("\n\t-----Thong Tin Cua Dien Thoai-----");
			DienthoaiArray[i] = new DienThoai();
			DienthoaiArray[i].Nhap();
			DienthoaiArray[i].Xuat();
		}
		double giacaonhat;
		int vt = 0;
		giacaonhat = DienthoaiArray[0].getGiaSP();
		for (int i = 0; i < DienthoaiArray.length; i++) {
			if( giacaonhat < DienthoaiArray[i].getGiaSP()) {
				giacaonhat = DienthoaiArray[i].getGiaSP();
				vt = i;
		}
			
		}
		System.out.println("San Pham Co Gia Cao Nhat La ");
		DienthoaiArray[vt].Xuat();
		System.out.println("\n\t---Dien Thoai Samsung---");
		String Tensp = DienthoaiArray[vt].TenSP;
		for (int i = 0; i < DienthoaiArray.length; i++) {
			if( DienthoaiArray[i].getTenSP().equalsIgnoreCase("Samsung")) {
				DienthoaiArray[i].Xuat();
			}
		}
	}
	

}
