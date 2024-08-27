
// 1) System header files: It comes with the complier
#include<iostream>
// 2) user defined header files: It is writeen by the programmer

// #include"New header file.g" 
/*---> this will produce an error if 'New header file.g' is not
present in the current directory.*/ 
using namespace std;

int main(){

    int num1, num2 ;
    cout<<"enter the first number: \n"; /* "<<" is called insertion operator.*/
    cin>>num1; /* ">>" is called extraction operator.*/
    
   cout<<"enter the second number: \n"; /* "<<" is called insertion operator.*/
    cin>>num2; /* ">>" is called extraction operator.*/
    
    cout<< "the sum is :" << num1 + num2;
}

