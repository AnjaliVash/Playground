#include<iostream>
#include<math.h>
using namespace std;
int main()
{
 int m,n,r;
  cin>>m>>n>>r;
if(pow(m,n)>=r)
{
  cout<<"Doctor, you can proceed with your experiment.";
}
  else
  {
    cout<<"Sorry Doctor! You need more bacteria.";
  }
  return 0;
}