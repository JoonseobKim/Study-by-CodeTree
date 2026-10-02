import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int ans = 0;

        for (int l = 0; l < n; l++) {
            for (int r = l; r < n; r++) {
                int sum = 0;
                int mid = 0;
                for (int k = l; k <= r; k++) {
                    sum += arr[k];
                }

                // 평균이 정수가 아니면 배열 원소와 같을 수 없음
                if (sum % (r - l + 1) != 0)
                    continue;

                mid = sum / (r - l + 1);

                for (int k = l; k <= r; k++) {
                    if (arr[k] == mid) {
                        ans++;
                        break;
                    }
                }
            }

        }
        System.out.print(ans);
    }
}
