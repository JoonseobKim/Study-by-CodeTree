import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n - 1; i++) {
            int temp1 = arr[i];
            arr[i] = 0;

            for (int j = i + 1; j < n; j++) {
                int sum = 0;
                int temp2 = arr[j];
                arr[j] = 0;

                for (int k = 0; k < n; k++) {
                    sum += arr[k];
                }

                arr[j] = temp2;
                ans = Math.min(ans, Math.abs(sum - s));
            }

            arr[i] = temp1;

        }

        System.out.print(ans);
    }
}
