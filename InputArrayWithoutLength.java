/*
* Given an array without its lenght, implement it, how would you
* know its length and take the input. 
*/

import java.util.*;

public class InputArrayWithoutLength{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        while(sc.hasNext()){
            int val = sc.nextInt();
            arr.add(val);
        }
        System.out.println(arr);
    }
}