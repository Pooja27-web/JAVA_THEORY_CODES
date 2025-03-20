class Apple{
    public static void type(){
        System.out.println("Fruit type is: Apple");
    }
}
class furit extends Apple{
    public static void type2(){
        System.out.println("Fruit Colour is: Red");
        System.out.println("Fruit Shape is: Circle");
        System.out.println("Fruit Taste is: Sweet");
        System.out.println("Fruit Price is: 1M");
    }
}
public class Fuit_Details {
    public static void main(String[]args){
        System.out.println("          Fruit_Details");
        System.out.println("-----------------------------------");
        furit obj1=new furit();
        obj1.type();
        obj1.type2();
    }
}
