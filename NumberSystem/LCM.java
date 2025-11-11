
import java.util.Scanner;

/*
* Calculate  lcm of 2 given numbers.
*/

// Approach -> 
// Formula => a * b = lcm * hcf
// We already know to calculate the hcf(gcd)

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = gcd(a, b);
        int lcm = (a * b) / gcd;

        System.out.println(lcm);

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