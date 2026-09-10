import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int cnt = 0;
        func(n, cnt);
    }

    public static void func(int n, int cnt) {
        if (n == 1) {
            System.out.print(cnt);
            return;
        }
        else if (n % 2 == 0) {
            n /= 2;
        }
        else if (n % 2 == 1) {
            n = n / 3;
        }
        cnt++;
        func(n, cnt);
    }
}
