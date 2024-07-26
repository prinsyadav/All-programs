#include<iostream>

using namespace std;

int main(){
    /*Loops in C++:
    There are three types of loops in C++:
    1. For loop
    2. While loop
    3. Do-While loop
    */

   /*For loop in C++*/
   //Syntax for "For loop"
   // for(initialization; condition; updation;)
   // {
    //  loop body(c++ code);
    //    } 
    
   for(int i=1; i<=50; i++){
    cout<<i<<" ";
   }
   cout<<endl;

    /*While loop in C++*/
   //Syntax for "While loop"
    //    while(condition);
    //    {
    //     C++ statements;
    //    }
    
    //while loop in C++
    
    int i=2;
    while(i<=40){
        cout<<i<<" ";
        i++;
    }
    cout<<endl;

    // DO-while loop in C++
    
    int k=3;
    do{
        cout<<k<<" ";
        k++;
    }while(k<=40);
    cout<<endl;
    

    // 6 ka table
    int n; 
    cout<<"Enter the number, you want table for.."<<endl;
    cin>>n;

    int l=1;
    while(l<=20){
        cout<<n<<" * "<<l<<" = "<<n*l<<endl;
        l++;
    }

   return 0;
}