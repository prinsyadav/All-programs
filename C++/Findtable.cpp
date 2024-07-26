#include<iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter the number, you want table for.."<<endl;
    cin>>n;
    for(int i=1; i<=40; i++){
        cout<<n<<" * "<<i<<" = "<<n*i<<endl;
    }
    return 0;
}