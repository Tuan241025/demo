package onthi;

public class Xemay extends Xe {
	public String Loaixe;
	public String BienSo;
	
	public Xemay() {
		super();
	}

	public Xemay(String loaixe, String bienSo) {
		super();
		Loaixe = loaixe;
		BienSo = bienSo;
	}
	public void Nhap() {
		System.out.println("\t\t----------NHAP THONG TIN CHO XE MAY----------");
		super.Nhap();
		System.out.println("Nhap Loai Xe: ");
		this.Loaixe = sc.nextLine();
		System.out.println("Nhap Bien So: ");
		this.BienSo = sc.nextLine();
	}
	public void Xuat() {
		System.out.println("\t\t----------XUAT THONG TIN CHO XE MAY----------");
		super.Xuat();
		System.out.println("Loai Xe: "+this.Loaixe);
		System.out.println("Bien So: "+this.BienSo);
		System.out.println("Tien Xe La: "+Tinhtienthuexe());
	}
	@Override
	public double Tinhtienthuexe() {
		double tong1 = 150000;
		double tong2 = 200000;
		int cout = 0;
		for (int i = 0; i < this.Sogio; i++) {
			cout +=1;
		}
				if(this.Sogio == 1 && this.Loaixe.equalsIgnoreCase("Xe 100")) {
					return tong1;
				}
				else if (this.Sogio == 1 && this.Loaixe.equalsIgnoreCase("250")){
					return tong2 ;
				}
				if(this.Sogio >=2  && this.Loaixe.equalsIgnoreCase("Xe 100")){
					return tong1 +((cout-1) * 100000);
				}
				else if(this.Sogio >= 2 && this.Loaixe.equalsIgnoreCase("250"))  {
					return tong2 + ((cout-1)*  100000);
				}
			
		// TODO Auto-generated method stub
	


		return 0 ;
			
	
	
}
}
