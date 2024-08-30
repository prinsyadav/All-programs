/*
class Pen{
    String color;
    String type;

    
    public void write(){
        System.out.println("Writing something "+color+" "+type);
    }

    public void print(){
        System.out.println(this.color);
    }
    
}   */

/*    
public class OOPS {
    public static void main(String[] args){
        Pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen pen2 = new pen();
        pen2.color = "Yellow";
        pen2.type = "Sketch";

        pen1.write();
        pen2.print();
    }
    
} */

// Inheritence

/* 
class Shape{ // this is parent class
    String color;
    int quantity;

    public void area(){
        System.out.println("Displays area");
    }
}

// class Triangle inherited the properties of class Shape by using "Extends" keyword. 
class Triangle extends Shape{ // this is child class  // This will also be called as single level inheritence
    public float area(int l, int h){
        float x = (l*h)*1/2;
        return x;
    }
}

class Circle extends Shape{
    public void area(){
        System.out.println("Displaying area");
    }
}

public class OOPS{
    public static void main(String[] args){
        Triangle t1 = new Triangle();
        t1.quantity = 20;
        t1.color = "Yellow";
        System.out.println(t1.color+" "+t1.quantity);
        
        float n = t1.area(8, 9);
        System.out.println(n);

        Circle cl = new Circle();
        cl.area();
    }
}

*/

// Abstraction

// This is an abstract class 
abstract class Animal{
    abstract void animalSound();

    void animalSleep(){};
}

// Inherited class from the abstract class
class Donkey extends Animal{
    public void animalSound(){
        System.out.println("This is the sound of Donkey  : HEE HEE");
    }
}

class Dog extends Animal{
    public void animalSleep(){
        System.out.println("This is the sleeping sound of dog : ZZZ");
    }
}

public class OOPS{
    public static void main(String[] args){
        Donkey dn1 = new Donkey();
        dn1.animalSound();

        Dog dg1 = new Dog();
        dg1.animalSleep();
    }
}
