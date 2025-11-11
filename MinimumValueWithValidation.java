/* 
* Problem Name: Minimum Value in Matrix with Validation
* Problem Description: Given a matrix of size m \times n, 
* your task is to:Print "invalid input" if m <= 0 or n <= 0
* Otherwise, find and print the minimum value in the matrix
*/
import java.util.*;

class MinimumValueWithValidation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // rows
        int n = sc.nextInt(); // cols

        if(m<=0 || n<=0) {
            System.out.println("Invalid Input");
            return;
        }

        int ans = Integer.MAX_VALUE;

        // Make a 2D array
        // 0r, ->

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                int temp = sc.nextInt();
                if(temp < ans) {
                    ans = temp;
                }
            }
        }

        System.out.println(ans);
    }
}