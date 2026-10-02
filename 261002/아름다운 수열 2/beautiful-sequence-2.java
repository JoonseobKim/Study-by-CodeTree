import java.util.Arrays;
import java.util.Scanner;
/**
 * 아수 : 수열 순서 바꿔서 나올 수 있는 모든 경우의 수
 *
 * 입력: M
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N : N개의 정수 (수열 A)
        int N = sc.nextInt();
        // M : M개의 정수 (수열 B)
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < M; i++)
            B[i] = sc.nextInt();
        // Please write your code here.

        int cnt = 0;
        for (int i = 0; i < N - M + 1; i++) {
            int[] temp = new int[M];
            for (int j = 0; j < M; j++) {
                temp[j] = A[i + j];
            }

            Arrays.sort(temp);
            Arrays.sort(B);

            boolean check = true;
            for (int j = 0; j < temp.length; j++) {
                if (temp[j] != B[j]) {
                    check = false;
                }
            }

            if (check) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
