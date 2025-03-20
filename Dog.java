class Animal{
    public static void barking(){
        System.out.println("Dog is Barking");
    }
}
class Behaviour extends Animal{
    public static void eating(){
        System.out.println("Dog is Eating");
    }
}
class Dog {
    public static void main(String[]args){
        Behaviour obj1= new Behaviour();
        obj1.barking();
        obj1.eating();
    }
}
