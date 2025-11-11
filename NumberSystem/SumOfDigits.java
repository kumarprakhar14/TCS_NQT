
import java.util.Scanner;

/*
* Find the sum of all the digits of a number 
*/

class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int max = Integer.MIN_VALUE;

        while(num != 0) {
            int temp = num % 10;
            num = num / 10;
            sum += temp;
            if(temp > max) 
            max = temp;
        }

        System.out.println(sum);
        System.out.println(max);
    }
}