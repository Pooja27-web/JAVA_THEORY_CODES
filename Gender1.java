class CheckGender extends Exception{
    CheckGender(){
        super("Give Valid Gender.....!!");
    }
}
public class Gender1 {
    public static void CheckValid(String gender) throws CheckGender {
        //Exception Method inside Main class
        if (gender == "male") {
            System.out.println("Gender male is matched...!");
        } else if (gender == "female") {
            System.out.println("Gender female is matched...!");
        } else if (gender == "Trans"){
            System.out.println("Gender Trans is matched...!");
        } else {
            throw new CheckGender();
        }
    }
    public static void main(String[]args){
        try{
            CheckValid("different");
        }catch (CheckGender e){
            System.out.println("Caught Exception:"+e.getMessage());
        }
    }
}