import java.util.Scanner;


public class Hourglass {
    
    public static void hourGlass(int n) {
        for(int i=1; i<=n; i++){

            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int j=i; j<=2*n-i; j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 2 * n - i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        hourGlass(n);
    }
}
