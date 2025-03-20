import java.io.*;
import java.util.*;
public class trendynumber {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = s.nextInt();
        int d=n/10;
        System.out.println("After dividing by 10"+d);
        int e=d%10;
        System.out.println("After module by 10"+e);
        if(e%3==0){
            System.out.println("Trendy number: "+e);
        }
        else{
            System.out.println("Not Trendy number: "+e);
        }
    }
}
