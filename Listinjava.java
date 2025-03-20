import java.util.List;
import java.util.ArrayList;
public class Listinjava {
    public static void main(String[]args){
        List<String>list=new ArrayList<>();
        List<Integer>list1=new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list.add("Apple");
        list.add("Banana");
        list.add("Kiwi");
        list.add("Grapes");
        list.add("Orange");
        System.out.println("FRUIT DETAILS");
        System.out.println("-------------");
        System.out.println(list);
        System.out.println(list1);
        for(String fruits:list)
        {
            System.out.println(fruits);
        }
//        for (Integer fruits1:list1);
//        {
//            System.out.println(furits1);
//        }
    }
}
