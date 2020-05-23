#include<iostream>
#include<math.h>
using namespace std;
int main()
{
int a;
  cin>>a;
  int t=11;
  while(a>0)
  {
    cout<<pow(t,2)<<" ";
    t=t+4;
    a--;
  }
}