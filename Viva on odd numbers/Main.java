#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,count=0;
  float sum=0;
  while(count!=3)
  {
    cin>>a;
    if(a<0)
    {
      sum=sum-1;
      break;
    }
    else if((float)(a%2)!=0)
    {
      sum=sum+1;
      count=count+1;
    }
    else
    {
      sum=(float)(sum-0.5);
    }
  }
  cout<<(float)sum;
}