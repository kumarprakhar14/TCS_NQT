/*
* Check if a number is pallindrome or not 
*/
import java.util.Scanner;

class PallindromeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int inpNum = number;
        int revNum = 0;

        if(inpNum < 0){
            System.out.println("False");
        }

        while(number != 0) {
            int temp = number % 10;
            number = number / 10;

            revNum = revNum * 10 + temp;
        }

        System.out.println(number + " " + revNum);

        if(inpNum == revNum) {
            System.out.println("True");
        }
        else {
            System.err.println("False");
        }
    }
}