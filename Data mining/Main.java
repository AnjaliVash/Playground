#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,t,sum1=0,sum2=0;
  cin>>a;
  while(a>0)
  {
    t=a%10;
    if(t%2!=0)
    {
      sum1=sum1+t;
    }
    else
    {
      sum2=sum2+t;
    }
    a=a/10;
  }
  (sum1==sum2)?cout<<"Yes":cout<<"No";
  return 0;
}