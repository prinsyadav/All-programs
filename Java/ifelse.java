import java.util.Scanner;

public class ifelse {

    public static void main(String[] args){
        try (Scanner the = new Scanner(System.in)) {
            System.out.println("Enter the Value of X :" );
            int x = the.nextInt();

            if (x>=15) {
                System.out.println("You got 15 or more than 15 rupees");
            } else if(x < 15){
                if (x >= 10) {
                System.out.println("You got Money between 10 to 14 rupees");
            } else {
                if(x>= 5){
                System.out.println("You got Money between 5 to 9 rupees");
                } else{
                    System.out.println("You get less than 5 rupees");
                }
            }
            }
        } 
    }


}