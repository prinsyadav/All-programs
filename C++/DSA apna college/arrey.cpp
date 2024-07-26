#include<iostream>
#include<climits>

using namespace std;

int main(){

    // int array[4]= {10,20,30,40};
    // cout<<array[1]<<endl;

    cout<<"Enter the size of arrey : ";
    int n;
    cin>>n;

    int array[n];
    /*
    for (int i = 0; i < n; i++)
    {
        cout<<"Enter "<<i<< "th element of array : ";
        cin>>array[i];
    }
     
      cout<<"The Provided Array was : ";

    for (int i = 0; i < n; i++)
    {
        cout<<array[i]<<" ";
    }  */

     int maxNo=INT_MIN;
     int minNo=INT_MAX;

    for (int i = 0; i < n; i++)
    {
        maxNo = max(maxNo, array[i]);    
        minNo = min(minNo, array[i]);

        cout<<"maximum number is ; "<<maxNo;
        cout<<"minimum number is : "<<minNo;
    }
    
     


    return 0;
}