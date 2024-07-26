/*class countDigits{
    public static void main(String[] arga){
        int n = 56757;
        int cnt = 0;

         while (n > 0) {
            // Increment the counter
            // for each digit encountered.
            cnt = cnt + 1;
            // Divide 'n' by 10 to
            // remove the last digit.
            n = n / 10;
        }
        // count of digits.
    
        System.out.println("Number of Digits in N: " + cnt);
    }
    
} */

import java.util.Iterator;

class Sorting {

	public static void main(String[] args) {
		int[] arr = {7,8,3,1,2};
		
		// bubble sort
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++ ) {
				if(arr[j] > arr[j+1]) {
					// Swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
			  }
			}
		}
		printArray(arr);
		
		
	}
	
	 static void printArray(int arr[]) {
		for(int i=0 ; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}