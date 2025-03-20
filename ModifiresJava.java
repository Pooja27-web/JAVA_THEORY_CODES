class Modi{
    public  int a=100;
    protected  int b=200;
     int c=300;
    private  String d="B";

    public String getName(){
        return d;
    }
}
public class ModifiresJava {
    public static int a=100;
    protected static int b=200;
    static int c=300;
    private static String d="Bhuvan";
    public static void main(String[]args){
        System.out.println("a value:"+a);
        System.out.println("b value:"+b);
        System.out.println("c value:"+c);
        System.out.println("My name is:"+d);

        Modi m=new Modi();
        System.out.println("a value:"+m.a);
        System.out.println("b value:"+m.b);
        System.out.println("c value:"+m.c);
        System.out.println("My name is:"+m.getName());
    }
}
