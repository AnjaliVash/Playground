#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  for(int j=1;j<=n;j++)
  {
    cout<<j;
	int t=j;
    while(t>1)
    {
      cout<<"*"<<j;
      t=t-1;
    }
    cout<<"\n";
  }
  for(int j=n;j>=1;j--)
  {
    cout<<j;
	int t=j;
    while(t>1)
    {
      cout<<"*"<<j;
      t=t-1;
    }
    cout<<"\n";
  }
  return 0;
}