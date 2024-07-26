#include <iostream>
using namespace std;

typedef struct student
{
    int marks;
    char favchar;
    float obtainedmarks;
}stu;
int main(){
    stu Prince;
    Prince.marks = 56;
    Prince.favchar = 'd';
    Prince.obtainedmarks = 132.7687;
    cout<<"Roll no. is: "<<Prince.marks<<endl;
    cout<<"Favourite character of Prince is: "<<Prince.favchar<<endl;
    cout<<"Obtained marks is: "<<Prince.obtainedmarks<<endl;

    union MyUnion
    {
        
    };

    return 0;
}