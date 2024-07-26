#include<xc.h>
#include<pic18f4550.h>
void main(void) 
{
  int i, j, temp;
    int num[]= {10,2,5,1,6};for(j=i+1; j<=4; j++)
    { // point to RHS number
       if (num[i] < num[j])
      { // if LHS < RHS , change the position
        temp = num[i];
        num[i] =num[j];
        num[j]= temp;
      }
    }
}

