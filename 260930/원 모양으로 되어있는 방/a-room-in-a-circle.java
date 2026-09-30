import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.

        int ans = Integer.MAX_VALUE;

        // i : arr[i] 가 시작 위치. 즉, 해당 방에 들어갈 인원들은 이동 거리 = 0
        for (int i = 0; i < n; i++) {
            int sum = 0;
            // j : 시작 위치에서부터 j 만큼 떨어짐을 나타냄. i+j > n-1 이면 i+j = 0으로 돌아감
            for (int j = 0; j < n; j++) {

                if (i + j > n - 1) {
                    sum += arr[i + j - n] * j;
                } else {
                    sum += arr[i + j] * j;
                }
            }
            ans = Math.min(ans, sum);
        }
        System.out.print(ans);
    }
}
