public class FindMissingNumber {
    public int findMissingNumber(int[] arr){
        int n = arr.length;
        int total = (n+1)*(n+2)/2;
        for(int i=0; i<n; i++){
            total -= arr[i];
        }
        return total;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        FindMissingNumber obj = new FindMissingNumber();
        System.out.println(obj.findMissingNumber(arr));
    }
}
