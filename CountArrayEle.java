
import java.util.HashMap;
import java.util.Scanner;

/*
* Count the no. of elements in an array
* Whenever we need to find the count, 
* always go for Hashmap.
*/

class CountArrayEle {
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

        System.out.println("Frequency of the elements in the array are: \n");
        System.out.println(map);

        System.out.println("Printing through for-each loop");
        for(int key: map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}