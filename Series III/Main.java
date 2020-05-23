#include<iostream>
using namespace std;
int main()
{
  int t=5,c=6;;
  int a;
  cin>>a;
  while(a>0)
  {
    a=a-1;
    cout<<c<<" ";
    c=c+t;
    t=t+5;
  }
  return 0;
}