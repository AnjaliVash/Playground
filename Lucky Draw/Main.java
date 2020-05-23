#include<iostream>
using namespace std;
int main()
{
  int a;
  cin>>a;
  int n=(int)(a/2)+1;
  int flag=0;
  (a==1)?flag=1:flag=0;
  while(n!=1)
  {
    if(a%n==0)
    {
      flag=1;
      break;
    }
    n--;
  }
  (flag==0)?cout<<"Eligible":cout<<"Not eligible";
  return 0;
}