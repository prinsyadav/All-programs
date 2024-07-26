public class methodoverloading{

    static int plusmethod(int x, int y){
        return x + y;
    }

    static double plusmethod(double x, double y){
        return x + y;
    }

    public static void main(String[] args){
        int mysum1 = plusmethod(50 , 45);
        double mysum2 = plusmethod(45.4578 , 987.456); 
        
        System.out.println(" Int : " + mysum1);
        System.out.println(" Double : " + mysum2);
    }
}