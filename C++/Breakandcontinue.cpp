#include <iostream>
using namespace std;

int main(){

  int n;
  cin>>n;
    for (int i = 0; i <= n; i++)
    {
        cout<<i<<endl;
        if (i==5)
        {
          break;   
        } 
    }

    for (int i = 0; i <= n; i++)
    {
        if (i==5)
        {
          break;  
        }
        cout<<i<<endl;
    }

    for (int i = 0; i <= n; i++)
    {
        cout<<i<<endl;
        if (i==5)
        {
          continue;  
        }
    }

    for (int i = 0; i <= n; i++)
    {
        if (i==5)
        {
          continue;  
        }
        cout<<i<<endl;
    }

    return 0;
}