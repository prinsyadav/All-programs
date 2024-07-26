public class stringtoarray {
   public static void main(String[] args) {
     String test1 = "Hello there!!";
     char[] arr = test1.toCharArray();
     
     for(int i=0; i<test1.length(); i++){
       System.out.print(arr[i]);
     }
     
   } 
}
