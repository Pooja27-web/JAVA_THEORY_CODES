import java.util.List;
import java.util.ArrayList;
public class ListInJava1 {
    public static void main(String[]args){
        List<String>list =new ArrayList<>(); //creating list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Grapes");
        list.add("Orange");
        System.out.println("Fruits:"+list);

        //Implimantation of list2
        String find_fruit = list.get(3);
        System.out.println("Using index :"+find_fruit);

        //Implimantation of list1
        list.remove("Cherry");
        System.out.println("After removed fruits: "+list);

        //Implimantation of list3
        for(String fruits:list){
            System.out.println(fruits);
        }
    }
}