/*
* TCS sheet question 1 
*/
import java.util.*;

public class PrimeIndexSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = (int) 1e6;
        boolean prime[] = new boolean[n+1];
        Arrays.fill(prime, true);

        for(int i=2; i*i<=n; i++) {
            if(prime[i] == true){
                for(int j=2*i; j<=n; j+=i) {
                    prime[j] = false;
                }
            }
        }

        // Since we have no idea about the no. of prime numbers, 
        // we cannot declare size of an array
        // Thus, using arraylist

        ArrayList<Integer> primelist = new ArrayList<>();
        primelist.add(-1);
        for(int i=2; i<=n; i++) {
            if(prime[i] == true)
            primelist.add(i);
        }

        int x = sc.nextInt();
        int y = sc.nextInt();

        int a = primelist.get(x);
        int b = primelist.get(y);
        System.out.println((a+b)-1);
    }
}