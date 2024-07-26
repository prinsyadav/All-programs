import java.math.*;

public class recurisontwo {
	    // Method to calculate the sum of cubes up to the n-th term using recursion
	//     public static int sumOfCubes(int n) {
	//         if (n == 1) {
	//             return 1;
	//         } else {
	//             return n * n * n + sumOfCubes(n - 1);
	//         }
	//     }
     public static void main(String[] args) {
	        long n = 100; // Example value for n
	        long result = sumOfSeries(n);
	        System.out.println("The sum of the series is: " + result);
	    }

    public static long sumOfSeries(long n) {
        if (n == 1) {
            return 1;
        }
        long result = (long) (Math.pow(n, 3) + sumOfSeries(n - 1));
        // Recursive case: n^3 + sum of cubes up to (n-1)
        return result; 
    }

}