import java.util.ArrayList;
import java.util.Scanner;

public class AddTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
       
        System.out.println("Enter the elements of the first array: ");
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of the second array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter the elements of the second array: ");
        for(int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
        }

        AddTwoArrays obj = new AddTwoArrays();
        ArrayList<Integer> result = obj.addTwoArrays(arr1, arr2);
        System.out.println("The sum of the two arrays is: ");
        for(int i=result.size()-1; i>=0; i--){
            System.out.print(result.get(i) + " ");
        }
         
    }

    public ArrayList<Integer> addTwoArrays(int[] arr1, int[] arr2){
        ArrayList<Integer> result = new ArrayList<>();
        int i = arr1.length - 1;
        int j = arr2.length - 1;

        int carry = 0;
        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0){
                sum += arr1[i];
                i--;
            }
            if(j>=0){
                sum += arr2[j];
                j--;
            }
            result.add(sum%10);
            carry = sum/10;
        }   
        if(carry != 0){
            result.add(carry);
        } 
        return result;
    }
}
