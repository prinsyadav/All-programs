import java.util.Scanner;

public class methodparameters {
    public static boolean myMethod1(int num){
        if (num%2==0) {
            System.out.println("This number is even.");
            return true;
        }else{
            System.out.println("This number is odd.");
            return false;
        } 
    }

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num1 = myObj.nextInt();
        myMethod1(num1);
        
        
    }
}
