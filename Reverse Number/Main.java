#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  int a;
  cin>>a;
  while(a>0)
  {
    cout<<a%10;
    a=a/10;
  }
	return 0;
}