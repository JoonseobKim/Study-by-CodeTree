import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[21][21];
        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.

        int[] dr = {1, 0, 1, -1};
        int[] dc = {0, 1, 1, 1};
        int ans = 0;
        int ans_r = 0;
        int ans_c = 0;

        for (int r = 1; r < 20; r++) {
            for (int c = 1; c < 20; c++) {

                if (arr[r][c] == 1) {
                    for (int d = 0; d < 4; d++) {
                        int cnt1 = 0;
                        int cnt2 = 0;
                        for (int k = 0; k < 5; k++) {

                            int nr = r + dr[d] * k;
                            int nc = c + dc[d] * k;
                            if (nr < 1 || nr >= 20 || nc < 1 || nc >= 20) {
                                break;
                            }
                            if (arr[nr][nc] != 1) {
                                break;
                            }

                            cnt1++;

                            if (cnt1 == 5) {
                                ans_r = r + dr[d] * 2;
                                ans_c = c + dc[d] * 2;
                                ans = 1;
                                break;
                            }
                        }
                    }
                }
                else if (arr[r][c] == 2) {
                    for (int d = 0; d < 4; d++) {
                        int cnt1 = 0;
                        int cnt2 = 0;
                        for (int k = 0; k < 5; k++) {

                            int nr = r + dr[d] * k;
                            int nc = c + dc[d] * k;
                            if (nr < 1 || nr >= 20 || nc < 1 || nc >= 20) {
                                break;
                            }
                            if (arr[nr][nc] != 2) {
                                break;
                            }

                            cnt2++;

                            if (cnt2 == 5) {
                                ans_r = r + dr[d] * 2;
                                ans_c = c + dc[d] * 2;
                                ans = 2;
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (ans == 0) {
            System.out.println(0);
        } else {
            System.out.printf("%d\n%d %d", ans, ans_r, ans_c);
        }
    }
}
