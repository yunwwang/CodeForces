import java.util.*;
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int temp = 0;

            for (int j = 0; j < n; j++){
                a[j] = sc.nextInt();

                if (temp != 1) {
                    temp = gcd(a[j], temp);
                }
            } 

            int count = a[n-1] / temp;

            System.out.println(count);
        }

        sc.close();
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd (b, a % b);
    }
}