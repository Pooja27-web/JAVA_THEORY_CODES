class Animal2{
    public void sound(){
        System.out.println("Parent");
    }
}
class Dog2 extends Animal2{
    @Override
    public void  sound(){
        System.out.println("Child");
    }
}

public class polymorifisum1 {
    public static void main(String[]args){
        Dog2 obj=new Dog2();
        obj.sound();
    }
}
