public class Overloading {
    public  int add(int a , int b){
        return a+b;
    }
    public  float add(float a , float b){
        return a+b;
    }
    public  String add(String a , String b){
        return a+b;
    }
    public  double add(double a , double b){
        return a+b;
    }
    public static void main(String[]args){
        System.out.println("  Method Overload");
        System.out.println("--------------------");
        Overloading obj=new Overloading();
        System.out.println(obj.add(20,30));
        System.out.println(obj.add(10,5));
        System.out.println(obj.add("Bhuvan","Krishna"));
        System.out.println(obj.add(100,500));
    }
}
