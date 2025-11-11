import java.util.*;

public class TOH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // no. of disks

        System.out.println((int)Math.pow(2, n) - 1);
    }
}