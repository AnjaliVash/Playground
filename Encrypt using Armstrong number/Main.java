#include<iostream>
int county(int n) 
{ 
    if (n == 0) 
        return 0; 
    return 1 + county(n / 10); 
} 
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int sum=0,t=n;
  int count=county(n);
    while(n>0)
    {
      sum=sum+power(n%10,count);
      n=n/10;
    }
  if(sum==t)
  {
    return 1;
  }
  else{
  return 0;}
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
}