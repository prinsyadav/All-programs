import java.util.Scanner;

public class CeilTheFloor {

    public int[] ceilandfloor(int arr[], int target) {
        int ceil = 0;
        int floor = 0;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
                floor = arr[mid];
            } else {
                end = mid - 1;
                ceil = arr[mid];
            }
        }
        return new int[] { ceil, floor };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        CeilTheFloor obj = new CeilTheFloor();
        int ans[] = obj.ceilandfloor(arr, target);
        System.out.println("Ceil: " + ans[0] + " Floor: " + ans[1]);
        sc.close();
    }
}
