#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int a,c=0,t,s,sum=0;
  cin>>a;
  s=a;
  a=pow(a,2);
  t=a;
  while(t>0)
  {
    t=t/10;
    c=c+1;
  }
  c=c/2;
  t=pow(10,c);
  sum=(a-a%t)/t + a%t;
  if(sum==s)
  cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
  return 0;
}