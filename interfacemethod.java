interface Animal6{
    void sound();
}
class Cat implements Animal6{
    public  void sound() {
        System.out.println("Meow Meow");
    }
}
public class interfacemethod {
    public static void sound() {
        System.out.println("Meow Meow-----Main class");
    }
    public static void main(String[]args){
        Cat obj=new Cat();
        obj.sound();
        sound();
    }
}
