import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(function(a, b));
    }

    public static int function(int a, int b) {

        int ans = 0;

        for (int i = a; i <= b; i++) {

            if (isPrime(i)) {
                ans += i;
            }
        }

        return ans;
    }

    public static boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}