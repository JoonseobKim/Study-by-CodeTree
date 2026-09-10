import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(func(N));
    }

    public static int func(int N) {

        if (N == 0) {
            return 0;
        }

        int num = N % 10;

        return num * num + func(N / 10);
    }
}