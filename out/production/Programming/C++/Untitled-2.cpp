#include<iostream>

using namespace std;

int glo = 5000;
void sum(){
    int a=1, b=4;
    cout<<glo;
    cout<<"\nthose no. : " <<a;
    cout<<" \n"<<b;
}

int main(){

    int a= 14 , b= 56;
    float c=3.6877;
    char d='F';
    bool check= false;
    sum();
    cout<<"\nPrinting the numbers : \n" <<a <<"\n"<<b  <<"\n"<<c <<"\n"<<d;
    cout<<"\nthis is charecter print :"<<check;
    // cout<<c;
}