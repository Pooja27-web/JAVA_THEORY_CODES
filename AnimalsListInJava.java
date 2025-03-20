import java.util.List;
import java.util.ArrayList;
public class AnimalsListInJava {
    public static void main(String[]args){
        List<String>list =new ArrayList<>(); //creating list
        list.add("Dog");
        list.add("Cat");
        list.add("Cow");
        list.add("Sheep");
        list.add("Pig");
        list.add("Horse");
        list.add("Goat");
        list.add("Lion");
        list.add("Camel");
        list.add("Donkey");
        System.out.println("Animals:"+list);
        for(String Animals:list){
            System.out.println(Animals);
        }
    }
}