//Writing a file
import java.io.FileWriter;
import java.io.IOException;
public class FileHandlingInJava {
    public static void main(String[]args){
        try {
            FileWriter java=new FileWriter("java.txt");//creating And wirting a file
            java.write("Java is a high level programming language");
            java.close();
            System.out.println("Java file creation and writing is finned");
        }catch (IOException e){
            System.out.println("File is not created:Error");
            e.printStackTrace();
        }
    }
}