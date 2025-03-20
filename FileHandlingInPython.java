//Writing a file
import java.io.FileWriter;
import java.io.IOException;
public class FileHandlingInPython {
    public static void main(String[]args){
        try {
            FileWriter python=new FileWriter("python.txt");//creating And wirting a file
            python.write("Python is a high level programming language");
            python.write("You create an object in Python by instantiating a class,\n which involves calling the class name followed by parentheses.");
            python.write("in Python allows a class to inherit attributes and methods from another class,\n known as the parent class.");
            python.write("You use super() in Python to call a method from the parent class,\n allowing you to extend or modify inherited behavior.");
            python.close();
            System.out.println("Python file creation and writing is finned");
        }catch (IOException e){
            System.out.println("File is not created:Error");
            e.printStackTrace();
        }
    }
}
