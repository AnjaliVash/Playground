#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  float h;
  cin>>n>>h;
  switch(n)
  {
    case 1: cout<<(float)h; break;
    case 2: cout<<(float)h+h/2; break;
    case 3: cout<<(float)h*2; break;
    default: cout<<"Number of items is more";
  }
  return 0;
}