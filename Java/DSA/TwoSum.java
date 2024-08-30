// package DSA;
import java.util.Scanner;

public class twoSum {
    public int[] solution(int[] nums, int target){
        int[] ans = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum: ");
        int target = sc.nextInt();
        sc.close();
        twoSum obj = new twoSum();
        int[] result = obj.solution(arr, target);
        System.out.println("The indices of the two numbers are: ");
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }   
}
