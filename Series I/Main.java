#include<iostream>
using namespace std;
int main()
{
  int a;
  float t=0.5;
  cin>>a;
  cout<<t<<" ";
  while(a>1)
  {
    t=t*3;
    cout<<t<<" ";
    a=a-1;
  }
  return 0;
}
