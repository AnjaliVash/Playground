#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,n;
  cin>>r>>c>>n;
  if(((r*2>=n)&&(r+1<=n))||((r*(c-1)>=n)&&(r*(c-2)+1<=n)))
  {
    cout<<"It is a mango tree";
  }
  else
    cout<<"It is not a mango tree";
  
  return 0;
}