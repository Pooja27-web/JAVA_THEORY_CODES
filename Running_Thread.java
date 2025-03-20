class Run extends Thread{
    public void running(){
        for(int i=1;i<5;i++){
            System.out.println("Running......"+i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class Running_Thread {
    public static void main(String[]args){
        Run obj=new Run();
        obj.start();
        obj.running();
    }
}
