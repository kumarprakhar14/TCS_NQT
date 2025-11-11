/*
* Problem Name: Temperature Classifier + AverageProblem 
* Description: Given two temperature values, 
classify each temperature as follows:
If temperature < 10 $\to$ "it's very cool"
If temperature is from 10 to 20 (inclusive) $\to$ "it's cold"
If temperature > 20 $\to$ "it's warm" 
*/

import java.util.Scanner;


public class TemperatureClassifier{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        if(t1 < 10){
            System.out.println("its cool");
        }
        if(t1 >= 10 || t1 <= 20){
            System.out.println("it's cold");
        }else{
            System.out.println("it;s warm");
        }
        if(t2 < 10){
            System.out.println("its cool");
        }
        if(t2 >= 10 || t2 <= 20){
            System.out.println("it's cold");
        }else{
            System.out.println("it;s warm");
        }
        double aver = (t1+t2)/2;
        System.out.println(aver);
        System.out.println(t1);
        System.out.println(t2);
        
    }
}