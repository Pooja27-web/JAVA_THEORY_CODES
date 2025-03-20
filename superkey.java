class Parent1{
    Parent1(){
        System.out.println("Parent class constructor");
    }
    void parent1(){
        System.out.println("Parent class method");
    }
}
class Child1 extends Parent{
    Child1(){
         super();
        System.out.println("Child class constructor");
    }
    void child1(){
        super.parent1();
        System.out.println("Child class method");
    }
}
public class superkey {
    public static void main(String[]args){
        Child obj=new Child();
        obj.child1();
        obj.parent1();
    }
}
