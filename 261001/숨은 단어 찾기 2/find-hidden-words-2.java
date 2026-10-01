import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        // Please write your code here.
        int[] dr = {-1, 1, 0, 0, 1, 1, -1, -1};
        int[] dc = {0, 0, -1, 1, 1, -1, -1, 1};
        int ans = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {

                if (arr[r].charAt(c) == 'L') {

                    for (int d = 0; d < 8; d++) {
                        boolean check = false;

                        for (int k = 1; k <= 2; k++) {

                            int nr = r + dr[d] * k;
                            int nc = c + dc[d] * k;
                            if (nr >= 0 && nc >= 0 && nr < n && nc < m) {
                                if (arr[nr].charAt(nc) == 'E') {
                                    check = true;
                                } else {
                                    check = false;
                                    break;
                                }
                            } else {
                                check = false;
                                break;
                            }
                        }

                        if (check) {
                            ans++;
                        }
                    }
                }
            }
        }

        System.out.print(ans);
    }
}
