import java.util.Scanner;
import java.math.*;

public class longestSubArrayLength {
    public static int longestSubArrayLength(int[] arr, int n) {
        int res = 0;
        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            for(int j = i; j < arr.length; j++) {
               count += arr[j];
               if(count == n) {
                   res = Math.max(res, j-i+1);
               }
            }
            // res = Math.max(res, count);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the number you want to find the sum of: ");
        int k = sc.nextInt();
        System.out.println("Length of the longest subarray is: " + longestSubArrayLength(arr, k));
    }
}
