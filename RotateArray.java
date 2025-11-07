/*
* Rotate an array given no. of times 
*/
import java.util.*;

class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rotate = sc.nextInt();
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        rotate = rotate % size;

        reverse(arr, 0, rotate-1);
        reverse(arr, rotate, size-1);
        reverse(arr, 0, size-1);

        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int arr[], int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}