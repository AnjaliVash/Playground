#include<iostream>
using namespace std;
int findsm(int m, int n)
{
  if(m>n)
    return n;
  else
   return m;
}
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  int s= findsm(a,b);
  s=findsm(s,c);
  for(int j=s;j>0;j--)
  {
    if((a%s==0) && (b%s==0) && (c%s==0))
      break;
    s--;
  }
  //cout<<s;
  cin>>a;
  if(a==s)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
  return 0;
}
