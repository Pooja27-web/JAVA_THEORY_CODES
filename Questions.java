// Q1 = Write a program to sum three numbers in java
// Q2 = Write a program to calculate Average using marks of three subjects(Out of 100)
// Q3 = Write a program that take 2 number and perform addition, subtraction, multiplication and division. first num = 14, second number = 4.
// Q4 = Write a program to calculate the area of circle and should take radius as input. r = 7, pi = 3.14 (pi*r**2)
public class Questions {
    public static void main(String[] args) {
        int a=50;
        int b=60;
        int c=100;
        int d=a+b+c;
        int e=d/100;
        System.out.println("Sum of all three numbers are= "+d);
        System.out.println("Average of all three subjects= "+e);
        int first_num=14;
        int second_num=4;
        int add=first_num+second_num;
        int sub=first_num-second_num;
        int mul=first_num*second_num;
        int div=first_num/second_num;
        System.out.println("Addition= "+add);
        System.out.println("Subtraction= "+sub);
        System.out.println("Multiplication= "+mul);
        System.out.println("Division= "+div);
        int radius=7;
        float pi=3.14f;
        float area=pi*(radius*radius);
        System.out.println("Area of the circle= "+area);
    }
}
