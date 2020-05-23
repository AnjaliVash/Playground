#include<iostream>
using namespace std;
int main()
{
  int n;
  int i=1;
  cin>>n;
  int p=0;
 for(int j=0;j<n;j++)
 {
   if(j%2==0)
   {
     p=p+1;
     cout<<p;
     int t=j;
     while(t>0)
     {
       p=p+1;
       cout<<"*"<<p;
       t=t-1;
     }
   }
   else
   {
     p=p+j+1;
     cout<<p;
     int t=j;
     while(t>0)
     {
       p=p-1;
       cout<<"*"<<p;
       t=t-1;
     }
     p=p+1*j;
   }
   cout<<"\n";
 }
  return 0;
}