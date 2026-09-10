import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func1(n);
        System.out.println();
        func2(n);
        // Please write your code here.
    }

    public static void func1(int n) {
        if (n == 0) {
            return;
        }

        func1(n - 1);
        System.out.print(n + " ");
    }

    public static void func2(int n) {
        if (n == 0)
            return;

        System.out.print(n + " ");
        func2(n - 1);
    }
}
