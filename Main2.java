class Parent { //super clss
    public static void parent1(){
        System.out.println("Parent Method");
    }
}
class Child extends Parent{ //sub class
    public  static void child1(){
        System.out.println("Child Method");
    }
}

public class Main2 {
    public static void main(String[]args){
        Child obj1= new Child();
        obj1.parent1();
        obj1.child1();
    }
}