import java.io.*;
import java.util.*;
public class Midpoint {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int x1=s.nextInt();
        int y1=s.nextInt();
        int x2=s.nextInt();
        int y2=s.nextInt();
        float x3=(x1+x2)/2;
        float y3=(y1+y2)/2;
        System.out.println(x3+" "+y3);
    }
}