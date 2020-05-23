#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int t0=0,t1=1;
  int t,n;
  cin>>n;
  while(n>1)
  {
    t=t0+t1;
    t0=t1;
    t1=t;
    n--;
  }
  cout<<t0;
  return 0;
}