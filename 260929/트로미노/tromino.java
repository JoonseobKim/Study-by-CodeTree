import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] map = new int[N][M];

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                map[r][c] = sc.nextInt();
            }
        }

        int max = 0;

        // 모든 칸을 시작점으로 확인
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {

                // 1. 가로 일자형
                // ■ ■ ■
                if (c + 2 < M) {
                    int sum = map[r][c]
                            + map[r][c + 1]
                            + map[r][c + 2];

                    max = Math.max(max, sum);
                }

                // 2. 세로 일자형
                // ■
                // ■
                // ■
                if (r + 2 < N) {
                    int sum = map[r][c]
                            + map[r + 1][c]
                            + map[r + 2][c];

                    max = Math.max(max, sum);
                }

                // 아래부터는 2 x 2 영역에서
                // 한 칸만 제외하면 L자 모양이 됨

                if (r + 1 < N && c + 1 < M) {

                    // 3.
                    // ■ ■
                    // ■ □
                    int sum1 = map[r][c]
                            + map[r][c + 1]
                            + map[r + 1][c];

                    max = Math.max(max, sum1);


                    // 4.
                    // ■ ■
                    // □ ■
                    int sum2 = map[r][c]
                            + map[r][c + 1]
                            + map[r + 1][c + 1];

                    max = Math.max(max, sum2);


                    // 5.
                    // ■ □
                    // ■ ■
                    int sum3 = map[r][c]
                            + map[r + 1][c]
                            + map[r + 1][c + 1];

                    max = Math.max(max, sum3);


                    // 6.
                    // □ ■
                    // ■ ■
                    int sum4 = map[r][c + 1]
                            + map[r + 1][c]
                            + map[r + 1][c + 1];

                    max = Math.max(max, sum4);
                }
            }
        }

        System.out.println(max);
    }
}