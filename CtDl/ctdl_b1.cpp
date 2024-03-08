#include <iostream>
#include <string>
using namespace std;

const int MAX_CLASSES = 10;

// Ðinh nghia cau truc thông tin c?a m?t ca h?c
struct CaHoc {
    string tenHP;
    string phonghoc;
    int Soluongsinhvien;
    string Mahp;
};

// Hàm nh?p thông tin c?a các ca h?c vào m?ng
void nhapCaHoc(CaHoc danhSach[], int &soLuong) {
    cout << "Nhap so luong ca hoc: ";
    cin >> soLuong;
    cin.ignore(); // Ð? xóa b? nh? d?m t? l?nh cin tru?c khi dùng getline sau

    cout << "Nhap thong tin cho " << soLuong << " ca hoc:" << endl;
    for (int i = 0; i < soLuong; ++i) {
        cout << "Nhap ten hoc phan cho ca hoc thu " << i + 1 << ": ";
        getline(cin, danhSach[i].tenHP);
        cout << "Nhap ma phong hoc cho ca hoc thu " << i + 1 << ": ";
        getline(cin, danhSach[i].phonghoc);
        cout<<"Nhap so luong sinh vien:";
        cin>>danhSach[i].Soluongsinhvien;
        cout<<"Nhap ma hoc phan: ";
        cin>>danhSach[i].Mahp;
        cin.ignore() ;
    }
}

// Hàm xu?t thông tin c?a các ca h?c t? m?ng
void xuatCaHoc(const CaHoc danhSach[], int soLuong) {
    cout << "Thong tin cua " << soLuong << " ca hoc:" << endl;
    for (int i = 0; i < soLuong; ++i) {
        cout << "Ca hoc thu " << i + 1 << ":" << endl;
        cout << "Ten hc phan: " << danhSach[i].tenHP << endl;
        cout << "Ma lop: " << danhSach[i].phonghoc << endl;
        cout << "So luong: " << danhSach[i].Soluongsinhvien<<endl;
   		cout << "Ma hoc phan la: "<<danhSach[i].Mahp<<endl;
   }
    
}
void timKiemTheoMa(const CaHoc danhSach[], int soLuong, const string &Mahp) {
    bool timThay = false;
    for (int i = 0; i < soLuong; ++i) {
        if (danhSach[i].Mahp == Mahp) {
            cout << "Thong tin cua ca hoc thuc hanh co ma lop hoc phan la " << Mahp << ":" << endl;
            cout << "Ma lop hoc phan: " << danhSach[i].Mahp << endl;
            cout << "Ten hoc phan: " << danhSach[i].tenHP<< endl;
            cout << "So luong hoc sinh: "<<danhSach[i].Soluongsinhvien<<endl;
            cout << "Phong Hoc: " << danhSach[i].phonghoc<<endl;
            timThay = true;
            break; // Sau khi tìm th?y, thoát vòng l?p
        }
    }
    if (!timThay) {
        cout << "Khong tim thay ca hoc thuc hanh voi ma lop hoc phan " << Mahp << endl;
    }
}
void timKiemTheoTen(const CaHoc danhSach[], int soLuong, const string &tenHP) {
    bool timThay = false;
    for (int i = 0; i < soLuong; ++i) {
        if (danhSach[i].tenHP == tenHP) {
            cout << "Thong tin cua ca hoc thuc hanh co ten hoc phan la " << tenHP << ":" << endl;
            cout << "Ma lop hoc phan: " << danhSach[i].Mahp << endl;
            cout << "Ten hoc phan: " << danhSach[i].tenHP << endl;
            cout << "So luong sinh vien: " << danhSach[i].Soluongsinhvien << endl;
            cout << "Phong hoc: " << danhSach[i].phonghoc << endl;
            timThay = true;
            break; // Sau khi tim thay, thoat vong lap
        }
    }
    if (!timThay) {
        cout << "\n\t---Khong tim thay ca hoc thuc hanh voi ten hoc phan---" << tenHP << endl;
    }
}
void inDanhSachCaHocThucHanh(const CaHoc danhSach[], int soLuong, const string& phonghoc) {
    bool timThay = false;

    cout << "Các ca hoc thuc hanh toi phong " << phonghoc << " là:" << endl;
    for (int i = 0; i < soLuong; i++) {
        if (danhSach[i].phonghoc == phonghoc) {
            cout << "Ten hoc phan: " << danhSach[i].tenHP << endl;
            cout << "Ma hoc phan: " << danhSach[i].Mahp << endl;
            cout << "So luong hoc sinh: " << danhSach[i].Soluongsinhvien << endl;
            timThay = true;
        }
    }

    if (!timThay) {
        cout << "Khong co ca hoc thuc hanh nao toi phong " << phonghoc << "." << endl;
    }
}
void hoanDoi(CaHoc &a, CaHoc &b) {
    CaHoc temp = a;
    a = b;
    b = temp;
}
void sapXepTheoMaHocPhan(CaHoc danhSach[], int soLuong) {
    for (int i = 0; i < soLuong - 1; ++i) {
        for (int j = 0; j < soLuong - i - 1; ++j) {
            if (danhSach[j].Mahp > danhSach[j + 1].Mahp) {
                hoanDoi(danhSach[j], danhSach[j + 1]);
            }
        }
    }
}


int main() {
    CaHoc danhSachCaHoc[MAX_CLASSES];
    int soLuongCaHoc;

    // G?i hàm nh?p thông tin c?a các ca h?c
    nhapCaHoc(danhSachCaHoc, soLuongCaHoc);

    // G?i hàm xu?t thông tin c?a các ca h?c
    xuatCaHoc(danhSachCaHoc, soLuongCaHoc);
    //
    string maTimKiem;
    cout << "\nNhap ma lop hoc phan can tim kiem: ";
    cin >> maTimKiem;
    timKiemTheoMa(danhSachCaHoc, soLuongCaHoc, maTimKiem);
    //
	string tenTimKiem;
    cout << "\nNhap ten hoc phan can tim kiem: ";
    cin >> tenTimKiem;
   timKiemTheoTen(danhSachCaHoc, soLuongCaHoc, tenTimKiem);
    //
    string indanhsach;
    cout<<"Nhap phong hoc: ";
    cin>>indanhsach;
    inDanhSachCaHocThucHanh(danhSachCaHoc, soLuongCaHoc,indanhsach);
    //
    cout<<"\nMa hoc phan the thu tu tang dan: ";
    sapXepTheoMaHocPhan(danhSachCaHoc, soLuongCaHoc);
	xuatCaHoc(danhSachCaHoc, soLuongCaHoc);	
    return 0;
}
