import java.io.*;
import java.util.*;
public class main1 {
    public static void main(String[]args){
        int a,b;
        float c;
        char d;
        String st;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter value of a: ");
        a=s.nextInt();
        System.out.println("Enter value of b: ");
        b=s.nextInt();
        System.out.println("Enter value of c: ");
        c=s.nextFloat();
        System.out.println("Enter Character of d: ");
        d=s.next().charAt(0);
        System.out.println("Enter String st: ");
        st=s.next();
        System.out.println(a+" "+b+" "+c+" "+d+" "+st);
        System.out.println("the add of "+a+" and "+b+" = "+(a+b));
        System.out.println("the sub of "+a+" and "+b+" = "+(a-b));
        System.out.println("the mul of "+a+" and "+b+" = "+(a*b));
        System.out.println("the div of "+a+" and "+b+" = "+(a/b));
        System.out.println("the mod of "+a+" and "+b+" = "+(a%b));
    }
}