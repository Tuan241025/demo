#include<iostream>
#include<conio.h>
using namespace std;
// khai bao mot danh sach gom nhung phan tu co kieu du lieu Struc Node
typedef struct node *NODEPTR; 
struct node
{
	int data; 
	node *next;
};
//khai bao cac ham con
void Menu();
void Khoitao(NODEPTR & plist);
int empty(NODEPTR plist);
NODEPTR create_node(int x);
void Input_list(NODEPTR &plist);
void Insert_first(NODEPTR &plist,int x);
void print_list(NODEPTR plist);
int Search_list(NODEPTR plist);
void Sapxep_list(NODEPTR plist);
int main()
{
	NODEPTR First;//bien chi con tro dau tien trong danh sach
	Khoitao(First);
	int chon;
	NODEPTR p;
	int k;
	do{
		Menu();
		cout<<"\n\t Nhap Mot So De Chon:";
		cin>>chon;
		//xet gia tri cua bien chon
		switch(chon)
		{
			case 0:
				printf("\n\t Goodbye");
				break;
			case 1:
				Input_list(First);
				break;
			case 2:
				print_list(First);
				break;
			case 3:
				Search_list(First);
				break;
			case 4:
				Sapxep_list(First);
				break;
		}
	}while(chon!= 0);
	return 0;
}
void Menu()
{
	cout<<"\n\t-------------------------";
	cout<<"\n0.\t Thoat Khoi Chuong Trinh";
	cout<<"\n1.\t Nhap Danh Sach";
	cout<<"\n2.\t In Danh Sach";
	cout<<"\n3.\t Tim Kiem Tren Danh Sach";
	cout<<"\n4.\t Sap Xep Danh Sach";
	cout<<"\n\t--------------------------";
}
void Khoitao(NODEPTR &plist)
{
	plist = NULL;
}
int empty(NODEPTR plist)
{
	return(plist == NULL ? 1:0);
}
NODEPTR create_node(int x)
{
	NODEPTR p;
	p = new node;
	p -> data = x;
	p -> next = NULL;
	return p;
}
void Insert_first(NODEPTR &plist)
{
	int x;//gia tri cua phan tu dua vao danh sach
	do{
		cout<<"\n\t Nhap gia tri dua vao danh sach. Nhap -999 de ket thuc!...";
		cin>>x;
		if(x!= 999)
		{
			//chen vao dau danh sach
			Insert_first(plist,x);
		}
	} while(x != -999);
}
void print_list(NODEPTR plist)
{
	NODEPTR p=plist;
	cout<<"\n";
	while(p!=NULL)
	{
		cout<<p->data;
		p=p->next;
	}
}
int Search_list(NODEPTR plist)
{
    if (empty(plist))
    {
        cout << "\n\t Danh sach rong!";
        return -1; // Tr? v? -1 n?u danh sách r?ng
    }

    int x;
    cout << "\n\t Nhap gia tri can tim kiem: ";
    cin >> x;

    NODEPTR p = plist;
    int position = 0; // Bi?n d? theo dõi v? trí c?a giá tr? c?n tìm

    while (p != NULL)
    {
        if (p->data == x)
        {
            cout << "\n\t Tim thay gia tri " << x << " tai vi tri " << position << ".";
            return position; // Tr? v? v? trí n?u tìm th?y
        }

        p = p->next;
        position++;
    }

    cout << "\n\t Khong tim thay gia tri " << x << " trong danh sach.";
    return -1; // Tra ve -1 neu không tim thay gia tri
}
void Sapxep_list(NODEPTR &plist)
{
    if (empty(plist))
    {
        cout << "\n\t Danh sach rong! Khong co gi de sap xep.";
        return;
    }

    // Su dung thuat toán sap xap noi bot de sap xep danh sách
    for (NODEPTR i = plist; i != NULL; i = i->next)
    {
        for (NODEPTR j = i->next; j != NULL; j = j->next)
        {
            if (i->data > j->data)
            {
                // Hoán doi giá tri cua hai nút
                int temp = i->data;
                i->data = j->data;
                j->data = temp;
            }
        }
    }

    cout << "\n\t Da sap xep danh sach theo thu tu tang dan.";
}


