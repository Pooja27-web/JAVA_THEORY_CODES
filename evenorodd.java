import java.io.*;
import java.util.*;
public class evenorodd {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n=s.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
