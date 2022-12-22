import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] nn = new int[t];
        int[][] aa = new int[t][100000];

        for (int i = 0; i < t; i++) {
            nn[i] = sc.nextInt();

            for (int j = 0; j < nn[i]; j++) {
                aa[i][j] = sc.nextInt();
            }
        }

        sc.close();

        for (int i = 0; i < t; i++) {
            int[] a = aa[i];
            int n = nn[i];

            Arrays.sort(a, 0, n);

            int max = a[n-1] - a[0];

            if (max == 0) {
                long result = (long)n * (n - 1);
                System.out.println(result);
            }
            else {
                int count_1 = 1;
                int count_2 = 1;
                for (int j = 1; j < n; j++) {
                    if (a[j] == a[0]) {
                        count_1 ++;
                    }
                    else {
                        break;
                    }
                }
                for (int j = n-2; j > 0; j--) {
                    if (a[j] == a[n-1]) {
                        count_2 ++;
                    }
                    else {
                        break;
                    }
                } 

                long result = (long)count_1 * count_2 * 2;
                System.out.println(result);
            }
        }
    }
}