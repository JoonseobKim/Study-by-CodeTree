import java.util.Scanner;

public class Main {
    public static final int MAX_N = 15;

    public static int n, m;
    public static char[][] grid = new char[MAX_N][MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.next().charAt(0);
            }

        // 이동 시에 행과 열이 전부 증가하도록
        // 모든 쌍을 다 잡아봅니다.
        int cnt = 0;
        // 첫 번째 중간 지점의 행을 선택
        // 시작점 (0, 0)보다 아래쪽이어야 하므로 1부터 시작
        for (int i = 1; i < n; i++)

            // 첫 번째 중간 지점의 열을 선택
                // 시작점 (0, 0)보다 오른쪽이어야 하므로 1부터 시작
                    for (int j = 1; j < m; j++)

                        // 두 번째 중간 지점의 행을 선택
                            // 첫 번째 중간 지점보다 반드시 아래쪽이어야 하므로 i + 1부터 시작
                                // 마지막 도착점은 (n-1, m-1)이므로 그 전까지만 선택
                                    for (int k = i + 1; k < n - 1; k++)

                                        // 두 번째 중간 지점의 열을 선택
                                            // 첫 번째 중간 지점보다 반드시 오른쪽이어야 하므로 j + 1부터 시작
                                                // 마지막 도착점은 (n-1, m-1)이므로 그 전까지만 선택
                                                    for (int l = j + 1; l < m - 1; l++)

                                                        // 이동하면서 연속된 칸의 색깔이 서로 다른 경우만 카운트
                                                            if (grid[0][0] != grid[i][j] &&
                                                                grid[i][j] != grid[k][l] &&
                                                                grid[k][l] != grid[n - 1][m - 1]) {

                                                                    cnt++;
                                                                }

        System.out.println(cnt);
    }
}
