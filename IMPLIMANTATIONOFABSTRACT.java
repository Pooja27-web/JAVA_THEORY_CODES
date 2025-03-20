abstract class Animal4{
    public abstract void dog_details();
}
class Dog4 extends Animal4{
    public void dog_details(){
        String dog_name="  keaton";
        String dog_breed="  lab";
        String dog_price="  10000";
        String dog_location="  Bangalore";
        String dog_owner="  Bhuvan B Krishna";


        System.out.println("dog details");
        System.out.println("------------");
        System.out.println("Dog name          :"+dog_name);
        System.out.println("Dog breed         :"+dog_breed);
        System.out.println("Dog price         :"+dog_price);
        System.out.println("Dog location      :"+dog_location);
        System.out.println("Dog owner details :"+dog_owner);
    }
}
public class IMPLIMANTATIONOFABSTRACT {
    public static void main(String[] args){
        Dog4 obj=new Dog4();
        obj.dog_details();
    }
}
