
import java.util.Scanner;

/*
* Find LCM of 3 numbers / more than 2 numbers 
*/

class LCMOf3num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int gcd1 = gcd(a, b);
        int lcm1 = (a * b) / gcd1;

        int gcd2 = gcd(lcm1, c);
        int ans = (lcm1 * c) / gcd2;

        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if(a == 0) return b;
        if(b == 0) return a;

        if(a > b) {
            return gcd(a % b, b);
        }
        else return gcd(a, a % b);
    }
}