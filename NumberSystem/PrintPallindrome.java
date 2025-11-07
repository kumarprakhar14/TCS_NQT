/*
* Print all the pallindrome numbers from 1 to a given range 
*/

import java.util.Scanner;

class PrintPallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        for(int i=1; i<=number; i++) {
            checkPallindrom(i);
        }
        }

    static void checkPallindrom(int num) {
        int revNum = 0;
        int inpNum = num;

        while(num != 0) {
            int temp = num % 10;
            num = num / 10;
            revNum = revNum * 10 + temp;
        }

        if(inpNum == revNum) {
            System.out.println(inpNum);
        }
    }
}