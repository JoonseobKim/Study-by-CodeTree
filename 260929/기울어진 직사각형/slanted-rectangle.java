import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        int ans = 0;

        // 중심점
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {

                int sum = 0;
                int cr = r;
                int cc = c;

                //각 방향마다 얼마큼 이동할지 모두 확인해야함.
                //방향 1: d1
                for (int d1 = 1; d1 <= n; d1++) {
                    if (r - d1 >= 0 && c + d1 >= 0 && r - d1 < n && c + d1 < n) {

                        int temp1 = 0;
                        for (int i = 1; i <= d1; i++) {
                            temp1 += grid[r - i][c + i];
                        }

                        sum += temp1;

                        cr = r - d1;
                        cc = c + d1;

                        // 방향 2: d2
                        for (int d2 = 1; d2 <= n; d2++) {
                            if (cr - d2 >= 0 && cc - d2 >= 0 && cr - d2 < n && cc - d2 < n) {

                                int temp2 = 0;

                                for (int i = 1; i <= d2; i++) {
                                    temp2 += grid[cr - i][cc - i];
                                }

                                sum += temp2;

                                cr = cr - d2;
                                cc = cc - d2;

                                // 방향 3: d3
                                for (int d3 = 1; d3 <= n; d3++) {
                                    if (cr + d3 >= 0 && cc - d3 >= 0 && cr + d3 < n && cc - d3 < n) {

                                        int temp3 = 0;

                                        for (int i = 1; i <= d3; i++) {
                                            temp3 += grid[cr + i][cc - i];
                                        }

                                        sum += temp3;

                                        cr = cr + d3;
                                        cc = cc - d3;

                                        // 방향 4: d4
                                        for (int d4 = 1; d4 <= n; d4++) {
                                            if (cr + d4 >= 0 && cc + d4 >= 0 && cr + d4 < n && cc + d4 < n) {

                                                int temp4 = 0;

                                                for (int i = 1; i <= d4; i++) {
                                                    temp4 += grid[cr + i][cc + i];
                                                }

                                                sum += temp4;

                                                cr = cr + d4;
                                                cc = cc + d4;

                                                if (cr == r && cc == c) {
                                                    ans = Math.max(ans, sum);
                                                }

                                                sum -= temp4;
                                                cr = cr - d4;
                                                cc = cc - d4;
                                            }

                                        }
                                        sum -= temp3;
                                        cr = cr - d3;
                                        cc = cc + d3;
                                    }
                                }
                                sum -= temp2;
                                cr = cr + d2;
                                cc = cc + d2;
                            }

                        }
                        sum -= temp1;
                        cr = cr + d1;
                        cc = cc - d1;
                    }

                }

            } // c
        } // r

        System.out.print(ans);
    }
}
