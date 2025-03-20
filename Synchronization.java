class Printer{
    synchronized void message(String msg){
        System.out.print("["+msg);
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("]");
    }
}
class MyThread extends Thread{
    Printer print_msg;
    String msg;

    MyThread(Printer print_msg,String msg){//child consuctors
        this.print_msg=print_msg;
        this.msg=msg;
    }

    public void run(){
        print_msg.message(msg);
    }
}
public class Synchronization {
    public static void main(String[]args){
        Printer p=new Printer();

        MyThread m1=new MyThread(p,"Hello");
        MyThread m2=new MyThread(p,"Bhuvan");
        MyThread m3=new MyThread(p,"Welcome");
        MyThread m4=new MyThread(p,"To");
        MyThread m5=new MyThread(p,"My_World");
        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
    }
}