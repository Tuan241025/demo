package onthi;

public class XeDap extends Xe {

	public void Nhap() {
		System.out.println("\t\t----------NHAP THONG TIN CHO XE DAP----------");
		super.Nhap();
	}
	public void Xuat() {
		System.out.println("\t\t----------XUAT THONG TIN CHO XE DAP----------");
		super.Xuat();
		System.out.println("Tien Xe La: "+Tinhtienthuexe());
	}
	@Override
	public double Tinhtienthuexe() {
		double tong = 10000;
		int cout = 0;
		for (int i = 0; i < this.Sogio; i++) {
				cout += 1;
		}
				if(cout == 1) {
					return tong;
				}
				else if(cout >=2){
					return tong + (8000*(cout-1));
				}
			
		// TODO Auto-generated method stub
	


		return tong ;
}
	
	
}
