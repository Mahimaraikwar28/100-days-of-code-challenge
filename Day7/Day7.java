import java.util.*;
public class Day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];

        System.out.println("the value of a[i]");
        for(int i=0;i<a.length;i++){

            a[i]=sc.nextInt();

        }
        int j=0;
        for(int i=b.length-1;i>=0;i--){
            b[i]=a[j];
            j++;
        }
        System.out.println("the value of b[i] is");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
    }
