/*
* Given a list of integers where all numbers occur at least twice 
* except for one number, find and return the number that appears only once. 
* HINT: Use XOR operator on all the elements of the array.
* XOR operator returns 1 if 2 elements are distinct and returns
* 0 if 2 elements are same.
*/

import java.util.*;

public class SingleNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        while(sc.hasNext()){
            int val = sc.nextInt();
            arr.add(val);
        }
        
        int ans = 0;
        

        // for(int i=0; i<arr.size(); i++) {
        //     ans = ans ^ arr.get(i);
        // }
        // or, use this ->

        for(int val : arr) {
            ans = ans ^ val;
        }
        
        System.out.println(ans);
    }
}