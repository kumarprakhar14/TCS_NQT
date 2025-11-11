/*
* Calculate GCD of 3 numbers / more than 2 numbers. 
*/
import java.util.*;

public class GCDOf3num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int gcd = gcd(a, b);
        gcd = gcd(gcd, c);

        System.out.println(gcd);

    }

    public static int gcd(int a, int b) {
        if(a == 0) return b;
        if(b == 0) return a;

        if(a > b) {
            return gcd(a % b, b);
        }
        else return gcd(a, b % a);
    }
}