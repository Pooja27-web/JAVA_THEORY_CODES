import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Setinjava {
    public static void main(String[]args){
        Set<String> fruits=new HashSet<>();//Creating Empty Fruits Set
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Kiwi");
        fruits.add("Banana");
        System.out.println("Fruits_Details");
        System.out.println("--------------");
        System.out.println("Fruit(before)"+fruits);
        Scanner s=new Scanner(System.in);
        while(true){
            System.out.println("Enter Fruit1 name: (type 'done' to Finish)");
            String a=s.nextLine();
            if(a.equalsIgnoreCase("done")){
                break;
            }
            fruits.add(a);

          System.out.println("Fruits_Details");
          System.out.println("--------------");
          System.out.println("Fruit(After)"+fruits);
        }
        System.out.println("------------------------------");
        System.out.println("Fruit(After)"+fruits);
    }
}