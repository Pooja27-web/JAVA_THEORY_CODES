class Bike4{
    public void module4(){
        System.out.println("       Bike_Details");
    }
}
class Bike5 extends Bike4{
    @Override
    public void module4(){
        System.out.println("       Bike_Details");
        System.out.println("-------------------------");
        System.out.println("Bike module is:Pulsar");
        System.out.println("Bike company is:Baza");
        System.out.println("Bike Price is:2Lakes");
    }
}
class Bike6 extends Bike4{
    @Override
    public void module4(){
        System.out.println("Bike module is:450x");
        System.out.println("Bike company is:Ather");
        System.out.println("Bike Price is:1.5Lakes");
    }
}
class Bike7 extends Bike4{
    @Override
    public void module4(){
        System.out.println("Bike module is:z900");
        System.out.println("Bike company is:Kawasaki");
        System.out.println("Bike Price is:20Lakes");
    }
}

public class POLYMORFISUMBIKE {
    public static void main(String[]args){
        Bike5 obj=new Bike5();
        obj.module4();
        System.out.println("-----------------------------------");
        Bike6 obj1=new Bike6();
        obj1.module4();
        System.out.println("-----------------------------------");
        Bike7 obj2=new Bike7();
        obj2.module4();
        System.out.println("-----------------------------------");

    }
}
