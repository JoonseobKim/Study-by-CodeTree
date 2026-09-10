import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 1;
        int plus = N;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans = cnt;
            for (int j = 0; j < N; j++) {
                System.out.print(ans + " ");
                ans += plus;
            }
            cnt++;
            System.out.println();
        }
    }
}
