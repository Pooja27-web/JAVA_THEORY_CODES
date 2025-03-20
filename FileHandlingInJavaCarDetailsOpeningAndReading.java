import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class FileHandlingInJavaCarDetailsOpeningAndReading {
    public static void main(String[]args){
        try{
            FileReader file=new FileReader("Car_Details.txt");
            BufferedReader bufferedReader =new BufferedReader(file);
            String car;
            while ((car=bufferedReader.readLine())!=null){
                System.out.println(car);
            }
            bufferedReader.close();
            file.close();
        }catch (IOException e){
            System.out.println("Error:File Not Found");
            e.printStackTrace();
        }
    }
}
