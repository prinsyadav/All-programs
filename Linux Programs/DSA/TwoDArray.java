import java.util.Scanner;

public class TwoDArray {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of columns");
    int col = sc.nextInt();
    System.out.println("Enter the number of rows");
    int rows = sc.nextInt();

    int[][] numbers = new int[rows][col];

    // Take input from the user.
    for( int i = 0; i<rows; i++){
        for(int j = 0; j<col ; j++){
            numbers[i][j] = sc.nextInt();
        }
    }
    // to print the 2D Array
    for( int i=0; i<rows; i++){
        for(int j=0; j<col; j++){
            System.out.print(numbers[i][j]+ " ");
        }
        System.out.println();
    }

    // To find particular element from the array and print index of that element.
    System.out.println("Enter the element you want to find the index of");
    int target = sc.nextInt();
    for(int i= 0; i<rows; i++){
        for(int j=0; j<col; j++){
            if (numbers[i][j] == target) {
                System.out.println("Index of the element is"+" "+i+" "+j);
            }
        }
    }
   } 

}
