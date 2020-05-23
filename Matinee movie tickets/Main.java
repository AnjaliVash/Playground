#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  string time;
  cin>>a>>time;
  if(a>13)
  {
    if(time=="13.30")
    {
      cout<<"$5.00";
    }
    else
    {
      cout<<"$8.00";
    }
  }
  else
  {
    if(time=="13.30")
    {
      cout<<"$2.00";
    }
    else
    {
      cout<<"$4.00";
    }
  }
}