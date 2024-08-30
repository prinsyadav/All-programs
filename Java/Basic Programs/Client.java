import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        try{
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a message: ");
            String str = sc.nextLine();
            dout.writeUTF(str);

            // Take two integer input from user and send it to server
            System.out.println("Enter first integer: ");
            int num1 = sc.nextInt();
            dout.writeInt(num1);
            System.out.println("Enter second integer: ");
            int num2 = sc.nextInt();
            dout.writeInt(num2);

            // Receive sum of integers from server
            DataInputStream dis = new DataInputStream(s.getInputStream());
            int sum = dis.readInt();
            System.out.println("Sum of "+num1+" and "+num2+" is: "+sum);
            dout.flush();
            dout.close();
            dis.close();
            s.close();
            sc.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
