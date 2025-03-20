abstract class Flowers1{
    String flower_name;
    public abstract void flowers_details(String flower_name,
                                         String flower_colour,
                                         String flower_price,
                                         String flower_size,
                                         String flower_smell);//abstract method
}
class Lilly extends Flowers1{
    public void flowers_details(String flower_name,
                                String flower_colour,
                                String flower_price,
                                String flower_size,
                                String flower_smell) {//normal method
        System.out.println("       FLOWER_DETAILS");
        System.out.println("-------------------------------");
        System.out.println("FLOWER NAME  : "+flower_name);
        System.out.println("FLOWER COLOUR: "+flower_colour);
        System.out.println("FLOWER PRICE : "+flower_price);
        System.out.println("FLOWER SIZE  : "+flower_size);
        System.out.println("FLOWER SMELL : "+flower_smell);
    }
}
public class IMPLIMANTATIONOFABSTRACT3 {
    public static void main(String[]args){
        Lilly obj=new Lilly();
        obj.flowers_details("Lilly","White","15RS","Small","Amazing");
    }
}