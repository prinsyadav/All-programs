import java.util.*;

public class StarTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    for(int i=0; i<n; i++){
            for(int j=n+1; j>n-i; j--){
                System.out.print(" ");
            }

            for(int j=n+1; j>2*i; j--){
                System.out.print("*");
            }

            System.out.println();
        }
    } 
}
