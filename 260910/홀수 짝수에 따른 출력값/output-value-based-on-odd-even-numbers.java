import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.print(func(n));
    }

    public static int func(int n) {
        if (n <= 0) {
            return 0;
        }

        return n + func(n - 2);

    }
}
