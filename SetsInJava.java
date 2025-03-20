import java.util.Set;
import java.util.HashSet;
public class SetsInJava {
    public static void main(String[]args){
        Set<String> animal =new HashSet<>();//Creating a set in java
        animal.add("Dog");
        animal.add("Cat");
        animal.add("Pig");
        animal.add("Cow");
        animal.add("Bird");
        System.out.println("Animals :"+animal);
        for(String animals:animal){
            System.out.println(animals);
        }
    }
}