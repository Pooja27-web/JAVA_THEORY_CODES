//Multiple methods
interface Veihcles{
    void vehical_details1();
    void vehical_details2();
}
class  Car3 implements Veihcles{
    public void vehical_details1() {
        System.out.println("====VEHICALES_DETAILS====");
        System.out.println("-------------------------");
        System.out.println("Car name          : Swift Dzire");
        System.out.println("Car company       : Suzike");
        System.out.println("Car Price         : 10Lakes");
        System.out.println("Car Owner Details : Raghav K");
        System.out.println("----------------------------");
    }
    public void vehical_details2() {
        System.out.println("====VEHICALES_DETAILS====");
        System.out.println("-------------------------");
        System.out.println("Car name          : Swift Dzire");
        System.out.println("Car company       : Suzike");
        System.out.println("Car Price         : 10Lakes");
        System.out.println("Car Owner Details : Raghav K");
        System.out.println("----------------------------");
    }
}
public class InterfaceImplimentation {
    public static void main(String[]args){
        Car3 obj=new Car3();
        obj.vehical_details1();
        obj.vehical_details2();
    }
}
