
#include<iostream>
using namespace std;
const int MAX_PRODUCT = 40;
const int MAX_Masp = 5;
const int MAX_Tensp = 50;
const int MAX_NoiSx = 5;
	struct Date{
		int ngay;
		int thang;
		int nam;
	}ngaysanxuat;
	
struct SanPham{
	string Masp;
	string Tensp;
	double Dongia;
	int Exp;
	string NoiSx;  
	Date ngaysanxuat;
}Sp;

//Nhap san pham
void NhapSP(SanPham &Sp){
	cout << "\nNhap Ma San Pham: ";
    cin >> Sp.Masp;
	cout<< "\nNhap Ten san Pham: ";
	
	cin>> Sp.Tensp;
	cout<< "\nNhap Don Gia: ";
	cin>> Sp.Dongia;
	cout<< "\nNhap Ngay Su Dung: ";
	cin>> Sp.Exp;
	cout<<"\nNhap Noi San Xuat: ";
	cin>>Sp.NoiSx;
	cout<<"\nNhap Ngay: ";
	cin>>Sp.ngaysanxuat.ngay;
	cout<<"\nNhap Thang: ";
	cin>>Sp.ngaysanxuat.thang;
	cout<<"\nNhap Nam: ";
	cin>>Sp.ngaysanxuat.nam;
}
void Xuat(SanPham &Sp){
	cout << "\nMa San Pham: " << Sp.Masp << endl;
    cout << "\nTen san Pham: " << Sp.Tensp << endl;
    cout << "\nDon Gia: " << Sp.Dongia << endl;
    cout << "\nNgay Su Dung: " << Sp.Exp << endl;
    cout << "\nNoi San Xuat: " << Sp.NoiSx << endl;
    cout << "\nNgay Thang Nam: " << Sp.ngaysanxuat.ngay << "/" << Sp.ngaysanxuat.thang << "/" << Sp.ngaysanxuat.nam << endl;
}
void timkiemtheoMasp(const SanPham danhsachsanpham[], int Soluong,const string &Masp){
	bool Timthay = false;
	cout<<"\nThong Cua San Pham Co Ma San Pham La: "<<Masp<<endl;
	for(int i = 0;i <Soluong;i++ ){
		if(danhsachsanpham[i].Masp== Masp){
			cout << "\nMa San Pham: " << danhsachsanpham[i].Masp << endl;
    		cout << "\nTen san Pham: " << danhsachsanpham[i].Tensp << endl;
    		cout << "\nDon Gia: " << danhsachsanpham[i].Dongia << endl;
    		cout << "\nNgay Su Dung: " << danhsachsanpham[i].Exp << endl;
    		cout << "\nNoi San Xuat: " << danhsachsanpham[i].NoiSx << endl;
    		cout << "\nNgay Thang Nam: " << danhsachsanpham[i].ngaysanxuat.ngay << "/" <<danhsachsanpham[i].ngaysanxuat.thang << "/" << danhsachsanpham[i].ngaysanxuat.nam << endl;
			Timthay = true;
			break;
		}
	}
	if (!Timthay) {
        cout << "\nKhong tim thay san pham voi ma san pham " << Masp << endl;
    }
}
void timkiemtheoTensp(const SanPham danhsachsanpham[], int Soluong,const string &Tensp){
	bool Timthay = false;
	cout<<"\nThong Tin Cua San Pham Co Ten San Pham La: "<<Tensp<<endl;
	for(int i = 0;i <Soluong;i++ ){
		if(danhsachsanpham[i].Tensp== Tensp){
			cout << "\nMa San Pham: " << danhsachsanpham[i].Masp << endl;
    		cout << "\nTen san Pham: " << danhsachsanpham[i].Tensp << endl;
    		cout << "\nDon Gia: " << danhsachsanpham[i].Dongia << endl;
    		cout << "\nNgay Su Dung: " << danhsachsanpham[i].Exp << endl;
    		cout << "\nNoi San Xuat: " << danhsachsanpham[i].NoiSx << endl;
    		cout << "\nNgay Thang Nam: " << danhsachsanpham[i].ngaysanxuat.ngay << "/" <<danhsachsanpham[i].ngaysanxuat.thang << "/" << danhsachsanpham[i].ngaysanxuat.nam << endl;
			Timthay = true;
			break;
		}
	}
	if (!Timthay) {
        cout << "\nKhong tim thay san pham voi ma san pham " << Tensp << endl;
    }
}
void inDanhSanpham(const SanPham danhsachsanpham[], int soLuong, const string& NoiSx) {
    bool Timthay = false;

    cout << "\nCac San Pham Co Noi San Xuat O " << NoiSx << " là:" << endl;
    for (int i = 0; i < soLuong; i++) {
        if (danhsachsanpham[i].NoiSx == NoiSx) {
            cout<<"Thong Tin Cua San Pham O  "<<NoiSx<<":"<<endl;
			cout << "\nMa San Pham: " << danhsachsanpham[i].Masp << endl;
    		cout << "\nTen san Pham: " << danhsachsanpham[i].Tensp << endl;
    		cout << "\nDon Gia: " << danhsachsanpham[i].Dongia << endl;
    		cout << "\nNgay Su Dung: " << danhsachsanpham[i].Exp << endl;
    		cout << "\nNoi San Xuat: " << danhsachsanpham[i].NoiSx << endl;
    		cout << "\nNgay Thang Nam: " << danhsachsanpham[i].ngaysanxuat.ngay << "/" <<danhsachsanpham[i].ngaysanxuat.thang << "/" << danhsachsanpham[i].ngaysanxuat.nam << endl;
			Timthay = true;
			break;
        }
    }

    if (!Timthay) {
        cout << "\nKhong co san pham nao o " << NoiSx << "." << endl;
    }
}
void hoanDoi(SanPham &a, SanPham &b) {
    SanPham temp = a;
    a = b;
    b = temp;
}
void sapXepTheoTenTangdan(SanPham danhsachsanpham[], int Soluong) {
    for (int i = 0; i < Soluong - 1; ++i) {
        for (int j = 0; j < Soluong - i - 1; ++j) {
            if (danhsachsanpham[j].Tensp > danhsachsanpham[j + 1].Tensp) {
                hoanDoi(danhsachsanpham[j], danhsachsanpham[j + 1]);
            }
        }
    }
}
int main(){
	int Soluong;
	cout<<"\nNhap So Luong San Pham(toi da 40 san pham): ";
	cin>> Soluong;
	
	SanPham* danhsachsanpham = new SanPham[Soluong];
	for(int i = 0; i < Soluong; i++){
		cout<<"\nNhap Thong Tin Cho San Pham Thu"<<i+1<<endl;
		NhapSP(danhsachsanpham[i]);
	}
	for(int i = 0; i < Soluong;i++){
		cout<<"\nThong Tin Cua San Pham Thu "<<i+1<<endl;
		Xuat(danhsachsanpham[i]);
	}
	string maTimKiem;
    cout << "\nNhap ma san pham can tim kiem: ";
    cin >> maTimKiem;
    timkiemtheoMasp(danhsachsanpham, Soluong, maTimKiem);
    
    string tenTimKiem;
    cout << "\nNhap ten san pham can tim kiem: ";
    cin >> tenTimKiem;
    timkiemtheoTensp(danhsachsanpham, Soluong, tenTimKiem);
    
    string Indanhsach;
    cout << "\nNhap noi san xuat can in: ";
    cin >> Indanhsach;
    inDanhSanpham(danhsachsanpham, Soluong, Indanhsach);
    
    cout << "\nSan pham theo thu tu tang dan: ";
    sapXepTheoTenTangdan(danhsachsanpham, Soluong);
    for (int i = 0; i < Soluong; i++) {
        Xuat(danhsachsanpham[i]);
    }

	delete[]danhsachsanpham;
	
	return 0;
}
