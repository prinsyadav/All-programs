import java.util.*;
import java.util.Scanner;

public class FindTheUnionOfArrays {
        
        // Bruteforce approach
        /* 
        public ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {
            HashSet<Integer> set = new HashSet<Integer>();
            ArrayList<Integer> union = new ArrayList<Integer>();
            for(int i=0; i<arr1.length; i++){
                set.add(arr1[i]);
            }
            for(int i=0; i<arr2.length; i++){
                set.add(arr2[i]);
            }
            System.out.println("Union of the two arrays is: ");
            for(int it : set){
                union.add(it);
                // return union;
            }
            for(int i=0; i<union.size(); i++){
                System.out.print(union.get(i)+" ");
            }
            return union;

        }
        */

        // Optimized approach
        
        public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {
            HashSet<Integer> set = new HashSet<Integer>();
            ArrayList<Integer> union = new ArrayList<Integer>();
            int i=0, j=0;
            while(i<arr1.length && j<arr2.length){
                if(arr1[i] < arr2[j]){
                    set.add(arr1[i]);
                    i++;
                }
                else if(arr1[i] > arr2[j]){
                    set.add(arr2[j]);
                    j++;
                }
                else{
                    set.add(arr1[i]);
                    i++;
                    j++;
                }
            }
            while(i<arr1.length){
                set.add(arr1[i]);
                i++;
            }
            while(j<arr2.length){
                set.add(arr2[j]);
                j++;
            }
            for(int it : set){
                union.add(it);
            }
            return union;
        }
        
            
        public static void main(String[] args){
            FindTheUnionOfArrays obj = new FindTheUnionOfArrays();
            Scanner myobj = new Scanner(System.in); 
            System.out.println("Enter the size of the first array");
            int n = myobj.nextInt();
            int[] arr1 = new int[n];
            System.out.println("Enter the elements of the first array");
            for(int i=0; i<n; i++){
                arr1[i] = myobj.nextInt();
            }
            System.out.println("Enter the size of the second array");
            int m = myobj.nextInt();
            int[] arr2 = new int[m];
            System.out.println("Enter the elements of the second array");
            for(int i=0; i<m; i++){
                arr2[i] = myobj.nextInt();
            }
            obj.findUnion(arr1, arr2);
            ArrayList<Integer> Union = findUnion(arr1, arr2);
            for(int i=0; i<Union.size(); i++){
                System.out.print(Union.get(i)+" ");
            }
        }  
}
