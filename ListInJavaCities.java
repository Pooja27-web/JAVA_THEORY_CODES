import java.util.List;
import java.util.ArrayList;
public class ListInJavaCities {
    public static void main(String[]args){
        List<String>list =new ArrayList<>(); //creating list
        list.add("Bangalore");
        list.add("Mysore");
        list.add("Manglur");
        list.add("Tamil-Nadu");
        list.add("Kerala");
        System.out.println("Citys:"+list);
        for(String citys:list){
            System.out.println(citys);
        }
    }
}