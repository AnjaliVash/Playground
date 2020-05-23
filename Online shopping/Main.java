#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,d,s;
  int a[3]; 
  int t=0;
  int min=100000000;
  for(int i=0;i<3;i++)
  {
    //if(i==0){min=a[i];t=0;}
    cin>>m>>d>>s;
    a[i]= m- (m*d/100) +s;
    if(min>a[i])
    {
      min=a[i];
      t=i;
    }
    switch(i)
  {
    case 0: cout<<"In Flipkart Rs."<<a[i]<<"\n";
      break;
    case 1: cout<<"In Snapdeal Rs."<<a[i]<<"\n";
      break;
    case 2: cout<<"In Amazon Rs."<<a[i]<<"\n";
      break;
  }
  }
  switch(t)
  {
    case 0: cout<<"He will prefer Flipkart"<<"\n";
      break;
    case 1: cout<<"He will prefer Snapdeal"<<"\n";
      break;
    case 2: cout<<"He will prefer Amazon"<<"\n";
      break;
  }
  
}