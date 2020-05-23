#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n;
  int a=11;
  cin>>n;
  while(n>0)
  {
    cout<<pow(a,2)<<" ";
    a=a+4;
    n--;
  }
  return 0;
}