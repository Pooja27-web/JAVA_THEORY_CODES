import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class CarListInJavaUserinput {
    public static void main(String[]args){
        List<String>list1 =new ArrayList<>();
        Scanner s= new Scanner(System.in);
        while(true){
            System.out.println("--------------Car Details--------------");
            System.out.println("Enter Car1 name: (type 'done' to Finish)");
            String a=s.nextLine();
            if(a.equalsIgnoreCase("done")){
                break;
            }
            list1.add(a);

            System.out.println("Enter Car1 Colour: (type 'done' to Finish)");
            String b=s.nextLine();
            if(b.equalsIgnoreCase("done")){
                break;
            }
            list1.add(b);

            System.out.println("Enter Car1 Price: (type 'done' to Finish)");
            String c=s.nextLine();
            if(c.equalsIgnoreCase("done")){
                break;
            }
            list1.add(c);

        }
        System.out.println("Car 1:"+list1);
        List<String>list =new ArrayList<>();
        Scanner s1= new Scanner(System.in);
        while(true){
            System.out.println("--------------Car Details--------------");
            System.out.println("Enter Car2 name: (type 'done' to Finish)");
            String d=s1.nextLine();
            if(d.equalsIgnoreCase("done")){
                break;
            }
            list.add(d);

            System.out.println("Enter Car2 Colour: (type 'done' to Finish)");
            String e=s1.nextLine();
            if(e.equalsIgnoreCase("done")){
                break;
            }
            list.add(e);

            System.out.println("Enter Car2 Price: (type 'done' to Finish)");
            String f=s1.nextLine();
            if(f.equalsIgnoreCase("done")){
                break;
            }
            list.add(f);

        }
        System.out.println("Car 1:"+list1);
        System.out.println("Cars 2:"+list);

    }
}
