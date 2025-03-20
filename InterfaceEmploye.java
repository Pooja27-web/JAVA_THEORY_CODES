interface Jobs{
    void emp1_details1();
}
interface Jobs1{
    void emp2_details2();
}
interface Jobs2{
    void emp3_details3();
}
interface Jobs3{
    void emp4_details4();
}
interface Jobs4{
    void emp5_details5();
}
class Employe1 implements Jobs{
    public void emp1_details1(){
        System.out.println("Employe_Details 1");
        System.out.println("-----------------");
        System.out.println("Emp_id      :01");
        System.out.println("Emp_name    :Bhuvan");
        System.out.println("Emp_Salary  :50000");
        System.out.println("Emp_Location:Bangalore");
        System.out.println("Emp_Company :Amazon");
        System.out.println("-------------------");

    }
}
class Employe2 implements Jobs1{
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
class Employe3 implements Jobs2{
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
class Employe4 implements Jobs3{
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
class Employe5 implements Jobs4{
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
public class InterfaceEmploye {
    public static void main(String[]args){
        Employe1 obj=new Employe1();
        obj.emp1_details1();
        Employe2 obj1=new Employe2();
        obj1.emp2_details2();
        Employe3 obj2=new Employe3();
        obj2.emp3_details3();
        Employe4 obj3=new Employe4();
        obj3.emp4_details4();
        Employe5 obj4=new Employe5();
        obj4.emp5_details5();

    }
}
