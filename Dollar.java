import java.io.*;
import java.util.*;
public class Dollar {
    public static void main(String[]args){
        int a,b,c,d;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Dollar1");
        a = s.nextInt();
        System.out.println("Enter Cent1");
        b= s.nextInt();
        System.out.println("Enter Dollar2");
        c= s.nextInt();
        System.out.println("Enter Cent2");
        d=s.nextInt();
        System.out.println("Total Dollar: "+((a+c)+((b+d)/100)));
        System.out.println("Total cent: "+((b+d)%100));
    }
}
