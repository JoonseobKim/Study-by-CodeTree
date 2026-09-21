import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int cnt = 0;

        // 같은 달인 경우
        if (m1 == m2) {
            cnt = d2 - d1 + 1;
        } else {

            // 시작 월에서 남은 날짜
            cnt += arr[m1 - 1] - d1 + 1;

            // 시작 월과 마지막 월 사이의 완전한 달
            for (int i = m1; i < m2 - 1; i++) {
                cnt += arr[i];
            }

            // 마지막 월
            cnt += d2;
        }

        System.out.print(cnt);
    }
}