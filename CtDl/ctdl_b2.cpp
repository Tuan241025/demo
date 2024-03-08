#include<iostream>
#include<cstdlib>
using namespace std;

// Cai dat cay
typedef struct Node
{
    int data;
    Node* left;
    Node* right;
} Node_t;

// Giai phong du lieu
void Free(Node_t* Root)
{
    if (Root == NULL)
        return;
    Free(Root->left);
    Free(Root->right);
    delete Root;
}

// Dieu huong cua cay
bool LeftOf(const int value, const Node_t* Root)
{
    // gia tri ko trung lap
    return value < Root->data;
}

bool RightOf(const int value, const Node_t* Root)
{
    return value > Root->data;
}

// them phan tu
Node_t* Insert(Node_t* root, const int value)
{
    if (root == NULL)
    {
        Node_t* Node = new Node_t;
        Node->left = NULL;
        Node->right = NULL;
        Node->data = value;
        return Node;
    }
    if (LeftOf(value, root))
        root->left = Insert(root->left, value);
    else if (RightOf(value, root))
        root->right = Insert(root->right, value);
    return root;
}

// tim kiem
bool Search(const Node_t* root, int value)
{
    if (root == NULL)
        return false;
    if (root->data == value)
    {
        return true;
    }
    else if (LeftOf(value, root))
    {
        return Search(root->left, value);
    }
    else if (RightOf(value, root))
    {
        return Search(root->right, value);
    }
    return false;
}

// Lay gia tri ben trai lon nhat
int LeftMostValue(const Node_t* root)
{
    while (root->left != NULL)
        root = root->left;
    return root->data;
}

// xoa node
Node_t* Delete(Node_t* root, int value) {
    if (root == NULL)
        return root;
    if (LeftOf(value, root))
        root->left = Delete(root->left, value);
    else if (RightOf(value, root))
        root->right = Delete(root->right, value);
    else {
        if (root->left == NULL) {
            Node_t* newRoot = root->right;
            Free(root);
            return newRoot;
        }
        if (root->right == NULL) {
            Node_t* newRoot = root->left;
            Free(root);
            return newRoot;
        }
        root->data = LeftMostValue(root->right);
        root->right = Delete(root->right, root->data);
    }
    return root;
}

// Duyet Preorder
void PreOrder(Node_t* root)
{
    if (root != NULL)
    {
        cout << root->data << " ";
        PreOrder(root->left);
        PreOrder(root->right);
    }
}

// Duyet Inorder
void InOrder(Node_t* root)
{
    if (root != NULL)
    {
        InOrder(root->left);
        cout << root->data << " ";
        InOrder(root->right);
    }
}

// Duyet PostOrder
void PostOrder(Node_t* root)
{
    if (root != NULL)
    {
        PostOrder(root->left);
        PostOrder(root->right);
        cout << root->data << " ";
    }
}

int main()
{
    // Example usage
    Node_t* root = NULL;
    root = Insert( root, 25 );
    root = Insert( root, 50 );
    root = Insert( root, 10 );
    root = Insert( root, 22 );
    root = Insert( root, 35 );
    root = Insert( root, 70 );
    root = Insert( root, 4 );
    root = Insert( root, 12 );
    root = Insert( root, 18 );
    root = Insert( root, 24 );
    root = Insert( root, 31 );
    root = Insert( root, 44 );
    root = Insert( root, 66 );
    root = Insert( root, 90 );


    cout<<"\nDuyet preorder : ";
    PreOrder(root);
    cout<<"\nDuyet inorder  : ";
   	InOrder(root);
    cout<<"\nDuyet postorder:";
    PostOrder(root);
 
    cout<<"\n==Thu them phan tu 15 vao BTS==\n";
    Insert(root, 15);
    cout<<"\nDuyet preorder : ";
    PreOrder(root);
    cout<<"\nDuyet inorder  : ";
    InOrder(root);
    cout<<"\nDuyet postorder:";
    PostOrder(root);
    

	cout << "\n==Xoa phan tu 4 khoi BTS==\n";
    root = Delete(root, 4);

    cout << "\nDuyet preorder sau xoa : ";
    PreOrder(root);
    cout << "\nDuyet inorder sau xoa  : ";
    InOrder(root);
    cout << "\nDuyet postorder sau xoa:";
    PostOrder(root);

    Free( root );
    root = NULL;
    return 0;
  

}

