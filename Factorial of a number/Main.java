#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n;
  cin>>n;
  int product=1;
  for(int i=1;i<=n;i++)
  {
    product=product*i;
  }
  cout<<product;
  return 0;
}