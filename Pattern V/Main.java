#include<iostream>
using namespace std;
int main()
{
  int c;
  cin>>c;
    int p=0,z=c;
   for(int i=0;i<c;i++)
   {
     int t=i;
     while(t>0)
     {
       cout<<"--";
       t=t-1;
     }
     for(int j=0;j<z;j++)
     {
       cout<<1+p<<"*";
       p=p+1;
     }
     for(int j=0;j<z;j++)
     {
       cout<<(c)*(c+1)-p+j+1;
       if(j!=z-1)
       {cout<<"*";
       }
     }
     z=z-1;
     cout<<"\n";
   }
  return 0;
}