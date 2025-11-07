/*
* Sort an array in descending order. 
*/
import java.util.*;

class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        // int arr[] = new int[size];

        // for(int i=0; i<size; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // Arrays.sort(arr);

        // int left = 0;
        // int right = size-1;

        // while(left < right) {
        //     int temp = arr[left];
        //     arr[left] = arr[right];
        //     arr[right] = temp;

        //     left++;
        //     right--;
        // }

        // System.out.println(Arrays.toString(arr));

        // Using collection framework

        Integer[] arr = new Integer[size];

        for(int i=0; i< size; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort in desceding 
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));

    }
}