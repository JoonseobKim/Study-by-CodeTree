import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        func(n, 0);
    }

    public static void func(int n, int cnt) {
        if (n == 1) {
            System.out.print(cnt);
            return;
        }

        if (n % 2 == 0) {
            n = n / 2;
            cnt++;
        }
        else if (n % 2 == 1) {
            n = n * 3 + 1;
            cnt++;
        }

        func(n, cnt);
    }
}
