#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n[3];
  int a,b,c;
  cin>>a>>b>>c;
  n[0]=a;
  n[1]=b;
  n[2]=c;
  //cout<<n[0];
  int min=n[0];
  int max=0;
  int t=0;
  for(int i=0;i<3;i++)
  {
    if(min>n[i])
    {
      min=n[i];
    }
    if(max<n[i])
    {
      max=n[i];
      t=i;
    }
  }
  int flag=0;
  int k=max;
  while(flag==0)
  {
    if(n[0]%k ==0 && n[1]%k ==0 && n[2]%k ==0 )
    {
      flag=1;
    }
    k--;
  }
  n[t]=min;
  max=0;
  for(int i=0;i<3;i++)
  {
    if(max<n[i])
    {
      max=n[i];
    }
  }
  cout<<"The treasure is in box which has number "<<max<<"\n";
  cout<<"The code to open the box is "<<k+1;
  return 0;
}