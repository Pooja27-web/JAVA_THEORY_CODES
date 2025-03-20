class CheckSeasons extends Exception{
    CheckSeasons(){
        super("Please give valid month....!!");
    }
}
public class Seasons {
    public static void checkmonth(String month)throws CheckSeasons{
        if(month == "Jan"||month == "Dec"||month == "Feb"){
            System.out.println("This is ur's Favourite WINTER..!!");
        }
        else if(month == "Mar"||month == "Apr"||month == "May"){
            System.out.println("This is ur's Favourite SUMMER..!!");
        }
        else if(month == "Jun"||month == "Jul"||month == "Aug"){
            System.out.println("This is ur's Favourite RAINY..!!");
        }
        else if(month == "Sep"||month == "Oct"||month == "Nov"){
            System.out.println("This is ur's Favourite AUTUM..!!");
        }
    }
    public static void main(String[]args){
        try{
            checkmonth("Apr");
        }catch (CheckSeasons e){
            System.out.println("Caught Execption: "+e.getMessage());
        }
        finally {
            System.out.println("Seasons is completed...!!");
        }
    }
}