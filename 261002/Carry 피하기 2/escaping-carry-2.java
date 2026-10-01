import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = -1;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {

                    int a = arr[i];
                    int b = arr[j];
                    int c = arr[k];

                    boolean carry = false;

                    while (a > 0 || b > 0 || c > 0) {
                        if (a % 10 + b % 10 + c % 10 >= 10) {
                            carry = true;
                            break;
                        }

                        a /= 10;
                        b /= 10;
                        c /= 10;
                    }

                    if (!carry) {
                        ans = Math.max(ans, arr[i] + arr[j] + arr[k]);
                    }
                }
            }
        }

        System.out.print(ans);
    }
}
