 import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter choice");
        int ch=sc.nextInt();
        System.out.println("Enter two numbers : ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        switch (ch)
        {
            case 1:{
                System.out.println("Addition of num : "+ (a+b));
                break;
            }
            case 2:{
                System.out.println("Difference of num : "+(a-b));
                break;
            }
            case 3:{
                System.out.println("Multiplication of num : "+(a*b));
                break;
            }
            case 4:{
                System.out.println("Modulus of num : "+(a%b));
                break;
            }
            case 5:{
                System.out.println("Division of num : "+(a/b));
                break;
            }
        }
    }
}
