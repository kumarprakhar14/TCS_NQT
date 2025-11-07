
import java.util.Scanner;

/*
* Find a given no is prime or not. 
*/

class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        if(num <=  1) {
            System.out.println("False");
            return;
        }

        for(int i=1; i<=(int)Math.sqrt(num); i++) {
            if(i == num) {
                continue;
            }
            else if(num % i == 0) {
                count += 1;
            }
        }

        if(count >= 2) {
            System.out.println("False");
        }
        else {
            System.out.println("True");
        }
    }
}