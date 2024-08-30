import java.util.Scanner;

public class bolleanexpression{

    public static void main(String[] args){

        Scanner Xab = new Scanner(System.in);
        System.out.println("Enter the value of X : "); 
        int x = Xab.nextInt();

        Scanner Yab = new Scanner(System.in);
        System.out.println("Enter the value of Y : ");
        int y = Yab.nextInt();

        if ( x >= y ) {
            System.out.println("X is greater than Y. (i.e. X > Y)");
        } else {
            System.out.println("Y is greater than X.(i.e. Y > X)");
        }
    }
}