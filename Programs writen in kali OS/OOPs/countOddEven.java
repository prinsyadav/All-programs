import java.util.Scanner;

public class countOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: size of the array
        System.out.print("Enter the number of elements in the array: ");
        int N = scanner.nextInt();

        int A[] = new int[N];

        // Input: elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int countEven = 0;
        int countOdd = 0;

        // Counting even and odd elements
        for (int i = 0; i < N; i++) {
            if (A[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        // Output: number of even and odd elements
        System.out.println("Number of even elements: " + countEven);
        System.out.println("Number of odd elements: " + countOdd);

        scanner.close();
    }
}

