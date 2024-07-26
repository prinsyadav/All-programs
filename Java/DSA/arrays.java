// import java.util.*;

public class arrays{

    public static void main(String[] args) {

    /*  int[] arrayName = new int[4];
        arrayName[2]=53;
        arrayName[0]=10;
        arrayName[1]=63;
        arrayName[3]=52;
        
        int array[]= {5,6,8,6,3,8,9,3,3};
        // System.out.println(arrayName[2]);

        for(int i=0; i<9; i++){
            System.out.println(array[i]);
            System.out.println(arrayName[i]);
        } */

        String words = "One Two Three Four";
        int countWords = words.split("\\s").length;
        System.out.println(countWords);

        String originalStr = "Hello";
        String reversedStr = "";

        for (int i = 0; i < originalStr.length(); i++) {
          reversedStr = originalStr.charAt(i) + reversedStr;
        }

        System.out.println("Reversed string: "+ reversedStr);

    }
}