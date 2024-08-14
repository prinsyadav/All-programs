import java.util.*;

public class MoveZerosToEnd {
    
    // Bruteforce approach
    /*
    public void moveZeroes(int[] nums) {
        
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                temp.add(nums[i]);
            }
        }

        for(int i=0; i<nums.length; i++){
            if(i<temp.size()){
                nums[i] = temp.get(i);
            }else{
                nums[i] = 0;
            }
        }

    }
    */

    // Optimized approach
    public void moveZeroesOptimized(int[] nums) {
        int j = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                j++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }
        
    public static void main(String[] args){
        MoveZerosToEnd obj = new MoveZerosToEnd();
        Scanner myobj = new Scanner(System.in); 
        System.out.println("Enter the size of the array");
        int n = myobj.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n; i++){
            arr[i] = myobj.nextInt();
        }
        obj.moveZeroesOptimized(arr);
        System.out.println("Array after moving zeros to the end");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }   

}
