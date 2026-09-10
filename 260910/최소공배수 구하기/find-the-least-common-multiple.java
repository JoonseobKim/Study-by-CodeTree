import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.

        System.out.println(최소공배수(n, m));

    }

    public static int 최소공배수(int n, int m) {
        return n / 최대공약수(n, m) * m;
    }

    public static int 최대공약수(int n, int m) {
        while (m != 0) {
            int tmp = n % m;
            n = m;
            m = tmp;
        }
        return n;
    }
}
