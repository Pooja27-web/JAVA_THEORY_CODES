public class NONstaticmembersacess {
    String b="Krishna";
    static String c="B";
    public static void main(String [] args){
        String a="Bhuvan";
        System.out.println(a);
        System.out.println(c);

        NONstaticmembersacess obj=new NONstaticmembersacess();
        System.out.println(obj.b);
        method1();
    }
    public static void method1(){
        System.out.println("Method1");
    }
}
