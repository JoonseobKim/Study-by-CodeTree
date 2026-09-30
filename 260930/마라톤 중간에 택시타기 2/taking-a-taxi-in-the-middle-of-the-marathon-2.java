import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        int ans = Integer.MAX_VALUE;

        // 제거할 체크포인트 선택
        for (int i = 1; i < n - 1; i++) {
            int sum = 0;

            // 제거할 체크포인트를 이전 체크포인트와 동일한 값으로 변경
            int temp_x = x[i];
            int temp_y = y[i];
            x[i] = x[i - 1];
            y[i] = y[i - 1];

            // 변경된 상태로 전체 거리를 계산
            for (int j = 1; j < n; j++) {
                sum += Math.abs(x[j] - x[j - 1]) + Math.abs(y[j] - y[j - 1]);
            }
            ans = Math.min(ans, sum);
            x[i] = temp_x;
            y[i] = temp_y;

        }

        System.out.print(ans);
    }
}
