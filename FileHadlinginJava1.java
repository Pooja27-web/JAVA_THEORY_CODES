//File handling in Java:Create and Write
import java.io.FileWriter;
import java.io.IOException;
public class FileHadlinginJava1 {
    public static void main(String[]args){
        try{
            FileWriter java = new FileWriter("Java_oops.txt");
            java.write("Object-Oriented Programming or Java OOPs concept refers to programming languages that use objects in programming. They use objects as a primary source to implement what is to happen in the code. Objects are seen by the viewer or user, performing tasks you assign. \n" +
                    "\n" +
                    "Object-oriented programming aims to implement real-world entities like inheritance, hiding, polymorphism, etc. in programming. The main aim of OOPs is to bind together the data and the functions that operate on them so that no other part of the code can access this data except that function.");
            java.close();
            System.out.println("Java_Oops file is created!!");
        }catch (IOException e){
            System.out.println("Error:File is not Created");
            e.printStackTrace();
        }
    }
}