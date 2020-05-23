#include<iostream>
using namespace std;
int main()
{
  int n1,n2;
  int sum=0;
  int i,j;
  cin>>n1>>n2;
  for(i=n1;i<n2;i++)
  {
    j=i-1;
    while(j>0)
    {
      if(i%j==0)
      {
        sum=sum+j;
      }
      j--;
    }
    if(sum==i)
    {
      cout<<i<<" ";
    }
    sum=0;
  }
  return 0;
}