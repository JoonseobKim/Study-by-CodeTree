import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.
        int answer = 0;

        // 중심점
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {

                // K = 0부터 증가
                for (int k = 0; k <= 2 * n; k++) {

                    int gold = 0;

                    // 마름모 내부의 모든 칸 검사
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {

                            // 중심으로부터의 맨해튼 거리
                            int distance = Math.abs(r - i) + Math.abs(c - j);

                            // 마름모 내부
                            if (distance <= k) {
                                gold += grid[i][j];
                            }
                        }
                    }

                    // 마름모 채굴 비용
                    int cost = k * k + (k + 1) * (k + 1);

                    // 손해를 보지 않는 경우
                    if (gold * m >= cost) {
                        answer = Math.max(answer, gold);
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
