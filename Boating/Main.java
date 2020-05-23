#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,a,c;
  cin>>w>>a>>c;
  if(w>= 75*a+30*c)
  {
    cout<<"Boat is stable";
  }
  else 
    cout<<"Boat will drow";
  return 0;
}