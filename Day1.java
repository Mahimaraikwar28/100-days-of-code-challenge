import java.util.*;
public class Day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the lower limit of your choice :  ");
        double lower = sc.nextDouble();

        System.out.println("Enter the upper limit of your choice");
        double upper = sc.nextDouble();
        if (lower <= upper) {

            System.out.println();
            System.out.println("The outcome number is even :");
            for (double i = lower; i <= upper; i++)//conditional statement
            {
                if (i % 2 == 0)
                {
                    System.out.println(i);
                }
            }

            System.out.println("The outcome number is odd :");
            System.out.println();
            for (double j = lower; j <= upper; j++) {
                if (j % 2 != 0) {
                    System.out.println(j);
                }
            }

        }
        else if (lower >= upper) {

            System.out.println();
            System.out.println("The outcome number is even");
                for (double i=lower; i>=upper; i--)
                {

                      if (i%2==0) {
                        System.out.println(i);
                    }

                }


            System.out.println();
            System.out.println("The outcome is odd ");

                for(double j=lower;j>=upper;j--) {

                      if (j%2!=0) {
                        System.out.println(j);
                    }

                }
        }
        else if(lower<0&&lower<=upper) {
            System.out.println("The entered number is even: ");
            System.out.println();
            for (double i = lower; i <= upper; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
            System.out.println("The entered number is odd : ");
            System.out.println();
            for (double j = lower; j <= upper; j++) {
                if (j % 2 != 0) {
                    System.out.println(j);
                }
            }

        }
            else{
            System.out.println("Entered value is wrong :( ");
        }
            }



    }


