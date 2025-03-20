import java.io.*;
import java.util.*;
public class checkingnumber {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n=s.nextInt();
        if(n>=100 && n<=999){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        if(n>=0 && n<=9){
            System.out.println("1 digit");
        }
        else if (n>=10 && n<=99) {
            System.out.println("2 digit");
        }
        else if (n>=100 && n<=999) {
            System.out.println("3 digit");
        }
        else if (n>=1000 && n<=9999) {
            System.out.println("4 digit");
        }
        else{
            System.out.println("Invalid number");
        }
    }
}
