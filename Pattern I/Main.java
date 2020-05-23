#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int count=1;
  int k=6;
  while(k>0)
  {   
   	for(int i =0; i<count;i++)
    {
      cout<<n;
    }
    if(k>3){
    count=count+1;
    n=n+1;
    }
    else if(k==3)
    {
      cout<<"\n";
      for(int i =0; i<count;i++)
    {
      cout<<n;
    }
      count=count-1;
    n=n-1; 
    }
    else{
    count=count-1;
    n=n-1; 
    }
    cout<<"\n";
    k=k-1;
  }
  cout<<n;
  return 0;
}