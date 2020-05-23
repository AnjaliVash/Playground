#include<iostream>
using namespace std;
int main()
{
  int b=0;
  int a=2;
  int n;
  int t=6;
  std::cin>>n;
  cout<<b<<" ";
  while(n>1)
  {
    cout<<a<<" ";
    a=a+t;
    if(n%2!=0)
    {
      t=t+4;
    }
    n--;
  }
  return 0;
}