#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int a,count=0;
  cin>>a;
  cout<<a<<"\n";
  while(a!=1)
  {
    if(a%2==0)
    {
      a=a/2;
    }
    else
    {
      a=3*a+1;
    }
    count++;
    cout<<a<<"\n";
  }
  cout<<count;
  return 0;
}