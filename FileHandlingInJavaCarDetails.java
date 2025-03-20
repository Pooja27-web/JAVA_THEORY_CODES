import java.io.FileWriter;
import java.io.IOException;
public class FileHandlingInJavaCarDetails {
    public static void main(String[]args){
        try{
            FileWriter car = new FileWriter("Car_Details.txt");
            car.write("Car_Details1.\n"+
                    "\n"+
                    "Car_name:Audi\n"+
                    "\n"+
                    "Car_Color:Black\n"+
                    "\n"+
                    "Car_NumberPlate:KA 03 MN 3663\n"+
                    "\n"+
                    "Car_Country:India\n"+
                    "\n"+
                    "Car_Price: 20 L\n"+
                    "\n"+
                    "Car_Description:Good\n"+
                    "\n"+
                    "-----------------------------\n"+
                    "\n"+

                    "Car_Details2.\n"+
                    "\n"+
                    "Car_name:Audi\n"+
                    "\n"+
                    "Car_Color:Black\n"+
                    "\n"+
                    "Car_NumberPlate:KA 03 MN 3663\n"+
                    "\n"+
                    "Car_Country:India\n"+
                    "\n"+
                    "Car_Price: 20 L\n"+
                    "\n"+
                    "Car_Description:Good\n"+
                    "\n"+
                    "-----------------------------\n"+
                    "\n"+

                    "Car_Details3.\n"+
                    "\n"+
                    "Car_name:Audi\n"+
                    "\n"+
                    "Car_Color:Black\n"+
                    "\n"+
                    "Car_NumberPlate:KA 03 MN 3663\n"+
                    "\n"+
                    "Car_Country:India\n"+
                    "\n"+
                    "Car_Price: 20 L\n"+
                    "\n"+
                    "Car_Description:Good\n"+
                    "\n"+
                    "-----------------------------\n"+
                    "\n"+

                    "Car_Details4.\n"+
                    "\n"+
                    "Car_name:Audi\n"+
                    "\n"+
                    "Car_Color:Black\n"+
                    "\n"+
                    "Car_NumberPlate:KA 03 MN 3663\n"+
                    "\n"+
                    "Car_Country:India\n"+
                    "\n"+
                    "Car_Price: 20 L\n"+
                    "\n"+
                    "Car_Description:Good\n"+
                    "\n"+
                    "-----------------------------\n"+
                    "\n"+

                    "Car_Details5.\n"+
                    "\n"+
                    "Car_name:Audi\n"+
                    "\n"+
                    "Car_Color:Black\n"+
                    "\n"+
                    "Car_NumberPlate:KA 03 MN 3663\n"+
                    "\n"+
                    "Car_Country:India\n"+
                    "\n"+
                    "Car_Price: 20 L\n"+
                    "\n"+
                    "Car_Description:Good\n"+
                    "\n"+
                    "-----------------------------\n"+
                    "\n"+

                    "Car_Details6.\n"+
                    "\n"+
                    "Car_name:Audi\n"+
                    "\n"+
                    "Car_Color:Black\n"+
                    "\n"+
                    "Car_NumberPlate:KA 03 MN 3663\n"+
                    "\n"+
                    "Car_Country:India\n"+
                    "\n"+
                    "Car_Price: 20 L\n"+
                    "\n"+
                    "Car_Description:Good\n"+
                    "\n"+
                    "-----------------------------\n"+
                    "\n"+

                    "Car_Details7.\n"+
                    "\n"+
                    "Car_name:Audi\n"+
                    "\n"+
                    "Car_Color:Black\n"+
                    "\n"+
                    "Car_NumberPlate:KA 03 MN 3663\n"+
                    "\n"+
                    "Car_Country:India\n"+
                    "\n"+
                    "Car_Price: 20 L\n"+
                    "\n"+
                    "Car_Description:Good\n"+
                    "\n"+
                    "-----------------------------\n"+
                    "\n"+

                    "Car_Details8.\n"+
                    "\n"+
                    "Car_name:Audi\n"+
                    "\n"+
                    "Car_Color:Black\n"+
                    "\n"+
                    "Car_NumberPlate:KA 03 MN 3663\n"+
                    "\n"+
                    "Car_Country:India\n"+
                    "\n"+
                    "Car_Price: 20 L\n"+
                    "\n"+
                    "Car_Description:Good\n"+
                    "\n"+
                    "-----------------------------\n"+
                    "\n"+

                    "Car_Details9.\n"+
                    "\n"+
                    "Car_name:Audi\n"+
                    "\n"+
                    "Car_Color:Black\n"+
                    "\n"+
                    "Car_NumberPlate:KA 03 MN 3663\n"+
                    "\n"+
                    "Car_Country:India\n"+
                    "\n"+
                    "Car_Price: 20 L\n"+
                    "\n"+
                    "Car_Description:Good\n"+
                    "\n"+
                    "-----------------------------\n"+
                    "\n"+

                    "Car_Details10.\n"+
                    "\n"+
                    "Car_name:Audi\n"+
                    "\n"+
                    "Car_Color:Black\n"+
                    "\n"+
                    "Car_NumberPlate:KA 03 MN 3663\n"+
                    "\n"+
                    "Car_Country:India\n"+
                    "\n"+
                    "Car_Price: 20 L\n"+
                    "\n"+
                    "Car_Description:Good\n"+
                    "\n"+
                    "-----------------------------\n");
            car.close();
            System.out.println("Car_Details file is created!!");
        } catch (IOException e) {
            System.out.println("File is not created:Error");
            e.printStackTrace();
        }
    }
}