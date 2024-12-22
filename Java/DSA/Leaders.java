import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Leaders {
    public static ArrayList<Integer> Leaders(int arr[]){
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        int max = arr[n-1];
        res.add(max);
        for(int i=n-2; i>=0; i--){
            if(arr[i] >= max){
                max = arr[i];
                res.add(max);
            }
        }
        Collections.reverse(res);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");

        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> res = Leaders(arr);
        System.out.println("Leaders in the array are: ");
        for(int i: res){
            System.out.print(i + " ");
        }
    }    

}
