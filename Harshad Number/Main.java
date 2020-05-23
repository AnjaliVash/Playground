#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,t,sum=0;
  cin>>a;
  t=a;
  while(t>0)
  {
    sum=sum+(int)t%10;
    t=t/10;
    //cout<<t<<" "<<sum<<"\n";
  }
  if(a%sum==0)
  {
    cout<<"Harshad Number";
  }
  else
  {
    cout<<"Not Harshad Number";
  }
}