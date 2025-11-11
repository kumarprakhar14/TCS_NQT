/** 
 * Problem Name: 2D Array Row Order Based on Even/Odd Row IndexProblem 
 * Description: Given a 2D array with m rows and n columns, 
 * print the elements of the array such that:
 * Rows with even indices (0, 2, 4, ...) are printed in left-to-right order.
 * Rows with odd indices (1, 3, 5, ...) are printed in right-to-left order.
*/

import java.util.*;

public class MatrixRowOrder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
