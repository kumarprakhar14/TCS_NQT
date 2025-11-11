
import java.util.*;

/*
* Print all the divisors/factors of a given no. 
*/

public class DivisorsOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sq = (int)Math.sqrt(num);
        ArrayList<Integer> divisors = new ArrayList<>();

        for(int i=1; i<=sq; i++) {
            if(num % i == 0) {
                int temp = num / i;
                divisors.add(i);
                if(i != temp)  // Checking, since when i and temp are same, divisors will be added twice.
                // Run the code for num=100 without this condition to see what happens.
                divisors.add(temp);
                // or, 
                // Syso(i, temp)
                // Instead of using the arraylist
            }
        }

        Collections.sort(divisors);

        System.out.println(divisors);
    }
}