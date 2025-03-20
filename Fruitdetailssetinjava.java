import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Fruitdetailssetinjava {
    public static void main(String[]args){
        Set<String> fruits1=new HashSet<>();
        System.out.println("Fruits_Details");
        System.out.println("--------------");
        System.out.println("Fruit(before)"+fruits1);
        Scanner s=new Scanner(System.in);
        while(true){
            System.out.println("Enter Fruit1 name: (type 'done' to Finish)");
            String a=s.nextLine();
            if(a.equalsIgnoreCase("done")){
                break;
            }
            fruits1.add(a);
            System.out.println("Enter Fruit1 quality: (type 'done' to Finish)");
            String b=s.nextLine();
            if(b.equalsIgnoreCase("done")){
                break;
            }
            fruits1.add(b);
            System.out.println("Enter Fruit1 price: (type 'done' to Finish)");
            String c=s.nextLine();
            if(c.equalsIgnoreCase("done")){
                break;
            }
            fruits1.add(c);
        }

        System.out.println("------------------------------");
        System.out.println("Fruit(After)"+fruits1);
    }
}
