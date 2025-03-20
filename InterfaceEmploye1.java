interface Jobs5{
    void emp1_details1();
}
interface Jobs6{
    void emp2_details2();
}
interface Jobs7{
    void emp3_details3();
}
interface Jobs8{
    void emp4_details4();
}
interface Jobs9{
    void emp5_details5();
}
class Employe6 implements Jobs5{
    public void emp1_details1(){
        int a=01;
        String b="Bhuvan";
        System.out.println("Employe_Details 1");
        System.out.println("-----------------");
        System.out.println("Emp_id      :"+a);
        System.out.println("Emp_name    :"+b);
        System.out.println("Emp_Salary  :50000");
        System.out.println("Emp_Location:Bangalore");
        System.out.println("Emp_Company :Amazon");
        System.out.println("-------------------");

    }
}
class Employe7 implements Jobs6{
    public void emp2_details2(){
        System.out.println("Employe_Details 2");
        System.out.println("-----------------");
        System.out.println("Emp_id      :02");
        System.out.println("Emp_name    :Varshit");
        System.out.println("Emp_Salary  :50000");
        System.out.println("Emp_Location:Bangalore");
        System.out.println("Emp_Company :Google");
        System.out.println("-------------------");

    }
}
class Employe8 implements Jobs7{
    public void emp3_details3(){
        System.out.println("Employe_Details 3");
        System.out.println("-----------------");
        System.out.println("Emp_id      :03");
        System.out.println("Emp_name    :Gagan");
        System.out.println("Emp_Salary  :50000");
        System.out.println("Emp_Location:Bangalore");
        System.out.println("Emp_Company :blinkit");
        System.out.println("--------------------");

    }
}
class Employe9 implements Jobs8{
    public void emp4_details4(){
        System.out.println("Employe_Details 4");
        System.out.println("-----------------");
        System.out.println("Emp_id      :04");
        System.out.println("Emp_name    :syruhl");
        System.out.println("Emp_Salary  :50000");
        System.out.println("Emp_Location:Bangalore");
        System.out.println("Emp_Company :snapchat");
        System.out.println("---------------------");

    }
}
class Employe10 implements Jobs9{
    public void emp5_details5(){
        System.out.println("Employe_Details 5");
        System.out.println("-----------------");
        System.out.println("Emp_id      :05");
        System.out.println("Emp_name    :nidhi");
        System.out.println("Emp_Salary  :50000");
        System.out.println("Emp_Location:Bangalore");
        System.out.println("Emp_Company :instagram");
        System.out.println("----------------------");

    }
}
public class InterfaceEmploye1 {
    public static void main(String[]args){
        Employe6 obj=new Employe6();
        obj.emp1_details1();
        Employe7 obj1=new Employe7();
        obj1.emp2_details2();
        Employe8 obj2=new Employe8();
        obj2.emp3_details3();
        Employe9 obj3=new Employe9();
        obj3.emp4_details4();
        Employe10 obj4=new Employe10();
        obj4.emp5_details5();

    }
}
