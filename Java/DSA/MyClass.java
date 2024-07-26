import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    Scanner myObj1 = new Scanner(System.in);

    System.out.println("Enter firstname");
    String firstname = myObj.nextLine();

    System.out.println("Enter lastname");
    String lastname = myObj1.nextLine();
    System.out.println("Name is: " + firstname +" "+ lastname);
  }
}
