#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,sum=0,count=0;
  cin>>a;
  while(sum<a)
  {
    int t;
    cin>>t;
    sum=sum+t;
    count++;
  }
  cout<<"The number of turns is "<<count;
  return 0;
}