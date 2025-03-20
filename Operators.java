public class Operators {
    public static  void main(String[]args){
        int a=20,b=40;
        //Arithmatic Operators
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        // Comparison Operators
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);
        //Assignment Operators
        int c=10,d=15;
        c+=20;
        d+=c;
        System.out.println(c+d);
        //Logical Operators &&,||,!
        boolean e=true;
        System.out.println(a==20 && b==40);
        System.out.println(a==20 && b==45);
        System.out.println(a==45 || b==40);
        System.out.println(!e);
        //Unary Operators
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(a);
    }
}
