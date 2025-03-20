class Vehicles{
    public  static void car_company(){
        System.out.println("Car Company is : Benz");
    }
}
class Car extends Vehicles{
    public  static void car_price(){
        System.out.println("Car Price is : 50Lakhs");
    }
}
class Car2 extends Vehicles{
    public  static void car_price(){
        System.out.println("Car Company is : Audi");
    }
}
public class automobiles {
    public  static void main(String[]args){
        System.out.println("Car Details");
        System.out.println("==========================");
        Car obj1 = new Car();
        obj1.car_company();
        obj1.car_price();
        Car2 obj2= new Car2();

    }
}
