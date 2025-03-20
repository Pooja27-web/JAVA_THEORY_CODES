class Bike{
    public void module1(){
        System.out.println("       Bike_Details");
    }
}
class Bike1 extends Bike{

    public void module2(){
        System.out.println("Bike module is:Pulsar");
        System.out.println("Bike company is:Baza");
        System.out.println("Bike Price is:2Lakes");
    }
}
class Bike2 extends Bike{

    public void module3(){
        System.out.println("Bike module is:450x");
        System.out.println("Bike company is:Ather");
        System.out.println("Bike Price is:1.5Lakes");
    }
}
class Bike3 extends Bike{

    public void module4(){
        System.out.println("Bike module is:z900");
        System.out.println("Bike company is:Kawasaki");
        System.out.println("Bike Price is:20Lakes");
    }
}
public class bikes {
    public static void main(String[]args){
        Bike1 obj=new Bike1();
        obj.module1();
        System.out.println("-----------------------------------");
        obj.module2();
        System.out.println("-----------------------------------");
        Bike2 obj1=new Bike2();
        obj1.module3();
        System.out.println("-----------------------------------");
        Bike3 obj2=new Bike3();
        obj2.module4();
        System.out.println("-----------------------------------");
    }
}