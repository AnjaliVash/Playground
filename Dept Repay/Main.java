#include<iostream>
using namespace std;
int main()
{
  int a,r,y;
  cin>>a>>r>>y;
  int f= a*r*y/100;
  float t= (float)f*2/100;
  cout<<f<<"\n"<<a+f<<"\n"<<t<<"\n"<<a+f-t;
  //Type your code here.
}