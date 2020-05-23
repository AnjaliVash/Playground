#include <iostream>
using namespace std;
int main() {
    // Type your code here
int n;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    int t=n-1;
    int p=i+1;
    if(i%2==0)
    {
      cout<<p;
    }
    while(t>0)
    {
      cout<<i;
      t=t-1;
    }
    if(i%2!=0)
    {
      cout<<p;
    }  
    cout<<"\n";
  }
    return 0;
}