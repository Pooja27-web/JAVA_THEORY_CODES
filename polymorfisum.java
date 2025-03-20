class Animal1{
    public void sound(){
        System.out.println("Sounds");
    }
}
class Dog1 extends Animal1{
    public void  bark(){
        System.out.println("Dog is Barking");
    }
}
public class polymorfisum {
    public static void main(String[]args){
        Dog1 obj=new Dog1();
        obj.sound();
        obj.bark();
    }
}