import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = 0;
        int[] count = new int[B];

        while (A > 1) {
            count[A % B]++;
            A = A / B;
        }
        for (int i = 0; i < B; i++) {
            ans += count[i] * count[i];
        }

        System.out.print(ans);

    }
}
