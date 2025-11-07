/*
* Find sum and avg of elements in an array 
*/
import java.util.*;

class SumOfArrayEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int sum = 0;
        float avg;
        int[] arr = new int[size];

        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<size; i++) {
            if(map.containsKey(arr[i]) == true) {
                int old = map.get(arr[i]);
                map.put(arr[i], old+1);
            }
            else {
                map.put(arr[i], 1);
            }
        }

        for(int num : map.keySet()) {
            sum += num;
        }

        avg = sum / size;

        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + avg);
    }
}