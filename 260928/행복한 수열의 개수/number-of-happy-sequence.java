import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // N : 격자의 크기
        // M : 같은 숫자가 연속으로 나와야 하는 최소 개수
        int N = sc.nextInt();
        int M = sc.nextInt();

        // N x N 격자
        int[][] map = new int[N][N];

        // 격자 입력
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                map[r][c] = sc.nextInt();
            }
        }

        // 행복한 수열의 개수
        int ans = 0;


        // =========================
        // 1. 모든 행 검사
        // =========================
        for (int r = 0; r < N; r++) {

            // 현재 같은 숫자가 몇 개 연속인지 저장
            // 첫 번째 숫자 자체가 이미 1개이므로 1부터 시작
            int cnt = 1;

            // M이 1이면 숫자 하나만 있어도 조건 만족
            // 따라서 모든 행은 무조건 행복한 수열
            if (M == 1) {
                ans++;
                continue;
            }

            // c = 1부터 시작
            // 현재 값 map[r][c]와
            // 바로 이전 값 map[r][c - 1]을 비교하기 때문
            for (int c = 1; c < N; c++) {

                // 현재 숫자와 바로 왼쪽 숫자가 같다면
                if (map[r][c] == map[r][c - 1]) {

                    // 같은 숫자가 연속되고 있으므로 개수 증가
                    cnt++;

                } else {

                    // 숫자가 달라졌다면
                    // 현재 숫자부터 새로운 연속 구간이 시작되므로
                    // 다시 1로 초기화
                    cnt = 1;
                }

                // 같은 숫자가 M개 이상 연속으로 나왔다면
                if (cnt >= M) {

                    // 현재 행은 행복한 수열
                    ans++;

                    // 이 행은 이미 행복한 수열이라는 것을 확인했으므로
                    // 더 이상 검사할 필요 없음
                    break;
                }
            }
        }


        // =========================
        // 2. 모든 열 검사
        // =========================
        for (int c = 0; c < N; c++) {

            // 현재 같은 숫자가 몇 개 연속인지 저장
            int cnt = 1;

            // M이 1이면 모든 열도 무조건 행복한 수열
            if (M == 1) {
                ans++;
                continue;
            }

            // r = 1부터 시작
            // 현재 값 map[r][c]와
            // 바로 위 값 map[r - 1][c]를 비교
            for (int r = 1; r < N; r++) {

                // 현재 숫자와 바로 위 숫자가 같다면
                if (map[r][c] == map[r - 1][c]) {

                    // 연속 개수 증가
                    cnt++;

                } else {

                    // 숫자가 달라졌다면
                    // 현재 숫자부터 다시 연속 개수를 1로 시작
                    cnt = 1;
                }

                // 같은 숫자가 M개 이상 연속되었다면
                if (cnt >= M) {

                    // 현재 열은 행복한 수열
                    ans++;

                    // 이미 조건을 만족했으므로
                    // 해당 열 검사 종료
                    break;
                }
            }
        }


        // 행복한 수열의 총 개수 출력
        System.out.println(ans);
    }
}