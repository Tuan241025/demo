package onthi;

import java.util.Scanner;

public abstract class Xe {
	public String Hoten;
	public int Sogio;
	Scanner sc = new Scanner(System.in);
	public Xe() {
		
	}
	public Xe(String hoten, int sogio) {
		
		Hoten = hoten;
		Sogio = sogio;
	}
	public String getHoten() {
		return Hoten;
	}
	public void setHoten(String hoten) {
		Hoten = hoten;
	}
	public int getSogio() {
		return Sogio;
	}
	public void setSogio(int sogio) {
		Sogio = sogio;
	}
	public void Nhap() {
		System.out.println("Nhap Ho va Ten: ");
		this.Hoten = sc.nextLine();
		System.out.println("Nhap So Gio: ");
		this.Sogio= Integer.parseInt(sc.nextLine());
	}
	public void Xuat() {
		System.out.println("Ho va Ten: "+this.Hoten);
		System.out.println("So Gio: "+this.Sogio);
	}
	public abstract double Tinhtienthuexe(); 
}
