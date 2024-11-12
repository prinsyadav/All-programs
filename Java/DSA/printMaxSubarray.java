package DSA;

public class printMaxSubarray {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSum = maxSubArray(arr);
        System.out.println("Maximum sum of the subarray is: " + maxSum);
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        int start = 0;
        int end = 0;
        int s = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
                s = i;
            } else {
                currentSum = currentSum + nums[i];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = s;
                end = i;
            }
        }
        System.out.println("The subarray with the maximum sum is: ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        return maxSum;
    }    
}
