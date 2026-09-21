import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int ans = 0;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {

                int cnt = 0;
                for (int d = 0; d < 4; d++) {
                    int nr = r + dr[d];
                    int nc = c + dc[d];

                    if (nr >= 0 && nr < n && nc >= 0 && nc < n) {
                        if (arr[nr][nc] == 1) {
                            cnt++;
                        }
                    }

                }
                if (cnt >= 3)
                    ans++;
            }
        }

        System.out.print(ans);
    }
}
