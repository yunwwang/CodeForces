import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        if (a == 0 || a == 2 || a % 2 == 1) {
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }        
    }
}