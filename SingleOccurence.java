/*
* Find the element that occurs only one time in an array.
*/
import java.util.*;

class SingleOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  size = sc.nextInt();
        int arr[] = new int[size];

        // take input
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<size; i++) {
            if(map.containsKey(arr[i]) == true) {
                int old = map.get(arr[i]);
                map.put(arr[i], old + 1);
            }
            else {
                map.put(arr[i], 1);
            }

        }

        for(int number : map.keySet()) {
            int count = map.get(number);
            if(count == 1) {
                System.out.println(number);
                return; // print only first element that occurs single time
            }
        }
    }
}