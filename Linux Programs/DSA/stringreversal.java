import java.util.Scanner;

public class stringreversal {
   public static void main(String[] args) {
    Scanner myobj = new Scanner(System.in);
    System.out.println("Enter the string: ");
    String originalstr = myobj.nextLine();
    String reversedstr = "";

    for(int i = 0; i < originalstr.length(); i++){
        reversedstr = originalstr.charAt(i) + reversedstr;
    }

    System.out.println("Reversed string is: "+ reversedstr);
   } 
}
