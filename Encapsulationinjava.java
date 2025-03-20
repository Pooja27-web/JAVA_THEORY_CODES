class Modi1{
    private  String a="Raghav";
    public String getName(){
        return a;
    }
}
public class Encapsulationinjava {
    public static void main(String[]args){
        Modi1 m=new Modi1();
        System.out.println("Student_Details");
        System.out.println("---------------");
        System.out.println("Stu_name: "+m.getName());
    }
}