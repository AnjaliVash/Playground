#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  long int a;
  cin>>a;
  int count=0;
  int flag=0;
  if(a>=0){
  while(a>0)
  {
    if(a%10!=0)
    {
      flag=1;
    }
    a=a/10;
    count=count+1;
  }}
  else if(a<0)
  {
    while(a<0)
  {
    a=a/10;
    count=count+1;
  }
  }
  if(flag==0)
  {
    count++;
  }
  cout<<count;return 0;
}