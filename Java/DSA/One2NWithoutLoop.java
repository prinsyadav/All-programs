// package DSA;
import java.util.Scanner;

public class One2NWithoutLoop {
    // You are given an integer ‘n’.
    //Your task is to return an array containing integers from 1 to ‘n’ (in increasing order) without using loops.
    public int[] print(int n){
        if(n==0){
            return new int[0];
        }
        int[] arr = new int[n];
        print(n, arr);
        return arr;
    }
    public void print(int n, int[] arr){
        if(n==0){
            return;
        }
        print(n-1, arr);
        arr[n-1] = n;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        One2NWithoutLoop obj = new One2NWithoutLoop();
        int n = sc.nextInt();
        int[] arr = obj.print(n);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
