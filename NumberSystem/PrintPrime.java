import java.util.*;

/*
* Print all the prime nos. in a given range. 
*/

// class PrintPrime {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         for(int i=1; i<=num; i++) {
//             if(checkPrime(i) == true){
//                 System.out.println(i);
//             }
//         }
//     }

//     static boolean checkPrime(int num) {
//         if(num <= 1) {
//             return false;
//         }
//         boolean flag = true;
//         for(int i=2; i<=Math.sqrt(num); i++) {
//             if(num % i == 0) {
//                 flag = false;
//                 break;
//             }
//         }

//         return flag;
//     }
// }

// Better approach -> 
class PrintPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean prime[] = new boolean[num+1];
        // Fill the whole array with true
        Arrays.fill(prime, true);

        int sq = (int)Math.sqrt(num);

        for(int i=2; i<=sq; i++) {
            if(prime[i] == true) {
                for(int j=i; j<= i*2; j++) {
                    prime[j] = false;
                }
            }
        }

        for(int i=0; i<prime.length; i++) {
            if(prime[i] == true){
                System.out.println(i);
            }
        }
    }
}