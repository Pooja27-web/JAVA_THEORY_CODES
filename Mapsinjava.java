import java.util.Map;
import java.util.HashMap;
public class Mapsinjava {
    public static void main(String[]args){
        Map<String,Integer> country=new HashMap<>();//Creating Empty Map
        System.out.println("Countries_Deatils");
        System.out.println("___________________");
        country.put("India",1);
        country.put("USA",2);
        country.put("AUS",3);
        country.remove(2);
        System.out.println("Countries:"+country);

        for(Map.Entry<String,Integer> entry : country.entrySet()){
            System.out.println("CONTRIES:"+entry.getKey()+":"+entry.getValue());
        }
    }
}