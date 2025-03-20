import java.io.*;
import java.util.*;
public class Interest {
    public static void main(String[]args){
        int a,b,c,d;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Principal Amount: ");
        a=s.nextInt();
        System.out.println("Enter No.of years: ");
        b=s.nextInt();
        System.out.println("Enter Rate of Interest: ");
        c=s.nextInt();
        d=a*c*b/100;
        System.out.println("Total Interest: "+d);
        System.out.println("Total Amount: "+(a+d));
    }
}
