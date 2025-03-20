public class Constuctors {
    int x;
    public Constuctors(int y){
        x=y;
    }
    public static void main(String[]args){
        Constuctors myobj=new Constuctors(5);
        System.out.println(myobj.x);
    }
}