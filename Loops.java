import java.io.*;
public class Loops {
    public static void main(String[]args){
        int n=10;
        for(int i=1; i<=n;i++){
            if(i%2==1)
            {
                System.out.println((i*i)-1);
            }
            else{
                System.out.println((i*i)-2);
            }
        }
    }
}
