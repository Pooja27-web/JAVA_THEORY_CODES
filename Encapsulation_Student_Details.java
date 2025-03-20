class Student_Details{
    private static  int id=101;
    private static String name;
    public int getId(){
        return id;
    }

    public static String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
public class Encapsulation_Student_Details {
    private static  int id=101;
    public static void main(String[]args){
        Student_Details s=new Student_Details();
        System.out.println("Student Id:"+id);
        System.out.println("Student Id getter method:"+s.getId());
        s.setName("Raghav");
        System.out.println("Student name setter:"+s.getName());

    }
}
