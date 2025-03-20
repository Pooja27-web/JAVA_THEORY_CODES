public class Modifiers {
    public int a=100;
    public  void public1(){
        System.out.println("This is non static method");

    }
    protected static int b=200;

    public static void main(String[] args){
        Modifiers m=new Modifiers();
        System.out.println("a value :"+m.a);
        System.out.println("b value :"+b);
    }
}
