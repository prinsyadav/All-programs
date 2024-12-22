import java.util.Scanner;

public class Factorial1 {
    
    public static int factorial(int n){
        if(n==0 || n ==1){
            return 1;
        } else {
            for(int i=n-1; i>=1; i--){
                n = n*i;
            }
        }
        return n;
    }

    public static void main(String args[]){

        System.out.println("Enter the number you want to find the factorial of:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        n = factorial(n);
        System.out.println("Factorial of the number is :"+n);
    }
}
