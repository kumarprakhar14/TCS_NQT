/*
* Find all the elements in an array that occurs more than once 
*/

import java.util.*;

class DuplicateNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array");
        int  size = sc.nextInt();
        int arr[] = new int[size];

        // take input
        System.out.println("Enter array elements");
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<size; i++) {
            if(map.containsKey((arr[i])) == true) {
                int old = map.get(arr[i]);
                map.put(arr[i], old+1);
            }
            else {
                map.put(arr[i], 1);
            }
        }

        for(int num : map.keySet()) {
            if(map.get(num) > 1) {
                System.out.println(num);
            }
        }
    }
}