import java.util.*;
class Day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z[] = new int[20];

        int pos = 0;
        int neg = 0;
        int zero = 0;
        int even = 0;
        int odd = 0;
        System.out.println("the value of z[]");
        for (int i = 0; i < z.length; i++) {
            z[i] = sc.nextInt();
            if (z[i] > 0) {
                pos++;
            } else if (z[i] < 0) {
                neg++;
            } else {
                zero++;
            }
                if (z[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            System.out.println("POSITIVE: " + pos
                    + "\nNEGATIVE: " + neg
                    + "\nZERO: " + zero
                    + "\nEVEN: " + even
                    + "\nODD: " + odd);
        }
    }
