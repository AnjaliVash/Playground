#include<iostream>
using namespace std;
int main()
{
  int n1,n2;
  cin>>n1>>n2;
  int a=n1+n2;
  int i=a-1;
  int sum=0;
  while(i>0)
  {
    if(a%i==0)
    {
      sum=sum+i;
    }
    i--;
  }
  if(sum==a)
  {
    cout<<"They can read the message";
  }
  else
    cout<<("They can't read the message");
	return 0;
}