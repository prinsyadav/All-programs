import java.util.Scanner;

public class findAverage {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the three numbers you want to find average of:");
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    sc.close();
    Avg(x,y,z);    
   }

    static int Avg(int x ,int y,int z){
    int m=x+y+z;
    int avg=m/3;
    System.out.println("Average of the numbers is:" + avg);
    return avg;
   } 
}
