import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int k = sc.nextInt();
         int result = sum(k);
         System.out.println(result);
    
    }

    public static int sum(int k){
        if (k>0) {
            return k + sum(k - 1);
        } else{
            return 0;
        }
    }
}
