import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 1번째, 2번째 피보나치 수
        if (n == 1 || n == 2) {
            System.out.print(1);
            return;
        }

        func(n, 2, 1, 1);
    }

    public static void func(int n, int cnt, int num1, int num2) {

        if (n == cnt) {
            System.out.print(num2);
            return;
        }

        int tmp = num2;

        num2 = num1 + num2;
        num1 = tmp;

        func(n, cnt + 1, num1, num2);
    }
}