import java.util.*;
public class Day2 {
    public static void main(String[] args) {
        int rem=0,rev=0,temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();

        temp=num;
        while(num>0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
            if(rev==temp)
            {
                System.out.println("IT IS AN PALINDROME NUMBER : )");
            }
            else{
                System.out.println("IT IS NOT AN PALINDROME NUMBER : (");
            }
        }
    }
