import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }

            Arrays.sort(a);

            if (a[n - 1] == a[0]) {
                long result = (long) n * (n - 1);
                System.out.println(result);
            } else {
                int j = 1;
                int k = n-2;

                while (a[j] == a[0]) j++;
                while (a[k] == a[n-1]) k--;

                long count_1 = j;
                long count_2 = n - k - 1;

                long result = count_1 * count_2 * 2;
                System.out.println(result);
            }
        }

        sc.close();
    }
}