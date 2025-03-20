import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class FileHandlingOpenReadFile {
    public static void main(String[]args){
        try{
            FileReader file=new FileReader("Java_oops.txt");
            BufferedReader bufferedReader =new BufferedReader(file);
            String java;
            while ((java=bufferedReader.readLine())!=null){
                System.out.println(java);
            }
            bufferedReader.close();
            file.close();
        }catch (IOException e){
            System.out.println("Error:File Not Found");
            e.printStackTrace();
        }
    }
}
