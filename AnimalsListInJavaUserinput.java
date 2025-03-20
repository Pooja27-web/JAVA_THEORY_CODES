import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class AnimalsListInJavaUserinput {
    public static void main(String[]args){
        List<String>list =new ArrayList<>();
        Scanner s= new Scanner(System.in);
        while(true){
        System.out.println("Enter Animal name: (type 'done' to Finish)");
        String a=s.nextLine();
        if(a.equalsIgnoreCase("done")){
            break;
        }
        list.add(a);

        }
        System.out.println("Animals:"+list);

    }
}