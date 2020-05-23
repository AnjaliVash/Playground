#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  cin>>a;
  if(a%400==0 && a%100==0)
  {
    cout<<a<<" is a leap year";
  }
  else if(a%100!=0 && a%4==0)
  {
    cout<<a<<" is a leap year";
  }
  else
  {
    cout<<a<<" is not a leap year";
  }
}