import java.util.Scanner;

/*
* Reverse a given number 
*/

class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int revNum = 0;

        // while(number != 0) {
        //     int lastDigit = number % 10;
        //     number = number / 10;
        //     System.out.print(lastDigit);
        // }
        // ☝️This approach fails for negative numbers

        while(number != 0) {
            int temp = number % 10;
            number = number / 10;

            revNum = revNum * 10 + temp;
        }

        System.out.println(revNum);
    }
}