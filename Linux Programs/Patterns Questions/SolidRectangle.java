import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows of Solid rectangle:");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns of Solid rectangle:");
        int columns = sc.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print("*");
            };
            System.out.println("");
        }
    }
}
