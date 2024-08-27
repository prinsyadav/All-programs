#include<iostream>
using namespace std;

int main(){

    cout<<"this is tutorial 9"<<endl;
    int age;
    cout<<"Tell me your age"<<endl;
    cin>>age;

    // Selection control structure: if else-if else lader

    // if((age<18) && (age>1)){
    //     cout<<"You are not allowed to participate in Game";
    // }
    // else if(age==18){
    //     cout<<" Please, Apply next year"<<endl;
    // }
    // else if(age<1){
    //     cout<<"You are not yet born"<<endl;
    // }
    // else{
    //     cout<<"You are allowed to participate in game"<<endl;
    // }

    // Selection control structure: Switc case statement
    
    switch (age)
    {
    case 18:/* constant-expression */
        /* code */
        cout<<"You are 18"<<endl;
        break;
    
    case 15:
        cout<<"You are 15"<<endl;
        break;
    
    case 5:
        cout<<"You are 5"<<endl;
        break;            
    
    default:
        cout<<"No Special cases"<<endl;
        break;
    }

    cout<<"Done with switch cases."<<endl;

    return 0;
}
