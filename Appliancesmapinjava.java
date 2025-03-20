import java.util.Map;
import java.util.HashMap;
public class Appliancesmapinjava {
    public static void main(String[]args){
        Map<String,Integer> Appliance=new HashMap<>();//Creating Empty Map
        System.out.println("Appliance_Deatils");
        System.out.println("___________________");
        Appliance.put("Cooker",1);
        Appliance.put("Pan",2);
        Appliance.put("Grinder",3);
        Appliance.put("South",4);
        Appliance.put("spactular",5);
        System.out.println("Appliance:"+Appliance);

        for(Map.Entry<String,Integer> entry : Appliance.entrySet()){
            System.out.println("Appliance:"+entry.getKey()+":"+entry.getValue());
        }
    }
}