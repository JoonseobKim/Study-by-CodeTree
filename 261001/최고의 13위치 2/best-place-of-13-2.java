import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        // Please write your code here.
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 2; j++) {
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];

                // 이 위치에 두 번째 직사각형 구현하면 되는것인지
                for (int a = 0; a < n; a++) {
                    for (int b = 0; b < n - 2; b++) {
                        if (!(a == i && b <= j + 2 && b + 2 >= j)) {

                            int sum2 = (arr[a][b] + arr[a][b + 1] + arr[a][b + 2]);

                            ans = Math.max(ans, sum + sum2);
                        }
                    }

                }
            }
        }

        System.out.print(ans);
    }
}
