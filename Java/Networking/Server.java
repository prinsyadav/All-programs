// package Basic Programs;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;

public class Server {
    public static void main(String[] args){
        try{
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = dis.readUTF();
            System.out.println("message= "+str);
            // Receive integer from client and send Sum of that integers to client
            int num1 = dis.readInt();
            int num2 = dis.readInt();

            int sum = num1 + num2;
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeInt(sum);
            System.out.println("Result sent to client");
            dout.flush();
            dis.close();
            s.close();
            ss.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
