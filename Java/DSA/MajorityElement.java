// package DSA;
import java.util.Scanner;
import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }
        for(int i=0; i<nums.length; i++){
            if(map.get(nums[i]) > nums.length/2){
                return nums[i];
            }
        }
        return -1;
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
        sc.close();
        MajorityElement obj = new MajorityElement();
        System.out.println(obj.majorityElement(arr));
    }
}
