abstract class Animal3{//parent class
    public abstract void sound();
}
class Dog3 extends Animal3{//child class
    public void sound(){
        System.out.println("Iam converted to  Abstract method to normal method");
    }

}
public class AbstractionM {
    public static void main(String[]args){
        Dog3 obj=new Dog3();
        obj.sound();

    }
}
