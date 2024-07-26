// public class method{
//     static void myMethod(String fname) {
//     System.out.println(fname + " Yadav");
//   }

//   public static void main(String[] args) {
//     myMethod("Prince");
//     myMethod("Priya");
//     myMethod("Neha");
//   }
// }

// 1)Methods Having return value

// public class method{
//     static int myMethod(int x){
//         return 10+x;
//     }

//     public static void main(String[] args){
//         System.out.println(myMethod(20));
//     }
// }

// 2) Methods having more than one parameters

public class method{
    static int myMethod(int x, int y){
        return 10+x*y;
    }

    public static void main(String[] args){
        System.out.println(myMethod(20,10));
    }
}