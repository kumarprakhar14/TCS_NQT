
import java.util.*;

/*
* Find median element of an array 
*/

class MedianEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        if(size % 2 != 0) {
            System.out.println(arr[size/2]);
        }
        else {
            System.err.println((arr[size/2 - 1] + arr[size/2]) / 2.0);
        }
        
    }
}