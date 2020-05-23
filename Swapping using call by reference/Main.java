#include<iostream>
using namespace std;
void swap(int &a,int &b)
{
int temp;
temp=a;
a=b;
b=temp;
}
int main()
{
int c,d;
cin>>c>>d;
 cout<<"Before swapping a= "<<c<<" and b="<<d<<endl;
swap(c,d);
  cout<<"After swapping a= "<<c<<" and b="<<d;
  return 0;
}